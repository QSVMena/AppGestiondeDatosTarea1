package Modells;

import java.util.Date;

public abstract class PersonBase {
	
	public String FirstName;
	public Date Birthdate;
	public char Genero;
	public int Age;
	
	
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public Date getBirthdate() {
		return Birthdate;
	}
	public void setBirthdate(Date birthdate) {
		Birthdate = birthdate;
	}
	public char getGenero() {
		return Genero;
	}
	public void setGenero(char genero) {
		Genero = genero;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
	
	

}
