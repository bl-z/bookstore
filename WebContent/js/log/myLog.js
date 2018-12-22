var url = "";// 定义一个全局变量传给id为fm的form提交事件

let $operateType = '';
let $startTime = '';
let $endTime = '';
let $UniformResourceLocation = 'http://' + window.location.host + '/bookstore/';

function doSearch() {
	$.ajax({
		url : $UniformResourceLocation + 'log/getMyLog',
		dataType : 'json',
		async : false,
		data : {
			operateType : $operateType,
			operate : $("#operate").val(),
			requestIp : $("#requestIp").val(),
			startTime : $startTime,
			endTime : $endTime,
			currentPage : 1,
			pageSize : 10
		},
		success : function(data) {
			transferType(data.value.rows);
			$("#dg").datagrid('loadData', data.value);
			console.log(data);
		}
	});

}

$(function() {

	$('#dg').datagrid({
		
	title:"我的操作日志"
		,
		columns : [ [ {
			field : 'logId',
			hidden : true
		}, {
			field : 'operateType',
			title : '类型',
			width : 50,
			align : 'center'
		}, {
			field : 'operate',
			title : '操作',
			width : 60,
			align : 'center'
		}, {
			field : 'detail',
			hidden:true,
			title : '细节',
			width : 100,
			align : 'left',
			 formatter: function(value,row,index){
					if (row.detail){
						return "&emsp;"+row.detail;
					} else {
						return '&emsp;无细节';
					}
				}
		}, {
			field : 'requestIp',
			title : 'ip',
			width : 60,
			align : 'center'
		}, {
			field : 'logTime',
			title : '时间',
			width : 100,
			align : 'center'
		} ] ],
		pagination : true,
		pageList : [ 5, 10, 20 ],
		fitColumns : true,
		striped : true,
		rownumbers : true,
		singleSelect : true,
		nowrap:false
	});

	doSearch();

	var pager = $('#dg').datagrid('getPager');
	pager.pagination({
		pageSize : 10,
		pageNumber : 1,
		showPageList : true,
		onSelectPage : function(pageNumber, pageSize) {
			$.ajax({
				url : $UniformResourceLocation + 'log/getMyLog',
				dataType : 'json',
				async : false,
				data : {
					operateType : $operateType,
					operate : $("#operate").val(),
					requestIp : $("#requestIp").val(),
					startTime : $startTime,
					endTime : $endTime,
					currentPage : pageNumber,
					pageSize : pageSize,
				},
				success : function(data) {
					transferType(data.value.rows);
					$("#dg").datagrid('loadData', data.value);
					console.log(data);
				}
			});
		}
	});
});

$(function() {

	// 设置查询时间格式
	$('#startTime').datebox(
			{
				onSelect : function(date) {
					$startTime = date.getFullYear() + "-"
							+ (date.getMonth() + 1) + "-" + date.getDate();
				}
			});
	$('#endTime').datebox(
			{
				onSelect : function(date) {
					$endTime = date.getFullYear() + "-" + (date.getMonth() + 1)
							+ "-" + date.getDate();
				}
			});

	$('#operateType').combobox({
		onSelect : function(record) {
			$operateType = record.text;
			console.log(record);
		}
	});

})

function transferType(rows) {
	$.each(rows, function(i, item) {

		switch (item["operateType"]) {
		case -1:
			item["operateType"] = "错&emsp;&emsp;&emsp;误";
			break;
		case 0:
			item["operateType"] = "未&emsp;&emsp;&emsp;知";
			break;
		case 1:
			item["operateType"] = "登陆与注销";
			break;
		case 2:
			item["operateType"] = "数据库操作";
			break;
		case 3:
			item["operateType"] = "日&emsp;&emsp;&emsp;志";
			break;
		default:
			item["operateType"] = "未&emsp;&emsp;&emsp;知";
			break;
		}
	})
}
