package tourclub_app;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.scene.control.TableView;

public abstract class Person {

    protected SimpleStringProperty name;

    public void setSurname(String surname) {
        this.surname.set(surname);
    }

    protected SimpleStringProperty surname;

    public void setBirthYear(int birthYear) {
        this.birthYear.set(birthYear);
    }

    protected SimpleIntegerProperty birthYear;

    public void setGender(String gender) {
        this.gender.set(gender);
    }

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

    public void setName(String set_name) {
        this.name.set(set_name);
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
