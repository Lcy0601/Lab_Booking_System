const config = {
	list() {
		return [
			{
				name: '实验室',
				value: 'shiyanshi'
			},
			{
				name: '实验指导',
				value: 'shiyanzhidao'
			},
			{
				name: '实验室评论',
				value: 'discussshiyanshi'
			},
			{
				name: '实验指导评论',
				value: 'discussshiyanzhidao'
			},
		]
	},
	roleList() {
		return [
			{
				roleName: 'xuesheng',
				tableName: '学生',
			},
			{
				roleName: 'jiaoshi',
				tableName: '教师',
			},
		]
	},
}
export default config;
