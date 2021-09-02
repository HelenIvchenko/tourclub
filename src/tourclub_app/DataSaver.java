package tourclub_app;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.FileWriter;
import java.io.IOException;

public class DataSaver {


        public void  saveAll(FileWriter csvWriter, ObservableList<Amateur> amateurs, ObservableList<Sportsman> sportsmen,  ObservableList<Coach> coaches,  ObservableList<Manager> managers ) throws IOException {

            csvWriter.append("Type");
            csvWriter.append(",");
            csvWriter.append("Surname");
            csvWriter.append(",");
            csvWriter.append("Name");
            csvWriter.append(",");
            csvWriter.append("BirthYear");
            csvWriter.append(",");
            csvWriter.append("Gender");
            csvWriter.append(",");
            csvWriter.append("CanSwim");
            csvWriter.append(",");
            csvWriter.append("Level");
            csvWriter.append(",");
            csvWriter.append("Salary");
            csvWriter.append("\n");

            for (Amateur amateur: amateurs) {
                csvWriter.append("Amateur"+",");
                csvWriter.append(amateur.getSurname()+",");
                csvWriter.append(amateur.getName()+",");
                csvWriter.append(amateur.getBirthYear()+",");
                csvWriter.append(amateur.getGender()+",");
                if(amateur.isCanSwim()){csvWriter.append("Yes");}
                else csvWriter.append("No");
                csvWriter.append("\n");
            }
            for (Sportsman sportsman: sportsmen) {
                csvWriter.append("Sportsman"+",");
                csvWriter.append(sportsman.getSurname()+",");
                csvWriter.append(sportsman.getName()+",");
                csvWriter.append(sportsman.getBirthYear()+",");
                csvWriter.append(sportsman.getGender()+",");
                if(sportsman.isCanSwim()){csvWriter.append("Yes"+",");}
                else csvWriter.append("No"+",");
                csvWriter.append(sportsman.getLevel()+"");
                csvWriter.append("\n");
            }
            for (Coach coach:coaches) {
                csvWriter.append("Coach"+",");
                csvWriter.append(coach.getSurname()+",");
                csvWriter.append(coach.getName()+",");
                csvWriter.append(coach.getBirthYear()+",");
                csvWriter.append(coach.getGender()+",");
                csvWriter.append(",");
                csvWriter.append(coach.getLevel()+",");
                csvWriter.append(coach.getSalary()+"");
                csvWriter.append("\n");
            }

            for (Manager manager:managers) {
                csvWriter.append("Manager"+",");
                csvWriter.append(manager.getSurname()+",");
                csvWriter.append(manager.getName()+",");
                csvWriter.append(manager.getBirthYear()+",");
                csvWriter.append(manager.getGender()+",");
                csvWriter.append(",");
                csvWriter.append(",");
                csvWriter.append(manager.getSalary()+"");
                csvWriter.append("\n");
            }

            csvWriter.flush();
            csvWriter.close();
    }
        }


