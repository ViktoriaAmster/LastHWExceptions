import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public void writeDataInFile(String [] data) {
        String finalData;
        finalData = String.format("%s %s %s %s %s %s\n", data [0], data[1], data[2], data[3], data[4], data[5]);
        String fileName = String.format("C:\\Users\\User\\Desktop\\GB\\Exceptions\\%s.txt", data[0]);
        try (FileWriter in = new FileWriter(fileName, true)){
            in.write(finalData);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
