package FamilyTree.src.Core.Presenters;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Views.View;

public class Presenter {
    Storage storage;
    View view;

    public Presenter(Storage storage, View view) {
        this.storage = storage;
        this.view = view;
    }

    public Storage getStorage() {
        return storage;
    }

    public void show() {
        for (Person person :
                storage.getPersons()) {
            view.show(person.toString());
        }
    }
}
