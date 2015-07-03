package com.jubydull.parser.manager;

import java.io.File;

import com.jubydull.bean.BookInformation;
import com.jubydull.parser.Parser;
import com.jubydull.parser.context.ParserContext;

public class ParsingManager {

	public BookInformation parse(ParserContext context, File file) {

		Parser parser = context.getParser();
		return parser.parse(file);

	}

}
