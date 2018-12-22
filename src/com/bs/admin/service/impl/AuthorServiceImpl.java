package com.bs.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bs.admin.dao.AuthorDao;
import com.bs.admin.pojo.Author;
import com.bs.admin.pojo.Book;
import com.bs.admin.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	private AuthorDao ad;

	@Override
	public List<Author> queryAuthor(Author author) {
		return ad.retrieveAuthorByAuthorInfo(author);
	}

	@Override
	public Integer addAuthor(Integer authorId,String authorName) {
		return ad.createAuthor(authorId,authorName);
	}

	@Override
	public Integer updateAuthor(Author author) {
		return ad.updateAuthor(author);
	}

	@Override
	public Integer createBookAuthor(Book book, Author author) {
		return ad.createBookAuthor(book, author);
	}

	@Override
	public Integer updateBookAuthor(Integer bookId, Integer authorId) {
		return ad.updateBookAuthor(bookId, authorId);
	}

	@Override
	public List<Author> getAllAuthor(Integer authorId, String authorName) {
		return ad.getAllAuthor(authorId, authorName);
	}

}
