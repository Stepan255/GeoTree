package FamilyTree.src.Research;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;

public class FindChildrens implements Research {
    Storage object;
    Person subject;

    public FindChildrens(Storage object, Person subject) {
        this.object = object;
        this.subject = subject;
    }

    @Override
    public ArrayList<Person> startResearch() {
        ArrayList<Person> childrens = new ArrayList<>();
        for (Person relative :
                subject.getRelatives(Kinship.DESCENDANT)) {
            if (relative.getKinship(subject).getGeneration() == 0) {
                childrens.add(relative);
            }
        }
        return childrens;
    }
}
