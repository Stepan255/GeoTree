package FamilyTree;

import java.util.ArrayList;

public class Researche1 {
	public ArrayList<Person> getChildrens(Repository rep, int idPerson){
		ArrayList<Person> childrens = new ArrayList<>();
		for (Person person : rep.getPersons()) {
			if (person.getId() == idPerson){
				for (Relationship relationship : person.getRelationships()) {
					if (relationship.getKinship() == Kinship.descendant &&
						relationship.getKinship().getGeneration() == 0) {
						childrens.add(rep.getPerson(relationship.getRelative().getId()));
					}
				}
			}
		}
		return childrens;
	}
}
