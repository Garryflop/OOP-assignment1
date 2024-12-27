package models;

public class Person {
    private String name;
    private String surname;
    private int age;
    private String genderStr;
    private boolean gender;

    public Person(String name, String surname, int age, String genderStr) {
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(genderStr);
    }

//setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String genderStr) {
        this.genderStr = genderStr;
        this.gender = genderStr.equals("Male");
    }
//getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean getGender() {
        return gender;
    }

    public String getGenderStr() {
        return genderStr;
    }

    @Override
    public String toString() {
        return String.format("Hi, I am %s %s, a %s-year-old %s.", getName(), getSurname(), getAge(), getGenderStr());
    }
}
