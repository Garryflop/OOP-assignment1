package modules;

public class Teacher extends Person {
    private String subject;
    private int yearsOfExperience;
    private double salary;

    public Teacher(String name, String surname, int age, String genderStr, String subject, int yearsOfExperience, double salary) {
        super(name, surname, age, genderStr);
        setSubject(subject);
        setYearsOfExperience(yearsOfExperience);
        setSalary(salary);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getYearsOfExperience() {
        return this.yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void giveRaise(double persent) {
        setSalary(getSalary() + ((persent) * getSalary()));
    }

    @Override
    public String toString() {
        return super.toString() + String.format("I teach %s. My salary: %s", getSubject(), getSalary());
    }
}
