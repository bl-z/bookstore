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
<script type="text/javascript" src="<%=path%>/js/purchase/purchaseValidate.js"></script>
<script type="text/javascript">


let $UniformResourceLocation='http://'+window.location.host+'/bookstore/';
var url = "";// 定义一个全局变量传给id为fm的form提交事件
let $currentPagePro  = '';
let $pageSizePro  = '';
var $rowPro='';
var $totalPay='';
let $purchaseId=getPurchaseId();
function getPurchaseId(){
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

function doProSearch(){ 
	$currentPagePro=1;
	$pageSizePro=10;
		$.ajax({			
			url:$UniformResourceLocation+'purchaseItem/getByPurchaseId',
			dataType:'json',
			async:false,
			data:{
				purchaseId:  90,
				currentPage	:$currentPagePro,
				pageSize:$pageSizePro,
			},
			success:function(data){
				$("#dgPro").datagrid('loadData',data.value);				
				console.log(data.value);
				//$totalPay=data.key;
			
			}
		});
	
	}


function doPriceSearch(){ 

	$.ajax({			
		url:$UniformResourceLocation+'purchase/getPurchasePay',
		dataType:'json',
		async:false,
		data:{
			purchaseId:  90,
		},
		success:function(data){
			console.log(data);
	
			
		}
	});
	
}







//窗口中加载row 数据 并且初始化第一页 数据
function purchaseProFun() {

		$('#purchasePro').dialog('open').dialog('setTitle','采购详单');
	     $("#titlePro").html(row.purchaseId +'号 采购单明细');
	     $("#idPro").html(row.purchaseId);
	     $("#batchPro").html(row.purchaseBatch);
	     $("#datePro").html(row.purchaseDate);
	     $("#empPro").html(row.employee);
	     $("#suppliePro").html(row.supplier.supplierName);
	     $("#statusPro").html(row.purchaseStatus);
	     $("#logPro").html(row.purchaseLog);
	   

     $("#totalPay").html($totalPay);
}

$(function(){
	
	$('#dataPII').datagrid({     
	    columns:[[    
			 {field:'purchaseId',title:'采购id',width:100},    
			 {field:'bookId',title:'采购内容',width:100},    
			 {field:'purchaseNum',title:'采购数量',width:50,align:'center'}  ,
			 {field:'purchasePrice',title:'采购价',width:50,align:'center'}
	    ]],
	    rownumbers:true
	   
	});  
	doProSearch();
	$('#dgPro').datagrid({ 
		 columns:[[    
		 {field:'purchaseItemId',hidden:true},    
		 {field:'purchaseId'},    
		 {field:'book',title:'采购内容',width:100,
			 
			 formatter: function(value,row,index){
					if (row.book){
						return row.book.bookName;
					} else {
						return '未知';
					}
				}
			 
		 
		 
		 },    
		 
		 {field:'purchaseNum',title:'采购数量',width:50,align:'center'}   ,
		 {field:'purchasePrice',title:'采购价￥',width:50,align:'center'}    ,
		 {field:'totalPrice',title:'合计￥',width:50,align:'right',
			 
			 formatter: function(value,row,index){
		
				 if(row.purchasePrice){
					 return row.purchasePrice*row.purchaseNum;
				 }
				}

		 
		 }   
		 ]] ,
		 pagination:true,
 		 pageList:[20,40,60],
 		 fitColumns:true,
 		 striped:true,
 		 toolbar:$("#toolBarPro"),
// 		 rownumbers:true
		 });
	
	
	var pagerPro = $('#dgPro').datagrid('getPager');	
	pagerPro.pagination({
		pageSize:20,
		pageNumber:1,
		showPageList:true,
		onSelectPage:function(pageNumber, pageSize){
			$.ajax({
				url:$UniformResourceLocation+'purchaseItem/getByPurchaseId',
				dataType:'json',
				async:false,
				data:{						
					purchaseId:  90,
					currentPage			:pageNumber,
					pageSize			:pageSize,
				}, 
				success:function(data){

					$("#dgPro").datagrid('loadData',data.value);
					console.log(data);
				}
			});		
		}	
	});
	
});



</script>

<title>采购管理</title>

</head>
<body>
     <span id='titlePro'></span>
    <span id='idPro'></span><span id='batchPro'></span><span id='datePro'></span><span id='empPro'></span>
    <span id='supplierPro'></span><span id='statusPro'></span><span id="totalPay"></span>
<p id='logPro'>
 
    
    <table id="dgPro" title="采购清单" class="easyui-datagrid">  </table>  
	<div id="toolBarPro">
	</div>


    
        

	
	
	
	
	
</body>

	
</html>