import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeDataInFile (String data, String fileName) {
        System.out.println(fileName);
        try (FileWriter in = new FileWriter(fileName, true)){
            in.append(data); // в дату добавить перенос строки
        } catch (IOException e) {
            throw new
        }
    }
}
