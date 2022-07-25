package FamilyTree.src.Core.Infrastructure;

import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;
import java.util.Collections;

public class Storage {
	private ArrayList<Person> persons;

	public Storage() {
		persons = new ArrayList<>();
	}

	public void create(Person ... persons){
		Collections.addAll(this.persons, persons);
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
		return Person.nullPerson();
	}
}
