  

<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"0","position":"relative","background":"#ECECEC","height":"auto"}' v-if="showType==1">
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">
































			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">编号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.bianhao" v-model="ruleForm.bianhao" placeholder="编号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">预约编号</view>
				<view :style='{"padding":"0px 24rpx","margin":"0px","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(0, 0, 0)","flex":"1"}' class="right-input">
					{{ruleForm.yuyuebianhao}}
				</view>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室名称</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshimingcheng" v-model="ruleForm.shiyanshimingcheng" placeholder="实验室名称"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室类型</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshileixing" v-model="ruleForm.shiyanshileixing" placeholder="实验室类型"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="tupianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">图片</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.tupian" :src="baseUrl+ruleForm.tupian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">院系</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.yuanxi" v-model="ruleForm.yuanxi" placeholder="院系"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">实验室位置</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.shiyanshiweizhi" v-model="ruleForm.shiyanshiweizhi" placeholder="实验室位置"  type="text"></input>
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
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">预约时间</view>
				<input :disabled="ro.appointmentdate" :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.appointmentdate" placeholder="预约时间" @tap="toggleTab('appointmentdate')"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">时间段</view>
				<picker :disabled="ro.timeperiod" :style='{"width":"100%","flex":"1","height":"auto"}' @change="timeperiodChange" :value="timeperiodIndex" :range="timeperiodOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input">{{ruleForm.timeperiod?ruleForm.timeperiod:"请选择时间段"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">预约状态</view>
				<picker :disabled="ro.yuyuezhuangtai" :style='{"width":"100%","flex":"1","height":"auto"}' @change="yuyuezhuangtaiChange" :value="yuyuezhuangtaiIndex" :range="yuyuezhuangtaiOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input">{{ruleForm.yuyuezhuangtai?ruleForm.yuyuezhuangtai:"请选择预约状态"}}</view>
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
		<w-picker  mode="date" step="1" :current="false" :hasSecond="false" @confirm="appointmentdateConfirm" ref="appointmentdate" themeColor="#333333"></w-picker>
	</view>
	<view v-else-if="showType==2">
		<view style="width: 100%;display: flex;flex-wrap: wrap;padding: 10px;">
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shiyanshiyuyue','实验室预约次数'))||(!userid&&isAuthFront('shiyanshiyuyue','实验室预约次数'))" size="mini" type="primary" @click="chartClick1()">
				实验室预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shiyanshiyuyue','实验室类型预约次数'))||(!userid&&isAuthFront('shiyanshiyuyue','实验室类型预约次数'))" size="mini" type="primary" @click="chartClick2()">
				实验室类型预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shiyanshiyuyue','日实验室预约次数'))||(!userid&&isAuthFront('shiyanshiyuyue','日实验室预约次数'))" size="mini" type="primary" @click="chartClick3()">
				日实验室预约次数
			</button>
			<button style="margin: 0 10px 0 0" v-if="(userid&&isAuth('shiyanshiyuyue','院系预约实验室次数'))||(!userid&&isAuthFront('shiyanshiyuyue','院系预约实验室次数'))" size="mini" type="primary" @click="chartClick4()">
				院系预约实验室次数
			</button>
		</view>
		<view style="width: 100%;">
			<view v-if="chartType1" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				实验室预约次数
			</view>
			<qiun-data-charts
				v-if="chartType1"
				style="width: 100%;height:"
				type="column"
				:opts="opts1"
				:chartData="chartData1">
			</qiun-data-charts>
			<view v-if="chartType2" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				实验室类型预约次数
			</view>
			<qiun-data-charts
				v-if="chartType2"
				style="width: 100%;height:"
				type="ring"
				:opts="opts2"
				:chartData="chartData2">
			</qiun-data-charts>
			<view v-if="chartType3" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				日实验室预约次数
			</view>
			<qiun-data-charts
				v-if="chartType3"
				style="width: 100%;height:"
				type="line"
				:opts="opts3"
				:chartData="chartData3">
			</qiun-data-charts>
			<view v-if="chartType4" style="width: 100%;text-align: center;line-height: 2;font-size: 12px;color: #000">
				院系预约实验室次数
			</view>
			<qiun-data-charts
				v-if="chartType4"
				style="width: 100%;height:"
				type="column"
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
				bianhao: '',
				yuyuebianhao: this.getUUID(),
				shiyanshimingcheng: '',
				shiyanshileixing: '',
				tupian: '',
				yuanxi: '',
				shiyanshiweizhi: '',
				xueshengxuehao: '',
				xueshengxingming: '',
				shoujihao: '',
				yongtu: '',
				appointmentdate: '',
				timeperiod: '',
				yuyuezhuangtai: '待签到' ,
				shhf: '',
				},
				timeperiodOptions: [],
				timeperiodIndex: 0,
				yuyuezhuangtaiOptions: [],
				yuyuezhuangtaiIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   bianhao : false,
				   yuyuebianhao : false,
				   shiyanshimingcheng : false,
				   shiyanshileixing : false,
				   tupian : false,
				   yuanxi : false,
				   shiyanshiweizhi : false,
				   xueshengxuehao : false,
				   xueshengxingming : false,
				   shoujihao : false,
				   yongtu : false,
				   appointmentdate : false,
				   timeperiod : false,
				   yuyuezhuangtai : false,
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
					if(o=='bianhao'){
						this.ruleForm.bianhao = obj[o];
						this.ro.bianhao = true;
						continue;
					}
					if(o=='yuyuebianhao'){
						this.ruleForm.yuyuebianhao = obj[o];
						this.ro.yuyuebianhao = true;
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
					if(o=='tupian'){
						this.ruleForm.tupian = obj[o].split(",")[0];
						this.ro.tupian = true;
						continue;
					}
					if(o=='yuanxi'){
						this.ruleForm.yuanxi = obj[o];
						this.ro.yuanxi = true;
						continue;
					}
					if(o=='shiyanshiweizhi'){
						this.ruleForm.shiyanshiweizhi = obj[o];
						this.ro.shiyanshiweizhi = true;
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
					if(o=='yongtu'){
						this.ruleForm.yongtu = obj[o];
						this.ro.yongtu = true;
						continue;
					}
					if(o=='appointmentdate'){
						this.ruleForm.appointmentdate = obj[o];
						this.ro.appointmentdate = true;
						continue;
					}
					if(o=='timeperiod'){
						this.ruleForm.timeperiod = obj[o];
						for(let x in this.timeperiodOptions) {
							if(this.timeperiodOptions[x] == this.ruleForm.timeperiod) {
								this.timeperiodIndex = Number(x)
							}
						}
						this.ro.timeperiod = true;
						continue;
					}
					if(o=='yuyuezhuangtai'){
						this.ruleForm.yuyuezhuangtai = obj[o];
						for(let x in this.yuyuezhuangtaiOptions) {
							if(this.yuyuezhuangtaiOptions[x] == this.ruleForm.yuyuezhuangtai) {
								this.yuyuezhuangtaiIndex = Number(x)
							}
						}
						this.ro.yuyuezhuangtai = true;
						continue;
					}
				}
			}

			// 自定义下拉框值
			this.timeperiodOptions = "8:00-10:00,10:01-12:00,12:01-14:00,14:01-16:00,16:01-18:00,18:01-20:00,20:01-22:00".split(',')
			this.timeperiodOptions.unshift("请选择时间段");
			if(this.ruleForm.timeperiod) {
				for(let x in this.timeperiodOptions) {
					if(this.timeperiodOptions[x] == this.ruleForm.timeperiod) {
						this.timeperiodIndex = Number(x)
					}
				}
			}
			// 自定义下拉框值
			this.yuyuezhuangtaiOptions = "已签到,已取消,待签到".split(',')
			this.yuyuezhuangtaiOptions.unshift("请选择预约状态");
			if(this.ruleForm.yuyuezhuangtai) {
				for(let x in this.yuyuezhuangtaiOptions) {
					if(this.yuyuezhuangtaiOptions[x] == this.ruleForm.yuyuezhuangtai) {
						this.yuyuezhuangtaiIndex = Number(x)
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
				res = await this.$api.info(`shiyanshiyuyue`, this.ruleForm.id);
				if(res.data.timeperiod) {
					for(let x in this.timeperiodOptions) {
						if(this.timeperiodOptions[x] == res.data.timeperiod) {
							this.timeperiodIndex = Number(x)
						}
					}
				}
				if(res.data.yuyuezhuangtai) {
					for(let x in this.yuyuezhuangtaiOptions) {
						if(this.yuyuezhuangtaiOptions[x] == res.data.yuyuezhuangtai) {
							this.yuyuezhuangtaiIndex = Number(x)
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

			appointmentdateChange(e) {
				this.ruleForm.appointmentdate = e.target.value;
				this.$forceUpdate();
			},

			// 日长控件选择日期时间
			appointmentdateConfirm(val) {
				this.ruleForm.appointmentdate = val.result;
				this.$forceUpdate();
			},

			// 下拉变化
			timeperiodChange(e) {
				this.timeperiodIndex = e.target.value
				this.ruleForm.timeperiod = this.timeperiodOptions[this.timeperiodIndex]
			},
			// 下拉变化
			yuyuezhuangtaiChange(e) {
				this.yuyuezhuangtaiIndex = e.target.value
				this.ruleForm.yuyuezhuangtai = this.yuyuezhuangtaiOptions[this.yuyuezhuangtaiIndex]
			},

			tupianTap() {
				if(this.ro.tupian){
					return false
				}
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.tupian = 'upload/' + res.file;
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
				if((!this.ruleForm.shiyanshimingcheng)){
					this.$utils.msg(`实验室名称不能为空`);
					return
				}
				if((!this.ruleForm.shiyanshileixing)){
					this.$utils.msg(`实验室类型不能为空`);
					return
				}
				// 冲突判定
				let type = 0
				let otj = await this.$api.list('shiyanshiyuyue', {
					shiyanshimingcheng: this.ruleForm.shiyanshimingcheng,
					appointmentdatestart: this.ruleForm.appointmentdate,
					appointmentdateend: this.ruleForm.appointmentdate,
					timeperiod: this.ruleForm.timeperiod,
					sfsh: '是',
				})
				if(otj.data.list.length) {
					var obj = uni.getStorageSync('crossObj');
					if(obj.reduciblenum) {
						if(otj.data.list.length>=obj.reduciblenum) {
							type = 2
						}
					}else {
						type = 1
					}
				}
				if(type==1) {
					that.$utils.msg(`该时间已被预约`);
					return false
				}else if(type==2) {
					that.$utils.msg(`该时间可预约次数已达上限`);
					return false
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
						let res = await this.$api.list(`shiyanshiyuyue`, params);
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
					await this.$api.update(`shiyanshiyuyue`, this.ruleForm);
				}else{
					oet = await this.$api.add(`shiyanshiyuyue`, this.ruleForm);
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
				let res = await this.$api.getPublic('shiyanshiyuyue/group/shiyanshimingcheng', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['shiyanshimingcheng']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['shiyanshimingcheng']
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
				let res = await this.$api.getPublic('shiyanshiyuyue/group/shiyanshileixing', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['shiyanshileixing']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['shiyanshileixing']
					})
				}
				this.opts2 = {
					rotate: false,
					rotateLock: false,
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [5,5,5,5],
					dataLabel: true,
					enableScroll: false,
					legend: {
						show: true,
						position: "right",
						lineHeight: 25
					},
					extra: {
						ring: {
							ringWidth: 60,
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
				this.chartData2 = {
					series: [
						{
							data: pArray
						}
					]
				};
				this.chartType2 = true
			},
			async chartClick3() {
				let params = {}
				let res = await this.$api.getPublic('shiyanshiyuyue/group/appointmentdate', params)
				res = res.data
				let xAxis = [];
				let yAxis = [];
				let pArray = []
				for(let i=0;i<res.length;i++){
					xAxis.push(res[i]['appointmentdate']);
					yAxis.push(parseFloat((res[i].total)));
					pArray.push({
						value: parseFloat((res[i].total)),
						name: res[i]['appointmentdate']
					})
				}
				this.opts3 = {
					color: ["#1890FF","#91CB74","#FAC858","#EE6666","#73C0DE","#3CA272","#FC8452","#9A60B4","#ea7ccc"],
					padding: [15,10,0,15],
					enableScroll: false,
					legend: {
						show: false
					},
					xAxis: {
						disableGrid: true
					},
					yAxis: {
						gridType: "dash",
						dashLength: 2,
						showTitle: false
					},
					extra: {
						line: {
							type: "straight",
							width: 2,
							activeType: "hollow"
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
				let res = await this.$api.getPublic('shiyanshiyuyue/group/yuanxi', params)
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
				this.opts4 = {
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
				this.chartData4 = {
					categories: xAxis,
					series: [
						{
							data: yAxis,
							name: ''
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
