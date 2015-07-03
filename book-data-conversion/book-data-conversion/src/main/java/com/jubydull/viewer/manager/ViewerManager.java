package com.jubydull.viewer.manager;

import com.jubydull.bean.BookInformation;
import com.jubydull.viewer.Viewer;
import com.jubydull.viewer.context.ViewerContext;

public class ViewerManager {

	public void parse(ViewerContext context, BookInformation bookInformation) {
		
		Viewer viewer = context.getViewer();
		viewer.view(bookInformation);
		
	}
}
