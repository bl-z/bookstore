package com.bs.admin.provider;
import java.util.Map;

import org.apache.ibatis.jdbc.SQL;

import com.bs.admin.pojo.Book;

/**
* <p>Title: BookProvider</p>  
* <p>Description: 动态修改</p>  
* @author 胡杰  
* <p> @date 2018年11月23日</p>
 */
public class BookProvider {

	/**
	 * <p>Title: dynamicUpdateBook</p>  
	 * <p>Description: 动态修改</p>  
	 * @param param  
	 * @return  
	 * <p> @date 2018年11月23日  </p>
	 */
	public String dynamicUpdateBook(Map<String, Object> param){
		Book book = (Book)param.get("book");
		return new SQL(){
			{
				UPDATE("t_book");
				if (book.getBookId() != null) 				  SET("book_id=#{book.bookId}");
				if (book.getBookName() != null) 			  SET("book_name=#{book.bookName}");
				if (book.getBookStatus() != null) 			  SET("book_status=#{book.bookStatus}");  					   // 状态
				if (book.getBookCategory() != null) 	  SET("book_category=#{book.bookCategory}");  			   // 类型
				if (book.getBookCoverImage() != null) SET("book_cover_image=#{book.bookCoverImage}");  // 图片路径
				if (book.getBookProfile() != null)			  SET("book_profile=#{book.bookProfile}");  				   // 简介
				if (book.getBookSalesPrice() != null) 	  SET("book_sales_price=#{book.bookSalesPrice}");  	   // 售价
				if (book.getPublishName() != null) 		  SET("publish_name=#{book.publishName}");
				// 条件
				if (book.getBookId() != null) 				  WHERE("book_id=#{book.bookId}");
			}
		}.toString();
	}
	
	  /**
	   * 
	   * <p>Title: addBook</p>  
	   * <p>Description: 添加书</p>  
	   * @param param
	   * @return  
	   * <p> @date 2018年11月26日  </p>
	   */
	public String addBook(Map<String, Object> param){
		Book book = (Book) param.get("book");
		return new SQL(){
			{
				INSERT_INTO("t_book");
				if(null != book.getBookId()) 			    		VALUES("book_id", "#{book.bookId}");
				if(null != book.getBookName())  	    		VALUES("book_name", "#{book.bookName}");
				if(null != book.getBookStatus())    			VALUES("book_status", "#{book.bookStatus}");
				if(null != book.getBookCategory())			VALUES("book_Category", "#{book.bookCategory}");
				if(null != book.getPrintId()) 						VALUES("print_id", "#{book.printId}");
				if(null != book.getPublishName())			VALUES("publish_name", "#{book.publishName}");
				if(null != book.getBookProfile()) 				VALUES("book_Profile", "#{book.bookProfile}");
				if(null != book.getBookSalesPrice())		VALUES("book_sales_price", "#{book.bookSalesPrice}");
				if(null != book.getBookCoverImage())	VALUES("Book_cover_Image", "#{book.bookCoverImage}");
			}
		}.toString();
	}
	
	
	
	
	
	
}
