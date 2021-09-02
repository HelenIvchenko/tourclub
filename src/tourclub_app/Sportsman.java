package tourclub_app;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.scene.control.TableView;

public class Sportsman extends Person{

    public void setLevel(int level) {
        this.level.set(level);
    }

    protected   SimpleIntegerProperty level;

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

    public int getLevel() {
        return level.get();
    }

    public SimpleIntegerProperty levelProperty() {
        return level;
    }



    Sportsman (String name,
           String surname) {
        super(name, surname);
    }
    Sportsman (String surname, String name, String birthYear, String gender, String canSwim, String level ) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthYear = new SimpleIntegerProperty(Integer.parseInt(birthYear));
        this.gender = new SimpleStringProperty(gender);
        this.canSwim = new SimpleBooleanProperty(canSwim.equalsIgnoreCase("Yes"));
        this.level = new SimpleIntegerProperty(Integer.parseInt(level));

    }
}
