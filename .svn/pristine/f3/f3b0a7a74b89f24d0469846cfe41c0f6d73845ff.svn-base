

$(function(){

	$.extend($.fn.validatebox.defaults.rules, {
		chinese : {
			validator : function(value, param) {
				return /^[\u0391-\uFFE5]+$/.test(value);
			},
			message : '请输入汉字'
		},
		english : { // 验证英语
			validator : function(value) {
				return /^[A-Za-z]+$/i.test(value);
			},
			message : '请输入英文'
		},
		ip : { // 验证IP地址
			validator : function(value) {
				return /\d+\.\d+\.\d+\.\d+/.test(value);
			},
			message : 'IP地址格式不正确'
		},
		zip : {
			validator : function(value, param) {
				return /^[0-9]\d{5}$/.test(value);
			},
			message : '邮政编码不存在'
		},
		qq : {
			validator : function(value, param) {
				return /^[1-9]\d{4,10}$/.test(value);
			},
			message : 'QQ号码不正确'
		},
		mobile : {
			validator : function(value) {
				var reg = /^1[3,4,5,7,8,9]\d{9}$/;//digital
				/*return /^(?:13\d|15\d|18\d)-?\d{5}(\d{3}|\*{3})$/.test(value);*/
				return reg.test(value);
			},
			message : '手机号码不正确'
		},
		tel : {
			validator : function(value, param) {
				return /^(\d{3}-|\d{4}-)?(\d{8}|\d{7})?(-\d{1,6})?$/.test(value);
			},
			message : '电话号码不正确'
		},
		mobileAndTel : {
			validator : function(value, param) {
				return /(^([0\+]\d{2,3})\d{3,4}\-\d{3,8}$)|(^([0\+]\d{2,3})\d{3,4}\d{3,8}$)|(^([0\+]\d{2,3}){0,1}13\d{9}$)|(^\d{3,4}\d{3,8}$)|(^\d{3,4}\-\d{3,8}$)/.test(value);
			},
			message : '请正确输入电话号码'
		},
		number : {
			validator : function(value, param) {
				return /^[0-9]+.?[0-9]*$/.test(value);
			},
			message : '请输入数字'
		},
		money : {
			validator : function(value, param) {
				return (/^(([1-9]\d*)|\d)(\.\d{1,2})?$/).test(value);
			},
			message : '请输入正确的金额'
		},
		mone : {
			validator : function(value, param) {
				return (/^(([1-9]\d*)|\d)(\.\d{1,2})?$/).test(value);
			},
			message : '请输入整数或小数'
		},
		integer : {
			validator : function(value, param) {
				return /^[+]?[1-9]\d*$/.test(value);
			},
			message : '请输入最小为1的整数'
		},
		integ : {
			validator : function(value, param) {
				return /^[+]?[0-9]\d*$/.test(value);
			},
			message : '请输入整数'
		},
		range : {
			validator : function(value, param) {
				if (/^[1-9]\d*$/.test(value)) {
					return value >= param[0] && value <= param[1]
				} else {
					return false;
				}
			},
			message : '输入的数字在{0}到{1}之间'
		},
		minLength : {
			validator : function(value, param) {
				return value.length >= param[0]
			},
			message : '至少输入{0}个字'
		},
		maxLength : {
			validator : function(value, param) {
				return value.length <= param[0]
			},
			message : '最多{0}个字'
		},
		//select即选择框的验证
		selectValid : {
			validator : function(value, param) {
				if (value == param[0]) {
					return false;
				} else {
					return true;
				}
			},
			message : '请选择'
		},
		idCode : {
			validator : function(value, param) {
				return /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/.test(value);
			},
			message : '请输入正确的身份证号'
		},
		loginName : {
			validator : function(value, param) {
				return /^[\u0391-\uFFE5\w]+$/.test(value);
			},
			message : '登录名称只允许汉字、英文字母、数字及下划线。'
		},
		equalTo : {
			validator : function(value, param) {
				return value == $(param[0]).val();
			},
			message : '两次输入的字符不一致'
		},
		englishOrNum : { // 只能输入英文和数字
			validator : function(value) {
				return /^[a-zA-Z0-9_ ]{1,}$/.test(value);
			},
			message : '请输入英文、数字、下划线或者空格'
		},
		xiaoshu : {
			validator : function(value) {
				return /^(([1-9]+)|([0-9]+\.[0-9]{1,2}))$/.test(value);
			},
			message : '最多保留两位小数！'
		},
		ddPrice : {
			validator : function(value, param) {
				if (/^[1-9]\d*$/.test(value)) {
					return value >= param[0] && value <= param[1];
				} else {
					return false;
				}
			},
			message : '请输入1到100之间正整数'
		},
		jretailUpperLimit : {
			validator : function(value, param) {
				if (/^[0-9]+([.]{1}[0-9]{1,2})?$/.test(value)) {
					return parseFloat(value) > parseFloat(param[0]) && parseFloat(value) <= parseFloat(param[1]);
				} else {
					return false;
				}
			},
			message : '请输入0到100之间的最多俩位小数的数字'
		},
		rateCheck : {
			validator : function(value, param) {
				if (/^[0-9]+([.]{1}[0-9]{1,2})?$/.test(value)) {
					return parseFloat(value) > parseFloat(param[0]) && parseFloat(value) <= parseFloat(param[1]);
				} else {
					return false;
				}
			},
			message : '请输入0到1000之间的最多俩位小数的数字'
		},
		onlyInteger : {
			validator : function(value) {
				var reg = /^[1-9]\d*$/i;//i:ignore 忽略 g:global 全局 m : multiple多行 
				return reg.test(value);
			},
			message : '手机号码不正确'
		},
		onlyNum : {
			validator : function(value) {
				var reg = /^(\d\.\d*)$|^([1-9]\d*\.\d*)$|^[1-9]\d*$/;//i:ignore 忽略 g:global 全局 m : multiple多行  01.01
				return reg.test(value);
			},
			message : '手机号码不正确'
		},
		onlyChinese : {
			validator : function(value,param) {
				var min = param[0];
				var max = param[1];
				var reg = /^[\u4e00-\u9fa5]$/;//i:ignore 忽略 g:global 全局 m : multiple多行  01.01
				var r = new RegExp('^[\u4e00-\u9fa5]{'+ min + ',' + max +'}$');
				return r.test(value);
			},
			message : '请输入最少{0}，最多{1}个中文，如果有阿拉伯数字请转换成中文大写'
		},
		
		
	});

});