package tourclub_app;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Amateur extends Person {


    public boolean isCanSwim() {
        return canSwim.get();
    }

    public SimpleBooleanProperty canSwimProperty() {
        return canSwim;
    }

    public void setCanSwim(boolean canSwim) {
        this.canSwim.set(canSwim);
    }

    private SimpleBooleanProperty canSwim;

    Amateur(String name,
            String surname) {
        super(name, surname);
    }

    Amateur(String surname, String name, String birthYear, String gender, String canSwim) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthYear = new SimpleIntegerProperty(Integer.parseInt(birthYear));
        this.gender = new SimpleStringProperty(gender);
        this.canSwim = new SimpleBooleanProperty(canSwim.equalsIgnoreCase("Yes"));

    }


}
