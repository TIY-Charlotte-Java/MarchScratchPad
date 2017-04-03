package com.theironyard.charlotte;

/**
 * Created by Ben on 3/29/17.
 */
public class Person {
    private String name;
    private int age;

    boolean isAlive;

    public Person(String name) {
        this.name = name;
    }

    // getter
    public int getAge() {
        return age;
    }

    // setter
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public boolean isValidName(String name) {
        if (name.contains(" ")) {
            return true;
        } else {
            return false;
        }
    }
}
