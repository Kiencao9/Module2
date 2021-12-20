package BaiTapT3;

public class Cat extends Animal implements MyAnimal{

    @Override
    public int run() {
        return 4;
    }

    @Override
    public String  makeSound() {
        return "Meo Meo...";
    }

    private String climb;

    public Cat(String climb) {
        this.climb = climb;
    }

    public Cat(String name, int age, double weight, String climb) {
        super(name, age, weight);
        this.climb = climb;
    }

    public String getClimb() {
        return climb;
    }

    public void setClimb(String climb) {
        this.climb = climb;
    }

    @Override
    public String toString() {
        return "Cat{" + super.toString() +
                "climb='" + climb + '\'' + "chạy "+ run() +"chân" + "kêu: " + makeSound() +
                '}';
    }
}
