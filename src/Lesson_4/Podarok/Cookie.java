package Lesson_4.Podarok;

public class Cookie extends Podarok {
    //уникальный параметр класса
    private String vkus;
    //пустой конструктор
    public Cookie(){}
    //параметризированный конструктор
    public Cookie(String name, double weight, double price, String vkus) {
        super(name, weight, price);
        this.vkus = vkus;
    }
    // сеттеры и геттеры для доступа к приватным полям класса
    public String getVkus() {
        return vkus;
    }
    public void setVkus(String vkus) {
        this.vkus = vkus;
    }
    // переопределенный метод класса String для объединения всех полей в одну строку
    @Override
    public String toString() {
        return "Cookie: [" + super.toString() + " Vkus: " + vkus + "]";
    }
}
