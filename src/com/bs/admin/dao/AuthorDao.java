package com.bs.admin.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.bs.admin.pojo.Author;
import com.bs.admin.pojo.Book;

@Repository
public interface AuthorDao {

	/**
	 * <p>Title: retrieveAuthorByAuthorId</p>  
	 * <p>Description: 通过作者id查询该作者对应的书</p>  
	 * @param authorId
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	List<Author> retrieveAuthorByAuthorInfo(Author author);
	
	/**
	 * 
	 * <p>Title: getAllAuthor</p>  
	 * <p>Description: 获取全部作者</p>  
	 * @param authorId
	 * @param authorName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Author> getAllAuthor(Integer authorId, String authorName);
	
	/**
	 * <p>Title: createAuthor</p>  
	 * <p>Description: 添加作者</p>  
	 * @param author
	 * @return  
	 * <p> @date 2018年11月24日  </p>
	 */
	Integer createAuthor(Integer authorId,String authorName);
	
	/**
	 * 
	 * <p>Title: updateAuthor</p>  
	 * <p>Description: 修改作者</p>  
	 * @param authorId
	 * @param authorName
	 * @return  
	 * <p> @date 2018年11月26日  </p>
	 */
	Integer updateAuthor(Author author);
		
	/**
	 * 
	 * <p>Title: createBookAuthor</p>  
	 * <p>Description: </p>  
	 * @param book
	 * @param author
	 * @return  
	 * <p> @date 2018年11月27日  </p>
	 */
	Integer createBookAuthor(Book book, Author author);
	
	/**
	 * 
	 * <p>Title: updateBookAuthor</p>  
	 * <p>Description: 修改书和作者的中间表</p>  
	 * @param bookId
	 * @param authorId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateBookAuthor(Integer bookId, Integer authorId);
}
