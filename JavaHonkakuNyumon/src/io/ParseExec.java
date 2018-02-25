package io;

public class ParseExec {
	private static final String type = "JAXB";
	public static void main(String[] args) {
		String xmlFile = "C:\\yu-ga\\workspace\\java\\JavaHonkakuNyumon\\staff.xml";
		
		ParseInterface parse = null;
		switch(type) {
			case "DOM":
				parse = new DomParser();
				break;
			case "SAX":
				parse = new SaxParser();
				break;
			case "StAX_CourseAPI":
				parse = new StaxCursorParser();
				break;
			case "StAX_EventItratorAPI":
				parse = new StaxEventParser();
				break;
			case "XPath":
				parse = new XPathParser();
				break;
			case "JAXB":
				parse = new JaxbParser();
				break;
			default:
				parse = new DomParser();
		}
		
		parse.parse(xmlFile);
	}
}
