<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui-1.4.5/themes/bootstrap/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui-1.4.5/themes/icon.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui-1.4.5/demo/demo.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/css/loadwait.css">
<script type="text/javascript" src="<%=path%>/js/jquery-2.2.1.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.datagrid.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.dialog.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.form.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.messager.js"></script>
<script type="text/javascript"
	src="<%=path%>/js/emp/userAction.js?v=<%=Math.random()%>"></script>
<script type="text/javascript" src="<%=path%>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path%>/js/loadwait.js"></script>
<script type="text/javascript" src="/bookstore/js/validateDemo.js"></script>
<title>员工页面</title>
<style type="text/css">
body {
	background-size: cover;
	background-repeat: no-repeat;
}

table {
	opacity: 0.7;
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

.easyui-numberbox {
	width: 75px;
}
</style>

<script type="text/javascript"> 
//全局变量
	let $date1 = '';
	let $date2 = '';
	let $empStatus  = '';
	let $name  = '';
	let $value = '';
	let $job = '';
	let $hireDate = '';
	// 查询时调用的方法
	function doSearch(value,name){ 
		$name  		  = name;
		$value 		  = value;
		
		// 每次查询返回到第一页
		setFirstPage("#dg");
		
		$.ajax({			
			url:'<%=basePath%>employee/page/1/10',
			dataType:'json',
			type:'post',
			async:false,
			data:{
				name		:$name,
				value		:$value,
				date1		:$date1,
				date2		:$date2,
				empStatus	:$empStatus
			},
			success:function(data){
				// 处理用户状态，将数值转为字符串
				changeStatus(data.value.rows);
				$("#dg").datagrid('loadData',data.value);
			},
			error:function(msg){
				$.messager.alert('失败','输入是否规范呢？')
				console.log(msg);
			},
			beforeSend:function(){
	            /*请求发送前向body中添加进度等待蒙版，样式同上*/
	            $("body").append("<div class='loading'><div class='bigpic'></div></div>");
	        },
			complete:function(xhr){
	            /*数据加载完成后，将蒙版移除*/
	            $(".loading").fadeOut();
	        }
		});
	}
	
	// 处理员工的状态
	function changeStatus(rows){
		$.each(rows,function(i, item){
			item.primaryId=item.empId;
			switch(item["empStatus"])
			{
				case 1:
					item["empStatus"] = "在职";
			  		break;
				case 2:
					item["empStatus"] = "休假";
			  		break;
				case 3:
					item["empStatus"] = "离职";
			  		break;
				default:
					break;
			}
		})
	}
	
	
	$(function(){
		// 刚进入页面时展示所有员工
		doSearch("","empName");
		
		var pager = $('#dg').datagrid('getPager');	// get the pager of datagrid
		pager.pagination({
			pageSize:10,
			pageNumber:1,
			showPageList:true,
			onSelectPage:function(pageNumber, pageSize){
				
				/* $(this).pagination('loading'); */
				/* alert('pageNumber:'+pageNumber+',pageSize:'+pageSize); */
				//alert("change page")
				$.ajax({
					url:'<%=basePath%>employee/page/'+pageNumber+'/'+pageSize,
					dataType:'json',
					type:'post',
					async:false,
					data:{
						
						name		:$name,
						value		:$value,
						date1		:$date1,
						date2		:$date2,
						empStatus	:$empStatus,
					}, 
					success:function(data){
						// 处理用户状态，将数值转为字符串
						changeStatus(data.value.rows);
						$("#dg").datagrid('loadData',data.value);
					}
				});
				
			}
			
		});
	});
	
	$(function(){
		// 查询条件中date1
		$('#date1').datebox({
		    onSelect: function(date){
		        $date1 = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
		    }
		});
		// 查询条件中date2
		$('#date2').datebox({
		    onSelect: function(date){
		        $date2 = date.getFullYear()+"-"+(date.getMonth()+1)+"-"+date.getDate();
		    }
		});
		
		// 查询条件中选中的员工状态
		$('#cc').combobox({
			onSelect: function(record){
				$empStatus = record.text;
			}
		});
		
		// 从数据库获取职位名，填充下拉菜单
		$('#ccjob').combobox({   
						
		    url:'<%=basePath%>job/allJobName',
			valueField : 'id',
			textField : 'text',
			onSelect : function(record) {
				$jobName = record.text;
			}
		});

		/* // 新增员工时选中的员工状态
		$('#ccstatus').combobox({
			onSelect: function(record){
				$empStatus = record.text;
			}
		});
		 */

		//新增员工时选中的入职日期
		$('#cchireDate').datebox(
				{
					onSelect : function(date) {
						$hireDate = date.getFullYear() + "-"
								+ (date.getMonth() + 1) + "-" + date.getDate();
					}
				});
		// 清空查询条件
		$(function() {
			$('#btnClear').bind('click', function() {
				$date1 = '';
				$date2 = '';
				$empStatus = '';
				$name = '';
				$value = '';
				$job = '';
				$hireDate = '';
				$('input').val('')
			});
		});

	})

	
</script>




</head>
<body>
	<!-- pagination : 是否可以分页  url：对应一个handler来获取数据 toolbar：使用一个div与之对应 ；
	rownumbers：在数据展示的时候是否显示行数；fitColumns：数据显示时是否根据内容调整每一列的占位；singleSelect：选择行数时是否只能单行选择-->
	<table id="dg" title="用户信息" class="easyui-datagrid"
		style="width: 100%; height: 100%" pagination="true" toolbar="#toolbar"
		rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- field ： 必须与返回json数据的字段(key)完全一致  ：json：total->总记录数 ;rows:数据-->
				<th field="primaryId" width="50">员工编号</th>
				<th field="empName" width="50">姓名</th>
				<th field="empDept" width="50">部门</th>
				<th field="empHireDate" width="50">入职日期</th>
				<th field="empQuitDate" width="50">离职日期</th>
				<th field="empStatus" width="50">状态</th>
				<!-- <th field="job" width="50">职位</th> -->


			</tr>
		</thead>
	</table>

	<div id="toolbar">
		<!-- searcher：点击查询标识的时候要执行的方法 -->
		<input id="ss" class="easyui-searchbox" style="width: 300px"
			data-options="searcher:doSearch,prompt:'请输入查询关键字',menu:'#searchMenu'"></input>

		入职时间：<input id="date1" type="text" class="easyui-datebox"
			required="required"> ~<input id="date2" type="text"
			class="easyui-datebox" required="required"> 状态： <select
			id="cc" name="empStatus" value="">
			<option selected="selected" value="1">在职</option>
			<option value="2">离职</option>
			<option value="3">休假</option>
		</select> <a id="btnClear" href="#" class="easyui-linkbutton"
			data-options="iconCls:'icon-clear'">清空查询条件</a> <br> <a href="#"
			class="easyui-linkbutton" iconCls="icon-add" plain="true"
			onclick="news('/bookstore/employee/add')">添加员工</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-edit" plain="true"
			onclick="edits('/bookstore/employee/update')">修改员工</a> <a href="#"
			class="easyui-linkbutton" iconCls="icon-remove" plain="true"
			onclick="removes('/bookstore/employee/remove')">彻底删除员工</a>


	</div>
	<div id="searchMenu" style="width: 120px">
		<div data-options="name:'empName',iconCls:'icon-ok'">姓名</div>
		<div data-options="name:'empId'">编号</div>
		<div data-options="name:'empDept'">部门</div>
	</div>

	<div id="dlg" class="easyui-dialog"
		style="width: 400px; height: 280px; padding: 10px 20px" closed="true"
		buttons="#dlg-buttons">
		<div class="ftitle">员工信息</div>
		<form id="fm" method="post">
			<div class="fitem">
				<label>id:</label> <input name="primaryId" type="text"
					class="easyui-numberbox" readonly="readonly" />
			</div>

			<div class="fitem">
				<label>姓名:</label> <input name="empName" class="easyui-validatebox"
					data-options="required:true">
			</div>
			<div class="fitem">
				<label>部门:</label> <input name="empDept" class="easyui-validatebox"
					data-options="required:true">
			</div>

			<div class="fitem">
				<label>入职日期:</label>
				<!-- <input  id="cchireDate" type= "text" class= "easyui-datebox" style="display:none;"> -->
				<input id="cchireDate" name="empHireDate" type="text"
					class="easyui-datebox" required="required">
			</div>
			<div class="fitem">
				<label>员工状态:</label> <select id="ccstate" class="easyui-combobox"
					name="empStatus" style="width: 70px;" data-options="required:true">
					<option>在职</option>
					<option>休假</option>
					<option>离职</option>
				</select>
			</div>
			<div class="fitem">
				<label>职位:</label> <input id="ccjob" name="jobName" value="aa"
					style="width: 170px" data-options="required:true">
			</div>

			<div class="fitem">
				<label>银行账户:</label> <input name="bankAccount"
					class="easyui-validatebox" data-options="required:true">
			</div>

		</form>
	</div>

	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok"
			onclick="saves()">Save</a> <a href="#" class="easyui-linkbutton"
			iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">Cancel</a>
	</div>
</body>

</html>