package MinitestT2.model;

public class Human {
    private String name;
    private int age;

    public Human() {

    }
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
