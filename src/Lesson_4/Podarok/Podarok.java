package Lesson_4.Podarok;
//абстрактный класс родитель для классов Candy, Cookie
public  abstract class Podarok {
    private String name;
    private double weight;
    private  double price;
//пустой конструктор
    public Podarok(){}
//параметризированный конструктор
    public Podarok(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
// сеттеры и геттеры для доступа к приватным полям класса
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
// переопределенный метод класса String для объединения всех полей в одну строку
    @Override
    public String toString() {
        return "name: " + name + " price = " + price + " weght = " + weight;
    }
}