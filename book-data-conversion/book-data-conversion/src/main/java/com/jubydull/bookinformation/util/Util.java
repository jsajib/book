package com.jubydull.bookinformation.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import com.jubydull.formatenum.FormatEnum;
import com.jubydull.parser.Parser;
import com.jubydull.parser.impl.JsonParser;
import com.jubydull.parser.impl.TextParser;

public class Util {

	public static Parser chooseFileParser(String fileType) {

		if (fileType.equals(FormatEnum.json.toString())) {
			JsonParser jsonParser = new JsonParser();
			return jsonParser;
		} else if (fileType.equals(FormatEnum.txt.toString())) {
			TextParser textParser = new TextParser();
			return textParser;
		} else {
			return null;
		}
	}

	public static String chooseViewForFile(File file) {
		Properties properties = new Properties();
		InputStream input = null;
		String targetFormat = "";
		try {

			input = new FileInputStream(file);
			try {
				properties.load(input);
				targetFormat = properties.getProperty("targetFormat");
			} catch (IOException e) {

				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}

		return targetFormat;
	}
}
