var url = "";
function news(src) {
	$('#dlg').dialog('open').dialog('setTitle', '');
	$('#fm').form('clear');
	url = src;
}
function edits(src) {
	var row = $('#dg').datagrid('getSelected');
	if (row) {
		$('#dlg').dialog('open').dialog('setTitle', 'Edit User');
		$('#fm').form('load', row);
		url = src;
	}
}

function saves() {
	$('#fm').form('submit', {
		url : url,
		onSubmit : function() {
			return $('#fm').form('validate');// jquery $("#")
			// $('#fm').form('validate')
		},
		success : function(result) {
			var result = eval('(' + result + ')');
			if (result.state) {
				console.log(result);
				$('#dlg').dialog('close'); // close the dialog
				$.messager.show({
					title : 'success',
					msg : result.msg
				});
			} else {
				$.messager.show({
					title : 'error',
					msg : result.msg
				});
			}
			$('#dg').datagrid('reload'); // reload the user data
		},
		
	});
}

function removes(src) {
	$.ajax({
		url : '/bookstore/loginCtrl/permission/',
		success : function(data) {
			alert("ojbk" + data)

			if (data == "经理") {
				alert("经理")
				var row = $('#dg').datagrid('getSelected');
				if (row) {
					$.messager.confirm('Confirm', '确定从数据库中彻底删除吗',
							function(cfm) {
								if (cfm) {
									if (row.empId) {
										data = {
											empId : row.empId
										}
									} else if (row.adminId) {
										data = {
											adminId : row.adminId
										}
									} else if (row.jobId) {
										data = {
											jobId : row.jobId
										}
									}
									// $.post(url,data,success(data,
									// textStatus,xhr),dataType)
									$.post(src, data, function(result) {
										if (result) {
											$('#dg').datagrid('reload'); // reload
																			// the
																			// user
											// data
											$.messager.show({ // show error
																// message
												title : 'success',
												msg : result.msg
											});
										} else {
											$.messager.show({ // show error
																// message
												title : 'Error',
												msg : result.msg
											});
										}
									}, 'json');
								}
							});
				}
			}

		},
		error : function(error) {
			console.log(error)
		}
	})
	if (permission) {
		alert("可以删除")

	}

}