  

<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"0","position":"relative","background":"#ECECEC","height":"auto"}' v-if="showType==1">
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">






























			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">预约编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)","flex":"1"}' class="right-input">
					{{ruleForm.yuyuebianhao}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">设备编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shebeibianhao" v-model="ruleForm.shebeibianhao" placeholder="设备编号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">设备名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shebeimingcheng" v-model="ruleForm.shebeimingcheng" placeholder="设备名称"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">设备分类</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shebeifenlei" v-model="ruleForm.shebeifenlei" placeholder="设备分类"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">院系</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yuanxi" v-model="ruleForm.yuanxi" placeholder="院系"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">借用数量</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shuliang" v-model="ruleForm.shuliang" placeholder="借用数量" type="number" @input="(e)=>numberChange(e,'shuliang')"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="fengmianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">封面</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.fengmian" :src="baseUrl+ruleForm.fengmian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">型号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xinghao" v-model="ruleForm.xinghao" placeholder="型号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">借用时间</view>
				<input :disabled="ro.jieyongshijian" :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.jieyongshijian" placeholder="借用时间" @tap="toggleTab('jieyongshijian')"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">学生学号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xueshengxuehao" v-model="ruleForm.xueshengxuehao" placeholder="学生学号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">学生姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.xueshengxingming" v-model="ruleForm.xueshengxingming" placeholder="学生姓名"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">手机号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shoujihao" v-model="ruleForm.shoujihao" placeholder="手机号"  type="text"></input>
			</view>
               
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">取消说明</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.quxiaoshuoming" placeholder="取消说明" :maxlength="-1" :disabled="ro.quxiaoshuoming"></textarea>
			</view>
			
			<view :style='{"width":"100%","padding":"0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"50rpx","background":"linear-gradient(117.51deg, rgb(55, 150, 153) 4.058%,rgb(119, 230, 232) 98.305%)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap(null)" class="bg-red">提交</button>
			</view>
		</form>
		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="jieyongshijianConfirm" ref="jieyongshijian" themeColor="#333333"></w-picker>
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
				yuyuebianhao: this.getUUID(),
				shebeibianhao: '',
				shebeimingcheng: '',
				shebeifenlei: '',
				yuanxi: '',
				shuliang: '',
				fengmian: '',
				xinghao: '',
				jieyongshijian: '',
				xueshengxuehao: '',
				xueshengxingming: '',
				shoujihao: '',
				quxiaoshuoming: '',
				shhf: '',
				},
				// 登录用户信息
				user: {},
				ro:{
				   yuyuebianhao : false,
				   shebeibianhao : false,
				   shebeimingcheng : false,
				   shebeifenlei : false,
				   yuanxi : false,
				   shuliang : false,
				   fengmian : false,
				   xinghao : false,
				   jieyongshijian : false,
				   xueshengxuehao : false,
				   xueshengxingming : false,
				   shoujihao : false,
				   quxiaoshuoming : false,
				   sfsh : false,
				   shhf : false,
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
			this.ruleForm.jieyongshijian =  this.$utils.getCurDateTime();
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.xueshengxuehao = this.user.xueshengxuehao
			this.ro.xueshengxuehao = true;
			this.ruleForm.xueshengxingming = this.user.xueshengxingming
			this.ro.xueshengxingming = true;
			this.ruleForm.shoujihao = this.user.shoujihao
			this.ro.shoujihao = true;

			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='yuyuebianhao'){
						this.ruleForm.yuyuebianhao = obj[o];
						this.ro.yuyuebianhao = true;
						continue;
					}
					if(o=='shebeibianhao'){
						this.ruleForm.shebeibianhao = obj[o];
						this.ro.shebeibianhao = true;
						continue;
					}
					if(o=='shebeimingcheng'){
						this.ruleForm.shebeimingcheng = obj[o];
						this.ro.shebeimingcheng = true;
						continue;
					}
					if(o=='shebeifenlei'){
						this.ruleForm.shebeifenlei = obj[o];
						this.ro.shebeifenlei = true;
						continue;
					}
					if(o=='yuanxi'){
						this.ruleForm.yuanxi = obj[o];
						this.ro.yuanxi = true;
						continue;
					}
					if(o=='shuliang'){
						this.ruleForm.shuliang = obj[o];
						this.ro.shuliang = true;
						continue;
					}
					if(o=='fengmian'){
						this.ruleForm.fengmian = obj[o].split(",")[0];
						this.ro.fengmian = true;
						continue;
					}
					if(o=='xinghao'){
						this.ruleForm.xinghao = obj[o];
						this.ro.xinghao = true;
						continue;
					}
					if(o=='jieyongshijian'){
						this.ruleForm.jieyongshijian = obj[o];
						this.ro.jieyongshijian = true;
						continue;
					}
					if(o=='xueshengxuehao'){
						this.ruleForm.xueshengxuehao = obj[o];
						this.ro.xueshengxuehao = true;
						continue;
					}
					if(o=='xueshengxingming'){
						this.ruleForm.xueshengxingming = obj[o];
						this.ro.xueshengxingming = true;
						continue;
					}
					if(o=='shoujihao'){
						this.ruleForm.shoujihao = obj[o];
						this.ro.shoujihao = true;
						continue;
					}
					if(o=='quxiaoshuoming'){
						this.ruleForm.quxiaoshuoming = obj[o];
						this.ro.quxiaoshuoming = true;
						continue;
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
				res = await this.$api.info(`quxiaoshebeiyuyue`, this.ruleForm.id);
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

			// 多级联动参数


			// 日长控件选择日期时间
			jieyongshijianConfirm(val) {
				this.ruleForm.jieyongshijian = val.result;
				this.$forceUpdate();
			},


			fengmianTap() {
				if(this.ro.fengmian){
					return false
				}
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.fengmian = 'upload/' + res.file;
					_this.$forceUpdate();
				});
			},

			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap(subMitType=null) {
				let that = this
				if(this.ruleForm.yuyuebianhao){
					this.ruleForm.yuyuebianhao = String(this.ruleForm.yuyuebianhao)
				}
				//跨表计算判断
				var obj;
				if(this.ruleForm.shuliang&&(!this.$validate.isIntNumer(this.ruleForm.shuliang))){
					this.$utils.msg(`借用数量应输入整数`);
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
							var notUpdateColumn = 'guihaizhuangtai,guihaizhuangtai'.split(',')
							if(changeInList(statusColumnName,notUpdateColumn)) {
								for (var o in obj){
									if(o==statusColumnName){
										obj[o] = statusColumnValue;
									}
								}
								var table = uni.getStorageSync('crossTable');
								await this.$api.update(`${table}`, obj);
							}
							function changeInList(name,arr){
								for(let x in arr) {
									if(arr[x] == name) {
										return false
									}
								}
								return true
							}
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
						let res = await this.$api.list(`quxiaoshebeiyuyue`, params);
						if (res.data.total >= crossoptnum) {
							this.$utils.msg(uni.getStorageSync('tips'));
							uni.removeStorageSync('crossCleanType');
							return false;
						}
					}
					//跨表计算
				}
				if(this.cross) {
					var ott = await this.$api.postPublic('updateColumn/shebeiyuyue/1', {
						csuUpdateColumn: 'guihaizhuangtai',
						csuUpdateColumnValue: '已归还',
						csuConditionColumn: 'yuyuebianhao',
						csuConditionColumnValue: this.ruleForm.yuyuebianhao
					})
					if(ott.code!=0) {
						that.$utils.msg('已归还不能取消');
						return false
					}
				}
				if(this.cross) {
					var ott = await this.$api.postPublic('updateColumn/shebeiyuyue/1', {
						csuUpdateColumn: 'guihaizhuangtai',
						csuUpdateColumnValue: '待归还',
						csuConditionColumn: 'yuyuebianhao',
						csuConditionColumnValue: this.ruleForm.yuyuebianhao
					})
					if(ott.code!=0) {
						that.$utils.msg('待归还');
						return false
					}
				}
				let oet = {}
				if(this.ruleForm.id){
					await this.$api.update(`quxiaoshebeiyuyue`, this.ruleForm);
				}else{
					oet = await this.$api.add(`quxiaoshebeiyuyue`, this.ruleForm);
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
