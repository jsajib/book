package com.jubydull.parser.impl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.jubydull.bean.BookInformation;
import com.jubydull.parser.Parser;

public class TextParser implements Parser {

	public BookInformation parse(File file) {
		BookInformation bookInformation = new BookInformation();

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			String line;
			try {
				while ((line = reader.readLine()) != null) {

					String lineSplit[] = line.split(":");
					if (lineSplit[0].equalsIgnoreCase("name")) {
						bookInformation.setName(lineSplit[1].trim());
					}
					if (lineSplit[0].equalsIgnoreCase("authors")) {
						String authorsArray[] = lineSplit[1].split(",");
						String authorArrayForJson[] = new String[authorsArray.length];
						int i = 0;
						for (String author : authorsArray) {
							authorArrayForJson[i] = author.trim();
							i++;
						}
						bookInformation.setAuthors(authorArrayForJson);
					}
					if (lineSplit[0].equalsIgnoreCase("published­date")) {
						bookInformation.setPublisheddate(lineSplit[1].trim());
					}
				}
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return bookInformation;
	}

}
