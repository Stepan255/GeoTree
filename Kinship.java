package FamilyTree;

public enum Kinship {
	ancestor (-1),
	descendant(-1),
	unspecified(-1);

	private int generation;
	Kinship(int generation){
		this.generation = generation;
	}

	public static Kinship ancestor(int generation){
		Kinship kinship = Kinship.valueOf("ancestor");
		kinship.setGeneration(generation);
		return kinship;
	}

	public static Kinship descendant(int generation){
		Kinship kinship = Kinship.valueOf("descendant");
		kinship.setGeneration(generation);
		return kinship;
	}

	public int getGeneration() {
		return generation;
	}

	public void setGeneration(int generation) {
		this.generation = generation;
	}
}
