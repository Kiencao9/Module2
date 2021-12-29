package BaiTap29_12;

public class Student extends Human{
    private double avgScore;

    public Student() {
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    public Student(String name, int age, String gender, String address, double avgScore) {
        super(name, age, gender, address);
        this.avgScore = avgScore;


    }

    @Override
    public String toString() {
        return "Student" + super.toString() +
                "avgScore=" + avgScore
                ;
    }
}
