var url = "";
// 定义一个全局变量传给id为fm的form提交事件
/* var data = {}; */
function newCoupon() {
	$('#dlg').dialog('open').dialog('setTitle',
			'添加优惠券!');
	$('#fm').form('clear');
	url = '/bookstore/coupon/addCoupon';
}
// id为fm的form的提交事件，由用户信息编辑对话框的确定按钮点击触发
function saveCoupon() {
	// easyui对ajax的封装
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			// 进行表单字段验证，当全部字段都有效时返回 true 。该方法和 validatebox 插件一起使用。
			return $('#fm').form('validate');// jquery $("#")
			// $('#fm').form('validate')
			// 会去调用验证框架进行验证，然后对所有easyui-validateBox验证结果进行与操作，全部ok表单才可以提交
		},
		success : function(result) {
			var result = eval('(' + result + ')');// 数据解析，如果是json数据就解析成json
			if (result.state==true) {
				var coupon = result.value;
				$('#dg').datagrid('appendRow', {   // 添加是自动刷新
					couponId 		: coupon.couponId,
					couponName 		: coupon.couponName,
					couponMoney		: coupon.couponMoney,
					couponNum 		: coupon.couponNum,
					couponStart 	: coupon.couponStart,
					couponEnd 		: coupon.couponEnd,
					couponRemainNum : coupon.couponRemainNum,
					couponStatus 	: coupon.couponStatus,
				});
				$('#dlg').dialog('close'); // close the dialog
				$('#dg').datagrid('reload'); // reload the user data
				$.messager.alert("提示", "添加成功！", "info");
			}
			$.messager.show({
				title : '提示消息',
				msg : result.msg
			});
		}
	});
}

