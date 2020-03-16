package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
	
	@Value("${book.author}")
	private String bookAuthor;
	@Value("${book.name}")
	private String bookName;
	
	@RequestMapping("/")
	public String getInfo() {
		return "book author is:"+this.bookAuthor + "<====>book name is:" + this.bookName;
	}

}
