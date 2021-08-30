package tourclub_app;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.Callback;
import javafx.util.converter.IntegerStringConverter;
import javafx.scene.control.cell.CheckBoxTableCell;

import java.io.*;
import java.util.*;

public class MainController {

    ObservableList<Person> amateurs = FXCollections.observableArrayList();
    ObservableList<Person> sportsmen = FXCollections.observableArrayList();
    ObservableList<Person> managers = FXCollections.observableArrayList();
    ObservableList<Person> coaches = FXCollections.observableArrayList();
    DataReader reader = new DataReader();

    @FXML
    private TableView<Person> amateur_table;
    public TableColumn<Person, String> amateur_name;
    public TableColumn<Person, String> amateur_surname;
    public TableColumn<Person, String> amateur_gender;
    public TableColumn<Person, Integer> amateur_birth;
    public TableColumn<Person, Boolean> amateur_swim;
    public TextField add_amateur_surname;
    public TextField add_amateur_name;
    public TextField add_amateur_year;
    public TextField add_amateur_gender;
    public Button add_amateur_button;
    public Button delete_amateur_button;
    public CheckBox add_amateur_swim;

    @FXML
    private TableView<Person> sportsman_table;
    public TableColumn<Person, String> sportsman_name;
    public TableColumn<Person, String> sportsman_surname;
    public TableColumn<Person, String> sportsman_gender;
    public TableColumn<Person, Integer> sportsman_birth;
    public TableColumn<Person, Integer> sportsman_level;
    public TableColumn<Person, Boolean> sportsman_swim;
    public TextField add_sportsman_surname;
    public TextField add_sportsman_name;
    public TextField add_sportsman_year;
    public TextField add_sportsman_level;
    public TextField add_sportsman_gender;
    public Button add_sportsman_button;
    public Button delete_sportsman_button;
    public CheckBox add_sportsman_swim;

    @FXML
    private TableView<Person> managers_table;
    public TableColumn<Person, String> manager_name;
    public TableColumn<Person, String> manager_surname;
    public TableColumn<Person, String> manager_gender;
    public TableColumn<Person, Integer> manager_birth;
    public TableColumn<Person, Integer> manager_salary;
    public TextField add_manager_surname;
    public TextField add_manager_name;
    public TextField add_manager_year;
    public TextField add_manager_salary;
    public TextField add_manager_gender;
    public Button add_manager_button;
    public Button delete_manager_button;


    @FXML
    private TableView<Person> coaches_table;
    public TableColumn<Person, String> coach_name;
    public TableColumn<Person, String> coach_surname;
    public TableColumn<Person, String> coach_gender;
    public TableColumn<Person, Integer> coach_birth;
    public TableColumn<Person, Integer> coach_level;
    public TableColumn<Person, Integer> coach_salary;
    public TextField add_coach_surname;
    public TextField add_coach_name;
    public TextField add_coach_year;
    public TextField add_coach_level;
    public TextField add_coach_salary;
    public TextField add_coach_gender;
    public Button add_coach_button;
    public Button delete_coach_button;


    public void initialize() {

        //initialize amateurs

        amateur_name.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setName(CellEditEvent.getNewValue()));
        amateur_surname.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setSurname(CellEditEvent.getNewValue()));
        amateur_gender.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setGender(CellEditEvent.getNewValue()));
        amateur_birth.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));


        amateur_birth.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        amateur_swim.setCellFactory(tc -> new CheckBoxTableCell<>());
        amateur_table.setItems(amateurs);

        //initialise sportsmen

       sportsman_name.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setName(CellEditEvent.getNewValue()));
        sportsman_surname.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setSurname(CellEditEvent.getNewValue()));
        sportsman_gender.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setGender(CellEditEvent.getNewValue()));
        sportsman_birth.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));
        sportsman_level.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));

        sportsman_birth.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        sportsman_level.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        sportsman_swim.setCellFactory(tc -> new CheckBoxTableCell<>());
        sportsman_table.setItems(sportsmen);

        //initialise managers

        manager_name.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setName(CellEditEvent.getNewValue()));
        manager_surname.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setSurname(CellEditEvent.getNewValue()));
        manager_gender.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setGender(CellEditEvent.getNewValue()));
        manager_birth.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));
        manager_salary.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));

        manager_birth.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        manager_salary.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        managers_table.setItems(managers);

        // initialise coaches

        coach_name.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setName(CellEditEvent.getNewValue()));
        coach_surname.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setSurname(CellEditEvent.getNewValue()));
        coach_gender.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setGender(CellEditEvent.getNewValue()));
        coach_birth.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));
       coach_salary.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));
        coach_level.setOnEditCommit(
                CellEditEvent -> CellEditEvent.getTableView().getItems().get(
                        CellEditEvent.getTablePosition().getRow()).setBirthYear(CellEditEvent.getNewValue()));

        coach_birth.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        coach_salary.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        coach_level.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));

        coaches_table.setItems(coaches);


    }

    @FXML
    protected void CloseAppAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    protected void HelpAction(ActionEvent event) {
        System.out.println("debug");
    }

    @FXML
    protected void SaveAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Save");
        File csv_file = fileChooser.showSaveDialog(null);
        //TODO: Actually save data to file
    }

    @FXML
    protected void DownloadFromCSVAction(ActionEvent event) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select csv with data");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV", "*.csv"),
                new FileChooser.ExtensionFilter("All", "*.*")
        );
        File csv_file = fileChooser.showOpenDialog(null); // Open file chooser in new window
        if (csv_file != null) {
            BufferedReader csvReader = new BufferedReader(new FileReader(csv_file));
            String row;
            int rowsCount = 0;
            while ((row = csvReader.readLine()) != null) {
                if (rowsCount == 0) {
                    rowsCount++;
                } else {
                    rowsCount++;
                    String[] data = row.split(",");

                    reader.readData(data);
                }
            }
            amateurs = reader.amateurs;
            sportsmen = reader.sportsmen;
            managers = reader.managers;
            coaches = reader.coaches;
            csvReader.close();
            amateur_table.setItems(amateurs);
            sportsman_table.setItems(sportsmen);
            managers_table.setItems(managers);
            coaches_table.setItems(coaches);

        }
    }

    @FXML
    protected void AddAmateur(ActionEvent event) throws IOException {
        String name = add_amateur_name.getText();
        String surname = add_amateur_surname.getText();
        String year = add_amateur_year.getText();
        String gender = add_amateur_gender.getText();
        String swim;
        if (add_amateur_swim.isSelected()) swim = "Yes";
        else {
            swim = "No";
        }


        Amateur amateur = new Amateur (surname, name, year, gender, swim);
        amateurs.add(amateur);
    }

    @FXML
    protected void DeleteAmateur(ActionEvent event) throws IOException {
        Person selectedPerson = amateur_table.getSelectionModel().getSelectedItem();
        amateur_table.getItems().remove(selectedPerson);
    }

    @FXML
    protected void AddSportsman(ActionEvent event) throws IOException {
        String name = add_sportsman_name.getText();
        String surname = add_sportsman_surname.getText();
        String year = add_sportsman_year.getText();
        String gender = add_sportsman_gender.getText();
        String level = add_sportsman_level.getText();
        String swim;
        if (add_sportsman_swim.isSelected()) swim = "Yes";
        else {
            swim = "No";
        }


        Sportsman sportsman = new Sportsman (surname, name, year, gender, swim, level);
        sportsmen.add(sportsman);
    }

    @FXML
    protected void DeleteSportsman(ActionEvent event) throws IOException {
        Person selectedPerson = sportsman_table.getSelectionModel().getSelectedItem();
        sportsman_table.getItems().remove(selectedPerson);
    }

    @FXML
    protected void AddCoach(ActionEvent event) throws IOException {
        String name = add_coach_name.getText();
        String surname = add_coach_surname.getText();
        String year = add_coach_year.getText();
        String gender = add_coach_gender.getText();
        String level = add_coach_level.getText();
        String salary = add_coach_salary.getText();

        Coach coach = new Coach (surname, name, year, gender, level, salary);
        coaches.add(coach);
    }

    @FXML
    protected void DeleteCoach(ActionEvent event) throws IOException {
        Person selectedPerson = sportsman_table.getSelectionModel().getSelectedItem();
        coaches_table.getItems().remove(selectedPerson);
    }

    @FXML
    protected void AddManager(ActionEvent event) throws IOException {
        String name = add_manager_name.getText();
        String surname = add_manager_surname.getText();
        String year = add_manager_year.getText();
        String gender = add_manager_gender.getText();
        String salary = add_manager_salary.getText();

        Manager manager = new Manager (surname, name, year, gender, salary);
        managers.add(manager);
    }

    @FXML
    protected void DeleteManager(ActionEvent event) throws IOException {
        Person selectedPerson = sportsman_table.getSelectionModel().getSelectedItem();
        managers_table.getItems().remove(selectedPerson);
    }

}
