<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
    <%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
	%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui-1.4.5/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui-1.4.5/themes/icon.css">
<link rel="stylesheet" type="text/css" href="<%=path %>/jquery-easyui-1.4.5/demo/demo.css">
<script type="text/javascript" src="<%=path %>/js/jquery-2.2.1.min.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui-1.4.5/plugins/jquery.datagrid.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui-1.4.5/plugins/jquery.dialog.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui-1.4.5/plugins/jquery.form.js"></script>
<script type="text/javascript" src="<%=path %>/jquery-easyui-1.4.5/plugins/jquery.messager.js"></script>
<script type="text/javascript" src="<%=path %>/js/activity/userAction.js"></script>
<script type="text/javascript" src="<%=path %>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path %>/js/validateDemo.js"></script>
<title>财务管理</title>
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
.fitem label {
	display: inline-block;
	width: 80px;
}
.easyui-numberbox{
	width: 75px;
}
</style>
<script type="text/javascript">
let $financialStatus = '';
let $financialTypes  = '';
let $financialStart = '';
let $financialEnd = '';
function doSearch(){
	setFirstPage("#dg");
	$.ajax({			
		url:'<%=basePath %>financial/getPageData/1/10',
		dataType:'json',
		async:false,
		data:{
			financialStatus		:$financialStatus,
			financialTypes		:$financialTypes,
			financialStart		:$financialStart,
			financialEnd		:$financialEnd,
		},
		success:function(data){
			$("#dg").datagrid('loadData',data);
		},
	});
}
$(function(){	
	doSearch();
	var pager = $('#dg').datagrid('getPager');	
	pager.pagination({
		pageSize:10,
		pageNumber:1,
		showPageList:true,
		onSelectPage:function(pageNumber, pageSize){
			$.ajax({
				url:'<%= basePath%>financial/getPageData/'+pageNumber+'/'+pageSize,
				dataType:'json',
				async:false,
				data:{						
					financialStatus		:$financialStatus,
					financialTypes		:$financialTypes,
					financialStart		:$financialStart,
					financialEnd		:$financialEnd,
					pageNumber			:pageNumber,
					pageSize			:pageSize
				}, 
				success:function(data){
					$("#dg").datagrid('loadData',data);		
				}
			});		
		}			
	});
});	
</script>
<script type="text/javascript">
//清空输入框
function clearButton() {
	$("input").val("");
	$financialStatus  = '';
	$financialTypes  = '';
	$financialStart = '';
	$financialEnd = '';
}
$(function(){
	$('#financialStart').datebox({
	    onSelect: function(date){
	        $financialStart = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	    }
	});	
	$('#financialEnd').datebox({
	    onSelect: function(date){
	        $financialEnd = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	    }
	});
	$('#financialTypes').combobox({
		url:'<%= basePath%>financial/getTypes',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$financialTypes = record.text;
		}
	});	
	$('#financialStatus').combobox({
		url:'<%= basePath%>financial/getStatus',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$financialStatus = record.text;
		}
	});
})
function doSearchButton() {
	doSearch();
}
</script>
</head>
<body>
<table id="dg" title="财务信息" class="easyui-datagrid" style="width: 100%;" toolbar="#toolbar" pagination="true" rownumbers="true" fitColumns="true">
	<thead>
		<tr>
		    <th data-options="field:'financialStatus',width:30">收入/支出</th>
			<th data-options="field:'financialTypes',width:30">收支类型</th>
			<th data-options="field:'financialMoney',width:30">收支金额</th>
			<th data-options="field:'financialDate',width:30">收支时间</th>
			<th data-options="field:'transactionDate',width:30">交易时间</th>
			<th data-options="field:'financialDetails',width:30">收支详情</th>
		</tr>
	</thead>
</table>
<div id="toolbar">
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"onclick="doSearchButton()" style="width: 80px">查询</a>
	支出收入<input id="financialStatus" class="easyui-combobox" name="financialStatus" style="width:100px"/>
	收支类型<input id="financialTypes" class="easyui-combobox" name="financialTypes" style="width:100px"/>
	开始时间<input id="financialStart"  type= "text" class= "easyui-datebox" style="width:100px"/>
	结束时间<input id="financialEnd"  type= "text" class= "easyui-datebox" style="width:100px"/>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'"onclick="clearButton()" style="width: 60px">清空</a>
		<br>
	<!-- <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add'"onclick="addFinancial()" style="width: 60px">添加</a> -->
</div>
</body>
</html>