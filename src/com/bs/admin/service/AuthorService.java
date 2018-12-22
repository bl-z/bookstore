package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.Author;
import com.bs.admin.pojo.Book;

@Service
public interface AuthorService {

	/**
	 * 
	 * <p>Title: queryAuthor</p>  
	 * <p>Description: 查询作者</p>  
	 * @param author
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Author> queryAuthor(Author author);
	
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
	 * 
	 * <p>Title: addAuthor</p>  
	 * <p>Description: 添加作者</p>  
	 * @param auhtorId
	 * @param authorName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer addAuthor(Integer auhtorId,String authorName);
	
	/**
	 * 
	 * <p>Title: updateAuthor</p>  
	 * <p>Description:  修改作者</p>  
	 * @param author
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateAuthor(Author author);
	
	/**
	 * 
	 * <p>Title: createBookAuthor</p>  
	 * <p>Description: 添加中间表的关联信息</p>  
	 * @param book
	 * @param author
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer createBookAuthor(Book book, Author author);
	
	/**
	 * 
	 * <p>Title: updateBookAuthor</p>  
	 * <p>Description: 修改中间表的关联信息</p>  
	 * @param bookId
	 * @param authorId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateBookAuthor(Integer bookId, Integer authorId);
}
