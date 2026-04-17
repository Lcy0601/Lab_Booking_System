<template>
	<div>
		<div class="register-container" :style="{'backgroundImage': indexBgUrl?`url(${$base.url + indexBgUrl})`:''}">
			<el-form v-if="pageFlag=='register'" ref="ruleForm" class="rgs-form animate__animated animate__" :model="ruleForm" :rules="rules">
				<div class="rgs-form2">
					<div class="title">基于SpringBoot的高校开放式计算机实验室综合管理平台的设计与实现</div>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('xueshengxuehao')?'required':''">学生学号：</div>
						<el-input  v-model="ruleForm.xueshengxuehao" :readonly="ro.xueshengxuehao" autocomplete="off" placeholder="学生学号"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('xueshengxingming')?'required':''">学生姓名：</div>
						<el-input  v-model="ruleForm.xueshengxingming" :readonly="ro.xueshengxingming" autocomplete="off" placeholder="学生姓名"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('mima')?'required':''">密码：</div>
						<el-input  v-model="ruleForm.mima" :readonly="ro.mima" autocomplete="off" placeholder="密码"  type="password"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
						<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" :readonly="ro.mima" />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
						<el-select filterable v-model="ruleForm.xingbie" placeholder="请选择性别" :disabled="ro.xingbie">
							<el-option
								v-for="(item,index) in xueshengxingbieOptions"
								v-bind:key="index"
								:label="item"
								:value="item">
							</el-option>
						</el-select>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('shoujihao')?'required':''">手机号：</div>
						<el-input  v-model="ruleForm.shoujihao" :readonly="ro.shoujihao" autocomplete="off" placeholder="手机号"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
						<file-upload
							tip="点击上传头像"
							action="file/upload"
							:limit="3"
							:multiple="true"
							:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
							@change="xueshengtouxiangUploadChange"
						></file-upload>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('zhuanye')?'required':''">专业：</div>
						<el-input  v-model="ruleForm.zhuanye" :readonly="ro.zhuanye" autocomplete="off" placeholder="专业"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='xuesheng'">
						<div class="lable" :class="changeRules('yuanxi')?'required':''">院系：</div>
						<el-select filterable v-model="ruleForm.yuanxi" placeholder="请选择院系" :disabled="ro.yuanxi">
							<el-option
								v-for="(item,index) in xueshengyuanxiOptions"
								v-bind:key="index"
								:label="item"
								:value="item">
							</el-option>
						</el-select>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('jiaoshizhanghao')?'required':''">教师账号：</div>
						<el-input  v-model="ruleForm.jiaoshizhanghao" :readonly="ro.jiaoshizhanghao" autocomplete="off" placeholder="教师账号"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('jiaoshixingming')?'required':''">教师姓名：</div>
						<el-input  v-model="ruleForm.jiaoshixingming" :readonly="ro.jiaoshixingming" autocomplete="off" placeholder="教师姓名"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('mima')?'required':''">密码：</div>
						<el-input  v-model="ruleForm.mima" :readonly="ro.mima" autocomplete="off" placeholder="密码"  type="password"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('mima')?'required':''">确认密码：</div>
						<el-input  v-model="ruleForm.mima2" autocomplete="off" placeholder="确认密码" type="password" :readonly="ro.mima" />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('xingbie')?'required':''">性别：</div>
						<el-select filterable v-model="ruleForm.xingbie" placeholder="请选择性别" :disabled="ro.xingbie">
							<el-option
								v-for="(item,index) in jiaoshixingbieOptions"
								v-bind:key="index"
								:label="item"
								:value="item">
							</el-option>
						</el-select>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('lianxidianhua')?'required':''">联系电话：</div>
						<el-input  v-model="ruleForm.lianxidianhua" :readonly="ro.lianxidianhua" autocomplete="off" placeholder="联系电话"  type="text"  />
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('touxiang')?'required':''">头像：</div>
						<file-upload
							tip="点击上传头像"
							action="file/upload"
							:limit="3"
							:multiple="true"
							:fileUrls="ruleForm.touxiang?ruleForm.touxiang:''"
							@change="jiaoshitouxiangUploadChange"
						></file-upload>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('yuanxi')?'required':''">院系：</div>
						<el-select filterable v-model="ruleForm.yuanxi" placeholder="请选择院系" :disabled="ro.yuanxi">
							<el-option
								v-for="(item,index) in jiaoshiyuanxiOptions"
								v-bind:key="index"
								:label="item"
								:value="item">
							</el-option>
						</el-select>
					</el-form-item>
					<el-form-item class="list-item" v-if="tableName=='jiaoshi'">
						<div class="lable" :class="changeRules('zhuanyefangxiang')?'required':''">专业方向：</div>
						<el-input  v-model="ruleForm.zhuanyefangxiang" :readonly="ro.zhuanyefangxiang" autocomplete="off" placeholder="专业方向"  type="text"  />
					</el-form-item>
					<div class="register-btn">
						<div class="register-btn1">
							<button type="button" class="r-btn" @click="login()">注册</button>
						</div>
						<div class="register-btn2">
							<div class="r-login" @click="close()">已有账号，直接登录</div>
						</div>
					</div>
				</div>
			</el-form>
		</div>
	</div>
</template>

<script>
	import 'animate.css'
export default {
	data() {
		return {
			ruleForm: {
			},
			forgetForm: {},
            pageFlag : '',
			tableName:"",
			rules: {},
			ro: {},
            xueshengxingbieOptions: [],
            xueshengyuanxiOptions: [],
            jiaoshixingbieOptions: [],
            jiaoshiyuanxiOptions: [],
			indexBgUrl: '',
		};
	},
	mounted(){
		this.pageFlag = this.$route.query.pageFlag
		if(this.$route.query.pageFlag=='register'){
			
			let table = this.$storage.get("loginTable");
			this.tableName = table;
			if(this.tableName=='xuesheng'){
				this.ruleForm = {
					xueshengxuehao: '',
					xueshengxingming: '',
					mima: '',
					xingbie: '',
					shoujihao: '',
					touxiang: '',
					zhuanye: '',
					yuanxi: '',
				}
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
			if(this.tableName=='jiaoshi'){
				this.ruleForm = {
					jiaoshizhanghao: '',
					jiaoshixingming: '',
					mima: '',
					xingbie: '',
					lianxidianhua: '',
					touxiang: '',
					yuanxi: '',
					zhuanyefangxiang: '',
				}
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
			if ('xuesheng' == this.tableName) {
				this.rules.xueshengxuehao = [{ required: true, message: '请输入学生学号', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.xueshengxingming = [{ required: true, message: '请输入学生姓名', trigger: 'blur' }]
			}
			if ('xuesheng' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.rules.jiaoshizhanghao = [{ required: true, message: '请输入教师账号', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.rules.jiaoshixingming = [{ required: true, message: '请输入教师姓名', trigger: 'blur' }]
			}
			if ('jiaoshi' == this.tableName) {
				this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
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
		}
	},
	created() {
		this.$http.get('config/info?name=bRegisterBackgroundImg',).then(rs=>{this.indexBgUrl = rs.data.data?rs.data.data.value:''})
	},
	destroyed() {
		  	},
	methods: {
		changeRules(name){
			if(this.rules[name]){
				return true
			}
			return false
		},
		// 获取uuid
		getUUID () {
			return new Date().getTime();
		},
		close(){
			this.$router.push({ path: "/login" });
		},
        xueshengtouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },
        jiaoshitouxiangUploadChange(fileUrls) {
            this.ruleForm.touxiang = fileUrls;
        },

        // 多级联动参数


		// 注册
		login() {
			var url=this.tableName+"/register";
			if((!this.ruleForm.xueshengxuehao) && `xuesheng` == this.tableName){
				this.$message.error(`学生学号不能为空`);
				return
			}
			if((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName){
				this.$message.error(`学生姓名不能为空`);
				return
			}
			if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
				this.$message.error(`密码不能为空`);
				return
			}
			if((this.ruleForm.mima!=this.ruleForm.mima2) && `xuesheng` == this.tableName){
				this.$message.error(`两次密码输入不一致`);
				return
			}
			if(`xuesheng` == this.tableName && this.ruleForm.shoujihao &&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
				this.$message.error(`手机号应输入手机格式`);
				return
			}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
			if((!this.ruleForm.jiaoshizhanghao) && `jiaoshi` == this.tableName){
				this.$message.error(`教师账号不能为空`);
				return
			}
			if((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName){
				this.$message.error(`教师姓名不能为空`);
				return
			}
			if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
				this.$message.error(`密码不能为空`);
				return
			}
			if((this.ruleForm.mima!=this.ruleForm.mima2) && `jiaoshi` == this.tableName){
				this.$message.error(`两次密码输入不一致`);
				return
			}
			if(`jiaoshi` == this.tableName && this.ruleForm.lianxidianhua &&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
				this.$message.error(`联系电话应输入手机格式`);
				return
			}
            if(this.ruleForm.touxiang!=null) {
                this.ruleForm.touxiang = this.ruleForm.touxiang.replace(new RegExp(this.$base.url,"g"),"");
            }
			this.$http({
				url: url,
				method: "post",
				data:this.ruleForm
			}).then(({ data }) => {
				if (data && data.code === 0) {
					this.$message({
						message: "注册成功",
						type: "success",
						duration: 1500,
						onClose: () => {
							this.$router.replace({ path: "/login" });
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
.register-container {
	position: relative;
	background: url(http://codegen.caihongy.cn/20260124/ae5e9c9ced4449f1a151ccbcbb3aa048.jpg);
	background-repeat: no-repeat;
	background-size: cover !important;
	background: url(http://codegen.caihongy.cn/20260124/ae5e9c9ced4449f1a151ccbcbb3aa048.jpg);
	display: flex;
	width: 100%;
	min-height: 100vh;
	justify-content: center;
	align-items: center;
	background-position: top center;
	.rgs-form {
		.rgs-form2 {
		width: 100%;
		}
		border-radius: 16px;
		padding: 30px 0 20px 0;
		box-shadow: none;
		margin: 20px auto;
		z-index: 1;
		align-content: center;
		background: #fff;
		display: flex;
		width: 600px;
		align-items: center;
		flex-wrap: wrap;
		height: auto;
		.title {
			margin: 0 0 20px 0;
			text-shadow: none;
			color: #1678ff;
			font-weight: 600;
			width: auto;
			font-size: 18px;
			line-height: 1;
			text-align: center;
			order: -2;
		}
		.list-item {
			border: 1px solid #ddd;
			border-radius: 8px;
			padding: 0 0 0 130px;
			margin: 0 auto 15px;
			width: 80%;
			position: relative;
			height: auto;
			/deep/ .el-form-item__content {
				display: block;
			}
			.lable {
				padding: 0 10px 0 0;
				color: #333;
				left: -130px;
				width: 130px;
				font-size: 14px;
				line-height: 44px;
				position: absolute !important;
				text-align: right;
			}
			.el-input {
				width: 100%;
			}
			.el-input /deep/ .el-input__inner {
				border: 0px solid #ddd;
				border-radius: 0px;
				padding: 0 10px;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-input /deep/ .el-input__inner:focus {
				border: none;
				border-radius: 0px;
				padding: 0 10px;
				box-shadow: none;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-input-number {
				width: 100%;
			}
			.el-input-number /deep/ .el-input__inner {
				text-align: center;
				border: 0px solid #ddd;
				border-radius: 0px;
				padding: 0 10px;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-input-number /deep/ .el-input__inner:focus {
				border: none;
				border-radius: 0px;
				padding: 0 10px;
				box-shadow: none;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-input-number /deep/ .el-input-number__decrease {
				display: none;
			}
			.el-input-number /deep/ .el-input-number__increase {
				display: none;
			}
			.el-select {
				width: 100%;
			}
			.el-select /deep/ .el-input__inner {
				border: 0px solid #ddd;
				border-radius: 0px;
				padding: 0 10px;
				color: #666;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-select /deep/ .el-input__inner:focus {
				border: none;
				border-radius: 0px;
				padding: 0 10px;
				box-shadow: none;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-date-editor {
				width: 100%;
			}
			.el-date-editor /deep/ .el-input__inner {
				border: 0px solid #ddd;
				border-radius: 0px;
				padding: 0 10px 0 30px;
				color: #666;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-date-editor /deep/ .el-input__inner:focus {
				border: none;
				border-radius: 0px;
				padding: 0 10px 0 30px;
				box-shadow: none;
				color: #333;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			.el-date-editor.el-input {
				width: 100%;
			}
			/deep/ .el-upload--picture-card {
				background: transparent;
				border: 0;
				border-radius: 0;
				width: auto;
				height: auto;
				line-height: initial;
				vertical-align: middle;
			}
			/deep/ .upload .upload-img {
				border: 1px solid #ddd;
				cursor: pointer;
				border-radius: 8px;
				margin: 5px 0 0 0;
				color: #999;
				width: 60px;
				font-size: 24px;
				line-height: 60px;
				text-align: center;
				height: 60px;
			}
			/deep/ .el-upload-list .el-upload-list__item {
				border: 1px solid #ddd;
				cursor: pointer;
				border-radius: 8px;
				margin: 5px 0 0 0;
				color: #999;
				width: 60px;
				font-size: 24px;
				line-height: 60px;
				text-align: center;
				height: 60px;
			}
			/deep/ .el-upload .el-icon-plus {
				border: 1px solid #ddd;
				cursor: pointer;
				border-radius: 8px;
				margin: 5px 0 0 0;
				color: #999;
				width: 60px;
				font-size: 24px;
				line-height: 60px;
				text-align: center;
				height: 60px;
			}
			/deep/ .el-upload__tip {
				margin: 0;
				color: #838fa1;
				line-height: 24px;
			}
			/deep/ .el-input__inner::placeholder {
				color: #999;
				font-size: 14px;
			}
			.required {
				position: relative;
			}
			.required::after{
				color: red;
				left: 120px;
				position: absolute;
				content: "*";
			}
			.editor {
				border-radius: 10px;
				margin: 10px;
				width: auto;
				height: auto;
			}
			.editor>.avatar-uploader {
				line-height: 0;
				height: 0;
			}
		}
		.list-item.email {
			input {
				border: 0px solid #ddd;
				border-radius: 0px 0 0 0px;
				padding: 0 10px;
				box-shadow: none;
				margin: 0;
				outline: none;
				color: #606266;
				background: none;
				flex: 1;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			input:focus {
				border: none;
				border-radius: 0px 0 0 0px;
				padding: 0 10px;
				box-shadow: none;
				color: #333;
				flex: 1;
				background: none;
				width: 100%;
				font-size: 14px;
				height: 44px;
			}
			input::placeholder {
				color: #999;
				font-size: 14px;
			}
			button {
				border: 0;
				cursor: pointer;
				border-radius: 0 6px 6px 0;
				padding: 0;
				box-shadow: none;
				margin: 0;
				outline: none;
				color: #fff;
				background: #1678ff;
				width: 110px;
				font-size: 15px;
				height: 44px;
			}
			button:hover {
				opacity: 0.8;
			}
		}
		.register-btn {
			margin: 0 auto;
			width: 80%;
		}
		.register-btn1 {
			width: 100%;
		}
		.register-btn2 {
			margin: 10px 0;
			width: 100%;
			text-align: center;
		}
		.r-btn {
			border: 0;
			cursor: pointer;
			padding: 0 10px;
			margin: 20px auto 5px;
			color: #fff;
			display: block;
			font-size: 16px;
			border-radius: 8px;
			box-shadow: none;
			outline: none;
			background: #1678ff;
			width: 100%;
			height: 50px;
		}
		.r-btn:hover {
			opacity: 0.8;
		}
		.r-login {
			cursor: pointer;
			padding: 0 10%;
			color: rgba(159, 159, 159, 1);
			display: inline-block;
			text-decoration: underline;
			font-size: 14px;
			line-height: 1;
		}
		.r-login:hover {
			opacity: 0.5;
		}
	}
}
	
	::-webkit-scrollbar {
	  display: none;
	}
</style>
