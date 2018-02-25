package library;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.fasterxml.jackson.databind.ObjectMapper;

public class WritJson {
	public static void main(String[] args) {
		Employee2 employee = new Employee2();
		employee.setName("山田　太郎");
		employee.setAge(35);
		employee.setLicense(Arrays.asList("第一種運転免許", "応用情報技術者"));
		
		File file = new File("newEmployee.json");
		ObjectMapper mapper = new ObjectMapper();
		try {
			mapper.writeValue(file, employee);
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}
	}
}
