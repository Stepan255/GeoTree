package FamilyTree;

public class Relationship {
	private Kinship kinship = Kinship.valueOf("unspecified");
	private Person relative;

	public Relationship(Kinship kinship, Person relative) {
		this.kinship = kinship;
		this.relative = relative;
	}
	
	public Person getRelative() {
		return relative;
	}

	public void setRelative(Person relative) {
		this.relative = relative;
	}

	public Kinship getKinship() {
		return kinship;
	}

	public void setKinship(Kinship kinship) {
		this.kinship = kinship;
	}
}
