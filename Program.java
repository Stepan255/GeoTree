package FamilyTree;

/**
 * Program
 */
public class Program {

	public static void main(String[] args) {
		Person stepan = new Person("Stepan", "B", Sex.male);
		Node nodeStepan = new Node(stepan);
		Person children = new Person("StepanCH1", "B", Sex.female);
		nodeStepan.addChildrens(new Node(children));
		children = new Person("StepanCH12", "B", Sex.male);
		nodeStepan.addChildrens(new Node(children));

		Person fatherS = new Person("FStepan", "B", Sex.male);
		Node nodeFatherS = new Node(fatherS);
		nodeFatherS.addChildrens(nodeStepan);
		Node.printGeoTree(nodeFatherS, " ");
	}
}