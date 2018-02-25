package library;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.supercsv.cellprocessor.Optional;
import org.supercsv.cellprocessor.ParseDate;
import org.supercsv.cellprocessor.ParseInt;
import org.supercsv.cellprocessor.constraint.NotNull;
import org.supercsv.cellprocessor.constraint.StrRegEx;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.CsvBeanReader;
import org.supercsv.io.ICsvBeanReader;
import org.supercsv.prefs.CsvPreference;

public class ReadCsv {
	public static void main(String[] args) {
		CellProcessor[] processors = new CellProcessor[] {
				new NotNull(),
				new ParseInt(new NotNull()),
				new ParseDate("yyyy/MM/dd"),
				new StrRegEx("[a-z0-9\\._]+@[a-z0-9\\.]+"),
				new Optional()
		};
		
		Path path = Paths.get("employee2.csv");
		try (ICsvBeanReader beanReader = new CsvBeanReader(Files.newBufferedReader(path), CsvPreference.STANDARD_PREFERENCE)) {
			String[] header = beanReader.getHeader(true);
			Employee employee;
			while ((employee = beanReader.read(Employee.class, header, processors)) != null) {
				System.out.println(employee);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
