package com.jubydull.viewer.impl;

import org.json.simple.JSONValue;

import com.jubydull.bean.BookInformation;
import com.jubydull.forjson.impl.Book;
import com.jubydull.viewer.Viewer;

public class JsonViewer implements Viewer {

	public void view(Object object) {
		
		BookInformation bookInformation = (BookInformation)object;
		Book jsonDomainObject = new Book();
		jsonDomainObject.setName(bookInformation.getName());
		jsonDomainObject.setAuthors(bookInformation.getAuthors());
		jsonDomainObject.setPublishedDate(bookInformation.getPublisheddate());
		
		String jsonViewStr = JSONValue.toJSONString(jsonDomainObject.toJSON());
		System.out.println(jsonViewStr);

	}

}
