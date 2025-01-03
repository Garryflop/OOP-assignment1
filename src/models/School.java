package models;

import java.util.ArrayList;
import java.util.Comparator;

public class School{
    private ArrayList<Person> members;

    public School() {
        this.members = new ArrayList<>();
    }

    public void addMember(Person person) {
        this.members.add(person);
    }

    public void sortMembersBySurname() {
        members.sort(Comparator.comparing(Person::getSurname));
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}