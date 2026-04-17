<template>
	<view class="content">
		<view :style='{"width":"100%","padding":"0","position":"relative","background":"#fff","height":"auto"}'>
			<view v-if="user&&user.id" :style='{"border":"0px solid #29828430","padding":"0","margin":"0 0 20rpx 0","borderRadius":"10rpx","color":"#000","background":"url(http://codegen.caihongy.cn/20251217/bfb58355fda94f028a80fe92f7f01018.jpg) no-repeat center top / 100% auto","display":"flex","width":"100%","position":"relative","height":"auto"}' @tap="onPageTap('../user-info/user-info')" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"alignContent":"center","padding":"20rpx","alignItems":"center","flexWrap":"wrap","flex":"1","display":"flex","height":"100%"}' v-if="tableName=='xuesheng'" class="userinfo">
					<image :style='{"width":"140rpx","padding":"0","margin":"30rpx 0 30rpx 80rpx","borderRadius":"100%","height":"140rpx"}' :src="user.touxiang?baseUrl+user.touxiang:require('../../static/gen/upload.png')"></image>
					<view :style='{"margin":"30rpx 0 30rpx 24rpx","flex":"auto","flexDirection":"column","display":"flex","width":"auto","justifyContent":"center","height":"140rpx"}' class="info">
						<view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"28rpx","color":"inherit"}'>{{user.xueshengxuehao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
					
					<view :style='{"width":"100%","padding":"0 0 10rpx 100rpx","margin":"0"}' class="info">
						<view :style='{"width":"100%","lineHeight":"48rpx","fontSize":"28rpx"}'>
							<span :style='{"color":"#333"}'>手机号：</span>
							<span :style='{"color":"#333"}'>{{user.shoujihao}}</span>
						</view>
						<view :style='{"width":"100%","lineHeight":"48rpx","fontSize":"28rpx"}' v-if="user.jf||user.jf==0">
							<span :style='{"color":"#333"}'>积分：</span>
							<span :style='{"color":"#333"}'>{{user.jf}}</span>
						</view>
					</view>
					<view :style='{"width":"100%","padding":"20rpx","justifyContent":"center","display":"flex"}'>
					  <view :style='{"margin":"0 40rpx 0 0","alignItems":"center","borderRadius":"8rpx","background":"#59b4b5","display":"flex","width":"35%","justifyContent":"center","height":"80rpx"}'>
					    <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#fff"}'></text>
					    <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"28rpx"}'>点赞 {{user.thumbsnum}}</text>
					  </view>
					  <view :style='{"alignItems":"center","borderRadius":"8rpx","background":"#da961e","display":"flex","width":"35%","justifyContent":"center","height":"80rpx"}'>
					    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#fff"}'></text>
					    <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"28rpx"}'>收藏 {{user.storenum}}</text>
					  </view>
					</view>
				</view>
				<view :style='{"alignContent":"center","padding":"20rpx","alignItems":"center","flexWrap":"wrap","flex":"1","display":"flex","height":"100%"}' v-if="tableName=='jiaoshi'" class="userinfo">
					<image :style='{"width":"140rpx","padding":"0","margin":"30rpx 0 30rpx 80rpx","borderRadius":"100%","height":"140rpx"}' :src="user.touxiang?baseUrl+user.touxiang:require('../../static/gen/upload.png')"></image>
					<view :style='{"margin":"30rpx 0 30rpx 24rpx","flex":"auto","flexDirection":"column","display":"flex","width":"auto","justifyContent":"center","height":"140rpx"}' class="info">
						<view :style='{"width":"100%","lineHeight":"36rpx","fontSize":"28rpx","color":"inherit"}'>{{user.jiaoshizhanghao}}<text v-if="user.vip&& user.vip=='是'">(VIP)</text></view>
					</view>
					
					<view :style='{"width":"100%","padding":"0 0 10rpx 100rpx","margin":"0"}' class="info">
						<view :style='{"width":"100%","lineHeight":"48rpx","fontSize":"28rpx"}'>
							<span :style='{"color":"#333"}'>联系电话：</span>
							<span :style='{"color":"#333"}'>{{user.lianxidianhua}}</span>
						</view>
						<view :style='{"width":"100%","lineHeight":"48rpx","fontSize":"28rpx"}' v-if="user.jf||user.jf==0">
							<span :style='{"color":"#333"}'>积分：</span>
							<span :style='{"color":"#333"}'>{{user.jf}}</span>
						</view>
					</view>
					<view :style='{"width":"100%","padding":"20rpx","justifyContent":"center","display":"flex"}'>
					  <view :style='{"margin":"0 40rpx 0 0","alignItems":"center","borderRadius":"8rpx","background":"#59b4b5","display":"flex","width":"35%","justifyContent":"center","height":"80rpx"}'>
					    <text class="icon iconfont icon-zan10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#fff"}'></text>
					    <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"28rpx"}'>点赞 {{user.thumbsnum}}</text>
					  </view>
					  <view :style='{"alignItems":"center","borderRadius":"8rpx","background":"#da961e","display":"flex","width":"35%","justifyContent":"center","height":"80rpx"}'>
					    <text class="icon iconfont icon-shoucang10" :style='{"margin":"0 4rpx 0 0","lineHeight":"1.5","fontSize":"28rpx","color":"#fff"}'></text>
					    <text :style='{"color":"#fff","lineHeight":"1.5","fontSize":"28rpx"}'>收藏 {{user.storenum}}</text>
					  </view>
					</view>
				</view>
				<view :style='{"padding":"0 0 0 20rpx","alignItems":"center","top":"40rpx","flexDirection":"column","display":"flex","width":"120rpx","position":"absolute","right":"60rpx","justifyContent":"center","height":"auto","zIndex":"1"}' class="setting">
					<text class="icon iconfont icon-qita6" :style='{"border":"0","width":"64rpx","lineHeight":"64rpx","fontSize":"64rpx","color":"inherit","borderRadius":"0"}'></text>
					<text :style='{"padding":"0 20rpx 0 20rpx","margin":"10rpx 0 0 0","whiteSpace":"nowrap","color":"inherit","background":"#fff","lineHeight":"2","fontSize":"24rpx"}'>设置</text>
				</view>
			</view>
			
			<view v-else :style='{"border":"0px solid #29828430","padding":"0","margin":"0 0 20rpx 0","borderRadius":"10rpx","color":"#000","background":"url(http://codegen.caihongy.cn/20251217/bfb58355fda94f028a80fe92f7f01018.jpg) no-repeat center top / 100% auto","display":"flex","width":"100%","position":"relative","height":"auto"}' @tap="loginClick" class="header" v-bind:class="{'status':isH5Plus}">
				<view :style='{"alignItems":"center","color":"#666","display":"flex","width":"100%","fontSize":"36rpx","justifyContent":"center","height":"100%"}'>登录/注册</view>
			</view>
			
			<view :style='{"width":"100%","padding":"0 24rpx 0 24rpx","background":"#fff","height":"auto"}' class="list">
				
				<view :style='{"width":"100%","margin":"0","height":"auto"}'>
					<view :style='{"padding":"0 0 0 60rpx","color":"#fff","textAlign":"left","background":"url(http://codegen.caihongy.cn/20251216/4255e8ea722543b681847805c8f3a64c.png) no-repeat center top / 100% 100%","width":"100%","lineHeight":"120rpx","fontSize":"36rpx","height":"120rpx"}'>
						<view :style='{"color":"#fff","fontSize":"36rpx","lineHeight":"120rpx"}'>我的服务</view>
					</view>
					<view class="me-menu-view">
						<block v-for="item in menuList" v-bind:key="item.roleName">
							<block v-if="role==item.roleName" v-bind:key="menu.menu" v-for="(menu,index) in item.backMenu">
								<block v-bind:key="child.tableName" v-for=" (child,sort) in menu.child">
									<view class="me-menu-item" v-if="hasBack(child.tableName)" @tap="onPageTap('../'+child.tableName+'/list?userid='+user.id+'&menuJump='+child.menuJump)" hover-class="hover">
										<view class="me-menu-icon" :class="child.appFrontIcon"></view>
										<view class="text">{{child.menu}}</view>
										<view class="icon iconfont icon-jinru"></view>
									</view>
								</block>
							</block>
						</block>


						<view v-if="user&&user.id" @tap="onPageTap('../chat/chat')" class="me-menu-item" hover-class="hover">
							<view class="cuIcon-service me-menu-icon"></view>
							<view class="text">智能助手</view>
							<view class="icon iconfont icon-jinru"></view>
						</view>
						<view v-if="user&&user.id" @tap="passwordShow()" class="me-menu-item" hover-class="hover">
							<view class="cuIcon-lock me-menu-icon"></view>
							<view class="text">修改密码</view>
							<view class="icon iconfont icon-jinru"></view>
						</view>
					</view>
				</view>
			</view>
			
			<!-- 推荐 -->
			<view style="width: 100%;height: 80px"></view>
		</view>
		<uni-popup class="popup-content" ref="passwordPopup" type="bottom">
			<view class="passwordForm">
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.mima" placeholder="原密码" />
				</view>
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.newmima" placeholder="新密码" />
				</view>
				<view class="passwordInput">
					<input type="password" v-model="passwordForm.newmima1" placeholder="确认密码" />
				</view>
				<view class="passwordBtnView">
					<button class="passwordBtn" @click="updatePassword">更新</button>
				</view>
			</view>
		</uni-popup>
	</view>
</template>
<script>
	import menu from '@/utils/menu'
	export default {
		data() {
			return {
				isH5Plus: true,
				user: {},
				tableName:'',
				role: '',
				menuList: [],
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
				passwordForm: {
					mima: '',
					newmima: '',
					newmima1: '',
				},
			};
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(){
			let menus = menu.list();
			this.menuList = menus;
		},
		async onShow(){
            uni.removeStorageSync("useridTag");
			this.role = uni.getStorageSync("appRole");
			await this.getSession()
			this.getThumbsup()
			this.getStoreup()
			this.tableName = uni.getStorageSync("nowTable");
			let menus = menu.list();
			this.menuList = menus;
			this.$forceUpdate()
		},
		methods: {
			hasBack(tableName) {
				if(tableName == 'hasBoard') {
					return false
				}
				if(tableName.indexOf('chapter')!=-1) {
					return false
				}
				return true
			},
			async getSession(){
				let table = uni.getStorageSync("nowTable");
				let res = await this.$api.session(table);
				this.user = res.data;
				this.$forceUpdate()
			},
			async getThumbsup(){
				if(!this.user||!this.user.id){
					return false
				}
				let res = await this.$api.page('storeup',{userid: this.user.id,type: 21})
				this.user.thumbsnum = Number(res.data.total)
				this.$forceUpdate()
			},
			async getStoreup(){
				if(!this.user||!this.user.id){
					return false
				}
				let res = await this.$api.page('storeup',{userid: this.user.id,type: 1})
				this.user.storenum = Number(res.data.total)
				this.$forceUpdate()
			},
			loginClick(){
				uni.navigateTo({
					url: '../login/login'
				});
			},
			onPageTap(url) {
                uni.setStorageSync("useridTag",1);
				uni.navigateTo({
					url: url,
					fail: function() {
						uni.switchTab({
							url: url
						});
					}
				});
			},
			hasTranslate(){
				for(let x in this.menuList){
					if(this.menuList[x].roleName == this.role){
						for(let i in this.menuList[x].backMenu){
							if(this.menuList[x].backMenu[i].child.length) {
								for(let j in this.menuList[x].backMenu[i].child) {
									if(this.menuList[x].backMenu[i].child[j].tableName=='hasTranslate'){
										return true
									}
								}
							}
						}
					}
				}
				return false
			},
			
			preHttp(str) {
			    return str && str.substr(0,4)=='http';
			},
			recommendDetail(id) {
				uni.navigateTo({
					url: `../${this.recommendTable}/detail?id=${id}`,
					fail: function() {
						uni.switchTab({
							url: `../${this.recommendTable}/detail?id=${id}`
						});
					}
				});
			},
			passwordShow() {
				this.passwordForm = {
					mima: '',
					newmima: '',
					newmima1: '',
				}
				this.$forceUpdate()
				this.$refs.passwordPopup.open()
			},
			async updatePassword() {
				if (this.passwordForm.mima == ''){
					this.$utils.msg('原密码不能为空')
					return false
				}
				if (this.passwordForm.newmima == ''){
					this.$utils.msg('新密码不能为空')
					return false
				}
				if (this.passwordForm.newmima1 == ''){
					this.$utils.msg('确认密码不能为空')
					return false
				}
				let password = ''
				if (this.user.mima) {
					password = this.user.mima;
				} else if (this.user.password) {
					password = this.user.password;
				}
				if (this.tableName == 'xuesheng') {
				}
				let newpassword = this.passwordForm.mima
				if(password != newpassword){
					this.$utils.msg('原密码不正确')
					return false
				}
				if (this.passwordForm.newmima != this.passwordForm.newmima1){
					this.$utils.msg('两次密码不一致')
					return false
				}
				if (this.passwordForm.mima == this.passwordForm.newmima){
					this.$utils.msg('新密码与原密码相同！')
					return false
				}
				this.user.password = this.passwordForm.newmima
				this.user.mima = this.passwordForm.newmima
				await this.$api.update(this.tableName,this.user)
				this.$utils.msg('修改密码成功,下次登录系统生效')
				this.$refs.passwordPopup.close()
				this.getSession()
			},
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		height: calc(100vh - 94px);
		box-sizing: border-box;
	}
	.passwordForm {
		width: 100%;
		padding: 10px 20px 60px;
		background: #fff;
	
		.passwordInput {
			background: #eee;
			margin: 0 0 10px;
			padding: 0 10px;
	
			input {
				height: 36px;
				line-height: 36px;
				font-size: 14px;
			}
		}
	
		.passwordBtnView {
			width: 100%;
			display: flex;
			align-items: center;
			justify-content: center;
			padding: 10px 0;
	
			.passwordBtn {
				padding: 0 20px;
				width: auto;
				height: 20px;
				line-height: 20px;
				font-size: 14px;
				color: #fff;
				background: #007aff;
				border: none;
				border-radius: 5px;
	
			}
		}
	}
	.me-menu-view {
		padding: 24rpx 24rpx 0 24rpx;
		display: flex;
		width: 100%;
		flex-wrap: wrap;
		height: auto;
		.me-menu-item {
			padding: 10rpx 0 10rpx 0;
			display: flex;
			width: 100%;
			border-color: #eeeeee;
			border-width: 0 0 2rpx 0;
			align-items: center;
			border-style: solid;
			height: auto;
			.me-menu-icon {
				color: #298284;
				font-size: 84rpx;
				line-height: 1;
			}
			.text {
				padding: 0 20rpx 0 20rpx;
				color: #333;
				flex: 1;
				width: 100%;
				font-size: 28rpx;
				line-height: 88rpx;
			}
			.icon {
				color: #999;
				width: 28rpx;
				font-size: 28rpx;
				line-height: 28rpx;
			}
		}
	}
</style>
