package tourclub_app;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Coach extends Person{

    public void setLevel(int level) {
        this.level.set(level);
    }

    protected   SimpleIntegerProperty level;

    public void setSalary(int salary) {
        this.salary.set(salary);
    }

    protected SimpleIntegerProperty salary;
    public SimpleIntegerProperty salaryProperty() {
        return salary;
    }

    public int getSalary() {
        return salary.get();
    }

    public int getLevel() {
        return level.get();
    }

    public SimpleIntegerProperty levelProperty() {
        return level;
    }

    Coach (String name,
            String surname) {
        super(name, surname);
    }

    public Coach(String surname, String name, String birthYear, String gender, String level,String salary) {
        this.name = new SimpleStringProperty(name);
        this.surname = new SimpleStringProperty(surname);
        this.birthYear = new SimpleIntegerProperty(Integer.parseInt(birthYear));
        this.gender = new SimpleStringProperty(gender);
        this.level = new SimpleIntegerProperty(Integer.parseInt(level));
        this.salary = new SimpleIntegerProperty(Integer.parseInt(salary));
    }
}
