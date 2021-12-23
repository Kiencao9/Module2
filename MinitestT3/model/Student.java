package MinitestT3.model;

public class Student extends Human {
    private double mathScore;
    private double physicScore;
    private double chemistryScore;
    private double avgScore;

    public Student(double mathScore, double physicScore, double chemistryScore,double avgScore) {
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
        this.avgScore = (chemistryScore + physicScore + chemistryScore) / 3;
    }

    public Student(String name, int age, double mathScore, double physicScore, double chemistryScore) {
        super(name, age);
        this.mathScore = mathScore;
        this.physicScore = physicScore;
        this.chemistryScore = chemistryScore;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        this.mathScore = mathScore;
    }

    public double getPhysicScore() {
        return physicScore;
    }

    public void setPhysicScore(double physicScore) {
        this.physicScore = physicScore;
    }

    public double getChemistryScore() {
        return chemistryScore;
    }

    public void setChemistryScore(double chemistryScore) {
        this.chemistryScore = chemistryScore;
    }

    public double getAvgScore() {
        return avgScore;
    }

    public void setAvgScore(double avgScore) {
        this.avgScore = avgScore;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathScore=" + mathScore +
                ", physicScore=" + physicScore +
                ", chemistryScore=" + chemistryScore +
                '}';
    }
}
