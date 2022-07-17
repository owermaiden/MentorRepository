package Splitter;

public class Person {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
        //Splitter.PersonBuilder.buildPerson(id,name);
    }

    @Override
    public String toString() {
        return "Splitter.Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

class PersonBuilder {
    public static Person buildPerson(int id, String name) {
        return new Person(id, name);
    }

    public static void main(String[] args) {
        int id = 23;
        String name = "John";
        Person person = null;
        person = buildPerson(id, name);
        System.out.println(person);
    }
}

