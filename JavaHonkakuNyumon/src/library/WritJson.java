package library;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WritJson {
	public static void main(String[] args) {
		Employee2 employee = new Employee2();
		employee.setName("�R�c�@���Y");
		employee.setAge(35);
		employee.setLicense(Arrays.asList("����^�]�Ƌ�", "���p���Z�p��"));
		
		File file = new File("newEmployee.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, employee);
		} catch (IOException e) {
			// TODO �����������ꂽ catch �u���b�N
			e.printStackTrace();
		}
	}
}
