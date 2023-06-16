import Exceptions.MyExceptions;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DataProcessing {
    public String [] chekData() {
        DataIn ourData = new DataIn();
        StringBuilder StringOut = new StringBuilder(0);
        String[] parsingData = ourData.dataToArray();
        for (int i = 0; i < parsingData.length; i++) {
            switch (i) {
                case 0, 1, 2:
                    if (parsingData[i].matches("[^А-Яа-яЁё]+")) {
                        try {
                            throw new MyExceptions();
                        } catch (MyExceptions e){
                            e.NameException();
                        }
                    }else {
                        parsingData[i] = parsingData[i].substring(0,1).toUpperCase() + parsingData[i].substring(1).toLowerCase();
                    }
                    break;
                case 3:
                    DateTimeFormatter dateBirth = DateTimeFormatter.ofPattern("dd.MM.yyyy");
                    try {
                        LocalDate.parse(parsingData[i], dateBirth);
                    } catch (DateTimeException e) {
                        throw new DateTimeException("Дата рождения введена неверно.");
                    }
                    break;
                case 4:
                    

            }
        }
    }
}
