package io;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class SampleHandler extends DefaultHandler {
	@Override
	public void startDocument() {
		System.out.println("Start Document");
	}
	
	@Override
	public void endDocument() {
		System.out.println("End Document");
	}
	
	@Override
	public void startElement(String namespaceURL, String localName,
			String qName, Attributes atts) {
		
		if (atts != null) {
			for (int i = 0; i < atts.getLength(); i++) {
				System.out.println("Attribute: " + atts.getQName(i)
						+ "=" + atts.getValue(i));
			}
		}
		System.out.println("Start Element: " + qName);
	}
	
	@Override
	public void endElement(String namespaceURL, String localName,
			String qName) {
		System.out.println("End Element: " + qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length) {
		String text = new String(ch, start, length);
		System.out.println("Text: " + text);
	}
}
