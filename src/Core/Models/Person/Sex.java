package FamilyTree.src.Core.Models.Person;

public enum Sex {
    MALE ("Ж"),
    FEMALE ("М"),
    UNSPECIFIED ("Н");
    private String sex;

    Sex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }
}
