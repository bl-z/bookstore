
// 每次查询返回到第一页
function setFirstPage(ids) {
		var opts = $(ids).datagrid('options');
		var pager = $(ids).datagrid('getPager');
		opts.pageNumber = 1;
		opts.pageSize = opts.pageSize;
		pager.pagination('refresh', {
			pageNumber : 1,
			pageSize : opts.pageSize
		});
	}

