/*
Задание №4
1. Массив размерностью 20, заполняется случайными целыми числами
от -10 до 10. Найти максимальный отрицательный и минимальный положительный
элементы массива. Поменять их местами.
 */
package Lesson_4.SortingAnArray;

public class Main {
    public static void main(String[] args) {
        //создаем обьект класса ArrayRandomNumber
        ArrayRandomNumber ar = new ArrayRandomNumber();
        //создание рандомного массива из 20 чисел
        ar.createArray();
        //находит максимальное отрицательное число в массиве
        ar.maxNegative();
        //находит минимальное положительное число в массиве
        ar.minPositive();
        //меняет местами  найденые два числа и выводит результат в консоли
        ar.changeSometimesPositiveAndNegative();
    }
}
