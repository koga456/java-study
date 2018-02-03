package file;
import java.io.*;

import javax.xml.parsers.*;

import org.w3c.dom.*;

public class ReadXmlTest {
	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream
					("C:\\yu-ga\\workspace\\java\\SukkiriJava\\src\\file\\rpgsave.xml");
			Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(is);
			Element hero = doc.getDocumentElement();
			Element weapon = findChildByTag(hero, "weapon");
			Element power = findChildByTag(weapon, "power");
			String value = power.getTextContent();
			System.out.println(value);
		} catch (Exception e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
	}
	static Element findChildByTag(Element self, String name) {
		
		NodeList children = self.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			if (children.item(i) instanceof Element) {
				Element e = (Element) children.item(i);
				if (e.getTagName().equals(name)) {
					return e;
				}
			}
		}
		return null;
	}
}
