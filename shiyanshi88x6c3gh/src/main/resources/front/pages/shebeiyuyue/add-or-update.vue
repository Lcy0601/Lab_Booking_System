  

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
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">归还状态</view>
				<picker :disabled="ro.guihaizhuangtai" :style='{"width":"100%","flex":"1","height":"auto"}' @change="guihaizhuangtaiChange" :value="guihaizhuangtaiIndex" :range="guihaizhuangtaiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input">{{ruleForm.guihaizhuangtai?ruleForm.guihaizhuangtai:"请选择归还状态"}}</view>
				</picker>
			</view>
                
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">用途</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.yongtu" placeholder="用途" :maxlength="-1" :disabled="ro.yongtu"></textarea>
			</view>
			
			<view :style='{"width":"100%","padding":"0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"50rpx","background":"linear-gradient(117.51deg, rgb(55, 150, 153) 4.058%,rgb(119, 230, 232) 98.305%)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap(null)" class="bg-red">提交</button>
			</view>
		</form>
		<w-picker  mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="jieyongshijianConfirm" ref="jieyongshijian" themeColor="#333333"></w-picker>
	</view>
	<view v-else-if="showType==2">
		<view style="width: 100%;display: flex;flex-wrap: wrap;padding: 10px;">
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shebeiyuyue','学生预约次数'))||(!userid&&isAuthFront('shebeiyuyue','学生预约次数'))" size="mini" type="primary" @click="chartClick1()">
				学生预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shebeiyuyue','院系预约次数'))||(!userid&&isAuthFront('shebeiyuyue','院系预约次数'))" size="mini" type="primary" @click="chartClick2()">
				院系预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shebeiyuyue','设备预约次数'))||(!userid&&isAuthFront('shebeiyuyue','设备预约次数'))" size="mini" type="primary" @click="chartClick3()">
				设备预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shebeiyuyue','设备归还占比'))||(!userid&&isAuthFront('shebeiyuyue','设备归还占比'))" size="mini" type="primary" @click="chartClick4()">
				设备归还占比
			</button>
		</view>
		<view style="width: 100%;">
			<view v-if="chartType1" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				学生预约次数
			</view>
			<qiun-data-charts
				v-if="chartType1"
				style="width: 100%;height:"
				type="column"
				:opts="opts1"
				:chartData="chartData1">
			</qiun-data-charts>
			<view v-if="chartType2" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				院系预约次数
			</view>
			<qiun-data-charts
				v-if="chartType2"
				style="width: 100%;height:"
				type="column"
				:opts="opts2"
				:chartData="chartData2">
			</qiun-data-charts>
			<view v-if="chartType3" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				设备预约次数
			</view>
			<qiun-data-charts
				v-if="chartType3"
				style="width: 100%;height:"
				type="column"
				:opts="opts3"
				:chartData="chartData3">
			</qiun-data-charts>
			<view v-if="chartType4" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				设备归还占比
			</view>
			<qiun-data-charts
				v-if="chartType4"
				style="width: 100%;height:"
				type="pie"
				:opts="opts4"
				:chartData="chartData4">
			</qiun-data-charts>
		</view>
	</view>
</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";
	import xiaEditor from '@/components/xia-editor/xia-editor';
	import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	import qiunDataCharts from '@/components/qiun-data-charts/components/qiun-data-charts/qiun-data-charts.vue';
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
				guihaizhuangtai: '待归还' ,
				yongtu: '',
				shhf: '',
				},
				guihaizhuangtaiOptions: [],
				guihaizhuangtaiIndex: 0,
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
				   guihaizhuangtai : false,
				   yongtu : false,
				   sfsh : false,
				   shhf : false,
				},
				virtualPay: false,
				showType: 1,
				userid: '',
				chartData1: {},
				opts1: {},
				chartType1: false,
				chartData2: {},
				opts2: {},
				chartType2: false,
				chartData3: {},
				opts3: {},
				chartType3: false,
				chartData4: {},
				opts4: {},
				chartType4: false,
			}
		},
		components: {
			wPicker,
			xiaEditor,
			multipleSelect,
			qiunDataCharts,
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
			if(options.showType) {
				this.showType = 2
				if(options.userid&&options.userid!='') {
					this.userid = options.userid
				}
				return false
			}else {
				this.showType = 1
			}
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

			this.ro.guihaizhuangtai = true;
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
					if(o=='guihaizhuangtai'){
						this.ruleForm.guihaizhuangtai = obj[o];
						for(let x in this.guihaizhuangtaiOptions) {
							if(this.guihaizhuangtaiOptions[x] == this.ruleForm.guihaizhuangtai) {
								this.guihaizhuangtaiIndex = Number(x)
							}
						}
						this.ro.guihaizhuangtai = true;
						continue;
					}
					if(o=='yongtu'){
						this.ruleForm.yongtu = obj[o];
						this.ro.yongtu = true;
						continue;
					}
				}
				this.ruleForm.shuliang = 0
				this.ro.shuliang = false
			}

			// 自定义下拉框值
			this.guihaizhuangtaiOptions = "已归还,待归还".split(',')
			this.guihaizhuangtaiOptions.unshift("请选择归还状态");
			if(this.ruleForm.guihaizhuangtai) {
				for(let x in this.guihaizhuangtaiOptions) {
					if(this.guihaizhuangtaiOptions[x] == this.ruleForm.guihaizhuangtai) {
						this.guihaizhuangtaiIndex = Number(x)
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
				res = await this.$api.info(`shebeiyuyue`, this.ruleForm.id);
				if(res.data.guihaizhuangtai) {
					for(let x in this.guihaizhuangtaiOptions) {
						if(this.guihaizhuangtaiOptions[x] == res.data.guihaizhuangtai) {
							this.guihaizhuangtaiIndex = Number(x)
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

			// 多级联动参数


			// 日长控件选择日期时间
			jieyongshijianConfirm(val) {
				this.ruleForm.jieyongshijian = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			guihaizhuangtaiChange(e) {
				this.guihaizhuangtaiIndex = e.target.value
				this.ruleForm.guihaizhuangtai = this.guihaizhuangtaiOptions[this.guihaizhuangtaiIndex]
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
				obj = uni.getStorageSync('crossObj');
				var table = uni.getStorageSync('crossTable');
				if((parseFloat(obj.shuliang)<parseFloat(this.ruleForm.shuliang))){
					this.$utils.msg("借用数量不足");
					return
				}
				if(this.ruleForm.shuliang<=0){
					this.$utils.msg("借用数量不能为0");
					return
				}
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
						let res = await this.$api.list(`shebeiyuyue`, params);
						if (res.data.total >= crossoptnum) {
							this.$utils.msg(uni.getStorageSync('tips'));
							uni.removeStorageSync('crossCleanType');
							return false;
						}
					}
					//跨表计算
					if(!obj) {
						obj = uni.getStorageSync('crossObj');
					}
					var table = uni.getStorageSync('crossTable');
				}
				let oet = {}
				if(this.ruleForm.id){
					await this.$api.update(`shebeiyuyue`, this.ruleForm);
				}else{
					oet = await this.$api.add(`shebeiyuyue`, this.ruleForm);
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
			async chartClick1() {
				let params = {}
				let res = await this.$api.getPublic('shebeiyuyue/value/xueshengxuehao/shuliang', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['xueshengxuehao']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['xueshengxuehao']
					})
				}
				this.opts1 = {
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [15,15,10,5],
					enableScroll: false,
					xAxis: {
						disableGrid: true,
						rotateLabel: true,
						rotateAngle: 30
					},
					legend: {
						show: false
					},
					yAxis: {},
					extra: {
						column: {
							type: "group",
							width: 30,
							activeBgColor: "#000000",
							activeBgOpacity: 0.08
						}
					}
				}
				this.chartData1 = {
					categories: xAxis,
					series: [
						{
							data: yAxis,
							name: ''
						}
					]
				};
				this.chartType1 = true
			},
			async chartClick2() {
				let params = {}
				let res = await this.$api.getPublic('shebeiyuyue/value/yuanxi/shuliang', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['yuanxi']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['yuanxi']
					})
				}
				this.opts2 = {
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [15,15,10,5],
					enableScroll: false,
					xAxis: {
						disableGrid: true,
						rotateLabel: true,
						rotateAngle: 30
					},
					legend: {
						show: false
					},
					yAxis: {},
					extra: {
						column: {
							type: "group",
							width: 30,
							activeBgColor: "#000000",
							activeBgOpacity: 0.08
						}
					}
				}
				this.chartData2 = {
					categories: xAxis,
					series: [
						{
							data: yAxis,
							name: ''
						}
					]
				};
				this.chartType2 = true
			},
			async chartClick3() {
				let params = {}
				let res = await this.$api.getPublic('shebeiyuyue/value/shebeimingcheng/shuliang', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['shebeimingcheng']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['shebeimingcheng']
					})
				}
				this.opts3 = {
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [15,15,10,5],
					enableScroll: false,
					xAxis: {
						disableGrid: true,
						rotateLabel: true,
						rotateAngle: 30
					},
					legend: {
						show: false
					},
					yAxis: {},
					extra: {
						column: {
							type: "group",
							width: 30,
							activeBgColor: "#000000",
							activeBgOpacity: 0.08
						}
					}
				}
				this.chartData3 = {
					categories: xAxis,
					series: [
						{
							data: yAxis,
							name: ''
						}
					]
				};
				this.chartType3 = true
			},
			async chartClick4() {
				let params = {}
				let res = await this.$api.getPublic('shebeiyuyue/value/guihaizhuangtai/shuliang', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['guihaizhuangtai']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['guihaizhuangtai']
					})
				}
				this.opts4 = {
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [5,5,5,5],
					enableScroll: false,
					extra: {
						pie: {
							activeOpacity: 0.5,
							activeRadius: 10,
							offsetAngle: 0,
							labelWidth: 15,
							border: false,
							borderWidth: 3,
							borderColor: "#FFFFFF"
						}
					}
				}
				this.chartData4 = {
					series: [
						{
							data: pArray
						}
					]
				};
				this.chartType4 = true
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
