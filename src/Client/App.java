package FamilyTree.src.Client;

import FamilyTree.src.Core.Infrastructure.Storage;
import FamilyTree.src.Core.Models.Person.Person;
import FamilyTree.src.Core.Presenters.Presenter;
import FamilyTree.src.Core.Views.View;
import FamilyTree.src.Mathematics.IsNumeric;
import FamilyTree.src.Research.FindChildrens;

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
                .append("2 - Find children\n");
//                .append("3 - Find parent\n")
//                .append("4 - add person\n")
//                .append("0 - exit\n");


        programCycle(text);
    }

    private void programCycle(StringBuilder sb) {
        while (true) {
            view.show(sb.toString());
            switch (view.get()) {
                case "1":
                    for (Person person :
                            new FindChildrens(storage, getPerson()).startResearch()) {
                        view.show(String.format("%s; ", person.toString()));
                    }
                    break;
                case "2":
                    presenter.show();
                    break;
//                case "3":
//                    presenter.show();
//                    break;
                case "0":
                    return;
            }
        }
    }

    // TODO вынести метод в класс
    private Person getPerson() {
        String numberString;
        Integer id;
        Person person;
        do {
            id = getNumber();
            person = storage.getPerson(id);
        } while (person == Person.nullPerson());
        return person;
    }

    // TODO связан с getPerson()
    private int getNumber() {
        String numberString;
        IsNumeric numeric = new IsNumeric();
        boolean checkNumeric;
        do {
            view.show("Введите идентификатор человека для исследования");
            numberString = view.get();
            checkNumeric = !(numeric.isNumeric(numberString));
        } while (checkNumeric);
        if (numberString == null){
            return 0;
        }
        return Integer.getInteger(numberString);
    }


}
