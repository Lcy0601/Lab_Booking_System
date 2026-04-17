<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100%","width":"100%","padding":"0","position":"relative","background":"#ECECEC","height":"auto"}'>
		<view :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}'>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>学生学号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xueshengxuehao"  v-model="ruleForm.xueshengxuehao" placeholder="学生学号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>学生姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xueshengxingming"  v-model="ruleForm.xueshengxingming" placeholder="学生姓名"></input>
			</view>
			<view v-if="tableName=='xuesheng'" :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' :disabled="ro.xingbie" @change="xueshengxingbieChange" :value="xueshengxingbieIndex" :range="xueshengxingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>手机号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shoujihao"  v-model="ruleForm.shoujihao" placeholder="手机号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='xuesheng'" @tap="xueshengtouxiangTap" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='xuesheng'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>专业</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zhuanye"  v-model="ruleForm.zhuanye" placeholder="专业"></input>
			</view>
			<view v-if="tableName=='xuesheng'" :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">院系</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' :disabled="ro.yuanxi" @change="xueshengyuanxiChange" :value="xueshengyuanxiIndex" :range="xueshengyuanxiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input picker-select-input">{{ruleForm.yuanxi?ruleForm.yuanxi:"请选择院系"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>教师账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiaoshizhanghao"  v-model="ruleForm.jiaoshizhanghao" placeholder="教师账号"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>教师姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiaoshixingming"  v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"></input>
			</view>
			<view v-if="tableName=='jiaoshi'" :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' :disabled="ro.xingbie" @change="jiaoshixingbieChange" :value="jiaoshixingbieIndex" :range="jiaoshixingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>联系电话</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.lianxidianhua"  v-model="ruleForm.lianxidianhua" placeholder="联系电话"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiaoshi'" @tap="jiaoshitouxiangTap" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view v-if="tableName=='jiaoshi'" :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">院系</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}' :disabled="ro.yuanxi" @change="jiaoshiyuanxiChange" :value="jiaoshiyuanxiIndex" :range="jiaoshiyuanxiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input picker-select-input">{{ruleForm.yuanxi?ruleForm.yuanxi:"请选择院系"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='jiaoshi'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}'>专业方向</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"#000","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zhuanyefangxiang"  v-model="ruleForm.zhuanyefangxiang" placeholder="专业方向"></input>
			</view>
			<view :style='{"width":"100%","padding":"0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"border":"0","padding":"0px","margin":"0","color":"#fff","borderRadius":"50rpx","background":"linear-gradient(45deg, #37969b 0%,#77e6e6 100%)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'>保存</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"border":"#BED3D4","padding":"0px","margin":"20rpx 0 0","color":"#298284","borderRadius":"50rpx","background":"#BED3D4","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>

	import xiaEditor from '@/components/xia-editor/xia-editor';
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				ro: {},
				xueshengxingbieOptions: [],
				xueshengxingbieIndex: 0,
				xueshengyuanxiOptions: [],
				xueshengyuanxiIndex: 0,
				jiaoshixingbieOptions: [],
				jiaoshixingbieIndex: 0,
				jiaoshiyuanxiOptions: [],
				jiaoshiyuanxiIndex: 0,
			}
		},
		components: {
			multipleSelect,
			xiaEditor
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let that = this
			let res = {}
			this.tableName = table;
			this.getSession()
			if(this.tableName=='xuesheng'){
				// 自定义下拉框值
				this.xueshengxingbieOptions = "男,女".split(',');
				this.xueshengxingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.xueshengxingbieIndex = index;
					}
				});
				// 下拉框
				var yuanxiRefParams = {}
				res = await this.$api.option(`yuanxi`,`yuanxi`,yuanxiRefParams);
				this.xueshengyuanxiOptions = res.data;
				this.xueshengyuanxiOptions.unshift("请选择院系");
				this.xueshengyuanxiOptions.forEach((item, index) => {
					if(item==this.ruleForm.yuanxi) {
						this.xueshengyuanxiIndex = index;
					}
				});
				this.ro = {
					xueshengxuehao: true,
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
				this.jiaoshixingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.jiaoshixingbieIndex = index;
					}
				});
				// 下拉框
				var yuanxiRefParams = {}
				res = await this.$api.option(`yuanxi`,`yuanxi`,yuanxiRefParams);
				this.jiaoshiyuanxiOptions = res.data;
				this.jiaoshiyuanxiOptions.unshift("请选择院系");
				this.jiaoshiyuanxiOptions.forEach((item, index) => {
					if(item==this.ruleForm.yuanxi) {
						this.jiaoshiyuanxiIndex = index;
					}
				});
				this.ro = {
					jiaoshizhanghao: true,
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
			this.$forceUpdate()
		},
		methods: {
			async getSession(){
				let res = await this.$api.session(this.tableName)
				this.ruleForm = res.data;
				uni.setStorageSync('userSession',JSON.stringify(res.data))
			},
			// 下拉变化
			xueshengxingbieChange(e) {
				this.xueshengxingbieIndex = e.target.value
				this.ruleForm.xingbie = this.xueshengxingbieOptions[this.xueshengxingbieIndex]
			},
			xueshengtouxiangTap() {
				if(this.ro.touxiang){
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
				if(this.ro.touxiang){
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

			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('. .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.userInfoForm.list.input.backgroundColor
					// })
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.clearStorageSync()
				this.$utils.jump('../login/login');
			},
			// 注册
			async update() {
				if(`xuesheng` == this.tableName&&(!this.ruleForm.xueshengxuehao)){
					this.$utils.msg(`学生学号不能为空`);
					return
				}
				if(`xuesheng` == this.tableName&&(!this.ruleForm.xueshengxingming)){
					this.$utils.msg(`学生姓名不能为空`);
					return
				}
				if(`xuesheng` == this.tableName&&(!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`xuesheng` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
					this.$utils.msg(`手机号应输入手机格式`);
					return
				}
				if(`jiaoshi` == this.tableName&&(!this.ruleForm.jiaoshizhanghao)){
					this.$utils.msg(`教师账号不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName&&(!this.ruleForm.jiaoshixingming)){
					this.$utils.msg(`教师姓名不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName&&(!this.ruleForm.mima)){
					this.$utils.msg(`密码不能为空`);
					return
				}
				if(`jiaoshi` == this.tableName && this.ruleForm.lianxidianhua&&(!this.$validate.isMobile(this.ruleForm.lianxidianhua))){
					this.$utils.msg(`联系电话应输入手机格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
				this.getSession()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
