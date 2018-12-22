<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.5/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.5/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.5/demo/demo.css">
<script type="text/javascript" src="<%=path%>/js/jquery-2.2.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.datagrid.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.dialog.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.form.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.messager.js"></script>
<script type="text/javascript" src="<%=path%>/js/printAction1.js"></script>
<script type="text/javascript" src="<%=path%>/js/setFirstPage.js"></script>
<script type="text/javascript" src="<%=path%>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path%>/js/validateDemo.js"></script>
<title>印刷商管理</title>
<style type="text/css">

#fm {
	margin: 0;
	padding: 10px 30px;
}

.ftitle {
	font-size: 14px;
	font-weight: bold;
	color: #666;
	padding: 5px 0;
	margin-bottom: 10px;
	border-bottom: 1px solid #ccc;
}

.fitem {
	margin-bottom: 5px;
}

.easyui-datagrid {
	width: 100%;
	height: 100%;
}

.fitem label {
	display: inline-block;
	width: 80px;
}

.easyui-numberbox {
	width: 75px;
}
#printerId{
	border-radius: 6px;
}
#printerName{
	border-radius: 6px;
}
</style>

<script type="text/javascript"> 
	
	function doSearch(value, name){ 
		
			setFirstPage("#dg");
		
			$.ajax({
				url:'<%=basePath%>printController/getPrinter',
				dataType : "json",
				async : false,
				data : {
					value : value,
				},
				success : function(data) {
					$("#dg").datagrid('loadData', data.value);
				}
		});
	}

	// 查看印刷商
	$(function() {
		$('#printer').combogrid({
			panelWidth : 210,
			idField : 'printerId',
			textField : 'printerName',
			url : 'getAllPrinter',
			columns : [ [ {
				field : 'printerId',
				title : '印刷商编号',
				width : 70
			}, {
				field : 'printerName',
				title : '印刷商名',
				width : 140
			}, ] ]
		});
	})
</script>

</head>
<body>
	<!-- pagination : 是否可以分页  url：对应一个handler来获取数据 toolbar：使用一个div与之对应 ；
	rownumbers：在数据展示的时候是否显示行数；fitColumns：数据显示时是否根据内容调整每一列的占位；
	singleSelect：选择行数时是否只能单行选择-->
	<table id="dg" title="印刷商信息" class="easyui-datagrid" pagination="true"
		url="" toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- field ： 必须与返回json数据的字段(key)完全一致  ：json：total->总记录数 ;rows:数据-->
				<th field="printerName" width="50px">印刷厂名</th>
				<th field="printId" width="50px">印刷编号</th>
				<th field="printSize" width="50px">印刷开本</th>
				<th field="printDate" width="50px">印刷时间</th>
				<th field="printQuantity" width="50px">印刷数量</th>
				<th field="printBatch" width="60px">印刷批次</th>
			</tr>
		</thead>
	</table>

	<div id="toolbar">
		<!-- searcher：点击查询标识的时候要执行的方法 -->
		<input id="ss" class="easyui-searchbox" style="width: 300px" data-options="searcher:doSearch,prompt:'Please Input Value',menu:'#searchMenu'"></input>
		&nbsp;&nbsp;
		查看印刷商<input id="printer" name="dept" value="" style="width:120px"/> &nbsp;&nbsp;
		<br/>		
		<!-- 按键 -->
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="addPrint()">添加印刷厂</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="editPrint()">修改印刷厂</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removePrint()">删除印刷厂</a>
	</div>
	
	<div id="searchMenu" style="width: 120px">
		<div data-options="name:'printerId',iconCls:'icon-ok'">编号</div>
		<div data-options="name:'printerName',iconCls:'icon-ok'">公司名</div>
	</div>

	<!-- 显示印刷信息的弹出框 -->
	<div id="dlg" class="easyui-dialog" style="width: 400px; height: 280px; padding: 10px 20px" closed="true" buttons="#dlg-buttons">
		<div class="ftitle">印刷厂信息</div>
		<!-- 添加时需要输入的信息 -->
		<form id="fm" method="post">
			<div class="fitem">
				<label>印刷厂名:</label> 
				<input name="printerName" class="easyui-validatebox" placeholder="厂名" data-options="required:true,validType:'onlyChinese[1,50]'">
			</div>
			<div class="fitem">
				 <label>印刷编号:</label>
				<input name="printId" class="easyui-validatebox" placeholder="编号" data-options="required:true,validType:'number'">
			</div>
			<div class="fitem">
				<label>印刷开本:</label>
				<input name="printSize" class="easyui-validatebox" placeholder="开本/大小" data-options="required:true,validType:'number'">
			</div>
			<div class="fitem">
				<label>印刷日期:</label> 
				<input name="printDate" class="easyui-datebox" data-options="required:true">
			</div>
			<div class="fitem">
				<label>印刷数量:</label>
				<input name="printQuantity" class="easyui-validatebox" ata-options="required:true,validType:'number'">
			</div>
			<div class="fitem">
				<label>印刷批次:</label> 
				<input name="printBatch" class="easyui-validatebox" data-options="required:true,validType:'number'">
			</div>
		</form>
	</div>

	<div id="dlg-buttons">
		<!-- Save 保存 -->
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="savePrint()">Save</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
</body>

</html>