package modules;

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

    private int setGrade(int grade) {
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
        int persentage;
        persentage = total / grades.size();

        if (persentage < 50){
            return 0;
        }
        else if (persentage < 55){
            return 1;
        }
        else if (persentage < 60){
            return 1.33;
        }
        else if (persentage < 65){
            return 1.67;
        }
        else if (persentage < 70){
            return 2.0;
        }
        else if (persentage < 75){
            return 2.33;
        }
        else if (persentage < 80){
            return 2.67;
        }
        else if (persentage < 85){
            return 3.0;
        }
        else if (persentage < 90){
            return 3.33;
        }
        else if (persentage < 95){
            return 3.67;
        }
        return 4.0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("I am a student with ID %s, gpa: %s.", getId(), calculateGPA());
    }
}
