package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamReader;

public class StaxCursorParser implements ParseInterface {
	public void parse(String xmlFile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
			XMLInputFactory factory = XMLInputFactory.newInstance();
			XMLStreamReader reader = factory.createXMLStreamReader(is);
			
			while (reader.hasNext()) {
				reader.next();
				
				int eventType = reader.getEventType();
				
				if (eventType == XMLStreamConstants.START_ELEMENT) {
					System.out.println("Name: " + reader.getName());
					
					int count = reader.getAttributeCount();
					if (count != 0) {
						System.out.println("Attribute:");
						for (int i=0; i<count;i++) {
							System.out.println(" Name: " + reader.getAttributeName(i));
							System.out.println(" Value: " + reader.getAttributeValue(i));
						}
					}
				} else if (eventType == XMLStreamConstants.CHARACTERS) {
					String text = reader.getText().trim();
					if (!text.isEmpty()) {
						System.out.println("Text: " + text);
						System.out.println();
					}
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
