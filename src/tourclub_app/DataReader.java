package tourclub_app;

import java.util.ArrayList;
import java.util.List;

public class DataReader {
    List<Person> amateurs = new ArrayList<>(100);
    Amateur amateur;

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
        }
   }
}
