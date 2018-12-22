package com.bs.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bs.admin.pojo.Author;
import com.bs.admin.pojo.Book;
import com.bs.admin.pojo.CategoryOrStatus;
import com.bs.admin.pojo.BookModel;
import com.bs.admin.pojo.Message;
import com.bs.admin.pojo.PageData;

@Service
public interface BookService {

	/**
	 * 
	 * <p>Title: getBookByBookInfo</p>  
	 * <p>Description: 获取书的信息</p>  
	 * @param topPrice
	 * @param bottomPrice
	 * @param bookCategory
	 * @param publishName
	 * @param bookStatus
	 * @param value
	 * @param pageNumber
	 * @param pageSize
	 * @param authorName
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<BookModel> getBookByBookInfo(Double topPrice, Double bottomPrice, String bookCategory, String publishName,
			String bookStatus, String value, Integer pageNumber, Integer pageSize, String authorName);
	/*List<Book> getBookByBookInfo(Double topPrice, Double bottomPrice, String bookCategory, String publishName,
			String bookStatus, String value, Integer pageNumber, Integer pageSize);*/

	/*PageData<Book> getBookData(Double topPrice, Double bottomPrice, String bookCategory, String publishName,
			String bookStatus, String value, Integer pageNumber, Integer pageSize);*/
	PageData<BookModel> getBookData(Double topPrice, Double bottomPrice, String bookCategory, String publishName,
			String bookStatus, String value, Integer pageNumber, Integer pageSize,String authorName);

	/**
	 * 
	 * <p>Title: addBook</p>  
	 * <p>Description: 添加书</p>  
	 * @param book
	 * @param author
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer addBook(Book book, Author author);

	/**
	 * 
	 * <p>Title: updateBook</p>  
	 * <p>Description: 修改书</p>  
	 * @param book
	 * @param author
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer updateBook(Book book, Author author);

	/**
	 * 
	 * <p>Title: getMessageByBookId</p>  
	 * <p>Description: 查询留言</p>  
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<Message> getMessageByBookId(Integer bookId);

	/**
	 * 
	 * <p>Title: getBookName</p>  
	 * <p>Description: 获取全部书名</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<String> getBookName();

	/**
	 * 
	 * <p>Title: getBookByBookId</p>  
	 * <p>Description: 通过书id获取书的信息</p>  
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Book getBookByBookId(Integer bookId);

	/**
	 * 
	 * <p>Title: getBookCategory</p>  
	 * <p>Description: 获取书的类型</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<CategoryOrStatus> getBookCategory();
	
	/**
	 * 
	 * <p>Title: getPublishName</p>  
	 * <p>Description: 获取全部印刷商</p>  
	 * @return  
	 * <p> @date 2018年12月14日  </p>
	 */
	List<CategoryOrStatus> getPublishName();
	
	/**
	 * 
	 * <p>Title: getBookCategory</p>  
	 * <p>Description: 获取书的状态</p>  
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	List<CategoryOrStatus> getBookStataus();
	
	/**
	 * 
	 * <p>Title: deleteBook</p>  
	 * <p>Description: 删除书</p>  
	 * @param bookId
	 * @return  
	 * <p> @date 2018年12月10日  </p>
	 */
	Integer deleteBook(Integer bookId);

}
