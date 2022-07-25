package FamilyTree.src.Research;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Kinship;
import FamilyTree.src.Core.Models.Person.Person;

import java.util.ArrayList;

public class FindChildrens extends FindRelatoves {
    public FindChildrens(Storage object, Person subject) {
        super(object, subject);
    }

    @Override
    public ArrayList<Person> startResearch() {
        ArrayList<Person> childrens = new ArrayList<>();
        findRelatives(childrens, Kinship.DESCENDANT, 0);
        return childrens;
    }
}
