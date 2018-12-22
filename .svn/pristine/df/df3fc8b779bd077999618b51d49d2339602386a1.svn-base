package com.bs.admin.pojo;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * 
* <p>Title: Author</p>  
* <p>Description: 作者的实体类</p>  
* @author 胡杰  
* <p> @date 2018年11月23日</p>
 */
public class Author implements Serializable {

	private static final long serialVersionUID = -2631951426846305889L;
	private Integer authorId;
	private String authorName;
	private Set<Book> books = new HashSet<Book>();
	
	public Author(){
		
	}
	public Author(Integer authorId, String authorName, Set<Book> books) {
		this.authorId = authorId;
		this.authorName = authorName;
		this.books = books;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", authorName=" + authorName + ", books：" + books +"]";
	}
	public Integer getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Integer authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public Set<Book> getBooks() {
		return books;
	}
	public void setBook(Set<Book> books) {
		this.books = books;
	}
	
}
