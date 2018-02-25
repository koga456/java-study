package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

public class XPathParser implements ParseInterface {
	public void parse(String xmlFile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
			
			DocumentBuilder builder = DocumentBuilderFactory
					.newInstance().newDocumentBuilder();
			Document document = builder.parse(is);
			
			XPathFactory factory = XPathFactory.newInstance();
			XPath xpath = factory.newXPath();
			
			System.out.println("id=" + xpath.evaluate(
					"/staffs/staff/@id", document));
			
			System.out.println("firstname=" + xpath.evaluate(
					"/staffs/staff/name/firstname/text()", document));
			
			System.out.println("lastname=" + xpath.evaluate(
					"/staffs/staff/name[firstname='Takuya']/lastname/text()", document));
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
