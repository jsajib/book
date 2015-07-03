package com.jubydull.parser.context;

import java.io.File;

import com.jubydull.bean.BookInformation;
import com.jubydull.parser.Parser;

public class ParserContext {

	private Parser parser;

	public void setParser(Parser parser) {
		this.parser = parser;
	}

	public Parser getParser() {
		return parser;
	}

	public BookInformation executeParser(File file) {
		return parser.parse(file);
	}

}
