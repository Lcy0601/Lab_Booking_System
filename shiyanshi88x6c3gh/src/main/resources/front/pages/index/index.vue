<template>
	<view class="content">
		<view :style='{"width":"100%","padding":"20rpx","flexWrap":"wrap","background":"#fff","display":"flex","height":"auto"}'>
			<view class="list-swiper-4" :style='{"width":"100%","position":"relative","height":"360rpx","order":"0"}' @touchstart="touchStart" @touchmove="touchMove" @touchend="touchEnd">
				<view :style='{"width":"100%","position":"absolute","top":"0%","left":"0%","background":"#fff","height":"360rpx"}' class="item animate__animated" :class="prevNumList4 == index  ? 'animate__backOutLeft' : (numList4 == index  ? 'animate__fadeInRight' : '')" v-for="(swiper,index) in swiperList" :key="index" v-if="numList4 == index || prevNumList4 == index">
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"360rpx"}' mode="aspectFill" :src="baseUrl+swiper.img" @tap="onSwiperTap(swiper)"></image>
					<view :style='{"padding":"8rpx 20rpx","margin":"-20rpx 0 0 0","transform":"translate3d(-50%, -50%, 0)","top":"50%","color":"#000","left":"50%","background":"rgba(255, 255, 255, 0.3)","display":"none","lineHeight":"1.5","fontSize":"40rpx","position":"absolute"}'>{{ swiper.title }}</view>
				</view>
				<view class="animate__navigation" :style='{"alignItems":"center","left":"0%","bottom":"0%","background":"rgba(0,0,0,.3)","display":"flex","width":"100%","position":"absolute","justifyContent":"center","height":"40rpx"}'>
					<block v-for="(swiper,index) in swiperList" :key="index">
						<text class="navigation-item" v-if="numList4 == index" :style='{"width":"16rpx","margin":"0 4rpx","borderRadius":"100%","background":"rgb(55, 150, 153)","height":"16rpx"}'></text>
						<text class="navigation-item" v-if="numList4 != index" :style='{"width":"16rpx","margin":"0 4rpx","borderRadius":"100%","background":"#fff","height":"16rpx"}'></text>
					</block>
				</view>
			</view>
			<!-- menu -->
			<view v-if="true" class="menu_view">
				<block v-for="(item,index1) in menuList" v-bind:key="item.roleName">
					<block v-if="index1==0" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
						<block v-bind:key="sort" v-for=" (child,sort) in menu.child">
							<block v-bind:key="sort2" v-for=" (button,sort2) in child.buttons">
								<view class="menu-item" v-if="button=='查看' && child.tableName!='yifahuodingdan' && child.tableName!='yituikuandingdan' &&child.tableName!='yiquxiaodingdan' && child.tableName!='weizhifudingdan' && child.tableName!='yizhifudingdan' && child.tableName!='yiwanchengdingdan' " @tap="onPageTap2(child.tableName)">
									<view class="iconarr" :class="child.appFrontIcon"></view>
									
									<view class="text">{{child.menu.split("列表")[0]}}</view>
								</view>
							</block>
						</block>
					</block>
				</block>
			</view>
			<!-- 商品推荐 -->
			<!-- 商品推荐 -->
			
			<!-- 商品列表 -->
			<view class="listBox list" :style='{"padding":"0","margin":"40rpx 0 0 0","overflow":"hidden","borderRadius":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto","order":"6"}'>
				<view class="title" :style='{"padding":"0 0 0 60rpx","color":"#000000","borderRadius":"0","textAlign":"left","background":"url(http://codegen.caihongy.cn/20251216/4255e8ea722543b681847805c8f3a64c.png) no-repeat center top / 100% 100%","width":"100%","fontSize":"48rpx"}'>
					<view :style='{"fontSize":"32rpx","lineHeight":"120rpx","color":"#fff","fontWeight":"600"}'>实验设备</view>
					<view :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","top":"20rpx","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"60rpx","position":"absolute","right":"20rpx"}' @tap="onPageTap('shiyanshebei')">
						<text :style='{"color":"#fff","fontSize":"28rpx"}'>更多 +</text>
						<text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx","display":"none"}'></text>
					</view>
				</view>
				<!-- 样式1 -->
				<view class="list-box style1" :style='{"padding":"24rpx","margin":"20rpx 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view @tap="onDetailTap('shiyanshebei',product.id)" v-for="(product,index) in homeshiyanshebeilist" :key="index" class="list-item" :style='{"border":"0px solid rgb(0, 0, 0)","margin":"0 0 20rpx","flexWrap":"wrap","background":"transparent","display":"flex","width":"48%","height":"auto"}'>
						<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.4","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.shebeimingcheng}}</view>
						<image :style='{"padding":"0","margin":"0","objectFit":"cover","display":"block","width":"100%","height":"300rpx","order":"-1"}' class="list-item-image" mode="aspectFill" v-if="product.fengmian.substring(0,4)=='http'" :src="product.fengmian"></image>
						<image :style='{"padding":"0","margin":"0","objectFit":"cover","display":"block","width":"100%","height":"300rpx","order":"-1"}' class="list-item-image" mode="aspectFill" v-else :src="product.fengmian?baseUrl+product.fengmian.split(',')[0]:''"></image>
						<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.4","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">型号:{{product.xinghao}}</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.addtime.split(' ')[0].replace(/\-/g,'-')}}</text>
						</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.storeupnum}}</text>
						</view>
					</view>
				</view>
			</view>
			<view class="listBox list" :style='{"padding":"0","margin":"40rpx 0 0 0","overflow":"hidden","borderRadius":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto","order":"6"}'>
				<view class="title" :style='{"padding":"0 0 0 60rpx","color":"#000000","borderRadius":"0","textAlign":"left","background":"url(http://codegen.caihongy.cn/20251216/4255e8ea722543b681847805c8f3a64c.png) no-repeat center top / 100% 100%","width":"100%","fontSize":"48rpx"}'>
					<view :style='{"fontSize":"32rpx","lineHeight":"120rpx","color":"#fff","fontWeight":"600"}'>实验指导</view>
					<view :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","top":"20rpx","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"60rpx","position":"absolute","right":"20rpx"}' @tap="onPageTap('shiyanzhidao')">
						<text :style='{"color":"#fff","fontSize":"28rpx"}'>更多 +</text>
						<text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx","display":"none"}'></text>
					</view>
				</view>
				<!-- 样式1 -->
				<view class="list-box style1" :style='{"padding":"24rpx","margin":"20rpx 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
					<view @tap="onDetailTap('shiyanzhidao',product.id)" v-for="(product,index) in homeshiyanzhidaolist" :key="index" class="list-item" :style='{"border":"0px solid rgb(0, 0, 0)","margin":"0 0 20rpx","flexWrap":"wrap","background":"transparent","display":"flex","width":"48%","height":"auto"}'>
						<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.4","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.zhishibiaoti}}</view>
						<view :style='{"padding":"4rpx 20rpx 4rpx 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"1.4","fontSize":"28rpx","textOverflow":"ellipsis"}' class="list-item-title ">{{product.zhishileixing}}</view>
						<image :style='{"padding":"0","margin":"0","objectFit":"cover","display":"block","width":"100%","height":"300rpx","order":"-1"}' class="list-item-image" mode="aspectFill" v-if="product.fengmian.substring(0,4)=='http'" :src="product.fengmian"></image>
						<image :style='{"padding":"0","margin":"0","objectFit":"cover","display":"block","width":"100%","height":"300rpx","order":"-1"}' class="list-item-image" mode="aspectFill" v-else :src="product.fengmian?baseUrl+product.fengmian.split(',')[0]:''"></image>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.addtime.split(' ')[0].replace(/\-/g,'-')}}</text>
						</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.jiaoshizhanghao}}</text>
						</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.thumbsupnum}}</text>
						</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.storeupnum}}</text>
						</view>
						<view :style='{"padding":"0 20rpx","flex":"auto"}'>
							<text class="icon iconfont icon-chakan2" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{product.clicknum}}</text>
						</view>
					</view>
				</view>
			</view>
			<!-- 商品列表 -->
			<!-- 新闻资讯 -->
			<view class="listBox news" :style='{"padding":"0","margin":"40rpx 0 0 0","overflow":"hidden","borderRadius":"0","flexWrap":"wrap","background":"none","display":"flex","width":"100%","position":"relative","height":"auto","order":"5"}'>
				<view class="title" :style='{"padding":"0 0 0 60rpx","color":"#000000","borderRadius":"0","textAlign":"left","background":"url(http://codegen.caihongy.cn/20251216/4255e8ea722543b681847805c8f3a64c.png) no-repeat center top / 100% 100%","width":"100%","fontSize":"48rpx","fontWeight":"700"}'>
					<view :style='{"fontSize":"32rpx","lineHeight":"120rpx","color":"#fff","fontWeight":"600"}'>通知公告</view>
					<view :style='{"border":"0","padding":"0 30rpx","margin":"0 auto","top":"20rpx","textAlign":"center","background":"none","display":"block","width":"auto","lineHeight":"60rpx","position":"absolute","right":"20rpx"}' @tap="onPageTap('news')">
					  <text :style='{"color":"#fff","fontSize":"28rpx","fontWeight":"500"}'>更多 +</text>
					  <text class="icon iconfont icon-gengduo1" :style='{"color":"#fff","fontSize":"28rpx","display":"none"}'></text>
					</view>
				</view>
				<!-- 样式6 -->
				<view class="news-box3" :style='{"width":"100%","padding":"24rpx","margin":"0","height":"auto"}'>
					<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"8rpx 40rpx 8rpx 40rpx","margin":"0","borderColor":"#eeeeee","borderRadius":"0","borderWidth":"0 0 2rpx 0","width":"100%","position":"relative","borderStyle":"solid","height":"auto"}'>
						<view :style='{"padding":"0","boxShadow":"none","margin":"-8rpx 0 0 0","backgroundColor":"#29828499","top":"50%","borderRadius":"2rpx","left":"16rpx","width":"10rpx","position":"absolute","height":"10rpx"}' class="dian"></view>
						<view :style='{"padding":"0 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"1.5","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{item.title}}</view>
						<view :style='{"padding":"0 20rpx","overflow":"hidden","whiteSpace":"nowrap","color":"#666","width":"100%","lineHeight":"1.5","fontSize":"28rpx","textOverflow":"ellipsis"}' class="text">{{item.introduction}}</view>
						<view :style='{"padding":"0 20rpx"}'>
							<text class="icon iconfont icon-shijian21" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.addtime.split(' ')[0].replace(/\-/g,'-')}}</text>
						</view>
						<view :style='{"padding":"0 20rpx"}'>
							<text class="icon iconfont icon-geren16" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"24rpx","color":"#666"}'></text>
							<text :style='{"color":"#666","lineHeight":"1.5","fontSize":"24rpx"}'>{{item.name}}</text>
						</view>
						<view class="cuIcon-right" :style='{"padding":"0","margin":"-36rpx 0 0 0","top":"50%","color":"#666","width":"32rpx","lineHeight":"72rpx","fontSize":"32rpx","position":"absolute","right":"0"}'></view>
					</view>
				</view>
			</view>
			<!-- 新闻资讯 -->
			<view v-if="scrollTop>200" @tap="scrollTopClick" :style='{"boxShadow":"0 8rpx 16rpx rgba(0,0,0,.3)","borderRadius":"50%","textAlign":"center","bottom":"20%","background":"#ff000030","width":"60rpx","lineHeight":"60rpx","position":"fixed","right":"20rpx","height":"60rpx"}'>
				<span class="icon iconfont icon-jiantou07" :style='{"color":"#fff"}'></span>
			</view>
		</view>
	</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				startX: 0,
				prevNumList4: '',
				numList4: 0,
				timerList4: null,
				flagList4: false,
				navigationActive: {"width":"16rpx","margin":"0 4rpx","borderRadius":"100%","background":"rgb(55, 150, 153)","height":"16rpx"},
				navigationDefault: {"width":"16rpx","margin":"0 4rpx","borderRadius":"100%","background":"#fff","height":"16rpx"},
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
				iconArr: [
					'cuIcon-same',
					'cuIcon-deliver',
					'cuIcon-evaluate',
					'cuIcon-shop',
					'cuIcon-ticket',
					'cuIcon-cascades',
					'cuIcon-discover',
					'cuIcon-question',
					'cuIcon-pic',
					'cuIcon-filter',
					'cuIcon-footprint',
					'cuIcon-pulldown',
					'cuIcon-pullup',
					'cuIcon-moreandroid',
					'cuIcon-refund',
					'cuIcon-qrcode',
					'cuIcon-remind',
					'cuIcon-profile',
					'cuIcon-home',
					'cuIcon-message',
					'cuIcon-link',
					'cuIcon-lock',
					'cuIcon-unlock',
					'cuIcon-vip',
					'cuIcon-weibo',
					'cuIcon-activity',
					'cuIcon-friendadd',
					'cuIcon-friendfamous',
					'cuIcon-friend',
					'cuIcon-goods',
					'cuIcon-selection'
				],
				role : '',
				menuList: [],
				swiperMenuList:[],
				user: {},
				tableName:'',

				//轮播
				swiperList: [],
				homeshiyanshebeilist: [],
				homeshiyanzhidaolist: [],
				news: [],
				scrollTop: 0,
			}
		},
		onPageScroll(e) {
			this.scrollTop = e.scrollTop
		},
		watch: {
		},
		mounted() {
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
			username() {
				return uni.getStorageSync("nickname")
			},
		},
		async onLoad(){
		},
		async onShow() {
			if (this.timerList4&&this.timerList4!=null) clearInterval(this.timerList4)
			this.swiperMenuList = []
			this.role = uni.getStorageSync("appRole");
			let table = uni.getStorageSync("nowTable");
			let res = {}
			if(table) {
				res = await this.$api.session(table);
				this.user = res.data;
				this.tableName = table;
			}
			let menus = menu.list();
			this.menuList = menus;
			this.menuList.forEach((item,key) => {
				if(key==0) {
					item.frontMenu.forEach((item2,key2) => {
						if(item2.child[0].buttons.indexOf("查看")>-1) {
							this.swiperMenuList.push(item2);
						}
					})
				}
			})
			// let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				type: 1,
				limit: 100
			});
			for (let item of res.data.list) {
				if (item.name.indexOf('picture') >= 0 && item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
						title: item.name,
						url: item.url
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			
			this.prevNumList4 = this.swiperList.length - 1
			this.timerList4 = setInterval(this.autoPlayList4, 5000)

			this.getRecommendList()
			this.getHomeList()
			this.getNewsList()
		},
		methods: {
			scrollTopClick(){
				uni.pageScrollTo({
					scrollTop: 0
				})
			},
			uGetRect(selector, all) {
				return new Promise(resolve => {
					uni.createSelectorQuery()
					.in(this)
					[all ? 'selectAll' : 'select'](selector)
					.boundingClientRect(rect => {
						if (all && Array.isArray(rect) && rect.length) {
							resolve(rect);
						}
						if (!all && rect) {
							resolve(rect);
						}
					})
					.exec();
				});
			},
			cloneData(data) {
				return JSON.parse(JSON.stringify(data));
			},
			async getNewsList(){
				let res;
				let params = {
					page: 1,
					limit: 4,
					sort: 'id',
					order: 'desc',
				}
				// 通知公告
				res = await this.$api.list('news', params)
				this.news = res.data.list
			},
			homeTabClick2(index,name){
				this['home' + name + 'Index2'] = index
				this.getHomeList()
			},
			async getHomeList(){
				let res;
				let params;
				params = {
					page:1,
					limit: 6,
					onshelves: 1,
				}
				res = await this.$api.list('shiyanshebei', params);
				this.homeshiyanshebeilist = res.data.list
				params = {
					page:1,
					limit: 6,
				}
				res = await this.$api.list('shiyanzhidao', params);
				this.homeshiyanzhidaolist = res.data.list
			},
			recommendTabClick2(index,name){
				this[name + 'Index2'] = index
				this.getRecommendList()
			},
			async getRecommendList(){
				let res;
				let params;
			},
			autoPlayList4() {
				this.prevNumList4 = this.numList4
			
				this.numList4++
				if (this.numList4 == this.swiperList.length) this.numList4 = 0
			},
			touchStart(event) {
				this.startX = event.touches[0].clientX
				
				clearInterval(this.timerList4)
				this.flagList4 = true
			},
			touchMove(event) {
				const currentX = event.touches[0].clientX;
				const deltaX = currentX - this.startX;
				
				if (deltaX > 50) {
					// 向右滑动逻辑
					if (this.flagList4) {
						this.flagList4 = false
						
						this.prevNumList4 = this.numList4
						this.numList4++
						if (this.numList4 == this.swiperList.length) this.numList4 = 0
					}
					
				} else if (deltaX < -50) {
					// 向左滑动逻辑
					if (this.flagList4) {
						this.flagList4 = false
						
						this.prevNumList4 = this.numList4
						this.numList4--
						if (this.numList4 < 0) this.numList4 = this.swiperList.length - 1
					}
				}
			},
			touchEnd() {
				this.startX = 0
				this.timerList4 = setInterval(this.autoPlayList4, 5000)
				this.flagList4 = false
			},
			//轮播图跳转
			onSwiperTap(e) {
				if(e.url) {
					if (e.url.indexOf('https') != -1) {
						// #ifdef MP-WEIXIN
						uni.navigateTo({
						    url: '../../common/linkOthers/linkOthers?url=' + encodeURIComponent(e.url),
						});
						return false
						// #endif
						window.open(e.url)
					} else {
						this.$utils.jump(e.url)
					}
				}
			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				let url = `../${tableName}/detail?id=${id}`
				this.$utils.jump(url)
			},
			onPageTap(tableName){
				let url = `../${tableName}/list`
				uni.navigateTo({
					url: url,
					fail: function(){
						uni.switchTab({
							url: url
						});
					}
				});
			},
			onPageTap2(index) {
				let url = '../' + index + '/list'
				if(index=='kefuguanli') {
					url = '../chat/chat'
				}
				uni.setStorageSync("useridTag",0);
				uni.navigateTo({
					url: url,
					fail: function() {
						uni.switchTab({
							url: url
						});
					}
				});
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
	.list-swiper-4 .animate__animated {
		--animate-delay: 300ms;
	}

	.menu_view {
		padding: 0;
		margin: 0;
		grid-template-columns: 1fr 1fr 1fr 1fr;
		background: none;
		display: grid;
		width: 100%;
		height: auto;
		order: 1;
		.menu-item {
			padding: 12rpx 0;
			margin: 10rpx 0;
			width: 100%;
			height: auto;
			.iconarr {
				border-radius: 100%;
				padding: 0;
				margin: 0px auto;
				color: #298284;
				background: #fff;
				display: block;
				width: 64rpx;
				font-size: 64rpx;
				line-height: 64rpx;
				height: 64rpx;
			}
			.text {
				padding: 0;
				margin: 12rpx auto 0;
				color: #333;
				width: 100%;
				font-size: 28rpx;
				line-height: 28rpx;
				text-align: center;
			}
		}
	}
</style>
