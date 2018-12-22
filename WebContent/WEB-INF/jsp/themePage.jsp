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
<link rel="stylesheet" type="text/css" href="<%=path%>/css/bookPage.css">
<script type="text/javascript" src="<%=path%>/js/jquery-2.2.1.min.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/jquery.easyui.min.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.datagrid.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.dialog.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.form.js"></script>
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.5/plugins/jquery.messager.js"></script>
<script type="text/javascript" src="<%=path%>/js/themeAction.js"></script>
<script type="text/javascript" src="<%=path%>/js/setFirstPage.js"></script>
<script type="text/javascript" src="<%=path%>/js/myValidate.js"></script>
<script type="text/javascript" src="<%=path%>/js/validateDemo.js"></script>

<title>推荐商品</title>

<script type="text/javascript"> 

	let $value = "";
	let $authorName = "";
	let $category = "";
	
	function doSearch(value, name){ 
			
			setFirstPage("#dg");
			$value = value;
			if ("" != $value && $authorName != "") {
				$.messager.alert("温馨提示", "为了查询的准确性，通过作者或者状态查看书时请删除输入框的查询关键字。如需查询全部的书请点击“清空查询条件”按钮后再点查询");
			} else {
				$.ajax({
					url:'<%=basePath%>themeController/getThemeBook/1/10', 
					dataType : "json",
					async : false,
					data : {
						value 				: 	$value,
						authorName	:	$authorName,
						category			:	$category,
					},
					success: function(data){
						$("#dg").datagrid('loadData', data.value);
					}
				});
			}
			
	}
	
	// 分页的操作 
	$(function(){
		var pager = $('#dg').datagrid('getPager');	// get the pager of datagrid
		pager.pagination({
			showPageList:true,
			onSelectPage:function(pageNumber, pageSize){
			// $(this).pagination('loading'); 
			$.ajax({
				url:'<%=basePath%>themeController/getThemeBook/'+pageNumber+'/'+pageSize,
				dataType : 'json',
				async : false,  // 同步
				data : {
					value				: 	$value,
					authorName	:	$authorName,
					category			:	$category,
				},
				success : function(data){
					$("#dg").datagrid('loadData', data.value);
				}
		  });
		}
	});
});
	
	// 清空选中项
	$(function(){
		$("#queryClear").bind("click", function(){
			$value = "";
			$authorName = "";
			$category = "";
			$("input").val("");
		})
	}) 
	
	// 获取作者
	$(function() {
		$('#author').combogrid({
			panelWidth : 210,
			idField : 'authorId',
			textField : 'authorName',
			url : '/bookstore/bookController/getAuthor',
			columns : [ [ {
				field : 'authorId',
				title : '作者编号',
				width : 70
			}, {
				field : 'authorName',
				title : '作者姓名',
				width : 140
			}, ] ],
			onSelect : function(data, value) {
				$authorName = value.authorName;
			}
		});
	})
	
	//书的类型 
	$(function(){
		$("#category").combobox({
			onSelect: function(record){
				$category = record.text;
			}
		}) 
		$('#category').combobox({    
		    url: '<%=basePath %>bookController/getCategpry', 
		    valueField:'id',         
		    textField:'text'   
		});  
	});
	
	
	// 默认给它隐藏掉
	$(function(){
		$('#category').next(".combo").hide();
		$('#author').next(".combo").hide();
		$('#a').css("display", "none");
		$('#c').css("display", "none"); 
	})  

	 //格式化单元格提示信息  
    function formatCellTooltip(value){  
        return "<span title='双击推荐该书<" + value + ">'>" + value + "</span>";  
    }
	
</script>

</head>
<body>
	
	<!-- pagination : 是否可以分页  url：对应一个handler来获取数据    toolbar：使用一个div与之对应 ；
	rownumbers：在数据展示的时候是否显示行数；fitColumns：数据显示时是否根据内容调整每一列的占位；
	singleSelect：选择行数时是否只能单行选择-->
	<table id="dg" title="书的基本信息" class="easyui-datagrid" pagination="true"
		url="" toolbar="#toolbar" rownumbers="true" fitColumns="true" singleSelect="true">
		<thead>
			<tr>
				<!-- field ： 必须与返回json数据的字段(key)完全一致  ：json：total->总记录数 ;rows:数据 
				 formatter="formatCellTooltip" -->
				<th field="bookId" width="50" formatter="formatCellTooltip">书编号</th>
				<th field="bookName" width="50" formatter="formatCellTooltip">书名</th>
				<th field="authors" width="50" formatter="formatCellTooltip">作者</th>
				<th field="bookCategory" width="50" formatter="formatCellTooltip">类型</th>
				<th field="bookSalesPrice" width="50" formatter="formatCellTooltip">售价</th>
				<th field="bookProfile" width="60" formatter="formatCellTooltip">简介</th>
				<th field="stockSales" width="50" formatter="formatCellTooltip">月销量</th>
				<th field="publishName" width="50" formatter="formatCellTooltip">出版社</th>
				<th field="bookStatus" width="50" formatter="formatCellTooltip">状态</th>
			</tr>
		</thead>
	</table>
	
	<div id="toolbar">
		<br/>
		<!-- searcher：点击查询标识的时候要执行的方法 -->
		<input id="ss" class="easyui-searchbox" style="width: 200px" data-options="searcher:doSearch, prompt:'请输入关键字',menu:'#searchMenu'"></input>
		&nbsp;&nbsp;
		选择主题<select id="themeContent" name="" class="easyui-combobox" style="width: 100px;">
							<option value="1">必看书单</option>
							<option value="2">作者推荐</option>
							<option value="3">类型推荐</option>
						</select>  &nbsp;&nbsp;
		<span id="a">选择作者</span> <input id="author" name="author" />
		<span id="c">选择类型</span> <input id="category" name="category"/>
		&nbsp;&nbsp;

		<!-- 按键 -->
		<a class="easyui-linkbutton" data-options="iconCls:'icon-edit'" onclick="openThemeWin()">更新推荐主题</a>  &nbsp;
		<a id="queryClear" class="easyui-linkbutton" data-options="iconCls:'icon-remove'">清空查询条件</a>  &nbsp;
		<br/>
		<br/>
	</div>
	
	<div id="searchMenu" style="width: 120px">
		<div data-options="name:'bookId',iconCls:'icon-ok'">书号</div>
		<div data-options="name:'bookName',iconCls:'icon-ok'">书名</div>
	</div>


	<div id="theme" class="easyui-window" title="编辑主题" style="width:400px;height:300px"   
        data-options="iconCls:'icon-save', closed:true, modal:true" >   
        <div class="ftitle">主题信息</div>
		<form id="themeFm" method="post">
			<div class="fitem">
				<span id="bt">标题：</span>
				<input id="themeName" name="themeName" class="easyui-validatebox" data-options="required:true, missingMessage:'请输入标题', validType:'onlyChinese[1,500]'">
			</div>
			<br>
			<textarea id="reason" rows="5" cols="36" placeholder="说一个让人信服的理由"></textarea>
			
		</form>

		<div id="theme-buttons">
			<a class="easyui-linkbutton" iconCls="icon-ok" onclick="saveTheme()">保存</a> 
			<a class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#theme').dialog('close')">关闭</a>
		</div>
	</div>
	
	<div id="dlg" class="easyui-dialog" style="width: 390px; height: 480px; padding: 10px 20px" closed="true" 
	buttons="#dlg-buttons">
		
		<div class="ftitle">推荐信息</div>
		<textarea id="text" rows="5" cols="45" placeholder="请输入推荐该书的理由"></textarea>
			
		<div class="ftitle">书的信息  >>仅供查看</div>
		<!-- 添加时需要输入的信息 -->
		<form id="fm" method="post">
		
			<div class="fitem">
				 <label>书编号:</label>
				<input name="bookId" class="easyui-validatebox" readonly="readonly">
			</div>
			<div class="fitem">
				<label>书名:</label> 
				<input name="bookName" class="easyui-validatebox" readonly="readonly">
			</div>
			
			<div class="fitem" id="aName">
				<label>作者姓名:</label> 
				<input name="authors" class="easyui-validatebox" readonly="readonly">
			</div>
			
			<div class="fitem">
				<label>售价:</label> 
				<input name="bookSalesPrice" class="easyui-validatebox" readonly="readonly">
			</div>
			
			<div class="fitem">
				<label>类型:</label> 
				<select id="bookCategory" class="easyui-combobox" disabled="disabled" style="width: 75px;">
					<option value="名著">名著</option>
					<option value="烹饪">烹饪</option>
					<option value="科幻">科幻</option>
					<option value="少儿">少儿</option>
					<option value="喜剧">喜剧</option>
					<option value="电脑">电脑</option>
				</select> 
			</div>
			
			<div class="fitem">
				<label>状态:</label> 
				<select id="bookStatus" class="easyui-combobox" disabled="disabled" style="width: 75px;">
					<option value="在售">在售</option>
					<option value="下架">下架</option>
				</select> 
			</div>
			
			<div class="fitem">
				<label>简介:</label> 
				<input name="bookProfile" class="easyui-validatebox" readonly="readonly" >
			</div>
			
		</form>
	</div>

	<div id="dlg-buttons">
		<a href="#" class="easyui-linkbutton" iconCls="icon-ok" onclick="submit()">提交</a> 
		<a href="#" class="easyui-linkbutton" iconCls="icon-cancel" onclick="javascript:$('#dlg').dialog('close')">关闭</a>
	</div>
</body>

</html>