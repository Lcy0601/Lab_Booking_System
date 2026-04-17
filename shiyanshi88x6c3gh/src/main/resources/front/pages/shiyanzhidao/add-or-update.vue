  

<template>
<view class="content">
	<view :style='{"minHeight":"100%","width":"100%","padding":"0","position":"relative","background":"#ECECEC","height":"auto"}' v-if="showType==1">
		<form :style='{"width":"100%","padding":"24rpx","background":"none","display":"block","height":"auto"}' class="app-update-pv">




























			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">知识标题</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.zhishibiaoti" v-model="ruleForm.zhishibiaoti" placeholder="知识标题"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">知识类型</view>
				<picker :disabled="ro.zhishileixing" :style='{"width":"100%","flex":"1","height":"auto"}' @change="zhishileixingChange" :value="zhishileixingIndex" :range="zhishileixingOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#298284"}' class="uni-input">{{ruleForm.zhishileixing?ruleForm.zhishileixing:"请选择知识类型"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="fengmianTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">封面</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-if="ruleForm.fengmian" :src="baseUrl+ruleForm.fengmian.split(',')[0]" mode="aspectFill"></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">教师账号</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiaoshizhanghao" v-model="ruleForm.jiaoshizhanghao" placeholder="教师账号"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">教师姓名</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' :disabled="ro.jiaoshixingming" v-model="ruleForm.jiaoshixingming" placeholder="教师姓名"  type="text"></input>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="" @tap="caozuoshipinTap">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">操作视频</view>
				<input :style='{"border":"0","padding":"0px 24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"80rpx"}' v-if="ruleForm.caozuoshipin"  v-model="baseUrl+ruleForm.caozuoshipin" placeholder="操作视频"></input>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
			</view>
              
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">知识点要求</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.zhishidianyaoqiu" placeholder="知识点要求" :maxlength="-1" :disabled="ro.zhishidianyaoqiu"></textarea>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","alignItems":"center","borderRadius":"50rpx","borderWidth":"2rpx","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"rgb(114, 114, 114)","textAlign":"right"}' class="title">注意事项</view>
				<textarea :style='{"border":"0","padding":"24rpx","margin":"0px","color":"rgb(0, 0, 0)","borderRadius":"8rpx","flex":"1","background":"rgba(255, 255, 255, 0)","fontSize":"28rpx","height":"240rpx"}' v-model="ruleForm.zhuyishixiang" placeholder="注意事项" :maxlength="-1" :disabled="ro.zhuyishixiang"></textarea>
			</view>
			<view :style='{"padding":"12rpx 0","margin":"0 0 24rpx 0","borderColor":"#29828450","borderRadius":"60rpx","borderWidth":"2rpx","background":"#fff","width":"100%","borderStyle":"solid","height":"auto"}' class="">
				<view :style='{"width":"100%","padding":"0 24rpx","lineHeight":"80rpx","fontSize":"28rpx","color":"#333","fontWeight":"500"}' class="title">详情</view>
				<xia-editor ref="xiangqing" :style='{"minHeight":"300rpx","border":"0px solid #efefef","padding":"12rpx 24rpx 24rpx 24rpx","borderRadius":"0 0 60rpx 60rpx","borderWidth":"2rpx 0 0 0","width":"100%","height":"auto"}' v-model="ruleForm.xiangqing" placeholder="详情" @editorChange="xiangqingChange"></xia-editor>
			</view>
			
			<view :style='{"width":"100%","padding":"0","flexDirection":"column","justifyContent":"center","display":"flex","height":"auto"}' class="btn" >
				<button :style='{"border":"0","padding":"0px","margin":"0","color":"rgb(255, 255, 255)","borderRadius":"50rpx","background":"linear-gradient(117.51deg, rgb(55, 150, 153) 4.058%,rgb(119, 230, 232) 98.305%)","width":"100%","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}' @tap="onSubmitTap(null)" class="bg-red">提交</button>
			</view>
		</form>
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
				zhishibiaoti: '',
				zhishileixing: '',
				fengmian: '',
				zhishidianyaoqiu: '',
				zhuyishixiang: '',
				xiangqing: '',
				jiaoshizhanghao: '',
				jiaoshixingming: '',
				caozuoshipin: '',
				discussnum: '',
				storeupnum: '',
				},
				zhishileixingOptions: [],
				zhishileixingIndex: 0,
				// 登录用户信息
				user: {},
				ro:{
				   zhishibiaoti : false,
				   zhishileixing : false,
				   fengmian : false,
				   zhishidianyaoqiu : false,
				   zhuyishixiang : false,
				   xiangqing : false,
				   jiaoshizhanghao : false,
				   jiaoshixingming : false,
				   caozuoshipin : false,
				   thumbsupnum : false,
				   crazilynum : false,
				   clicknum : false,
				   discussnum : false,
				   storeupnum : false,
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
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
			// ss读取
			this.ruleForm.jiaoshizhanghao = this.user.jiaoshizhanghao
			this.ro.jiaoshizhanghao = true;
			this.ruleForm.jiaoshixingming = this.user.jiaoshixingming
			this.ro.jiaoshixingming = true;

			// 跨表
			this.cross = options.cross;
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='zhishibiaoti'){
						this.ruleForm.zhishibiaoti = obj[o];
						this.ro.zhishibiaoti = true;
						continue;
					}
					if(o=='zhishileixing'){
						this.ruleForm.zhishileixing = obj[o];
						for(let x in this.zhishileixingOptions) {
							if(this.zhishileixingOptions[x] == this.ruleForm.zhishileixing) {
								this.zhishileixingIndex = Number(x)
							}
						}
						this.ro.zhishileixing = true;
						continue;
					}
					if(o=='fengmian'){
						this.ruleForm.fengmian = obj[o].split(",")[0];
						this.ro.fengmian = true;
						continue;
					}
					if(o=='zhishidianyaoqiu'){
						this.ruleForm.zhishidianyaoqiu = obj[o];
						this.ro.zhishidianyaoqiu = true;
						continue;
					}
					if(o=='zhuyishixiang'){
						this.ruleForm.zhuyishixiang = obj[o];
						this.ro.zhuyishixiang = true;
						continue;
					}
					if(o=='xiangqing'){
						this.ruleForm.xiangqing = obj[o];
						this.ro.xiangqing = true;
						continue;
					}
					if(o=='jiaoshizhanghao'){
						this.ruleForm.jiaoshizhanghao = obj[o];
						this.ro.jiaoshizhanghao = true;
						continue;
					}
					if(o=='jiaoshixingming'){
						this.ruleForm.jiaoshixingming = obj[o];
						this.ro.jiaoshixingming = true;
						continue;
					}
					if(o=='caozuoshipin'){
						this.ruleForm.caozuoshipin = obj[o];
						this.ro.caozuoshipin = true;
						continue;
					}
					if(o=='thumbsupnum'){
						this.ruleForm.thumbsupnum = obj[o];
						this.ro.thumbsupnum = true;
						continue;
					}
					if(o=='crazilynum'){
						this.ruleForm.crazilynum = obj[o];
						this.ro.crazilynum = true;
						continue;
					}
					if(o=='clicknum'){
						this.ruleForm.clicknum = obj[o];
						this.ro.clicknum = true;
						continue;
					}
					if(o=='discussnum'){
						this.ruleForm.discussnum = obj[o];
						this.ro.discussnum = true;
						continue;
					}
					if(o=='storeupnum'){
						this.ruleForm.storeupnum = obj[o];
						this.ro.storeupnum = true;
						continue;
					}
				}
			}

			var zhishileixingRefParams = {}
			// 下拉框
			res = await this.$api.option(`zhishileixing`,`zhishileixing`,zhishileixingRefParams);
			this.zhishileixingOptions = res.data;
			this.zhishileixingOptions.unshift("请选择知识类型");
			if(this.ruleForm.zhishileixing) {
				for(let x in this.zhishileixingOptions) {
					if(this.zhishileixingOptions[x] == this.ruleForm.zhishileixing) {
						this.zhishileixingIndex = Number(x)
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
				res = await this.$api.info(`shiyanzhidao`, this.ruleForm.id);
				if(res.data.zhishileixing) {
					for(let x in this.zhishileixingOptions) {
						if(this.zhishileixingOptions[x] == res.data.zhishileixing) {
							this.zhishileixingIndex = Number(x)
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
			xiangqingChange(e) {
				this.ruleForm.xiangqing = e
			},

			// 多级联动参数



			// 下拉变化
			zhishileixingChange(e) {
				this.zhishileixingIndex = e.target.value
				this.ruleForm.zhishileixing = this.zhishileixingOptions[this.zhishileixingIndex]
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
			caozuoshipinTap () {
				let _this = this;
				if(this.ro.caozuoshipin){
					return false
				}
				this.$api.uploadMedia(function(res) {
					_this.ruleForm.caozuoshipin = 'upload/' + res.file;
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
				if(this.ruleForm.thumbsupnum&&(!this.$validate.isIntNumer(this.ruleForm.thumbsupnum))){
					this.$utils.msg(`赞应输入整数`);
					return
				}
				if(this.ruleForm.crazilynum&&(!this.$validate.isIntNumer(this.ruleForm.crazilynum))){
					this.$utils.msg(`踩应输入整数`);
					return
				}
				if(this.ruleForm.clicknum&&(!this.$validate.isIntNumer(this.ruleForm.clicknum))){
					this.$utils.msg(`点击次数应输入整数`);
					return
				}
				if(this.ruleForm.discussnum&&(!this.$validate.isIntNumer(this.ruleForm.discussnum))){
					this.$utils.msg(`评论数应输入整数`);
					return
				}
				if(this.ruleForm.storeupnum&&(!this.$validate.isIntNumer(this.ruleForm.storeupnum))){
					this.$utils.msg(`收藏数应输入整数`);
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
						let res = await this.$api.list(`shiyanzhidao`, params);
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
					await this.$api.update(`shiyanzhidao`, this.ruleForm);
				}else{
					oet = await this.$api.add(`shiyanzhidao`, this.ruleForm);
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
