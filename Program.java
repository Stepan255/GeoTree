package FamilyTree;

import java.util.ArrayList;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {
		Person person = new Person("Олег", "Лодыжко", Sex.male);
		Person sun = new Person("Петр", "Лодыжко", Sex.male);
		Person daughter = new Person("Лиза", "Капустникова", Sex.female);
		Person father = new Person("Электрон", "Лодыжко", Sex.male);
		Person mother = new Person("Вера", "Лодыжко", Sex.female);
		Person[] persons = {person, sun, daughter, father, mother};
		person.addRelationships(new Relationship(Kinship.ancestor(0), father));
		person.addRelationships(new Relationship(Kinship.ancestor(0), mother));
		person.addRelationships(new Relationship(Kinship.descendant(0), sun));
		person.addRelationships(new Relationship(Kinship.descendant(0), daughter));
		Repository rep = new Repository(persons);
		ArrayList<Person> ch = new Researche1().getChildrens(rep, person.getId());
		System.out.print("Дети " + person + ": ");
		for (Person children : ch) {
			System.out.print(children + ", ");
		}

		System.out.println();
		ArrayList<Person> par = new Researche2().getParents(rep, person.getId());
		System.out.print("Родители " + person + ": ");
		for (Person parent : par) {
			System.out.print(parent + ", ");
		}
	}
}