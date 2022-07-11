package FamilyTree;

import java.util.ArrayList;
import java.util.Random;

public class Person {
	private int id = -1;
	private String firstName = "";
	private String lastName = "";
	private Sex sex = Sex.unspecified;
	private ArrayList<Relationship> relationships = new ArrayList<>();

	private Person(String firstName, String lastName, Sex sex, int id) {
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

	public Sex getSex() {
		return sex;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void addRelationships(Relationship ... relationships){
		for (Relationship relationship : relationships) {
			this.relationships.add(relationship);
			relationship.getRelative().relationships.add(relationship);
		}
	}

	public void remuveRelationships(Relationship ... relationships){
		for (Relationship relationship : relationships) {
			for (int i = 0; i < relationships.length; i++) {
				if (this.relationships.get(i).equals(relationship)) {
					this.relationships.remove(i);
					relationship.getRelative().remuveRelationships(relationship);
				}
			}
		}
	}

	public ArrayList<Relationship> getRelationships() {
		return relationships;
	}

	@Override
	public String toString() {
		String sex = "";
		if (getSex() == Sex.male)
			sex = "М";
		else if (getSex() == Sex.female) 
			sex = "Ж";
		else 
			sex = "Не указан";
		return String.format("%s %s(%s)", getFirstName(), getLastName(), sex);
	}

}

class generateId {
	
	public int genId() {
		return new Random().nextInt(Integer.MAX_VALUE);
	}
}