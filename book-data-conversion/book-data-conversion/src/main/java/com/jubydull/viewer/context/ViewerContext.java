package com.jubydull.viewer.context;

import com.jubydull.bean.BookInformation;
import com.jubydull.viewer.Viewer;

public class ViewerContext {

	private Viewer viewer;

	public void setViewer(Viewer viewer) {
		this.viewer = viewer;
	}
	
	public Viewer getViewer() {
		return viewer;
	}

	public void executeView(BookInformation bookInformation) {
		viewer.view(bookInformation);
	}
}
