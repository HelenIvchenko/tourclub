package tourclub_app;

import javafx.collections.ObservableList;
import javafx.collections.FXCollections;

import java.util.ArrayList;
import java.util.List;

public class DataReader {
    ObservableList<Amateur> amateurs = FXCollections.observableArrayList();
    ObservableList<Sportsman> sportsmen = FXCollections.observableArrayList();
    ObservableList<Manager> managers = FXCollections.observableArrayList();
    ObservableList<Coach> coaches = FXCollections.observableArrayList();
    Amateur amateur;
    Sportsman sportsman;
    Manager manager;
    Coach coach;

    public void readData(String[] data) {
        switch (data[0]) {
            case ("Amateur"):
                amateur = new Amateur(data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[5]);
                amateurs.add(amateur);
                break;


            case ("Sportsman"):
                sportsman = new Sportsman(data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[5],
                        data[6]);
                sportsmen.add(sportsman);
                break;


            case ("Manager"):
                manager = new Manager(data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[7]);
                managers.add(manager);
                break;

            case ("Coach"):
                coach = new Coach(data[1],
                        data[2],
                        data[3],
                        data[4],
                        data[6],
                        data[7]);
                coaches.add(coach);
                break;
        }
    }
}
