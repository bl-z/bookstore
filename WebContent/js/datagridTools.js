
//全选按钮
function checkAll(checkbox,dg){
 
if ( checkbox.checked == true){
	$(dg).datagrid('selectAll');
}else{
	$(dg).datagrid('clearSelections');
}
 
}

function clearSelections( dg){
	
	$(dg).datagrid('clearSelections');
	
}



function showDetail(checkbox,dg,filed){
	 
	if ( checkbox.checked == true){
		$(dg).datagrid('showColumn', filed);  
	}else{
		 $(dg).datagrid('hideColumn', filed);
	}
	 
	}