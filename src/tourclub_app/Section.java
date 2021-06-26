package tourclub_app;

public abstract class Section {


    protected String name;
    protected Person manager;
    protected Person coach;

   Section() {
        this.name = "Default name";
          }

    Section(String name) {
        this.name = name;

    }}