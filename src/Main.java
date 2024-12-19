import Classes.Person;
import Classes.School;
import Classes.Student;
import Classes.Teacher;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File students = new File("C:\\Users\\harry\\IdeaProjects\\OOP-assignment1\\src\\Sources\\students.txt");
        File teachers = new File("C:\\Users\\harry\\IdeaProjects\\OOP-assignment1\\src\\Sources\\teachers.txt");
        Scanner sc1 = new Scanner(students);
        Scanner sc2 = new Scanner(teachers);
        School school = new School();

        while (sc1.hasNext()) {
            String line = sc1.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            String gender = parts[3];

            Student student = new Student(name, surname, age, gender);
            int length = parts.length;

            for (int i = 4; i < length; i++) {
                student.addGrade(Integer.parseInt(parts[i]));
            }
            school.addmember(student);
        }

        while (sc2.hasNext()) {
            String line = sc2.nextLine();
            String[] parts = line.split(" ");

            String name = parts[0];
            String surname = parts[1];
            int age = Integer.parseInt(parts[2]);
            String gender = parts[3];
            String subject = parts[4];
            int year = Integer.parseInt(parts[5]);
            int salary = Integer.parseInt(parts[6]);
            Teacher teacher = new Teacher(name, surname, age, gender, subject, year, salary);
            int length = parts.length;

            for (int i = 7; i < length; i++) {
                teacher.giveRaise(25);
            }
            school.addmember(teacher);
        }
        school.sortMembersBySurname();
        System.out.println(school.toString());;
    }
}