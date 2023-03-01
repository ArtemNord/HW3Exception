package org.example;

public class IncorrectFIOException extends RuntimeException  {

    public IncorrectFIOException() {
        super("Некорректно заполнено поле ФИО");
    }

}
