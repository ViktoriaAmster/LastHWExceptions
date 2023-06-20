import Exceptions.MyExceptions;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DataProcessing {
    public String [] chekData(String[] parsingData) {
        String [] tempData = new String[6];
        for (int i = 0; i < parsingData.length; i++) {
            switch (i) {
                case 0, 1, 2:
                    if (parsingData[i].matches("[^А-Яа-яЁё]+")) {
                        try {
                            throw new MyExceptions();
                        } catch (MyExceptions e) {
                            e.NameException();
                        }
                    }else {
                        tempData[i] = parsingData[i].substring(0,1).toUpperCase() + parsingData[i].substring(1).toLowerCase();
                    }
                    break;
                case 3:
                    try{
                       tempData[i] = chekDate(parsingData[i]);
                    } catch (MyExceptions e) {
                        e.DateException();
                    }
                    break;
                case 4:
                    if (!(parsingData[i].substring(0,1).equals("8") && parsingData[i].length() == 11)) {
                        try {
                            throw new MyExceptions();
                        } catch (MyExceptions e) {
                            e.PhoneException();
                        }
                    }else {
                        tempData[i] = parsingData[i];
                    }
                    break;
                case 5:
                    if ((parsingData[i].length() != 1) || !((parsingData[i].equals("f")) || parsingData[i].equals("m"))) {
                        try {
                            throw new MyExceptions();
                        } catch (MyExceptions e) {
                            e.GenderException();
                        }
                    } else {
                        tempData[i] = parsingData[i];
                    }
                    break;
            }
        }
        return tempData;
    }

    public String chekDate (String date) throws MyExceptions {
        DateTimeFormatter dateBirth = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        try {
            LocalDate.parse(date, dateBirth);
        } catch (DateTimeParseException e) {
            throw new MyExceptions();
        }
        return String.format("%s", LocalDate.parse(date, dateBirth));
    }

}