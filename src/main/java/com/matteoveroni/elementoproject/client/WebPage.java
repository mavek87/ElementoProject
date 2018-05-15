package com.matteoveroni.elementoproject.client;

import elemental2.dom.HTMLElement;
import org.jboss.gwt.elemento.core.IsElement;
//import static org.jboss.gwt.elemento.processor.context.DataElementInfo.Kind.HTMLElement;
import org.jboss.gwt.elemento.template.Templated;

@Templated("WebPage.html")
public abstract class WebPage implements IsElement<HTMLElement> {

	static WebPage create() {
		return new Templated_WebPage();
	}
}