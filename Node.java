package FamilyTree;
import java.util.ArrayList;

public class Node {
	private Person person;
	private ArrayList<Node> childrens = new ArrayList<>();

	public Node(Person person) {
		this.person = person;
	}

	// TODO проверку на уже присутствия ребенка вчисле детей и пр. проверки
	public void addChildrens(Node ... childrens){
		for (Node children : childrens) {
			this.childrens.add(children);
		}
	}

	public Person getPerson() {
		return person;
	}

	public ArrayList<Node> getChildrens() {
		return childrens;
	}

	public Boolean hasRelatives(Person person){
		if (this.idRelatives(person) > -1)
			return true;
		else
			return false;
	}

	public int idRelatives(Person person){
		for (Relationship relationship : person.getRelationships()) {

			if (relationship.getIdRelative() == 
		}
	}

	public int n(Node ){

	}

	// static void printGeoTree(Node n, String spa) {
	// 	if (n != null) {
	// 		System.out.println(spa + n.person.getFirstName() + " " + n.person.getLastName());

	// 		if (n.childrens != null) {
	// 			for (Node children : n.childrens) {
	// 				printGeoTree(children, spa + "  ");
	// 			}
	// 		}
	// 	}
	// }
}
