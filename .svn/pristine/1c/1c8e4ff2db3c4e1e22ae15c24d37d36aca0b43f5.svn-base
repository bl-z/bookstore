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
<script type="text/javascript" src="<%=path %>/js/activity/activityUserAction.js"></script>
<script type="text/javascript" src="<%=path %>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path %>/js/validateDemo.js"></script>
<title>创建活动</title>
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
#newActivity{
	text-align:center;
}
#dlg-buttons{
	text-align:center;
}
</style>
<script type="text/javascript">
let $bookName  = '';
let $bookCategory  = '';
let $bookStatus = '';
let $bottomPrice = "";
let $topPrice = "";
let $activityName = "";
let $activityDiscount = "";
let $activityStart = "";
let $activityEnd = "";
function doSearch(){
	setFirstPage("#dg1");
	$.ajax({			
		url:'<%=basePath %>activity/getAllBook/1/10',
		dataType:'json',
		async:false,
		data:{
			bookName		:$bookName,
			bookCategory	:$bookCategory,
			bookStatus		:$bookStatus,
			bottomPrice		:$bottomPrice,
			topPrice		:$topPrice,
		},
		success:function(data){
			$("#dg1").datagrid('loadData',data);
		},
	});
}
$(function(){
	doSearch();
	var pager = $('#dg1').datagrid('getPager');	
	pager.pagination({
		pageSize:10,
		pageNumber:1,
		showPageList:true,
		onSelectPage:function(pageNumber, pageSize){
			$.ajax({
				url:'<%= basePath%>activity/getAllBook/'+pageNumber+'/'+pageSize,
				dataType:'json',
				async:false,
				data:{						
					bookName		:$bookName,
					bookCategory	:$bookCategory,
					bookStatus		:$bookStatus,
					bottomPrice		:$bottomPrice,
					topPrice		:$topPrice,
				}, 
				success:function(data){
					$("#dg1").datagrid('loadData',data);		
				}
			});		
		}			
	});
});	
</script>
<script type="text/javascript">
function doSearchc(){
	setFirstPage("#dg2");
	$.ajax({			
		url:'<%=basePath %>activity/allActivity/1/10',
		dataType:'json',
		async:false,
		success:function(data){
			$("#dg2").datagrid('loadData',data);
		},
	});
} 		
$(function(){	
	doSearchc();
	var pager = $('#dg2').datagrid('getPager');	
	pager.pagination({
		pageSize:10,
		pageNumber:1,
		showPageList:true,
		onSelectPage:function(pageNumber, pageSize){
			$.ajax({
				url:'<%= basePath%>activity/allActivity/'+pageNumber+'/'+pageSize,
				dataType:'json',
				async:false,
				data:{						
					pageNumber			:pageNumber,
					pageSize			:pageSize
				}, 
				success:function(data){
					$("#dg2").datagrid('loadData',data);		
				}
			});		
		}			
	});
});	
</script>
<script type="text/javascript">
$(function(){
	// 获取活动名
	$('#activityName').combobox({
		url:'<%= basePath%>activity/allActivityName',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$activityName = record.text;
		}
	});
	// 活动开始日期
	$('#activityStart').datebox({
	    onSelect: function(date){
	        $activityStart = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	    }
	});	
	// 活动结束日期
	$('#activityEnd').datebox({
	    onSelect: function(date){
	        $activityEnd = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
	    }
	});	
	// 获取类型
	$('#bookCategory').combobox({
		url:'<%= basePath%>bookController/getCategpry',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$bookCategory = record.text;
		}
	});	
	// 获取书名
	$('#bookName').combobox({
		url:'<%= basePath%>activity/allBookName',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$boookName = record.text;
		}
	});
	// 获取状态
	$('#bookStatus').combobox({
		url:'<%= basePath%>bookController/getBookStatus',    
	    valueField:'text',    
	    textField:'text',
		onSelect: function(record){
			$bookStatus = record.text;
		}
	});
})
function doSearchButton() {
	doSearch();
}
// 清空
function clearButton() {
	$("input").val("");
	$activityName  = '';
	$activityDiscount = '';
	$activityStart = '';
	$activityEnd = '';
	$bookName  = '';
	$bookCategory  = '';
	$bookStatus = '';
	$bottomPrice = "";
	$topPrice = "";
}
// 勾选完书本,选择活动数据
function choose() {
	var rows1 = $('#dg1').datagrid('getSelections');
	if(rows1.length==0){
		$.messager.alert("提示", "请选择书籍！", "info");
		return;
   	}else{
   		$.messager.confirm('提示', '是否添加选中数据?', function (r) {
			if (!r) {
		    	cancel();
		        return;  
		    }
			$('#dlg').dialog('open').dialog('setTitle','选择活动数据');
		});
   	}
}
</script>
</head>
<body>						
<table id="dg1" title="书本信息" class="easyui-datagrid" style="width: 100%; height: 100%" pagination="true" toolbar="#toolbar1" rownumbers="true" fitColumns="true" singleSelect="false" >
	<thead>
		<tr>
			<th field="ck" data-options="checkbox:true" required ="required"></th>
			<th data-options="field:'bookId',width:10">编号</th>
		    <th data-options="field:'bookName',width:20">书名</th>
			<th data-options="field:'bookCategory',width:20">类型</th>
			<th data-options="field:'bookSalesPrice',width:20">售价</th>
			<th data-options="field:'bookStatus',width:20">状态</th>
		</tr>
	</thead>
</table>
<div id="toolbar1">
	<br>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"onclick="doSearchButton()" style="width: 60px">查询</a>
	类型<input id="bookCategory" class="easyui-combobox" name="bookCategory" style="width:80px"/>
	书名<input id="bookName" class="easyui-combobox" name="bookName" style="width:80px"/>
	状态<input id="bookStatus" class="easyui-combobox" name="bookStatus" style="width:80px"/>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'"onclick="clearButton()" style="width: 60px">清空</a>
	<a href="#" rel="external nofollow" class="easyui-linkbutton" iconCls="icon-ok" plain="true" onclick="choose()">选择活动数据</a>
</div>
<div id="searchMenu" style="width:120px">
	<div></div>
</div>
<div id="dlg" class="easyui-dialog" style="width: 60%; height: 450px; padding: 10px 20px" closed="true" buttons="#dlg-buttons">
	<table id="dg2" title="活动信息" class="easyui-datagrid" style="width: 100%; height: 100%" pagination="true" toolbar="#toolbar2" rownumbers="true" fitColumns="true" singleSelect="true"
	data-options="iconCls:'icon-edit',onDblClickCell:onDblClickCell, onEndEdit:onEndEdit">
		<thead>
			<tr>
				<th field="ck" data-options="checkbox:true"></th>
				<th data-options="field:'activityId',width:20">编号</th>
				<th data-options="field:'activityName',width:20,
		   			formatter:function(value,row){
						return row.activityName;
					},
					editor:{
						type:'combobox',
						options:{
							valueField:'text',
							textField:'text',
							url:'<%= basePath%>activity/allActivityName', 
							method:'post',
						    required:true
						}
					}">活动名字</th>
				<th data-options="field:'activityDiscount',width:20,editor:{type:'numberbox'},required:true">活动折扣</th>
				<th data-options="field:'activityStart',width:20,editor:{type:'datebox'},required:true">开始时间</th>
				<th data-options="field:'activityEnd',width:20,editor:{type:'datebox'},required:true">结束时间</th>
			</tr>
		</thead>
	</table>
	<div id="toolbar2">
	<br>
	<!-- <a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-search'"onclick="doSearchButton2()" style="width: 60px">查询</a>
	  书名<input class="ccbookName" class="easyui-combobox" name="bookName" style="width:100px"/>
	      活动名<input class="ccactivityName" class="easyui-combobox" name="activityName" style="width:100px"/>
	  开始时间<input id="activityStart"  type= "text" class= "easyui-datebox" style="width:100px"/>
	  结束时间<input id="activityEnd"  type= "text" class= "easyui-datebox" style="width:100px"/>
	<a href="#" class="easyui-linkbutton" data-options="iconCls:'icon-clear'"onclick="clearButton()" style="width: 60px">清空</a> -->
	<a href="#" rel="external nofollow" class="easyui-linkbutton" iconCls="icon-add" plain="true" onclick="append()">添加</a>
	<a href="#" rel="external nofollow" class="easyui-linkbutton" iconCls="icon-save" plain="true" onclick="save()">保存</a>
	<a href="#" rel="external nofollow" class="easyui-linkbutton" iconCls="icon-cancel" plain="true" onclick="cancel()">取消</a>
	</div>
</div>
<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"onclick="saveActivity()">Save</a>
		<a href="<%= basePath%>activity/pagination" class="easyui-linkbutton" iconCls="icon-cancel">Cancel</a>
</div>
</body>
<script type="text/javascript">
function save() {
	if (endEditing()) {
		var $dg = $('#dg2');
		var rows = $dg.datagrid('getChanges');
		console.log(JSON.stringify(rows));
		if (rows.length > 0) {
			var insert = $dg.datagrid('getChanges', "inserted");
			console.log(JSON.stringify(insert));
			for(var i =0;i<insert.length;i++){
				if(insert[i].activityName=="" || null==insert[i].activityName &&
				   insert[i].activityDiscount=="" || null==insert[i].activityDiscount &&
				   insert[i].activityStart=="" || null==insert[i].activityStart &&
				   insert[i].activityEnd=="" || null==insert[i].activityEnd){
					$.messager.alert("提示", "请先添加活动数据！", "info");
					cancel();
					return;
				}else{
					var activity = insert;
				}
			}
		}
		$.ajax({
			url:'<%=basePath%>activity/insertActivity',
			dataType:'json',
			type:'POST',
			async: true,
			contentType:'application/json',
			data:JSON.stringify(activity),
			success:function(result){
				if (result.state=true) {
					doSearchc();
					$('#dg').datagrid('reload');
	                $.messager.alert("提示", "恭喜您，活动添加成功！", "info");
	            } else {  
	                $.messager.alert("提示", "添加失败，请重新操作！", "info");
	                cancel();
	                return;  
	            }	
			},
		});	
	}
}
function saveActivity() {
	// 定义传输对象
	var datas = null;
	// 定义传输数组
	var arr = [];
	// 获取选中行的数据
	var books = $('#dg1').datagrid('getSelections');
	var activity = $('#dg2').datagrid('getSelections');
	console.log(JSON.stringify(activity));
	// 遍历添加
	for(var i =0;i<books.length;i++){
		datas = new Object();
		datas.bookId = books[i].bookId;
		datas.activityName = activity[0].activityName;
		datas.activityDiscount = activity[0].activityDiscount;
		datas.activityStart = activity[0].activityStart;
		datas.activityEnd = activity[0].activityEnd;
		arr.push(datas);
	}
	if(activity.length==0){
		$.messager.alert("提示", "请选择活动数据！", "info");
		return;
   	}else{
   	}
	$.messager.confirm('提示', '是否添加选中数据?', function (r) {
		if (!r) {
	    	// 取消删除后,清空数组
	    	arr = [];
	    	// 取消选中
	    	cancel();
	        return;  
	    }
		$.ajax({
			type : "post",
			url : '<%= basePath%>activity/addActivity',
			contentType :"application/json",
			data :JSON.stringify(arr), 
			dataType : "json",
			cache : false,
			async : false,
			timeout : 60000,
			success: function (result) {  
	            if (result.state=true) {
	            	// 清空数组
	                arr = [];
	                $.messager.alert("提示", "恭喜您，活动创建成功！", "info");
	                window.location.href ='<%= basePath%>activity/pagination';
	            } else {  
	                $.messager.alert("提示", "添加失败，请重新操作！", "info");
	                cancel();
	                return;  
	            }  
	        }           
		});
	});
}
</script>
</html>