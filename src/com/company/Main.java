package com.company;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        String[][] arr = {{"1", "2", "3", "4"},
                            {"1", "2", "3", "4"},
                            {"1", "7", "56", "4"},
                            {"1", "2", "3", "4"}
                                                    };

        try {
            methodSumArr(arr);

        } catch (MyArraySizeException e) {
            System.out.println("Некорректный массив");
        } catch (MyArrayDataException e){
            System.out.println("Неверные данные в ячейке");;
        }

    }


    public static void methodSumArr(String[][] name) throws MyArraySizeException, MyArrayDataException {
        if (name.length != 4) {
            throw new MyArraySizeException();
        }
        for(int i = 0; i < name.length; i++){
            if(name[i].length != 4){
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                String str = name[i][j];
                for(int n = 0; n < str.length(); n++){
                    if(str.charAt(n) < '0' || str.charAt(n) > '9' ) {
                        System.err.println("Данные не верны в ячейке " + "[" + i + "][" + j + "]");
                        throw new MyArrayDataException();
                    }
                }
                sum = sum + Integer.parseInt(name[i][j]);
            }
        }
        System.out.println(sum);

    }
}

