<template>
	<div :style='{"width":"100%","padding":"10px","fontSize":"14px","color":"#666","height":"auto"}'>
		<el-form
			:style='{"border":"0px solid #e5e7eb","padding":"50px 20% 30px 10%","boxShadow":"none","borderRadius":"10px","flexWrap":"wrap","background":"#fff","display":"flex"}'
			class="add-update-preview"
			ref="ruleForm"
			:model="ruleForm"
			label-width="180px"
		>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="学生学号" prop="xueshengxuehao">
					<el-input v-model="ruleForm.xueshengxuehao" :readonly="ro.xueshengxuehao" placeholder="学生学号" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="学生姓名" prop="xueshengxingming">
					<el-input v-model="ruleForm.xueshengxingming" :readonly="ro.xueshengxingming" placeholder="学生姓名" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='xuesheng'"  label="性别" prop="xingbie">
					<el-select filterable v-model="ruleForm.xingbie" :disabled="ro.xingbie" placeholder="请选择性别">
						<el-option
							v-for="(item,index) in xueshengxingbieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="手机号" prop="shoujihao">
					<el-input v-model="ruleForm.shoujihao" :readonly="ro.shoujihao" placeholder="手机号" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='xuesheng'" label="头像" prop="touxiang">
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="1"
						:multiple="false"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="xueshengtouxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='xuesheng'"  label="专业" prop="zhuanye">
					<el-input v-model="ruleForm.zhuanye" :readonly="ro.zhuanye" placeholder="专业" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='xuesheng'"  label="院系" prop="yuanxi">
					<el-select filterable v-model="ruleForm.yuanxi" :disabled="ro.yuanxi" placeholder="请选择院系">
						<el-option
							v-for="(item,index) in xueshengyuanxiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="教师账号" prop="jiaoshizhanghao">
					<el-input v-model="ruleForm.jiaoshizhanghao" :readonly="ro.jiaoshizhanghao" placeholder="教师账号" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="教师姓名" prop="jiaoshixingming">
					<el-input v-model="ruleForm.jiaoshixingming" :readonly="ro.jiaoshixingming" placeholder="教师姓名" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='jiaoshi'"  label="性别" prop="xingbie">
					<el-select filterable v-model="ruleForm.xingbie" :disabled="ro.xingbie" placeholder="请选择性别">
						<el-option
							v-for="(item,index) in jiaoshixingbieOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="联系电话" prop="lianxidianhua">
					<el-input v-model="ruleForm.lianxidianhua" :readonly="ro.lianxidianhua" placeholder="联系电话" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='jiaoshi'" label="头像" prop="touxiang">
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="1"
						:multiple="false"
						:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
						@change="jiaoshitouxiangUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='jiaoshi'"  label="院系" prop="yuanxi">
					<el-select filterable v-model="ruleForm.yuanxi" :disabled="ro.yuanxi" placeholder="请选择院系">
						<el-option
							v-for="(item,index) in jiaoshiyuanxiOptions"
							v-bind:key="index"
							:label="item"
							:value="item">
						</el-option>
					</el-select>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}'   v-if="flag=='jiaoshi'"  label="专业方向" prop="zhuanyefangxiang">
					<el-input v-model="ruleForm.zhuanyefangxiang" :readonly="ro.zhuanyefangxiang" placeholder="专业方向" clearable></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='users'" label="用户名" prop="username">
					<el-input v-model="ruleForm.username" placeholder="用户名"></el-input>
				</el-form-item>
				<el-form-item :style='{"width":"48%","margin":"0 0 20px 0"}' v-if="flag=='users'" label="头像" prop="image">
					<file-upload
						tip="点击上传头像"
						action="file/upload"
						:limit="1"
						:multiple="false"
						:fileUrls="ruleForm.image?ruleForm.image:''"
						@change="usersimageUploadChange"
					></file-upload>
				</el-form-item>
				<el-form-item :style='{"width":"100%","padding":"0","margin":"10px auto 0","justifyContent":"center","display":"flex"}'>
					<el-button class="btn3" type="primary" @click="onUpdateHandler">
						<span class="icon iconfont icon-queren15"></span>
						提交
					</el-button>
				</el-form-item>
		</el-form>
	</div>
</template>
<script>
// 校验引入
	import { 
		isMobile,
	} from "@/utils/validate";

	export default {
		data() {
			return {
				ruleForm: {},
				ro: {},
				flag: '',
				usersFlag: false,
				xueshengxingbieOptions: [],
				xueshengyuanxiOptions: [],
				jiaoshixingbieOptions: [],
				jiaoshiyuanxiOptions: [],
			};
		},
		mounted() {
			var table = this.$storage.get("sessionTable");
			this.flag = table;
			this.$http({
				url: `${this.$storage.get("sessionTable")}/session`,
				method: "get"
			}).then(({ data }) => {
				if (data && data.code === 0) {
					if(table == 'xuesheng') {
						this.ro = {
							xueshengxuehao: false,
							xueshengxingming: false,
							mima: false,
							xingbie: false,
							shoujihao: false,
							touxiang: false,
							zhuanye: false,
							yuanxi: false,
						}
					}
					if(table == 'jiaoshi') {
						this.ro = {
							jiaoshizhanghao: false,
							jiaoshixingming: false,
							mima: false,
							xingbie: false,
							lianxidianhua: false,
							touxiang: false,
							yuanxi: false,
							zhuanyefangxiang: false,
						}
					}

					this.ruleForm = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			this.xueshengxingbieOptions = "男,女".split(',')
			this.$http({
				url: `option/yuanxi/yuanxi`,
				method: "get",
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.xueshengyuanxiOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
			this.jiaoshixingbieOptions = "男,女".split(',')
			this.$http({
				url: `option/yuanxi/yuanxi`,
				method: "get",
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.jiaoshiyuanxiOptions = data.data;
				} else {
					this.$message.error(data.msg);
				}
			});
		},
		methods: {
			xueshengtouxiangUploadChange(fileUrls) {
				this.ruleForm.touxiang = fileUrls;
			},
			jiaoshitouxiangUploadChange(fileUrls) {
				this.ruleForm.touxiang = fileUrls;
			},
			usersimageUploadChange(fileUrls) {
				this.ruleForm.image = fileUrls;
			},
			onUpdateHandler() {
				if((!this.ruleForm.xueshengxuehao)&& 'xuesheng'==this.flag){
					this.$message.error('学生学号不能为空');
					return
				}
				if((!this.ruleForm.xueshengxingming)&& 'xuesheng'==this.flag){
					this.$message.error('学生姓名不能为空');
					return
				}
				if((!this.ruleForm.mima)&& 'xuesheng'==this.flag){
					this.$message.error('密码不能为空');
					return
				}
				if('xuesheng' ==this.flag && this.ruleForm.shoujihao&&(!isMobile(this.ruleForm.shoujihao))){
					this.$message.error(`手机号应输入手机格式`);
					return
				}
				if(this.ruleForm.touxiang!=null) {
					this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
				}
				if((!this.ruleForm.jiaoshizhanghao)&& 'jiaoshi'==this.flag){
					this.$message.error('教师账号不能为空');
					return
				}
				if((!this.ruleForm.jiaoshixingming)&& 'jiaoshi'==this.flag){
					this.$message.error('教师姓名不能为空');
					return
				}
				if((!this.ruleForm.mima)&& 'jiaoshi'==this.flag){
					this.$message.error('密码不能为空');
					return
				}
				if('jiaoshi' ==this.flag && this.ruleForm.lianxidianhua&&(!isMobile(this.ruleForm.lianxidianhua))){
					this.$message.error(`联系电话应输入手机格式`);
					return
				}
				if(this.ruleForm.touxiang!=null) {
					this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
				}
				if('users'==this.flag && this.ruleForm.username.trim().length<1) {
					this.$message.error(`用户名不能为空`);
					return	
				}
				if(this.flag=='users'){
					this.ruleForm.image = this.ruleForm.image.replace(new RegExp(this.$base.url,"g"),"")
				}
				this.$http({
					url: `${this.$storage.get("sessionTable")}/update`,
					method: "post",
					data: this.ruleForm
				}).then(({ data }) => {
					if (data && data.code === 0) {
						if(this.flag=='users'){
							this.$storage.set('headportrait',this.ruleForm.image)
						}else {
							if(this.flag == 'xuesheng') {
								this.$storage.set('headportrait',this.ruleForm.touxiang)
							}
							if(this.flag == 'jiaoshi') {
								this.$storage.set('headportrait',this.ruleForm.touxiang)
							}
						}
						this.$message({
							message: "修改信息成功",
							type: "success",
							duration: 1500,
							onClose: () => {
								window.location.reload();
							}
						});
					} else {
						this.$message.error(data.msg);
					}
				});
			},
		}
	};
</script>
<style lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
				padding: 0 10px 0 0;
				color: #666;
				white-space: nowrap;
				font-weight: 500;
				width: 180px;
				font-size: 16px;
				line-height: 40px;
				text-align: right;
			}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
		margin: 0 0 0 80px;
		display: flex;
		align-items: center;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
				border: 1px solid #eee;
				border-radius: 4px;
				padding: 0 12px;
				box-shadow: none;
				outline: none;
				color: #333;
				width: 100%;
				font-size: 16px;
				height: 40px;
			}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
				border: 1px solid #eee;
				border-radius: 4px;
				padding: 0 10px;
				box-shadow: none;
				outline: none;
				color: #333;
				width: 100%;
				font-size: 16px;
				height: 40px;
			}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
				border: 1px solid #eee;
				border-radius: 4px;
				padding: 0 10px 0 30px;
				box-shadow: none;
				outline: none;
				color: #333;
				width: 100%;
				font-size: 16px;
				height: 40px;
			}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
				border: 1px solid #eee;
				cursor: pointer;
				border-radius: 6px;
				color: #999;
				width: 80px;
				font-size: 26px;
				line-height: 80px;
				text-align: center;
				height: 80px;
			}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
				border: 1px solid #eee;
				cursor: pointer;
				border-radius: 6px;
				color: #999;
				width: 80px;
				font-size: 26px;
				line-height: 80px;
				text-align: center;
				height: 80px;
			}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
				border: 1px solid #eee;
				border-radius: 4px;
				padding: 12px;
				box-shadow: none;
				outline: none;
				color: #666;
				width: 100%;
				font-size: 16px;
				height: auto;
			}
	
	.add-update-preview .btn3 {
				border: 0;
				cursor: pointer;
				border-radius: 4px;
				padding: 0 24px;
				margin: 4px;
				outline: none;
				color: #fff;
				background: #1678ff80;
				width: auto;
				font-size: 16px;
				min-width: 110px;
				height: 40px;
				.iconfont {
						margin: 0 2px;
						color: #fff;
						display: none;
						font-size: 16px;
						height: 40px;
					}
	}
	
	.add-update-preview .btn3:hover {
				opacity: 0.8;
			}
	.editor>.avatar-uploader {
		line-height: 0;
		height: 0;
	}
</style>
