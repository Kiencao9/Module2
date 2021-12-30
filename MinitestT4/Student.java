package MinitestT4;

public class Student extends Human{
    private double mathPoint;
    private double physicPoint;
    private double chemistryPoint;
    private double avgPoint;

    public Student(double mathPoint, double physicPoint, double chemistryPoint, double avgPoint) {
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;
        this.avgPoint = avgPoint;
    }

    public Student(String name, int age, double mathPoint, double physicPoint, double chemistryPoint) {
        super(name, age);
        this.mathPoint = mathPoint;
        this.physicPoint = physicPoint;
        this.chemistryPoint = chemistryPoint;

    }


    public double getMathPoint() {
        return mathPoint;
    }

    public void setMathPoint(double mathPoint) {
        this.mathPoint = mathPoint;
    }

    public double getPhysicPoint() {
        return physicPoint;
    }

    public void setPhysicPoint(double physicPoint) {
        this.physicPoint = physicPoint;
    }

    public double getChemistryPoint() {
        return chemistryPoint;
    }

    public void setChemistryPoint(double chemistryPoint) {
        this.chemistryPoint = chemistryPoint;
    }

    public double getAvgPoint() {
        return avgPoint = (mathPoint + physicPoint + chemistryPoint) / 3;
    }

    public void setAvgPoint(double avgPoint) {
        this.avgPoint = avgPoint = (mathPoint + physicPoint + chemistryPoint) / 3;
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "mathPoint=" + mathPoint +
                ", physicPoint=" + physicPoint +
                ", chemistryPoint=" + chemistryPoint +
                ", avgPoint=" + avgPoint +
                '}';
    }
}
