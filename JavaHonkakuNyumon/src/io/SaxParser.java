package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

public class SaxParser implements ParseInterface {
	public void parse(String xmlFile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			SAXParser parser = factory.newSAXParser();
			SampleHandler handler = new SampleHandler();
			
			parser.parse(is, handler);
			parser = factory.newSAXParser();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
