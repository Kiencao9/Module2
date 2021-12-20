package BaiTapT3;

public class Mouse extends Animal implements MyAnimal{

    @Override
    public int run() {
        return 4;
    }

    @Override
    public String makeSound() {
        return "Chít Chít";
    }

    private String dig;

    public Mouse(String dig) {
        this.dig = dig;
    }

    public Mouse(String name, int age, double weight, String dig) {
        super(name, age, weight);
        this.dig = dig;
    }

    public String getDig() {
        return dig;
    }

    public void setDig(String dig) {
        this.dig = dig;
    }

    @Override
    public String toString() {
        return "Mouse{" + super.toString() +
                "dig='" + dig + '\'' +  "chạy "+ run() +"chân" + "kêu: " + makeSound() +
                '}';
    }
}
