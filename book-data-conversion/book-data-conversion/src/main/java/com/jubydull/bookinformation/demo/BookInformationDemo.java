package com.jubydull.bookinformation.demo;

import com.jubydull.parser.manager.ParsingManager;

public class BookInformationDemo {

	public static void main(String[] args) {

		ParsingManager parsingManager = new ParsingManager();
		if (args != null && args.length > 0)
			parsingManager.process(args[0]);

	}

}
