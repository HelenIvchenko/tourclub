package tourclub_app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Tour Club \"Hiking with Olena\"");
        Button button = new Button("Download data from csv");

        HBox hbox = new HBox(button);
        primaryStage.setScene(new Scene(hbox, 1200, 800));
        primaryStage.show();
    }







    public static void main(String[] args) {
        launch(args);
//       Amateur vasia = new Amateur("Vasia","Pupkin");
//        System.out.println(vasia.getName());
    }
}
