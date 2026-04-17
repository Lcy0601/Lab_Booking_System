<template>
<view class="content">
	<view class="register-box" :style="{'backgroundImage': indexBgUrl?`url(${$base.url + indexBgUrl})`:''}">
		<view :style='{"border":"2rpx solid #ffffff","padding":"40rpx 40rpx 24rpx 40rpx","margin":"60rpx 0 0 0","borderRadius":"20rpx","background":"url(http://codegen.caihongy.cn/20251217/9976d1c4a87244068dec1fd4f984c227.png)","display":"block","width":"600rpx","position":"relative","height":"auto"}'>
			<image :style='{"border":"2rpx solid rgba(255, 255, 255, 0.5)","margin":"0 auto","transform":"translate(0 , -70rpx)","borderRadius":"50%","objectFit":"cover","display":"none","width":"140rpx","position":"relative","height":"140rpx"}' :src="indexLogoUrl?($base.url + indexLogoUrl):'http://codegen.caihongy.cn/20241217/dd3277f778034c7b8fa2649d48df74d6.png'" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">学生学号：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxuehao" v-model="ruleForm.xueshengxuehao"  type="text"  class="uni-input" name="" placeholder="学生学号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">学生姓名：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming"  type="text"  class="uni-input" name="" placeholder="学生姓名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">密码：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">确认密码：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" :disabled="ro.xingbie" @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
					<view>
						<view :style='{"lineHeight":"40rpx","fontSize":"28rpx","color":"rgb(55, 150, 153)","flex":"none"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">手机号：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.shoujihao" v-model="ruleForm.shoujihao"  type="text"  class="uni-input" name="" placeholder="手机号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" @tap="xueshengtouxiangTap" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">头像：</view>
				<image :style='{"width":"120rpx","borderRadius":"20rpx","display":"block","height":"120rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"120rpx","borderRadius":"20rpx","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">专业：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhuanye" v-model="ruleForm.zhuanye"  type="text"  class="uni-input" name="" placeholder="专业" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">院系：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='xuesheng'" :disabled="ro.yuanxi" @change="xueshengyuanxiChange" :value="xueshengyuanxiIndex" :range="xueshengyuanxiOptions">
					<view>
						<view :style='{"lineHeight":"40rpx","fontSize":"28rpx","color":"rgb(55, 150, 153)","flex":"none"}' class="uni-input">{{ruleForm.yuanxi?ruleForm.yuanxi:"请选择院系"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">教师账号：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshizhanghao" v-model="ruleForm.jiaoshizhanghao"  type="text"  class="uni-input" name="" placeholder="教师账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">教师姓名：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming"  type="text"  class="uni-input" name="" placeholder="教师姓名" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">密码：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.mima" v-model="ruleForm.mima" type="password"  class="uni-input" name="" placeholder="密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">确认密码：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' v-model="ruleForm.mima2" type="password" class="uni-input" name="" placeholder="确认密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">性别：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" :disabled="ro.xingbie" @change="jiaoshixingbieChange" :value="jiaoshixingbieIndex" :range="jiaoshixingbieOptions">
					<view>
						<view :style='{"lineHeight":"40rpx","fontSize":"28rpx","color":"rgb(55, 150, 153)","flex":"none"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">联系电话：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.lianxidianhua" v-model="ruleForm.lianxidianhua"  type="text"  class="uni-input" name="" placeholder="联系电话" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" @tap="jiaoshitouxiangTap" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">头像：</view>
				<image :style='{"width":"120rpx","borderRadius":"20rpx","display":"block","height":"120rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"120rpx","borderRadius":"20rpx","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">院系：</view>
				<picker :style='{"width":"100%","margin":"0 0 24rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" :disabled="ro.yuanxi" @change="jiaoshiyuanxiChange" :value="jiaoshiyuanxiIndex" :range="jiaoshiyuanxiOptions">
					<view>
						<view :style='{"lineHeight":"40rpx","fontSize":"28rpx","color":"rgb(55, 150, 153)","flex":"none"}' class="uni-input">{{ruleForm.yuanxi?ruleForm.yuanxi:"请选择院系"}}</view>
					</view>
				</picker>
			</view>
			<view :style='{"width":"100%","margin":"0 0 40rpx 0","flexDirection":"column","display":"flex","height":"auto"}' v-if="tableName=='jiaoshi'" class="uni-form-item uni-column">
				<view :style='{"padding":"0 0 12rpx 0px","whiteSpace":"nowrap","color":"#333","textAlign":"left","width":"100%","lineHeight":"40rpx","fontSize":"28rpx"}' class="label">专业方向：</view>
				<input :style='{"padding":"0 24rpx 0 24rpx","margin":"0","borderColor":"#37969950","color":"#333","borderRadius":"40rpx","flex":"none","background":"none","borderWidth":"2rpx","fontSize":"28rpx","borderStyle":"solid","height":"88rpx"}' :disabled="ro.zhuanyefangxiang" v-model="ruleForm.zhuanyefangxiang"  type="text"  class="uni-input" name="" placeholder="专业方向" />
			</view>
			<button :style='{"border":"0","padding":"0px","margin":"0 0 24rpx 0","color":"#fff","borderRadius":"40rpx","background":"#379699","width":"100%","lineHeight":"88rpx","fontSize":"32rpx","fontWeight":"600","height":"88rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
			
			<view class="idea1" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea1</view>
			<view class="idea2" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea2</view>
			<view class="idea3" :style='{"width":"100%","background":"red","display":"none","height":"80rpx"}'>idea3</view>
		</view>
	</view>
</view>
</template>

<script>
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
				xueshengyuanxiOptions: [],
				xueshengyuanxiIndex: 0,
				jiaoshixingbieOptions: [],
				jiaoshixingbieIndex: 0,
				jiaoshiyuanxiOptions: [],
				jiaoshiyuanxiIndex: 0,
				ruleForm: {
				xueshengxuehao: '',
				xueshengxingming: '',
				mima: '',
				xingbie: '',
				shoujihao: '',
				touxiang: '',
				zhuanye: '',
				yuanxi: '',
				jiaoshizhanghao: '',
				jiaoshixingming: '',
				mima: '',
				xingbie: '',
				lianxidianhua: '',
				touxiang: '',
				yuanxi: '',
				zhuanyefangxiang: '',
				},
				ro: {},
				tableName:"",
				indexBgUrl: '',
				indexLogoUrl: '',
			}
		},
		components: {
			multipleSelect
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
			this.tableName = table;

			if(this.tableName=='xuesheng'){
				// 自定义下拉框值
				this.xueshengxingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.xueshengxingbieOptions[0]
				var yuanxiRefParams = {}
				res = await this.$api.option(`yuanxi`,`yuanxi`,yuanxiRefParams);
				this.xueshengyuanxiOptions = res.data;
				this.xueshengyuanxiOptions.unshift("请选择院系");
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
				// 自定义下拉框值
				this.jiaoshixingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.jiaoshixingbieOptions[0]
				var yuanxiRefParams = {}
				res = await this.$api.option(`yuanxi`,`yuanxi`,yuanxiRefParams);
				this.jiaoshiyuanxiOptions = res.data;
				this.jiaoshiyuanxiOptions.unshift("请选择院系");
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
			
			this.styleChange()
		},
		methods: {

			// 下拉变化
			xueshengxingbieChange(e) {
					this.xueshengxingbieIndex = e.target.value
					this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
			},
			xueshengtouxiangTap() {
				if(this.ro.touxiang) {
					return false
				}
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},
			// 下拉变化
			xueshengyuanxiChange(e) {
					this.xueshengyuanxiIndex = e.target.value
					this.ruleForm.yuanxi = this.xueshengyuanxiOptions[this.xueshengyuanxiIndex]
			},
			// 下拉变化
			jiaoshixingbieChange(e) {
					this.jiaoshixingbieIndex = e.target.value
					this.ruleForm.xingbie = this.jiaoshixingbieOptions[this.jiaoshixingbieIndex]
			},
			jiaoshitouxiangTap() {
				if(this.ro.touxiang) {
					return false
				}
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},
			// 下拉变化
			jiaoshiyuanxiChange(e) {
					this.jiaoshiyuanxiIndex = e.target.value
					this.ruleForm.yuanxi = this.jiaoshiyuanxiOptions[this.jiaoshiyuanxiIndex]
			},
			toggleTab(str,str1) {
				if(this.ro[str1]){
					return false
				}
				this.$refs[str + str1].show();
			},

			async styleChange() {
				let rs = await this.$api.getPublic('config/info?name=appRegisterBackgroudImg')
				this.indexBgUrl = rs.data?rs.data.value:''
				rs = await this.$api.getPublic('config/info?name=appRegLogo')
				this.indexLogoUrl = rs.data?rs.data.value:''
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			// 注册
			async register() {
				
				if((!this.ruleForm.xueshengxuehao) && `xuesheng` == this.tableName){
					this.$utils.msg(`学生学号不能为空`);
					return
				}
				if((!this.ruleForm.xueshengxingming) && `xuesheng` == this.tableName){
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `xuesheng` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
					this.$utils.msg(`两次密码输入不一致`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
					this.$utils.msg(`手机号应输入手机格式`);
					return
				}
				if((!this.ruleForm.jiaoshizhanghao) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师账号不能为空`);
					return
				}
				if((!this.ruleForm.jiaoshixingming) && `jiaoshi` == this.tableName){
					this.$utils.msg(`教师姓名不能为空`);
					return
				}
				if((!this.ruleForm.mima) && `jiaoshi` == this.tableName){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && (this.ruleForm.mima!=this.ruleForm.mima2)){
					this.$utils.msg(`两次密码输入不一致`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	.register-box{
		padding: 24rpx;
		background: url(http://codegen.caihongy.cn/20251217/11a917b614e14e09bb55c5797bd392cf.jpg) no-repeat center / cover;
		display: flex;
		width: 100%;
		min-height: 100vh;
		justify-content: center;
		align-items: center;
		height: auto;
	}
</style>
