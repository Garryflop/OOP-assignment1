package models;

import java.util.*;

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
        int average;
        average = total / grades.size();
        Map<Integer, Double> gpaMap = new HashMap<>();
        gpaMap.put(50, 0.0);
        gpaMap.put(55, 1.0);
        gpaMap.put(60, 1.33);
        gpaMap.put(65, 1.67);
        gpaMap.put(70, 2.0);
        gpaMap.put(75, 2.33);
        gpaMap.put(80, 2.67);
        gpaMap.put(85, 3.0);
        gpaMap.put(90, 3.33);
        gpaMap.put(95, 3.67);
        gpaMap.put(100, 4.0);

        double gpa = 0.0;
        for (Map.Entry<Integer, Double> entry : gpaMap.entrySet()) {
            if (average < entry.getKey()) {
                gpa = entry.getValue();
                break;
            }
        }

        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("I am a student with ID %s, gpa: %s.", getId(), calculateGPA());
    }
}
