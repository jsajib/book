package com.jubydull.parser.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.google.gson.Gson;
import com.jubydull.bean.BookInformation;
import com.jubydull.parser.Parser;

public class JsonParser implements Parser {

	JSONParser parser = new JSONParser();

	public BookInformation parse(File file) {
		BookInformation bookInformation = null;
		try {

			JSONObject jsonBookInformation = null;

			try {

				jsonBookInformation = (JSONObject) parser
						.parse(new InputStreamReader(new FileInputStream(file)));
				String bookInformationStr = jsonBookInformation.get("book")
						.toString().replace("­", "");

				Gson gson = new Gson();
				bookInformation = gson.fromJson(bookInformationStr,
						BookInformation.class);

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (ParseException e1) {
			e1.printStackTrace();
		}

		return bookInformation;
	}
}
