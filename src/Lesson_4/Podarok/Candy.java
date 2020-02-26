package Lesson_4.Podarok;
//класс-наследник класса Podarok
public class Candy extends Podarok {
    //уникальный параметр класса
    private String brand;
    //пустой конструктор
    public Candy(){}
    //параметризированный конструктор
    public Candy(String name, double weight, double price, String brand) {
        super(name, weight, price);
        this.brand = brand;
    }
    // сеттеры и геттеры для доступа к приватным полям класса
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    // переопределенный метод класса String для объединения всех полей в одну строку
    @Override
    public String toString() {
        return "Candy + [" + super.toString() + ", brand: " + brand + "]";
    }
}
