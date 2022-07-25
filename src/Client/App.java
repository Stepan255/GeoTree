package FamilyTree.src.Client;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Presenters.Presenter;
import FamilyTree.src.Core.Views.View;
import FamilyTree.src.Mathematics.IsNumeric;
import FamilyTree.src.Research.FindChildrens;
import FamilyTree.src.Research.FindParents;
import FamilyTree.src.Research.FindRelatoves;

import java.util.ArrayList;

public class App {
    Storage storage;
    View view;
    Presenter presenter;

    public App(Storage storage, View view) {
        this.storage = storage;
        this.view = view;
        this.presenter = new Presenter(storage, view);
    }

    public void start() {
        StringBuilder text = new StringBuilder()
                .append("\n ==== \n")
                .append("1 - Show persons\n")
                .append("2 - Find children\n")
                .append("3 - Find parent\n")
//                .append("4 - add person\n")
                .append("0 - exit\n")
                .append("\n");

        showPersons(storage.getPersons());
        programCycle(text);
    }

    private void programCycle(StringBuilder sb) {
        while (true) {
            view.show(sb.toString());
            switch (view.get()) {
                case "1":
                    showPersons(storage.getPersons());
                    break;
                case "2":
                    Person person = getPerson();
                    ArrayList<Person> childrens = new FindChildrens(storage, person).startResearch();
                    view.show("Children " + person + " is: ");
                    showPersons(childrens);
                    break;
                case "3":
                    Person personResearch = getPerson();
                    ArrayList<Person> parents = new FindParents(storage, personResearch).startResearch();
                    view.show("Parents " + personResearch + " is: ");
                    showPersons(parents);
                    break;
                case "0":
                    return;
            }
        }
    }

    private void showPersons(ArrayList<Person> storage) {
        for (Person person :
                storage) {
            view.show(String.format("%s; ", person.toString()));
        }
    }

    // TODO вынести метод в класс
    private Person getPerson() {
        int id;
        Person person;
        do {
            id = getNumber();
            person = storage.getPerson(id);
        } while (person.equals(Person.nullPerson()));
        return person;
    }

    // TODO связан с getPerson()
    private int getNumber() {
        String numberString;
        IsNumeric numeric = new IsNumeric();
        boolean checkNumeric;
        do {
            view.show("Enter the ID of the person to investigate\n");
            numberString = view.get();
            checkNumeric = !(numeric.isNumeric(numberString));
        } while (checkNumeric);
        return Integer.parseInt(numberString);
    }


}
