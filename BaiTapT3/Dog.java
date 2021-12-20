package BaiTapT3;

public class Dog extends Animal implements MyAnimal{

    @Override
    public int run() {
        return 4;
    }

    @Override
    public String  makeSound() {
        return "Gâu Gâu";
    }

    private String eat;

    public Dog(String eat) {
        this.eat = eat;
    }

    public Dog(String name, int age, double weight, String eat) {
        super(name, age, weight);
        this.eat = eat;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    @Override
    public String toString() {
        return "Dog{" + super.toString() +
                "eat:'" + eat + '\'' + "chạy "+ run() +"chân" + "kêu: " + makeSound() +
                '}';
    }
}
