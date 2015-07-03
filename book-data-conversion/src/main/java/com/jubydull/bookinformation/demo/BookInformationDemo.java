package com.jubydull.bookinformation.demo;

import com.jubydull.processor.Processor;

public class BookInformationDemo {

	public static void main(String[] args) {

		Processor parsingManager = new Processor();
		if (args != null && args.length > 0)
			parsingManager.process(args[0]);

	}

}
