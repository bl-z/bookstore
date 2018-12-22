<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
<script type="text/javascript" src="<%=path %>/js/emp/userAction.js"></script>
<script type="text/javascript" src="<%=path %>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path %>/js/validateDemo.js"></script>
<title>后台账户页面</title>
<style type="text/css">
body{
	background-size: cover;
	background-repeat:no-repeat;
}

table{
	opacity : 0.7;
}
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
//全局变量
	let $pay1  = '';
	let $pay2  = '';
	let $name  = '';
	let $value = '';
	function doSearch(value,name){ 
		$name  		  = name;
		$value 		  = value;
		$pay1 		  =$('#pay1').numberspinner('getValue');
		$pay2 		  =$('#pay2').numberspinner('getValue');
		// 每次查询返回到第一页
		setFirstPage("#dg");
		
		$.ajax({			
			url:'<%=basePath%>job/page/1/10',
			dataType:'json',
			async:false,
			data:{
				name		:$name,
				value		:$value,
				pay1		:$pay1,
				pay2		:$pay2
			},
			success:function(data){
				changeId(data.value.rows);
				$("#dg").datagrid('loadData',data.value);
			},
			error:function(msg){
				$.messager.alert('失败','输入是否规范呢？')
				console.log(msg);
			}
		});
	}
	
	
	
	$(function(){	
		// 刚进入页面时展示所有职位
		doSearch("","jobName");
		
		var pager = $('#dg').datagrid('getPager');	// get the pager of datagrid
		pager.pagination({
			pageSize:10,
			pageNumber:1,
			showPageList:true,
			onSelectPage:function(pageNumber, pageSize){
				
				/* $(this).pagination('loading'); */
				/* alert('pageNumber:'+pageNumber+',pageSize:'+pageSize); */
				$.ajax({
					url:'<%=basePath%>job/page/'+pageNumber+'/'+pageSize,
					dataType:'json',
					async:false,
					data:{
						name		:$name,
						value		:$value,
						pageNum		:pageNumber,
						pageSize	:pageSize,
						pay1		:$pay1,
						pay2		:$pay2
					}, 
					success:function(data){
						changeId(data.value.rows);
						$("#dg").datagrid('loadData',data.value);
					}
				});
				
			}
			
		});
		
		
		// 清空查询条件
		$(function(){    
		    $('#btnClear').bind('click', function(){    
		    	$date1 = '';
		    	$date2 = '';
		    	$empStatus  = '';
		    	$name  = '';
		    	$value = '';
		    	$job = '';
		    	$hireDate = '';
		    	$('input').val('')
		    });    
		});  
	});
	function changeId(rows){
		$.each(rows,function(i, item){
			item.primaryId = item.jobId;
		})
	}
		
</script>

</head>
<body>
	<!-- pagination : 是否可以分页  url：对应一个handler来获取数据 toolbar：使用一个div与之对应 ；
	rownumbers：在数据展示的时候是否显示行数；fitColumns：数据显示时是否根据内容调整每一列的占位；singleSelect：选择行数时是否只能单行选择-->
	<table id="dg" title="职位信息" class="easyui-datagrid" style="width: 100%; height: 100%" pagination="true" 
		    toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- field ： 必须与返回json数据的字段(key)完全一致  ：json：total->总记录数 ;rows:数据-->
				<th field="primaryId" width="50">职位编号</th>
				<th field="jobName" width="50">职位名称</th>
				<th field="jobLevel" width="50">职位级别</th>
				<th field="jobAllowance" width="50">职位津贴</th>
				<th field="jobBasicPay" width="50">职位基本工资</th>
			</tr>
		</thead>
	</table>
	
	<div id="toolbar">
		<!-- searcher：点击查询标识的时候要执行的方法 -->
		<input id="ss" class="easyui-searchbox" style="width:300px" data-options="searcher:doSearch,prompt:'请输入查询关键字',menu:'#searchMenu'"></input> 
		基本工资：<input id="pay1" class="easyui-numberspinner" style="width:80px;" required="required" data-options="min:0,editable:true">
		~<input id="pay2" class="easyui-numberspinner" style="width:80px;" required="required" data-options="min:0,editable:true">
		<a id="btnClear" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'">清空查询条件</a> 
		<br>

		
		<a href="#" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="news('/bookstore/job/add')">添加职位</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-edit" plain="true" onclick="edits('/bookstore/job/update')">修改职位</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-remove" plain="true" onclick="removes('/bookstore/job/remove')">删除职位</a>
		
		
	</div>
	<div id="searchMenu" style="width:120px"> 
		<div data-options="name:'jobName',iconCls:'icon-ok'">职位名称</div>
		<div data-options="name:'jobId'">职位编号</div>
		<div data-options="name:'jobLevel'">职位级别</div>
	</div>
	
	<div id="dlg" class="easyui-dialog" style="width: 400px; height: 280px; padding: 10px 20px" closed="true" buttons="#dlg-buttons">
		<div class="ftitle">职位信息</div>
		<form id="fm" method="post" >
			<div class="fitem">
				<label>职位id:</label>
				<input name="primaryId" type="text" class="easyui-numberbox" readonly="readonly"/>
			</div>
		
			<div class="fitem">
				<label>职位名称:</label>
				<input name="jobName" class="easyui-textbox" data-options="required:true">
			</div>
			<div class="fitem">
				<label>职位级别:</label>
				<input name="jobLevel" class="easyui-numberbox" data-options="required:true" >
			</div>
			
			<div class="fitem">
				<label>职位津贴:</label>
				<input name="jobAllowance" class="easyui-numberbox" data-options="required:true" >
			</div>
			
			<div class="fitem">
				<label>职位基本薪资:</label>
				<input name="jobBasicPay" class="easyui-numberbox" data-options="required:true" >
			</div>
			
			
			
			
		</form>
	</div>
	
	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"onclick="saves()">Save</a>
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
</body>

</html>