package library;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class Employee {
	public Employee(String name, Integer age, Date birth, String email,
			String note) {
		this.name = name;
		this.age = age;
		this.birth = birth;
		this.email = email;
		this.note = note;
	}

	private String name;
	private Integer age;
	private Date birth;
	private String email;
	private String note;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
