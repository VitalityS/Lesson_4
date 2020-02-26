package Lesson_4.SortingAnArray;


import java.util.Arrays;

public class ArrayRandomNumber {
    //создание имени массива
    private int[] array;
    //размерность массива
    private static int sizeArray = 20;
    //минимальное число в массиве
    private static int min = -10;
    //переменная для поиска максимального отрицательного числа, изначально задаётся самое наименьшее возможное число в массиве
    private int maxNegative = -10;
    //переменная для хранения индекса максимального отрицательного числа в массиве
    private int numMaxNegative = 0;
    //переменная для поиска максимального отрицательного числа, изначально задаётся самое наименьшее возможное число в массиве
    private int minPositive = 10;
    //переменная для хранения индекса минимального положительного числа в массиве
    private int numMinPositive = 0;

    //создание массива,  размерностью  sizeArray, заполнен случайными числами от -10 до 10 включительно
    int[] createArray() {
        array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = min + (int) (Math.random() * sizeArray);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
    //находит максимальное отрицательное число в массиве и выводит в консоль.
    void maxNegative() {
        for (int i = 0; i < sizeArray; i++) {
            if (array[i] < 0 & array[i] >= maxNegative) {
                maxNegative = array[i];
                numMaxNegative = i + 1;
            }
        }
        System.out.println(numMaxNegative + "-й элемент максимальный отрицательный: " + maxNegative);
    }
    //находит минимальное положительное число в массиве и выводит в консоль.
     void minPositive() {
         for (int i = 0; i < sizeArray; i++) {
            if (array[i] > 0 & array[i] <= minPositive) {
                minPositive = array[i];
                numMinPositive = i + 1;
            }
        }
        System.out.println(numMinPositive + "-й элемент минимальный положительный: " + minPositive);
    }
    //меняет местами  найденые два числа и выводит результат в консоль.
    void changeSometimesPositiveAndNegative(){
        int temp = array[numMaxNegative-1];
        array[numMaxNegative-1] = array[numMinPositive-1];
        array[numMinPositive-1] = temp;
        System.out.println("В массиве ниже, элементы поменяли местами:");
        System.out.println(Arrays.toString(array));
    }
}
