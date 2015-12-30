package com.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.mapper.BookMapper;
import com.app.model.Book;
import com.app.service.IBookService;

@Service
public class BookServiceImpl extends BaseServiceImpl<Book> implements IBookService {

	@Autowired
	private BookMapper bookMapper;

	@Override
	public Book getUser(int id) {
		return bookMapper.getUser(id);
	}
	
}
