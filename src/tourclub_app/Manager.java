package tourclub_app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Manager extends Person {



    public SimpleIntegerProperty salaryProperty() {
        return salary;
    }

    public int getSalary() {
        return salary.get();
    }

    public void setSalary(int salary) {
        this.salary.set(salary);
    }

    protected SimpleIntegerProperty salary;

    Manager(String name,
            String surname) {
        super(name, surname);

    }

    public Manager(String surname, String name, String birthYear, String gender, String salary) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthYear = new SimpleIntegerProperty(Integer.parseInt(birthYear));
        this.gender = new SimpleStringProperty(gender);
        this.salary = new SimpleIntegerProperty(Integer.parseInt(salary));
    }
}
