package com.jubydull.bean;

import java.util.Arrays;

import org.codehaus.jackson.annotate.JsonProperty;

public class BookInformation {

	private String name;
	private String[] authors;

	@JsonProperty("published­date")
	private String publisheddate;

	public BookInformation() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String[] getAuthors() {
		return authors;
	}

	public void setAuthors(String[] authors) {
		this.authors = authors;
	}

	public String getPublisheddate() {
		return publisheddate;
	}

	public void setPublisheddate(String publisheddate) {
		this.publisheddate = publisheddate;
	}

	@Override
	public String toString() {
		return "BookInformation [name=" + name + ", authors="
				+ Arrays.toString(authors) + ", publisheddate=" + publisheddate
				+ "]";
	}

}
