import java.util.Scanner;

public class DataIn {
    public String[] dataToArray(){
        Scanner dataScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите данные через пробел");
            String data = dataScanner.nextLine();

            String [] splitData = data.split(" ");
            if (splitData.length != 6) {
                System.out.println("Убедитесь, что данные содержат все необходимые поля и не содержит лишних!");
                System.out.println("*Фамилия Имя Отчество* *Дата рождения* *номер телефона* *пол (f/m)* ");
            } else return splitData;
        }
    }

}
