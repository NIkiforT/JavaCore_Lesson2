package com.company;

public class MyArraySizeException extends Exception {

    @Override
    public String getMessage(){
        return "Данный массив не обрабатывается";
    }

}
