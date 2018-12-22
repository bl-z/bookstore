// 全局变量
var url = "";								// form提交时的url路径
var $_index = "";						// 鼠标点击的行下标
var $row = "";							// 鼠标点击的行参数
var $form = {};							// 行参数赋值的变量
var $themeContent = "";			// 用户选择的推荐主题
var $text = "";							// 推荐书时填写的信息

$(function(){
	
	// onSelect：点击事件
	$("#dg").datagrid({onSelect:function(index, row){
			$_index = index;
			$row = row;
		}
	});
	
	$("#dg").datagrid({
			// 双击事件
			onDblClickRow : function(index, row){
			$('#dlg').window('open');  
			$row = row.bookId;
			
			if (row) {
				$('#dlg').dialog('open').dialog('setTitle', '编辑推荐信息');
				$('#fm').form('load', row);
				url = 'addRecommendWord';
			}
		}
	});
});

// 提交时执行
function submit(){
	$themeContent = $("#themeContent ").combobox('getValue');
	$text = $("#text").val();
	
	$.ajax({
		url : url,
		dataType : 'json',
		async : false,
		data : {
			text 						: $text,
			bookId 				: $row,
			themeContent 	: $themeContent,
		},
		success : function(data){
			if (data.state) {
				$('#dlg').dialog('close');  // 关闭对话框
			}
			
			$.messager.show({
				title : '提示信息！',
				msg : data.msg
			});
			
		},
		error : function (err) {
			$.messager.alert("错误信息", "内部错误：" + err.msg);
			console.log(err);
		}
	})
}

// 打开指定的对话框
function openThemeWin(){
	$("#theme").window("open");
}

// id为fm的form的提交事件，由用户信息编辑对话框的确定按钮点击触发
// 保存时执行
function saveTheme() {
	
	var themeName = $("#themeName").val();
	var reason = $("#reason").val();
	$themeContent = $("#themeContent ").combobox('getValue');
	var flag = $('#themeFm').form('validate');
	if (flag) {
		$.ajax({
			url : 'updateTheme',
			dataType : 'json',
			async : false,
			data : {
				themeContent	: $themeContent,
				themeName 		: themeName,
				reason 				: reason,
			},
			success : function(data){
				if (data.state) {
					$("#theme").window("close");
				}
				$.messager.show({
					title : '提示信息！',
					msg : data.msg
				})
			},
			error : function(err){
				$.messager.alert("错误信息", "内部错误：" + err.msg);
				console.log(err);
			}
		})
	} else {
		$.messager.alert('提示','请输入标题');
	}
	
}

// 显示或隐藏下拉框
$(function(){
	$("#themeContent").combobox({
		onChange : function(newVal, oldVal){
			$themeContent = $("#themeContent ").combobox('getValue');
			if ($themeContent == 1) {
				$('#a').hide();
				$('#author').next(".combo").hide();
				$('#c').hide();
				$('#category').next(".combo").hide();
			} else if ($themeContent == 2) {
				$('#a').show();
				$('#author').next(".combo").show();
				$('#c').hide();
				$('#category').next(".combo").hide();
			} else if ($themeContent == 3){
				$('#c').show();
				$('#category').next(".combo").show();
				$('#a').hide();
				$('#author').next(".combo").hide();
			}
		}
	})
});


