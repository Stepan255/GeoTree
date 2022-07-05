package FamilyTree;

import java.util.Random;

public class Person {
	private int id = -1;
	private String firstName = "";
	private String lastName = "";
	private Sex sex = Sex.unspecified;
	private int idFather = -1;
	private int idMother = -1;

	public Person(String firstName, String lastName, Sex sex, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.sex = sex;
		this.id = id;
	}

	public Person(String firstName, String lastName, Sex male) {
		this(firstName, lastName, male, new generateId().genId());
	}

	

	public int getId() {
		return id;
	}

	public void setIdFather(int idFather) {
		this.idFather = idFather;
	}

	public void setIdMother(int idMother) {
		this.idMother = idMother;
	}

	public Sex getSex() {
		return sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

}

class generateId {
	
	public int genId() {
		return new Random().nextInt(Integer.MAX_VALUE);
	}

}