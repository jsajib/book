package com.jubydull.parser.manager;

import java.io.File;

import com.jubydull.FileExeption.NoFileException;
import com.jubydull.bean.BookInformation;
import com.jubydull.bookinformation.util.Util;
import com.jubydull.formatenum.FormatEnum;
import com.jubydull.parser.Parser;
import com.jubydull.parser.context.ParserContext;
import com.jubydull.viewer.context.ViewerContext;
import com.jubydull.viewer.impl.JsonViewer;
import com.jubydull.viewer.manager.ViewerManager;

public class ParsingManager {

	private static final String FILE_PATH_PREFIX = "com/jubydull/resource/";

	public BookInformation parse(ParserContext context, File file) {

		Parser parser = context.getParser();
		return parser.parse(file);

	}

	public void process(String fileName) {
		ParsingManager parsingManager = new ParsingManager();

		if (fileName != null && fileName.length() > 0) {
			String fullFileName = FILE_PATH_PREFIX + fileName;
			String[] fileType = fileName.split("\\.");
			File file = parsingManager.getFilePath(fullFileName);
			if (file != null) {

				Parser chooseParser = Util.chooseFileParser(fileType[1]);

				if (chooseParser != null) {

					ParserContext parserContext = new ParserContext();
					parserContext.setParser(chooseParser);

					BookInformation bookInformation = parsingManager.parse(parserContext, file);

					File propertiesFile = parsingManager.getFilePath(FILE_PATH_PREFIX
							+ "book-info-converter.properties");

					ViewerContext viewerContext = new ViewerContext();
					if (Util.chooseViewForFile(propertiesFile).equals(FormatEnum.json.toString())) {
						viewerContext.setViewer(new JsonViewer());
					}

					ViewerManager manager = new ViewerManager();
					manager.parse(viewerContext, bookInformation);
				}
			}

		}
	}

	public File getFilePath(String fileName) {

		ClassLoader classLoader = getClass().getClassLoader();
		File file = null;
		try {
			file = new File(classLoader.getResource(fileName).getFile());
		} catch (Exception e) {
			try {
				throw new NoFileException(e.getLocalizedMessage());
			} catch (NoFileException e1) {
				e1.printStackTrace();
			}
		}
		return file;

	}
}
