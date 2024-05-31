package org.javapractice.test;


/**
 * Map<String,Person> map = new HashMap<>();
 * map.put("g",new Person(5, 51, "EE"));
 * map.put("a",new Person(4,25,"DD"));
 * map.put("e",new Person(3, 44, "CC"));
 *
 * Id age name
 *
 * A,e,g
 *
 * 25,44,51
 */
public class Person {
    int id;
    int age;
    String name;

    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
