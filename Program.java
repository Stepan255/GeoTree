package FamilyTree;

import java.util.ArrayList;
import java.util.List;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {
		List<Person> listP = new ArrayList<>();
		Person p = new Person("firstName", "lastName", Sex.male);
		Person ch = new Person("Childr1", "lastName", Sex.male);
		Person ch1 = new Person("Childr2", "lastName", Sex.female);
		listP.add(p);
		listP.add(ch);
		listP.add(ch1);
		p.addRelationships(new Relationship(Kinship.descendant(0), ch.getId()));
		p.addRelationships(new Relationship(Kinship.descendant(0), ch1.getId()));
		for (int i = 0; i < p.getRelationships().size(); i++) {
			int idCh = p.getRelationships().get(i).getIdRelative();
			for (int j = 0; j < listP.size(); j++) {
				if (listP.get(j).getId() == idCh){
					System.out.println(listP.get(j).getFirstName());
				}
			}
		}
		// System.out.println(p.getRelationships().get);
		// Kinship k = Kinship.ancestor(1);
		// System.out.println(k);
		// Person stepan = new Person("Stepan", "B", Sex.male);
		// Node nodeStepan = new Node(stepan);
		// Person children = new Person("StepanCH1", "B", Sex.female);
		// nodeStepan.addChildrens(new Node(children));
		// children = new Person("StepanCH12", "B", Sex.male);
		// nodeStepan.addChildrens(new Node(children));

		// Person fatherS = new Person("FStepan", "B", Sex.male);
		// Node nodeFatherS = new Node(fatherS);
		// nodeFatherS.addChildrens(nodeStepan);
		// Node.printGeoTree(nodeFatherS, " ");
	}
}