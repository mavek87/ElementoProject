package com.matteoveroni.elementoproject.client;

import com.google.gwt.core.client.EntryPoint;
import elemental2.dom.DomGlobal;

public class MainEntryPoint implements EntryPoint{

	@Override
	public void onModuleLoad() {
		WebPage webPage = WebPage.create();
		DomGlobal.document.body.appendChild(webPage.asElement());
	}
}
