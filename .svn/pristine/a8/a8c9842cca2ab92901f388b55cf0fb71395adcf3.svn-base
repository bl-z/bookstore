<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
	System.out.print("basePath : " + basePath);
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
<link rel="stylesheet" href="<%=path%>/css/wsk.css">
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
<script>

$min=0;
$max=null;
$order='';



$(function(){

		$('#stockItemDg').datagrid(
				{
					title : '库存概览',
					columns : [ [
							{
								field : 'bookId',
								title : '编号',
								width : 30,
								align : 'center',
								formatter : function(value, row, index) {
									if (row.book) {
										return row.book.bookId;
									} else {
										return '未知';
									}
								}
							},
							{
								field : 'book',
								title : '项目名称',
								width : 100,
								align : 'center',
								formatter : function(value, row, index) {
									if (row.book) {
										return row.book.bookName;
									} else {
										return '未知';
									}
								}
							},
							{
								field : 'stockNum',
								title : '库存数量',
								width : 100,
								align : 'center'
							},
							{
								field : '213',
								title : '详情',
								width : 100,
								align : 'center',
								formatter : function(value, row, index) {
									if(row.book!=null){
									var bookId = row.book.bookId;
									}
									return '<a href="bookStockQuery?bookId='
											+ bookId
											+ ' target="_self"> 查看详情 </a>'
								}

							}

					] ],
					pagination : true,
					pageList : [ 5, 10, 20 ],
					fitColumns : true,
					striped : true,
					rownumbers : true,
					singleSelect : true,
					rowStyler : function(index, row) {

						if (row.stockNum < 100) {
							return 'background-color:rgba(255,0,0,0.1);';
						} else if (row.stockNum > 1000) {
							return 'background-color:rgba(0,255,0,0.1);';
						} else {
							return 'background-color:rgba(0,0,255,0.1);';
						}
					}
				});

		$('input[type=radio][name=StockRange]').change(function() {
			console.log(this.value);
				switch (this.value) {
				case '-1':
					$min=0;
					$max=100;
					break;
				case '0':
					$min = 101;
					$max = 1000;
					break;
				case '1':
					$min= 1001;
					$max = 2147483647;
					break;
				case '-2':
					$min= 0;
					$max = null;
					break;
				default:
					break;
				}
				doSearch();
			});
		$('input[type=radio][name=orderBy]').change(function() {
			$order=this.value;
			doSearch();
			});
		//打开网页立即dosearch()
		doSearch();

		var pager = $('#stockItemDg').datagrid('getPager');
		pager.pagination({
			pageSize : 10,
			pageNumber : 1,
			showPageList : true,
			onSelectPage : function(pageNumber, pageSize) {
				$.ajax({
					url : '<%=basePath%>stock/getVStock',
					dataType : 'json',
					async : false,
					data : {

						min : $min,
						max : $max,
						bookName : $("#bookName").val(),
						order : $order,
						currentPage : pageNumber,
						pageSize : pageSize
					},
					success : function(data) {
						$("#stockItemDg").datagrid('loadData', data.value);
						console.log(data);
					}
				});
			}
		});

	});
	
	
function doSearch(){ 
	console.log($order);
	$.ajax({			
		url:'<%=basePath%>stock/getVStock',
		dataType:'json',
		async:false,
		data:{
			min:$min,
			max:$max,
			bookName:$("#bookName").val(),
			order:$order,
			currentPage			:1,
			pageSize			:10
		},
		success:function(data){
			$("#stockItemDg").datagrid('loadData',data.value);				
			console.log(data);
		}
	});
	

}
</script>

<title>库存查询</title>

</head>
<body>





	<table id="stockItemDg" title="" class="easyui-datagrid"
		onClickRow="ClickRow" toolbar="#toolBar">
	</table>
	<div id="toolBar">
		<input id="bookName" class="easyui-searchbox" style="width: 100px"
			data-options="searcher:doSearch,prompt:'请输入书名关键字'"></input>
			
			 &emsp; &emsp;
			 库存数量:&emsp;
			 <input type="radio" name="StockRange" value="-2" checked><span
			style="background-color: rgba(128, 128, 128, 0.3)">所有</span> <input
			type="radio" name="StockRange" value="-1"><span
			style="background-color: rgba(255, 0, 0, 0.3)">紧张</span> <input
			type="radio" name="StockRange" value="0"><span
			style="background-color: rgba(0, 0, 255, 0.2)">正常</span> <input
			type="radio" name="StockRange" value="1"><span
			style="background-color: rgba(0, 255, 0, 0.2)">充足</span> &emsp; &emsp;
			<input type="radio" name="orderBy" value="desc" >从少到多 
			<input type="radio" name="orderBy" value="asc">从多到少 <br>

	</div>












</body>


</html>