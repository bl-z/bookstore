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


<title>库存详情</title>

</head>
<body>

	<script>
	let $bookId=getBookId();
	let $min=null;
	let $max=null;
	let $order=null;
	
function doSearch(){ 
	$.ajax({			
		url:'<%=basePath%>stock/getStockByBookId',
		dataType:'json',
		async:false,
		data:{
			bookId:$bookId,
			order: $order,
			min : $min,
			max : $max,
			currentPage			:1,
			pageSize			:10
		},
		success:function(data){
			$("#dg").datagrid('loadData',data.value);				
			console.log(data);
		}
	});
	

}


//辣鸡排序 真的难用！
/* $filtNum=$(".fitNum").val();

$('.fitNum').change(function() {
	  $filtNum=this.value;
	alert("input值"+$filtNum);
});  */
	

/*  $("#dg").datagrid('enableFilter', [{
field:'stockNum',
type:'combobox',
options:{
    panelHeight:'auto',
    data:[{value:'greaterorequal',text:'全部记录'},{value:'',text:'现有库存'},{value:'equal,text:'历史记录'}],
    onChange:function(value){
    	
    	 if (value == ''){
    		 $("#dg").datagrid('removeFilterRule', 'stockNum');
         } else {
        	 $("#dg").datagrid('addFilterRule', {
                 field: 'stockNum',
                 op: 'endwith',
                 value: 0
             });
         }
    	 $("#dg").datagrid('doFilter');
    	
    	


}
}}
]); */


//解析url 中的参数

function getBookId(){
	var result;
	var url=window.location.search; //获取url中"?"符后的字串  
	if(url.indexOf("?")!=-1){
	result = url.substr(url.indexOf("=")+1);
	}
	console.log(result);
	result=parseInt(result);
	console.log(result);
	return result;
	}


$(function(){	
	
	
	
	$('#dg').datagrid({   
		
		title:"bookName库存详情",
 		 columns:[[    
 		 {field:'stockId',hidden:true},     
 		 {field:'book',title:'项目名称',width:100,align:'center',
 			formatter: function(value,row,index){
				if (row.book){
					return row.book.bookName;
				} else {
					return '未知';
				}
			}
 		 }   ,
 		 {field:'stockNum',title:'库存数量',width:100,align:'center'}    ,
 		 {field:'purchaseItemId',title:'采购编号',width:100,align:'center',
 			formatter: function(value,row,index){
				if (row.purchaseItem){
					return row.purchaseItem.purchase.purchaseBatch+"-"+row.purchaseItem.purchaseItemId;
				} else {
					return '未知';
				}
			}}    ,
 		 {field:'storeHouse',title:'仓库',width:100,align:'center',

 			formatter: function(value,row,index){
				if (row.storeHouse){
					return row.storeHouse.storeHouseName;
				} else {
					return '未知';
				}
 		 }  
 		 },
 		 {field:'stockTime',title:'入库时间',width:100,align:'center'}  
 		 ]] ,
 		 pagination:true,
 		 pageList:[5,10,20],
 		 fitColumns:true,
 		 striped:true,
 		 rownumbers:true,
 		 singleSelect:true,
 		remoteFilter:true
 		 
 		 });   
	// 筛选按钮
	$('input[type=radio][name=fitNum]').change(function() {
		console.log(this.value);
			switch (this.value) {
			case 'all':
				$min=0;
				$max=null;
				break;
			case 'history':
				$min = null;
				$max = 0;
				break;
			case 'now':
				$min= 1;
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
	

	doSearch();
	

	var pager = $('#dg').datagrid('getPager');	
	pager.pagination({
		pageSize:10,
		pageNumber:1,
		showPageList:true,
		onSelectPage:function(pageNumber, pageSize){
			$.ajax({
				url:'<%=basePath%>stock/getStockByBookId',
						dataType : 'json',
						async : false,
						data : {
							bookId :$bookId,
							order: $order,
							min : $min,
							max : $max,
							currentPage : pageNumber,
							pageSize : pageSize,
						},
						success : function(data) {
							$("#dg").datagrid('loadData', data.value);
							console.log(data);
						}
					});
				}
			});
		});
	</script>
	<script src="<%=path%>/js/datagrid-filter.js"></script>

	<table id="dg" title="" class="easyui-datagrid" onClickRow="ClickRow"
		toolbar="#toolBar">
	</table>
	<div id="toolBar">
	
		
			<input type='radio'name='fitNum' value="all" >所有
			<input type='radio'name='fitNum' value='now'>目前库存 
			<input type='radio' name='fitNum' value='history'checked>历史记录 
			
			
			 &emsp; 
			<input type="radio" name="orderBy" value="desc" >从大到小 
			<input type="radio" name="orderBy" value="asc">从小到大
			
			
			库存量范围:<input id="max"style="width: 100px" /> &emsp; ~
			<input id="min" style="width: 100px" />
		&emsp; &emsp; <br>

	</div>













</body>


</html>