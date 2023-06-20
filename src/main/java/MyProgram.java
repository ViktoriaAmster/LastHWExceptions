public class MyProgram {
    public static void main(String[] args) {
        DataProcessing ourData = new DataProcessing();
        WriteFile dataInFile = new WriteFile();
        DataIn dataIn = new DataIn();
        String[] chekedData = new String[6];
        boolean flag = true;
        while (flag){
            String[] parsingData = dataIn.dataToArray();
            chekedData = ourData.chekData(parsingData);
            flag = false;
            for (int i = 0; i < parsingData.length; i++) {
                if (chekedData[i] == null){
                    flag = true;
                }
            }
        }
        dataInFile.writeDataInFile(chekedData);
        System.out.println("Данные записаны!");
    }
}
