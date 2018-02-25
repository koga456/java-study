package library;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadJson {
	public static void main(String[] args) {
		File file = new File("employee.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			Employee2 employee = mapper.readValue(file, Employee2.class);
			System.out.println(employee.getName());
			System.out.println(employee.getAge());
			System.out.println(employee.getLicense().get(0));
			System.out.println(employee.getLicense().get(1));
		} catch (IOException e) {
			// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩ catch ÉuÉçÉbÉN
			e.printStackTrace();
		}
	}
}
