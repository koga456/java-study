package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;

public class DomParser implements ParseInterface {
	public void parse(String xmlFile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {
			DocumentBuilder builder = DocumentBuilderFactory
					.newInstance().newDocumentBuilder();
			Node root = builder.parse(is);
			readRecursive(root);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private void readRecursive(Node node) {
		Node child = node.getFirstChild();
		while (child != null) {
			printNode(child);
			NamedNodeMap attributes = child.getAttributes();
			if (attributes != null) {
				for (int i = 0; i < attributes.getLength(); i++) {
					Node attribute = attributes.item(i);
					System.out.print("Attribute: ");
					printNode(attribute);
				}
			}
			readRecursive(child);
			child = child.getNextSibling();
		}
	}
	
	private void printNode(Node node) {
		System.out.println(node.getNodeName() + "=" + node.getNodeValue());
	}
}
