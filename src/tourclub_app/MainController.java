package tourclub_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.application.Platform;
import javafx.stage.FileChooser;
import java.io.File;

public class MainController {
    @FXML private Text reactive_text;

    @FXML protected void CloseAppAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML protected void DownloadFromCSVAction(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select csv with data");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("CSV", "*.csv"),
                new FileChooser.ExtensionFilter("All", "*.*")
        );
        File csv_file = fileChooser.showOpenDialog(null); // Open file chooser in new window
        if (csv_file != null) {
            //TODO Olena, open scv file and process it as list object
            reactive_text.setText("Here csv file is processed and input is set somewhere");
        }
    }

}
