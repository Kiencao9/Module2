package MinitestT2.model;

import MinitestT2.model.Human;

public class Student extends Human {
    private double avgScore;

    public Student(double avgScore) {
        this.avgScore = avgScore;
    }

    public Student(String name, int age, double avgScore) {
        super(name, age);
        this.avgScore = avgScore;
    }

    public double getAvgScore(double avgScore) {
        return this.avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" + toString() +
                "avgScore=" + avgScore +
                '}';
    }
}
