//package FamilyTree.src;
//
//import FamilyTree.src.Core.Models.Person.Kinship;
//import FamilyTree.src.Core.Models.Person.Person;
//
//import java.util.ArrayList;
//
//public class Researche2 {
//
//	public ArrayList<Person> getParents(Repository rep, int idPerson){
//		ArrayList<Person> parents = new ArrayList<>();
//		for (Person person : rep.getPersons()) {
//			if (person.getId() == idPerson){
//				for (Relationship relationship : person.getRelationships()) {
//					if (relationship.getKinship() == Kinship.ANCESTOR &&
//					relationship.getKinship().getGeneration() == 0) {
//						parents.add(rep.getPerson(relationship.getRelative().getId()));
//					}
//				}
//				}
//			}
//		return parents;
//	}
//}
//
