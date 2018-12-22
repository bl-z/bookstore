package com.bs.admin.mapper;

import java.util.List;

import com.bs.admin.pojo.Message;

public interface MessageMapper {

	/**
	 * 
	 * <p>Title: getMessageByBookId</p>  
	 * <p>Description: 通过书id查询该书的留言</p>  
	 * @param bookId
	 * @return  
	 * <p> @date 2018年11月26日  </p>
	 */
	List<Message> getMessageByBookId(Integer bookId);
}
