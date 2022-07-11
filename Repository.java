package FamilyTree;

import java.util.ArrayList;

public class Repository {
	private ArrayList<Person> persons = new ArrayList<>();

	public Repository(Person ... persons) {
		for (Person person : persons) {
			this.persons.add(person);
		}
	}

	public void create(Person ... persons){
		for (Person person : persons) {
			this.persons.add(person);
		}
	}

	public ArrayList<Person> getPersons() {
		return persons;
	}

	public Person getPerson(int idPerson){
		for (Person person : persons) {
			if (person.getId() == idPerson) {
				return person;
			}
		}
		return new Person("firstName", "lastName", Sex.male);
	}
}
