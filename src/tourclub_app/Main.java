package tourclub_app;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        ObservableList<Person> amateurs = FXCollections.observableArrayList();
        ObservableList<Person> sportsmen = FXCollections.observableArrayList();
        ObservableList<Person> managers = FXCollections.observableArrayList();
        ObservableList<Person> coaches = FXCollections.observableArrayList();

        Parent root = FXMLLoader.load(getClass().getResource("tourclub.fxml"));
        primaryStage.setTitle("Tour Club \"Hiking with Olena\"");

        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
    }







    public static void main(String[] args) {
        launch(args);
//       Amateur vasia = new Amateur("Vasia","Pupkin");
//        System.out.println(vasia.getName());
    }
}
