package tourclub_app;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TableColumn;
import javafx.util.Callback;

public class AmateurCanSwimValueFactory implements Callback<TableColumn.CellDataFeatures<Amateur, CheckBox>, ObservableValue<CheckBox>> {
    @Override
    public ObservableValue<CheckBox> call(TableColumn.CellDataFeatures<Amateur, CheckBox> param) {
        Amateur amateur = param.getValue();
        CheckBox checkBox = new CheckBox();
        checkBox.selectedProperty().setValue(amateur.isCanSwim());
        checkBox.selectedProperty().addListener((ov, old_val, new_val) -> {
            amateur.setCanSwim(new_val);
        });
        return new SimpleObjectProperty<>(checkBox);
    }
}