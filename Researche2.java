package FamilyTree;

import java.util.ArrayList;

public class Researche2 {
		
	public ArrayList<Person> getParents(Repository rep, int idPerson){
		ArrayList<Person> parents = new ArrayList<>();
		for (Person person : rep.getPersons()) {
			if (person.getId() == idPerson){
				for (Relationship relationship : person.getRelationships()) {
					if (relationship.getKinship() == Kinship.ancestor &&
					relationship.getKinship().getGeneration() == 0) {
						parents.add(rep.getPerson(relationship.getRelative().getId()));
					}
				}
				}
			}
		return parents;
	}
}

