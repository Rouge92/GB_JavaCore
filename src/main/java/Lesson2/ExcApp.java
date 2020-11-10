package Lesson2;

import java.util.Scanner;

public class ExcApp{
    static int checkArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Не верный размер массива!");
        }
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не удалось преобразовать " + i + "x" + j + " ячейку!");
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину масива:");
        int size = input.nextInt();
        String arr[][] = new String[size][size];
        System.out.println("Введите элементы:");
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr.length - 1; j++) {
                System.out.print("arr[" + i + "][" + j + "]:");
                arr[i][j] = input.next();
            }
        }
        try {
            try {
                checkArray(arr);
                int sum = ExcApp.checkArray(arr);
                System.out.println("Сумма элементов массива " + sum);
            } catch (MyArraySizeException e) {
                System.out.println(e.getMessage());
            }
        } catch (MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }
}



