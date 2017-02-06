package com.projectUser.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Article {

	private String title;
	private String body;
	private String field_news_image;
	
	
	public Article() {
		super();
	}
	public Article(String title, String body, String field_news_image) {
		super();
		this.title = title;
		this.body = body;
		this.field_news_image=field_news_image;
	 }
	public String getField_news_image() {
		return field_news_image;
	}
	public void setField_news_image(String field_news_image) {
		this.field_news_image = field_news_image;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
 
	
	
}
