package com.bs.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bs.admin.pojo.Author;

public interface AuthorMapper {

	/**
	 * <p>Title: getAuthorByAuthorId</p>  
	 * <p>Description: 根据作者的id查询该作者对应的所有书</p>  
	 * @param bookId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	List<Author> getAuthorByAuthorInfo(Author author);
	
	/**
	 * 
	 * <p>Title: getAllAuthor</p>  
	 * <p>Description: 获取全部作者</p>  
	 * @param authorId
	 * @param authorName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Author> getAllAuthor(@Param("authorId")Integer authorId, @Param("authorName")String authorName);
	
	/**
	 * 
	 * <p>Title: createAuthor</p>  
	 * <p>Description: 添加作者</p>  
	 * @param authorName
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer createAuthor(@Param("authorId")Integer authorId,@Param("authorName")String authorName); 
	
	/**
	 * 
	 * <p>Title: updateAuthor</p>  
	 * <p>Description: 修改作者</p>  
	 * @param authorName
	 * @return  
	 * <p> @date 2018年11月26日  </p>
	 */
	Integer updateAuthor(Author author);
	
	/**
	 * 
	 * <p>Title: createBookAuthor</p>  
	 * <p>Description: 给中间表添加对应的信息</p>  
	 * @param bookId
	 * @param authorId
	 * @return
	 * <p> @date 2018年11月27日  </p>
	 */
	Integer createBookAuthor(@Param("bookId")Integer bookId, @Param("authorId") Integer authorId);
	
	/**
	 * 
	 * <p>Title: updateBookAuthor</p>  
	 * <p>Description: 修改中间表的book_id值</p>  
	 * @param bookId
	 * @param authorId
	 * @return  
	 * <p> @date 2018年11月27日  </p>
	 */
	Integer updateBookAuthor(@Param("bookId")Integer bookId, @Param("authorId")Integer authorId);
	
}
