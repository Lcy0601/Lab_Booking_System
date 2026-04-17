
<template>
<view>
<mescroll-uni @init="mescrollInit" :up="upOption" :down="downOption" @down="downCallback" @up="upCallback" @scroll="scrollChange">
	<view class="content">
		<view class="container" :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"100%"}'>
			<swiper :style='{"width":"100%","background":"#fff","height":"360rpx"}' class="swiper" :indicator-dots='false' :autoplay='false' :circular='false' indicator-active-color='#000000' indicator-color='rgba(0, 0, 0, .3)' :duration='500' :interval='5000' :vertical='false'>
				<swiper-item :style='{"width":"100%","background":"#fff","height":"360rpx"}' v-for="(swiper,index) in swiperList" :key="index">
					<img :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' v-if="swiper.substring(0,4)=='http'" :src="swiper" @tap="imgView(swiper)">
					<img :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' v-else :src="baseUrl+swiper" @tap="imgView(baseUrl+swiper)">
				</swiper-item>
			</swiper>
			<view :style='{"width":"100%","padding":"20rpx","flexWrap":"wrap","background":"#fff","display":"flex","height":"auto"}' class="detail-content">
				<view :style='{"margin":"0","borderColor":"#ccc","flexWrap":"wrap","borderWidth":"0","display":"flex","width":"100%","borderStyle":"solid","justifyContent":"space-between","height":"auto"}' class="detail-list-item price">
					<view :style='{"display":"flex"}' v-if="storeupFlag==1" @click="shoucang">
						<text class="icon iconfont icon-shoucang11" :style='{"margin":"0 4rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}'></text>
						<text :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>已收藏</text>
					</view>
					<view :style='{"padding":"0 20rpx 0 0","borderRadius":"0 10rpx 0 0","background":"rgb(41, 130, 132)","flex":"auto","justifyContent":"flex-end","display":"flex"}' v-if="storeupFlag==0" @click="shoucang">
						<text class="icon iconfont icon-shoucang11" :style='{"margin":"0 4rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#fff"}'></text>
						<text :style='{"color":"#fff","lineHeight":"80rpx","fontSize":"28rpx"}'>收藏</text>
					</view>
				</view>

				<view :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}' class="lable">设备名称：</view>
					<view :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' class="text" >{{detail.shebeimingcheng}}</view>
				</view>
				<view :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class="detail-list-item title">
					<view :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}' class="lable">型号：</view>
					<view :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' class="text" >{{detail.xinghao}}</view>
				</view>

				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>设备编号：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.shebeibianhao}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>设备分类：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.shebeifenlei}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>院系：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.yuanxi}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>数量：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.shuliang}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>存放地点：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.cunfangdidian}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>收藏数：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}' >{{detail.storeupnum}}</view>
				</view>



				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>适合实验：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}'>{{detail.shiheshiyan}}</view>
				</view>
				<view class="detail-list-item" :style='{"margin":"0","borderColor":"#ccc","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>简介：</view>
					<view class="text" :style='{"padding":"0px","margin":"0px","lineHeight":"48rpx","fontSize":"28rpx","color":"#333333"}'>{{detail.jianjie}}</view>
				</view>


				<view class="detail-list-item rich" :style='{"margin":"0","borderColor":"#ccc","borderRadius":"10rpx","borderWidth":"0","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
					<view class="lable" :style='{"padding":"0 20rpx 0 10rpx","whiteSpace":"nowrap","color":"#333","textAlign":"right","width":"auto","lineHeight":"48rpx","fontSize":"28rpx"}'>使用说明：</view>
					<view class="rich-text" :style='{"padding":"0px 24rpx 24rpx 0","margin":"0","lineHeight":"48rpx"}'>
						<rich-text :nodes="detail.shiyongshuoming"></rich-text>
					</view>
				</view>



				<view class="bottom-content bg-white tabbar border shop" :style='{"padding":"10rpx 24rpx","flexWrap":"wrap","background":"#fff","display":"flex","gap":"20rpx","width":"100%","justifyContent":"center","height":"auto","order":"101"}'>

					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('shiyanshebei','预约')" @tap="onAcrossTap('shebeiyuyue','','','','')" class="cu-btn bg-brown round shadow-blur" >预约</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('shiyanshebei','预约')" @tap="onAcrossTap('shebeiyuyue','','','','')" class="cu-btn bg-brown round shadow-blur" >预约</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('shiyanshebei','报废')" @tap="onAcrossTap('baofeishenqing','','','','')" class="cu-btn bg-brown round shadow-blur" >报废</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('shiyanshebei','报废')" @tap="onAcrossTap('baofeishenqing','','','','')" class="cu-btn bg-brown round shadow-blur" >报废</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="userid&&isAuth('shiyanshebei','维护')" @tap="onAcrossTap('weihujilu','','','','')" class="cu-btn bg-brown round shadow-blur" >维护</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="!userid&&isAuthFront('shiyanshebei','维护')" @tap="onAcrossTap('weihujilu','','','','')" class="cu-btn bg-brown round shadow-blur" >维护</button>
					<button :style='{"border":"0","padding":"0 20rpx","margin":"0","alignItems":"center","color":"#298284","display":"flex","justifyContent":"center","outline":"none","borderRadius":"8rpx","background":"#29828430","width":"31%","fontSize":"28rpx","height":"80rpx"}' v-if="userid" @tap="onshelvesClick">
						{{detail.onshelves==1?'下架':'上架'}}
					</button>
				</view>
			</view>
		</view>
	</view>
</mescroll-uni>
</view>
</template>

<script>
	export default {
		data() {
			return {
				btnColor: ['#409eff','#67c23a','#909399','#e6a23c','#f56c6c','#356c6c','#351c6c','#f093a9','#a7c23a','#104eff','#10441f','#a21233','#503319'],
				id: '',
				userid: '',
				detail: {},
				swiperList: [],
				commentList: [],
				mescroll: null, //mescroll实例对象
				downOption: {
					auto: false //是否在初始化后,自动执行下拉回调callback; 默认true
				},
				upOption: {
					noMoreSize: 3, //如果列表已无数据,可设置列表的总数量要大于半页才显示无更多数据;避免列表数据过少(比如只有一条数据),显示无更多数据会不好看; 默认5
					textNoMore: '~ 没有更多了 ~',
					onScroll: true,
					toTop: true
				},
				hasNext: true,
				user: {},
				storeupFlag: 0,
				count: 0,
				timer: null,
				title:'',
				scrollTop: 0,
			}
		},
		components: {
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			username() {
				return uni.getStorageSync("nickname")
			},
		},
		async onLoad(options) {
			// #ifdef APP-PLUS
			let page = getCurrentPages()
			this.href = this.baseUrl + 'front/h5/#/' + page[page.length - 1].route
			// #endif
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.id = options.id;
			if(options.userid) {
				this.userid = options.userid;
			}
			// 渲染数据
			this.init();
		},
		// #ifdef MP-WEIXIN
		onShareAppMessage(){
			var obj = {
				title: this.title,
				imageUrl: this.swiperList[0]?this.baseUrl + this.swiperList[0]: ''
			}
			return obj
		},
		// #endif
		onUnload() {
			if(this.timer) {
				clearInterval(this.timer);
			}
		},
		async onShow(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			this.btnColor = this.btnColor.sort(()=> {
				return (0.5-Math.random());
			});
			this.getStoreup();
			let crossCleanType = uni.getStorageSync('crossCleanType')
			if(crossCleanType) {
				uni.removeStorageSync('crossCleanType')
				res = await this.$api.info('shiyanshebei', this.id);
				let reg=new RegExp('http://localhost:8080/shiyanshi88x6c3gh/upload','g')//g代表全部
				if(res.data.shiyongshuoming){
					res.data.shiyongshuoming = res.data.shiyongshuoming.replace(reg, this.$base.url + 'upload');
				}
				this.detail = res.data;
				this.title = this.detail.shebeimingcheng
			}
		},
		destroyed: function() {
			//window.clearInterval(this.inter);
		},
		methods: {
			scrollChange(e){
				this.scrollTop = e.scrollTop
			},
			scrollTopClick(){
				uni.pageScrollTo({
					scrollTop: 0
				})
			},
			imgView(url){
				let arr = []
				for(let x in this.swiperList){
					arr.push(this.swiperList[x].substr(0,4)=='http'?this.swiperList[x]:this.baseUrl + this.swiperList[x])
				}
				uni.previewImage({
					current: url,
					urls: arr
				})
			},
			// 拨打电话
			callClick(row){
				uni.makePhoneCall({
					phoneNumber: row
				})
			},
			// 支付
			onPayTap(){
				let that = this
				if(!this.user){
					this.$utils.msg("请先登录")
					setTimeout(()=>{
						that.$utils.jump('../login/login')
					},1500)
					return false
				}
				uni.setStorageSync('paytable','shiyanshebei');
				uni.setStorageSync('payObject',this.detail);
				this.$utils.jump('../pay-confirm/pay-confirm?type=1')
			},
			onDetailTap(item) {
				uni.setStorageSync("useridTag",this.userid);
				this.$utils.jump(`./detail?id=${item.id}&userid=`+this.userid)
			},
			// 收藏
			async getStoreup() {
				if(!this.user){
					return false
				}
				let params = {
					page: 1,
					limit: 1,
					refid : this.id,
					tablename : 'shiyanshebei',
					userid: this.user.id,
					type: '1',
				}
				let res = await this.$api.list(`storeup`, params);
				this.storeupFlag = res.data.list.length;
			},
			async shoucang(){
				let that = this
				if(!this.user){
					this.$utils.msg("请先登录")
					setTimeout(()=>{
						that.$utils.jump('../login/login')
					},1500)
					return false
				}
				let _this = this;
				let params = {
					page: 1,
					limit: 1,
					refid : _this.detail.id,
					tablename : 'shiyanshebei',
					userid: _this.user.id,
					type: '1',
				}
				let res = await _this.$api.list(`storeup`, params);
				if (res.data.list.length == 1) {
					let storeupId = res.data.list[0].id;
					uni.showModal({
						title: '提示',
						content: '是否取消',
						success: async function(res) {
							if (res.confirm) {
								_this.detail.storeupnum--
								await _this.$api.update('shiyanshebei',_this.detail)
								await _this.$api.del('storeup', JSON.stringify([storeupId]));
								_this.$utils.msg('取消成功');
								_this.getStoreup();
							}
						}
					});
					return;
				}
				uni.showModal({
					title: '提示',
					content: '是否收藏',
					success: async function(res) {
						if (res.confirm) {
							await _this.$api.add('storeup', {
								userid: _this.user.id,
								name: _this.detail.shebeimingcheng,
								picture: _this.swiperList[0],
								refid: _this.detail.id,
								tablename: 'shiyanshebei',
								type: '1'
							});
							_this.detail.storeupnum++
							await _this.$api.update('shiyanshebei',_this.detail)
							_this.$utils.msg('收藏成功');
							_this.getStoreup();
						}
					}
				});
			},
			// 跨表
			async onAcrossTap(tableName,crossOptAudit,crossOptPay,statusColumnName,tips,statusColumnValue,type=1){
				let that = this
				if(!this.user){
					this.$utils.msg("请先登录")
					setTimeout(()=>{
						that.$utils.jump('../login/login')
					},1500)
					return false
				}
				uni.setStorageSync('crossTable','shiyanshebei');
				uni.setStorageSync(`crossObj`, this.detail);
				uni.setStorageSync(`statusColumnName`, statusColumnName);
				uni.setStorageSync(`statusColumnValue`, statusColumnValue);
				uni.setStorageSync(`tips`, tips);
				if(statusColumnName!=''&&!statusColumnName.startsWith("[")) {
					var obj = uni.getStorageSync('crossObj');
					for (var o in obj){
						if(o==statusColumnName && obj[o]==statusColumnValue){
							this.$utils.msg(tips);
							return
						}
					}
				}
				this.$utils.jump(`../${tableName}/add-or-update?cross=true`);
			},
			// 获取详情
			async init(type=1){
				if(this.timer) {
					clearInterval(this.timer);
				}
				let res = await this.$api.info('shiyanshebei', this.id);
				let reg=new RegExp('http://localhost:8080/shiyanshi88x6c3gh/upload','g')//g代表全部
				if(res.data.shiyongshuoming){
					res.data.shiyongshuoming = res.data.shiyongshuoming.replace(reg, this.$base.url + 'upload').replace(/<img/g,'<img style="width: 100%;"');
				}
				this.detail = res.data;

				this.title = this.detail.shebeimingcheng





				// 轮播图片
				this.swiperList = this.detail.fengmian ? this.detail.fengmian.split(",") : [];
				





				//修改富文本的图片样式
				if(this.detail.shiyongshuoming) {
					this.detail.shiyongshuoming = this.detail.shiyongshuoming.replace(/img src/gi,"img style=\"width:100%;\" src");
				}
				



				if(type==2){
					this.detail.discussnum++
					await this.$api.update('shiyanshebei',this.detail)
				}
			},
			// mescroll组件初始化的回调,可获取到mescroll对象
			mescrollInit(mescroll) {
				this.mescroll = mescroll;
			},

			/*下拉刷新的回调 */
			downCallback(mescroll) {
				this.hasNext = true
				mescroll.resetUpScroll()
			},

			/*上拉加载的回调: mescroll携带page的参数, 其中num:当前页 从1开始, size:每页数据条数,默认10 */
			async upCallback(mescroll) {
				mescroll.endSuccess(mescroll.size, this.hasNext);

			},



			onChatTap() {
				this.$utils.jump('../chat/chat')
			},
			// 下载
			download(url ){
				if(!url){
					return false
				}
				let _this = this;
				url=_this.$base.url +  url;
				uni.downloadFile({
					url: url,
					success: (res) => {
						if (res.statusCode === 200) {
							_this.$utils.msg('下载成功');
							// #ifdef H5
							 window.open(url);
							// #endif
							// #ifndef H5
							uni.saveFile({
								tempFilePath: res.tempFilePath, //临时路径
								success: function(obj) {
									uni.showToast({
										icon: 'success',
										mask: true,
										title: '下载成功' , 
										duration: 2000,
									});
									setTimeout(() => {
										console.log('obj.savedFilePath',obj.savedFilePath);
										var filePath = obj.savedFilePath;
										uni.openDocument({ //新开页面打开文档，支持格式：doc, xls, ppt, pdf, docx, xlsx, pptx。
											filePath: filePath,
											showMenu: true,
											success: function(res) {
												console.log('打开文档成功');
											}
										});
									}, 2000)
								}
							});
							// #endif
						}
					}
				});
			},
			//
			onCartTabTap() {
				this.$utils.tab('../shop-cart/shop-cart')
			},

			onshelvesClick() {
				var that = this;
				uni.showModal({
					title: '提示',
					content: `是否${that.detail.onshelves==1?'下架':'上架'}？`,
					success: async function(res) {
						if (res.confirm) {
							that.detail.onshelves = (that.detail.onshelves==1?0:1)
							await that.$api.update('shiyanshebei',that.detail)
							that.$utils.msg(`${that.detail.onshelves==1?'上架':'下架'}成功`);
						}
					}
				});
			},
		}
	}
</script>

<style lang="scss">
	page {
	  --animate-duration: 1s;
	  --animate-delay: 1s;
	  --animate-repeat: 1;
	}
	
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	
	.seat-list {
		display: flex;
		align-items: center;
		flex-wrap: wrap;
		background: #FFFFFF;
		margin: 20upx;
		border-radius: 20upx;
		padding: 20upx;
		font-size: 30upx;
		.seat-item {
			width: 33.33%;
			display: flex;
			align-items: center;
			flex-direction: column;
			margin-bottom: 20upx;
	
			.seat-icon {
				width: 50upx;
				height: 50upx;
				margin-bottom: 10upx;
			}
		}
	}
	
	audio {
		display: flex;
		flex-direction: column;
	}
	
	.audio .uni-audio-default {
		width: inherit !important;
	}
	

</style>
