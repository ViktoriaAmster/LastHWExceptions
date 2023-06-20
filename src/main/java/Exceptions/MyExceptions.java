package Exceptions;

public class MyExceptions extends Exception{

    public MyExceptions() {
    }

    public void DateException(){
        System.out.println("Дата рождения введена неверно. Введите дату в формате дд.мм.гггг");
    }
    public void NameException(){
        System.out.println("Ошибка при вводе данных ФИО.");
        System.out.println("Вы использовали неразрешеные символы!");
    }

    public void PhoneException(){
        System.out.println("Вы не корректно ввели номер телефона!");
    }

    public void GenderException(){
        System.out.println("Некорректные данные в поле 'Пол'. Надо ввести лишь ОДИН из символов f или m");
    }


}

