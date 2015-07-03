package com.jubydull.parser;

import java.io.File;

import com.jubydull.bean.BookInformation;

public interface Parser {
	BookInformation parse(File file);
}
