package Classes;

import java.util.ArrayList;

public class Student extends Person {
    private static int counter;
    private int id;
    private ArrayList<Integer> grades;

    public Student(String name, String surname, int age, String genderStr) {
        super(name, surname, age, genderStr);
        this.id = counter++;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grade = setGrade(grade);
        this.grades.add(grade);

    }

    public int setGrade(int grade) {
        if (grade < 0){
            grade = 0;
        }
        else if (grade > 100){
            grade = 100;
        }
        return grade;
    }

    public int getId() {
        return id;
    }

    public double calculateGPA() {
        if (grades.isEmpty()){
            return 0;
        }
        int total = grades.stream().mapToInt(x -> x).sum();
        return (double) total / grades.size();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("I am a student with ID %s.", getId());
    }
}
