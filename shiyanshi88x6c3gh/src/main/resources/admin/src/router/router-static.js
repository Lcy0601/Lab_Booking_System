	import Vue from 'vue';
//配置路由
	import VueRouter from 'vue-router'
	Vue.use(VueRouter);
//1.创建组件
	import Index from '@/views/index'
	import Home from '@/views/home'
	import Login from '@/views/login'
	import NotFound from '@/views/404'
	import UpdatePassword from '@/views/update-password'
	import pay from '@/views/pay'
	import register from '@/views/register'
	import center from '@/views/center'
	import xuesheng from '@/views/modules/xuesheng/list'
	import jiaoshi from '@/views/modules/jiaoshi/list'
	import yuanxi from '@/views/modules/yuanxi/list'
	import shebeifenlei from '@/views/modules/shebeifenlei/list'
	import shiyanshebei from '@/views/modules/shiyanshebei/list'
	import shebeiyuyue from '@/views/modules/shebeiyuyue/list'
	import shebeiguihai from '@/views/modules/shebeiguihai/list'
	import baofeishenqing from '@/views/modules/baofeishenqing/list'
	import weihujilu from '@/views/modules/weihujilu/list'
	import quxiaoshebeiyuyue from '@/views/modules/quxiaoshebeiyuyue/list'
	import shebeishiyongbaogao from '@/views/modules/shebeishiyongbaogao/list'
	import shiyanshi from '@/views/modules/shiyanshi/list'
	import shiyanshiyuyue from '@/views/modules/shiyanshiyuyue/list'
	import shiyanshiqiandao from '@/views/modules/shiyanshiqiandao/list'
	import shiyanshiqiantui from '@/views/modules/shiyanshiqiantui/list'
	import quxiaoshiyanshiyuyue from '@/views/modules/quxiaoshiyanshiyuyue/list'
	import shiyanshipingjia from '@/views/modules/shiyanshipingjia/list'
	import anquanyinhuan from '@/views/modules/anquanyinhuan/list'
	import yinhuanchuli from '@/views/modules/yinhuanchuli/list'
	import xunchajilu from '@/views/modules/xunchajilu/list'
	import shiyanzhidao from '@/views/modules/shiyanzhidao/list'
	import zhishileixing from '@/views/modules/zhishileixing/list'
	import news from '@/views/modules/news/list'
	import chat from '@/views/modules/chat/list'
	import chathelper from '@/views/modules/chathelper/list'
	import syslog from '@/views/modules/syslog/list'
	import popupremind from '@/views/modules/popupremind/list'
	import users from '@/views/modules/users/list'
	import discussshiyanshi from '@/views/modules/discussshiyanshi/list'
	import discussshiyanzhidao from '@/views/modules/discussshiyanzhidao/list'
import config from '@/views/modules/config/list'

//2.配置路由   注意：名字
export const routes = [{
	path: '/',
	name: '系统首页',
	component: Index,
	children: [{
		// 这里不设置值，是把main作为默认页面
		path: '/',
		name: '系统首页',
		component: Home,
		meta: {icon:'', title:'center', affix: true}
	}, {
		path: '/updatePassword',
		name: '修改密码',
		component: UpdatePassword,
		meta: {icon:'', title:'updatePassword'}
	}, {
		path: '/pay',
		name: '支付',
		component: pay,
		meta: {icon:'', title:'pay'}
	}, {
		path: '/center',
		name: '个人信息',
		component: center,
		meta: {icon:'', title:'center'}
	}
	,{
		path: '/xuesheng',
		name: '学生',
		component: xuesheng
	}
	,{
		path: '/jiaoshi',
		name: '教师',
		component: jiaoshi
	}
	,{
		path: '/yuanxi',
		name: '院系',
		component: yuanxi
	}
	,{
		path: '/shebeifenlei',
		name: '设备分类',
		component: shebeifenlei
	}
	,{
		path: '/shiyanshebei',
		name: '实验设备',
		component: shiyanshebei
	}
	,{
		path: '/shebeiyuyue',
		name: '设备预约',
		component: shebeiyuyue
	}
	,{
		path: '/shebeiyuyuestat',
		name: '设备预约统计',
		component: shebeiyuyue
	}
	,{
		path: '/shebeiguihai',
		name: '设备归还',
		component: shebeiguihai
	}
	,{
		path: '/baofeishenqing',
		name: '报废申请',
		component: baofeishenqing
	}
	,{
		path: '/weihujilu',
		name: '维护记录',
		component: weihujilu
	}
	,{
		path: '/quxiaoshebeiyuyue',
		name: '取消设备预约',
		component: quxiaoshebeiyuyue
	}
	,{
		path: '/shebeishiyongbaogao',
		name: '设备使用报告',
		component: shebeishiyongbaogao
	}
	,{
		path: '/shiyanshi',
		name: '实验室',
		component: shiyanshi
	}
	,{
		path: '/shiyanshiyuyue',
		name: '实验室预约',
		component: shiyanshiyuyue
	}
	,{
		path: '/shiyanshiqiandao',
		name: '实验室签到',
		component: shiyanshiqiandao
	}
	,{
		path: '/shiyanshiqiantui',
		name: '实验室签退',
		component: shiyanshiqiantui
	}
	,{
		path: '/quxiaoshiyanshiyuyue',
		name: '取消实验室预约',
		component: quxiaoshiyanshiyuyue
	}
	,{
		path: '/shiyanshipingjia',
		name: '实验室评价',
		component: shiyanshipingjia
	}
	,{
		path: '/anquanyinhuan',
		name: '安全隐患',
		component: anquanyinhuan
	}
	,{
		path: '/yinhuanchuli',
		name: '隐患处理',
		component: yinhuanchuli
	}
	,{
		path: '/xunchajilu',
		name: '巡查记录',
		component: xunchajilu
	}
	,{
		path: '/shiyanzhidao',
		name: '实验指导',
		component: shiyanzhidao
	}
	,{
		path: '/zhishileixing',
		name: '知识类型',
		component: zhishileixing
	}
	,{
		path: '/news',
		name: '通知公告',
		component: news
	}
	,{
		path: '/chat',
		name: '智能助手',
		component: chat
	}
	,{
		path: '/chathelper',
		name: '聊天助手表',
		component: chathelper
	}
	,{
		path: '/syslog',
		name: '系统日志',
		component: syslog
	}
	,{
		path: '/popupremind',
		name: '弹窗提醒',
		component: popupremind
	}
	,{
		path: '/users',
		name: '管理员',
		component: users
	}
	,{
		path: '/discussshiyanshi',
		name: '实验室评论',
		component: discussshiyanshi
	}
	,{
		path: '/discussshiyanzhidao',
		name: '实验指导评论',
		component: discussshiyanzhidao
	}
	,{
		path: '/config/:type',
		name: '配置管理',
		component: config
	}
	]
	},
	{
		path: '/login',
		name: 'login',
		component: Login,
		meta: {icon:'', title:'login'}
	},
	{
		path: '/register',
		name: 'register',
		component: register,
		meta: {icon:'', title:'register'}
	},
	{
		path: '*',
		component: NotFound
	}
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
	mode: 'hash',
	/*hash模式改为history*/
	routes // （缩写）相当于 routes: routes
})
const originalPush = VueRouter.prototype.push
//修改原型对象中的push方法
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}
export default router;
