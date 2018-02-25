package library;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.supercsv.cellprocessor.FmtDate;
import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

public class WriteCsv {
	public static void main(String[] args) {
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee employee1 = new Employee("山田　太郎", 35, new Date(1978/4/1), "yamada@xxx.co.jp", "所有免許：第一種運転免許,応用情報技術者" ); 
		employeeList.add(employee1);
		
		String[] header = new String[]{"name", "age", "birth", "email", "note"};
		
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),
				new NotNull(),
				new FmtDate("yyyy/MM/dd"),
				new NotNull(),
				new Optional()
		};
		
		Path path = Paths.get("employee2.csv");
		try (ICsvBeanWriter beanWriter = new CsvBeanWriter(Files.newBufferedWriter(path), CsvPreference.STANDARD_PREFERENCE)) {
			beanWriter.writeHeader(header);
			for (Employee employee : employeeList) {
				beanWriter.write(employee, header, processors);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
