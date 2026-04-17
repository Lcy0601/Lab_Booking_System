  

<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"0","position":"relative","background":"#ECECEC","height":"auto"}' v-if="showType==1">
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">




















			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.bianhao" v-model="ruleForm.bianhao" placeholder="编号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshimingcheng" v-model="ruleForm.shiyanshimingcheng" placeholder="实验室名称"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室类型</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshileixing" v-model="ruleForm.shiyanshileixing" placeholder="实验室类型"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">院系</view>
				<picker :disabled="ro.yuanxi" :style='{"width":"100%","flex":"1","height":"auto"}' @change="yuanxiChange" :value="yuanxiIndex" :range="yuanxiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input">{{ruleForm.yuanxi?ruleForm.yuanxi:"请选择院系"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室位置</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshiweizhi" v-model="ruleForm.shiyanshiweizhi" placeholder="实验室位置"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="xianchangzhaopianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">现场照片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.xianchangzhaopian" :src="baseUrl+ruleForm.xianchangzhaopian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">巡查时间</view>
				<input :disabled="ro.xunchashijian" :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.xunchashijian" placeholder="巡查时间" @tap="toggleTab('xunchashijian')"></input>
			</view>
          
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">仪器配置</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.yiqipeizhi" placeholder="仪器配置" :maxlength="-1" :disabled="ro.yiqipeizhi"></textarea>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">巡查项目</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.xunchaxiangmu" placeholder="巡查项目" :maxlength="-1" :disabled="ro.xunchaxiangmu"></textarea>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","borderRadius":"60rpx","borderWidth":"2rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">巡查记录</view>
				<xia-editor ref="xunchajilu" :style='{"minHeight":"300rpx","border":"0px solid #efefef","padding":"12rpx 24rpx 24rpx 24rpx","borderRadius":"0 0 60rpx 60rpx","borderWidth":"2rpx 0 0 0","width":"100%","height":"auto"}' v-model="ruleForm.xunchajilu" placeholder="巡查记录" @editorChange="xunchajiluChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","padding":"0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"50rpx","background":"linear-gradient(117.51deg, rgb(55, 150, 153) 4.058%,rgb(119, 230, 232) 98.305%)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap(null)" class="bg-red">提交</button>
			</view>
		</form>
		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="xunchashijianConfirm" ref="xunchashijian" themeColor="#333333"></w-picker>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
	import xiaEditor from '@/components/xia-editor/xia-editor';
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				cross:'',
				ruleForm: {
				bianhao: '',
				shiyanshimingcheng: '',
				shiyanshileixing: '',
				yuanxi: '',
				shiyanshiweizhi: '',
				yiqipeizhi: '',
				xianchangzhaopian: '',
				xunchaxiangmu: '',
				xunchashijian: '',
				xunchajilu: '',
				},
				yuanxiOptions: [],
				yuanxiIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   bianhao : false,
				   shiyanshimingcheng : false,
				   shiyanshileixing : false,
				   yuanxi : false,
				   shiyanshiweizhi : false,
				   yiqipeizhi : false,
				   xianchangzhaopian : false,
				   xunchaxiangmu : false,
				   xunchashijian : false,
				   xunchajilu : false,
				},
				virtualPay: false,
				showType: 1,
			}
		},
		components: {
			wPicker,
			xiaEditor,
			multipleSelect,
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			sessionForm() {
				return uni.getStorageSync("appUserid")?JSON.parse(uni.getStorageSync('userSession')):{}
			},



		},
		async onLoad(options) {
			if(options.virtualPay){
				this.virtualPay = true
			}
			this.ruleForm.xunchashijian =  this.$utils.getCurDateTime();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取

			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='bianhao'){
						this.ruleForm.bianhao = obj[o];
						this.ro.bianhao = true;
						continue;
					}
					if(o=='shiyanshimingcheng'){
						this.ruleForm.shiyanshimingcheng = obj[o];
						this.ro.shiyanshimingcheng = true;
						continue;
					}
					if(o=='shiyanshileixing'){
						this.ruleForm.shiyanshileixing = obj[o];
						this.ro.shiyanshileixing = true;
						continue;
					}
					if(o=='yuanxi'){
						this.ruleForm.yuanxi = obj[o];
						for(let x in this.yuanxiOptions) {
							if(this.yuanxiOptions[x] == this.ruleForm.yuanxi) {
								this.yuanxiIndex = Number(x)
							}
						}
						this.ro.yuanxi = true;
						continue;
					}
					if(o=='shiyanshiweizhi'){
						this.ruleForm.shiyanshiweizhi = obj[o];
						this.ro.shiyanshiweizhi = true;
						continue;
					}
					if(o=='yiqipeizhi'){
						this.ruleForm.yiqipeizhi = obj[o];
						this.ro.yiqipeizhi = true;
						continue;
					}
					if(o=='xianchangzhaopian'){
						this.ruleForm.xianchangzhaopian = obj[o].split(",")[0];
						this.ro.xianchangzhaopian = true;
						continue;
					}
					if(o=='xunchaxiangmu'){
						this.ruleForm.xunchaxiangmu = obj[o];
						this.ro.xunchaxiangmu = true;
						continue;
					}
					if(o=='xunchashijian'){
						this.ruleForm.xunchashijian = obj[o];
						this.ro.xunchashijian = true;
						continue;
					}
					if(o=='xunchajilu'){
						this.ruleForm.xunchajilu = obj[o];
						this.ro.xunchajilu = true;
						continue;
					}
				}
			}

			var yuanxiRefParams = {}
			// 下拉框
			res = await this.$api.option(`yuanxi`,`yuanxi`,yuanxiRefParams);
			this.yuanxiOptions = res.data;
			this.yuanxiOptions.unshift("请选择院系");
			if(this.ruleForm.yuanxi) {
				for(let x in this.yuanxiOptions) {
					if(this.yuanxiOptions[x] == this.ruleForm.yuanxi) {
						this.yuanxiIndex = Number(x)
					}
				}
			}

			// 如果有登录，获取登录后保存的userid
			this.ruleForm.userid = uni.getStorageSync("appUserid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = Number(options.refid);
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`xunchajilu`, this.ruleForm.id);
				if(res.data.yuanxi) {
					for(let x in this.yuanxiOptions) {
						if(this.yuanxiOptions[x] == res.data.yuanxi) {
							this.yuanxiIndex = Number(x)
						}
					}
				}
				this.ruleForm = res.data;
			}
			this.$forceUpdate()
			if (uni.getStorageSync('raffleType') && uni.getStorageSync('raffleType') != null) {
				uni.removeStorageSync('raffleType')
				setTimeout(() => {
					this.onSubmitTap(null)
				}, 300)
			}
		},
		methods: {
			numberChange(e,name) {
				this.ruleForm[name] = Number(e.detail.value)
			},
			xunchajiluChange(e) {
				this.ruleForm.xunchajilu = e
			},

			// 多级联动参数


			// 日长控件选择日期时间
			xunchashijianConfirm(val) {
				this.ruleForm.xunchashijian = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			yuanxiChange(e) {
				this.yuanxiIndex = e.target.value
				this.ruleForm.yuanxi = this.yuanxiOptions[this.yuanxiIndex]
			},

			xianchangzhaopianTap() {
				if(this.ro.xianchangzhaopian){
					return false
				}
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.xianchangzhaopian = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap(subMitType=null) {
				let that = this
				//跨表计算判断
				var obj;
				if((!this.ruleForm.bianhao)){
					this.$utils.msg(`编号不能为空`);
					return
				}
				if((!this.ruleForm.shiyanshimingcheng)){
					this.$utils.msg(`实验室名称不能为空`);
					return
				}
				if((!this.ruleForm.shiyanshileixing)){
					this.$utils.msg(`实验室类型不能为空`);
					return
				}
				//更新跨表属性
				var crossuserid;
				var crossrefid;
				var crossoptnum;
				if(this.cross){
					var statusColumnName = uni.getStorageSync('statusColumnName');
					var statusColumnValue = uni.getStorageSync('statusColumnValue');
					if(statusColumnName!='') {
						if(!obj) {
							obj = uni.getStorageSync('crossObj');
						}
						if(!statusColumnName.startsWith("[")) {
							for (var o in obj){
								if(o==statusColumnName){
									obj[o] = statusColumnValue;
								}
							}
							var table = uni.getStorageSync('crossTable');
							await this.$api.update(`${table}`, obj);
						} else {
								crossuserid=Number(uni.getStorageSync('appUserid'));
								crossrefid=obj['id'];
								crossoptnum=uni.getStorageSync('statusColumnName');
								crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
						}
					}
					if(crossrefid && crossuserid) {
						this.ruleForm.crossuserid=crossuserid;
						this.ruleForm.crossrefid=crossrefid;
						let params = {
							page: 1,
							limit:10,
							crossuserid:crossuserid,
							crossrefid:crossrefid,
						}
						let res = await this.$api.list(`xunchajilu`, params);
						if (res.data.total >= crossoptnum) {
							this.$utils.msg(uni.getStorageSync('tips'));
							uni.removeStorageSync('crossCleanType');
							return false;
						}
					}
					//跨表计算
				}
				let oet = {}
				if(this.ruleForm.id){
					await this.$api.update(`xunchajilu`, this.ruleForm);
				}else{
					oet = await this.$api.add(`xunchajilu`, this.ruleForm);
				}
				if(this.cross){
					uni.setStorageSync('crossCleanType',true);
				}
				that.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				if(this.ro[str]){
					return false
				}
				this.$refs[str].show();
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
