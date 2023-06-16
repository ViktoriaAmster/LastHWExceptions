package Exceptions;

public class MyExceptions extends Exception {
    public MyExceptions(){}
    public void NameException(){
        System.out.println("Ошибка при вводе данных ФИО.");
        System.out.println("Вы использовали неразрешеные символы!");
    }
}
