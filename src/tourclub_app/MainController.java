package tourclub_app;

import javafx.beans.InvalidationListener;
import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import javafx.scene.control.cell.TextFieldTableCell;
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
    public TableColumn<Person, Integer> amateur_birth;
    public TableColumn<Person, Boolean> amateur_swim;
    public TextField add_amateur_surname;
    public TextField add_amateur_name;
    public TextField add_amateur_year;
    public TextField add_amateur_gender;
    public Button add_amateur_button;
    public CheckBox add_amateur_swim;

    @FXML
    private TableView<Person> sportsman_table;

    @FXML
    private TableView<Person> managers_table;

    @FXML
    private TableView<Person> coaches_table;

    public void initialize() {
        amateur_birth.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        amateur_swim.setCellFactory(tc -> new CheckBoxTableCell<>());
    }
    @FXML
    protected void CloseAppAction(ActionEvent event) {
        Platform.exit();
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
            amateurs=reader.amateurs;
            sportsmen=reader.sportsmen;
            managers=reader.managers;
            coaches=reader.coaches;
            csvReader.close();
            amateur_table.setItems(amateurs);
            sportsman_table.setItems(sportsmen);
            managers_table.setItems(managers);
            coaches_table.setItems(coaches);

        }
    }

    @FXML
    protected void AddAmateur(ActionEvent event) throws IOException{
        String name = add_amateur_name.getText();
        String surname = add_amateur_surname.getText();
        String year = add_amateur_year.getText();
        String gender = add_amateur_gender.getText();
        String swim;
        if(add_amateur_swim.isSelected()) swim = "Yes";
        else { swim = "No"; }

        Amateur amateur = new Amateur(name, surname, year, gender, swim);
        amateurs.add(amateur);
    }

}
