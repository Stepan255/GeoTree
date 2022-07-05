package FamilyTree;
import java.util.ArrayList;

public class Node {
	private Person person;
	private ArrayList<Node> childrens = new ArrayList<>();

	public Node(Person person) {
		this.person = person;
	}

	// TODO проверку на уже присутствия ребенка вчисле детей и пр. проверки
	// TODO вывод ошибок
	public void addChildrens(Node ... nodeChildrens){
		for (Node children : nodeChildrens) {
			this.childrens.add(children);
			if (person.getSex() == Sex.male){
				children.getPerson().setIdFather(person.getId());
			} else if (person.getSex() == Sex.female) {
				children.getPerson().setIdMother(person.getId());
			} else {
				System.out.println("ошибка, неопределенный пол");
			}
		}
	}

	static void printGeoTree(Node n, String spa) {
		if (n != null) {
			System.out.println(spa + n.person.getFirstName() + " " + n.person.getLastName());

			if (n.childrens != null) {
				for (Node children : n.childrens) {
					printGeoTree(children, spa + "  ");
				}
			}
		}
	}

	public Person getPerson() {
		return person;
	}

	public ArrayList<Node> getChildrens() {
		return childrens;
	}
}
