package io;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXB;


public class JaxbParser implements ParseInterface {
	public void parse(String xmlFile) {
		try (InputStream is = Files.newInputStream(Paths.get(xmlFile))) {

			Staffs staffs = JAXB.unmarshal(is, Staffs.class);
			System.out.println(staffs);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
