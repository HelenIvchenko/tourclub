package tourclub_app;

public abstract class Person {

    protected String name;
    protected String surname;
    protected int age;
    protected String gender;

    Person() {
        this.name = "Unknown";
        this.surname = "Unknown";
    }

    Person(String name,
           String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
