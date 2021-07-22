package tourclub_app;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TableView;

public abstract class Person {

    protected SimpleStringProperty name;
    protected SimpleStringProperty surname;
    protected SimpleIntegerProperty birthYear;
    protected SimpleStringProperty gender;

    Person() {
        this.name = new SimpleStringProperty("Unknown");
        this.surname = new SimpleStringProperty("Unknown");
    }

    Person(String name,
           String surname) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
    }

    public String getName() {
        return name.get();
    }

    public String getSurname() {
        return surname.get();
    }

    public int getBirthYear() {
        return birthYear.get();
    }

    public String getGender() {
        return gender.get();
    }
}
