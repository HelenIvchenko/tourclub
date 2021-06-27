package tourclub_app;

public class Amateur extends Person {

    private boolean canSwim;
    private String section;
    private String group;

    Amateur(String name,
            String surname) {
        super(name, surname);
    }

    Amateur(String surname, String name, String birthYear, String gender, String canSwim) {
        this.name = name;
        this.surname = surname;
        this.birthYear = Integer.parseInt(birthYear);
        this.gender = gender;
        if (canSwim.equalsIgnoreCase("Yes")) {
            this.canSwim = true;
        } else {
            this.canSwim = false;
        }
    }

}
