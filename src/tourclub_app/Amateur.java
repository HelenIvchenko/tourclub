package tourclub_app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Amateur extends Person {

    private boolean canSwim;
    private String section;
    private String group;

    Amateur(String name,
            String surname) {
        super(name, surname);
    }

    Amateur(String surname, String name, String birthYear, String gender, String canSwim) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthYear = new SimpleIntegerProperty(Integer.parseInt(birthYear));
        this.gender = new SimpleStringProperty(gender);
        this.canSwim = canSwim.equalsIgnoreCase("Yes");

    }


}
