package StreamsExample;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Person {
    private int personId;
    private String name;
    private Gender gender;

    public Person(int personId, String name, Gender gender) {
        super();
        this.personId = personId;
        this.name = name;
        this.gender = gender;
    }

    public boolean isMale() {
        return this.gender == Gender.MALE;
    }

    public boolean isFemale() {
        return this.gender == Gender.FEMALE;
    }

    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        StringBuilder str = null;
        str = new StringBuilder();
        str.append("Id:- " + getPersonId() + " Gender:- " + getGender() + " Name:- " + getName());
        return str.toString();
    }

    public static enum Gender {
        MALE,
        FEMALE
    }

}
public class StreamPartitioning {
    public static void main(String[] args) {

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, "Yashwant", Person.Gender.MALE));
        persons.add(new Person(2, "Mahesh", Person.Gender.MALE));
        persons.add(new Person(3, "Divya", Person.Gender.FEMALE));

        Predicate<Person> predicate = p -> p.getGender() == Person.Gender.MALE;

        Map<Boolean, List<Person>> partionedByMale = persons.stream().collect(Collectors.partitioningBy(predicate));

        System.out.println(partionedByMale);

    }
}
