package Lesson47;

import java.io.Serializable;

public class Person implements Serializable {

    //private static final long serialVersionUID = -4336228561426526594L;
    //private static final long serialVersionUID = -4253824958882683735L;
    private /*transient*/ int id;
    private /*transient*/ String personName;
    private int age;
    private byte type;

    public Person(int id, String name) {
        this.id = id;
        this.personName = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return personName;
    }

    public String toString() {
        return id + " : " + personName;
    }
}
