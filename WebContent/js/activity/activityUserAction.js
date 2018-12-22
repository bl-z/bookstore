//启动行内编辑
var editIndex = -1;
function endEditing() {
	 if (editIndex == undefined){return true}
	 $('#dg2').datagrid('endEdit', editIndex);
	   editIndex = undefined;
	   return true;
}
//修改的方式是直接双击击单元格，所以table要加上onClickCell属性，然后重写onClickCell方法
function onDblClickCell(index, field){
	if (editIndex != index) {
		if (endEditing()) {
		     $('#dg2').datagrid('selectRow', index)
		     		.datagrid('beginEdit', index);
		     var ed = $('#dg2').datagrid('getEditor', { index: index, field: field });
		     if (ed) {
		    	 ($(ed.target).data('textbox') ? $(ed.target).textbox('textbox') : $(ed.target)).focus();
			 }
		     editIndex = index;
		} else {
			 setTimeout(function () {
			      $('#dg2').datagrid('selectRow', editIndex);
			 }, 0);
		}
	}
}
// 最后编辑
function onEndEdit(index, row){
	var ed = $(this).datagrid('getEditor', {
	    index: index,
	});
}
// 添加一行
function append(){
	if (endEditing()) {
		$('#dg2').datagrid('appendRow', {
			isValid : '启用',
			sort:$('#dg2').datagrid('getRows').length + 1,
		});
		editIndex = $('#dg2').datagrid('getRows').length - 1;
		$('#dg2').datagrid('selectRow', editIndex).datagrid('beginEdit',editIndex);
	}
}

// 取消 reject
function cancel(){
	$('#dg2').datagrid('rejectChanges');
	editIndex = undefined;
}
// 对数组排序
function sortNumber(a, b){
	return a - b;
}
