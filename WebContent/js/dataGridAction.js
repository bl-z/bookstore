var url = "";//定义一个全局变量传给id为fm的form提交事件
/*var data = {};*/
function newUser() {
	$('#dlg').dialog('open').dialog('setTitle', 'New User&nbsp;&nbsp;<br/>添加用户请务必填入正确的邮箱以便我们发送用户的初始密码!');
	$('#fm').form('clear');
	url = 'AddUser.do';
}
function editUser() {
	//datagrid的getSelected方法是返回数据网格的第一个选中的行或者 null。
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('setTitle', 'Edit User');
		$('#fm').form('load', row);
		url = 'UpdateUser.do';
	}
}
//id为fm的form的提交事件，由用户信息编辑对话框的确定按钮点击触发
function saveUser() {
	//easyui对ajax的封装
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			//进行表单字段验证，当全部字段都有效时返回 true 。该方法和 validatebox 插件一起使用。
			return $('#fm').form('validate');//jquery $("#") $('#fm').form('validate') 会去调用验证框架进行验证，然后对所有easyui-validateBox验证结果进行与操作，全部ok表单才可以提交
		},
		success : function(result) {
			var result = eval('(' + result + ')');//数据解析，如果是json数据就解析成json
			if (result) {
				alert(result);
				$('#dlg').dialog('close'); // close the dialog
				$('#dg').datagrid('reload'); // reload the user data
			} else {
				$.messager.show({
					title : 'Error',
					msg : result.msg
				});
			}
		}
	});
}
//删除用户的方法
function removeUser() {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$.messager.confirm('Confirm','Are you sure you want to remove this user?', 
			function(cfm) {
				if (cfm) {
					// $.post(url,data,success(data, textStatus,xhr),dataType)
					$.post('RemoveUser.do',
							{uid : row.uid},
					function(result) {
						if (result) {
							$('#dg').datagrid('reload'); // reload the user data
						} else {
							$.messager.show({ // show error message
								title : 'Error',
								msg : result.msg
							});
						}
					}, 'json'// 返回的数据类型
					);
				}
			}
		);
	}
}
