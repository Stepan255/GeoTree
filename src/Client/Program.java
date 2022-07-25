package FamilyTree.src.Client;

import FamilyTree.src.Core.Infrastructure.GenerateId.GeneratorIntId;
import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Models.Person.Sex;
import FamilyTree.src.Core.Views.ViewConsole;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {
		Person person = new Person("Олег", "Лодыжко", Sex.MALE, new GeneratorIntId());
		Person sun = new Person("Петр", "Лодыжко", Sex.MALE, new GeneratorIntId());
		Person daughter = new Person("Лиза", "Капустникова", Sex.FEMALE, new GeneratorIntId());
		Person father = new Person("Электрон", "Лодыжко", Sex.MALE, new GeneratorIntId());
		Person mother = new Person("Вера", "Лодыжко", Sex.FEMALE, new GeneratorIntId());
		Person[] persons = {person, sun, daughter, father, mother};
		person.addRelationship(Kinship.ancestor(0), father);
		person.addRelationship(Kinship.ancestor(0), mother);
		person.addRelationship(Kinship.descendant(0), sun);
		person.addRelationship(Kinship.descendant(0), daughter);
		Storage storage = new Storage();
		storage.create(persons);

		new App(storage, new ViewConsole()).start();
	}
}