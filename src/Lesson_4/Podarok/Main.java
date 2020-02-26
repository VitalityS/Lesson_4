/*Формируется новогодний подарок. Он может включать в себя
разные сладости (Candy, Jellybean, etc.) У каждой сладости есть
название, вес, цена и свой уникальный параметр. Необходимо
собрать подарок из сладостей. Найти общий вес подарка, общую
стоимость подарка и вывести на консоль информацию о всех
сладостях в подарке.*/

package Lesson_4.Podarok;

public class Main {
    public static void main(String[] args) {
        //создаем объект с параметризированным конструктором
        Candy candy1 = new Candy("Alenka", 100, 68.99, "KO");
        //создаем объект с параметризированным конструктором
        Cookie cookie1 = new Cookie("Oreo", 75, 60.00, "banana");
        //создаем объект с пустым конструктором
        Cookie cookie2 = new Cookie();
        //пристваиваем объекту значение вкуса (уникальное знаечение для объектов класса Cookie)
        cookie2.setVkus("Klubnika");
        cookie2.setName("Yubileynoe");
        cookie2.setPrice(150.55);
        //формируем подарок в виде массива объектов
        Podarok[] box = {candy1, cookie1, cookie2} ;
        //Выво в консоль всех объектов в падарке с их описанием.
        for (Podarok all: box) {
            System.out.println(all.toString());
        }


    }
}
