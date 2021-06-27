package tourclub_app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;
import javafx.application.Platform;
import javafx.stage.FileChooser;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainController {
    List<Person> amateurs = new ArrayList<>();
    DataReader reader = new DataReader();

    @FXML
    private Text reactive_text;

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
                    continue;
                } else {
                    rowsCount++;
                    String[] data = row.split(",");

                    reader.readData(data);
                   // amateurs.add(reader.amateur);
                    // do something with the data
//                    switch (data[0]) {
//                        case ("Amateur"):
//                            amateur = new Amateur(data[1],
//                                    data[2],
//                                    data[3],
//                                    data[4],
//                                    data[5]);
//                            amateurs.add(amateur);
//                            break;
//                    }

                }
            }
            amateurs=reader.amateurs;
            csvReader.close();

            // reactive_text.setText("Here csv file is processed and input is set somewhere");
        }
    }

}
