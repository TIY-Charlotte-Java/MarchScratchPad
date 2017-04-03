package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ben"));
        people.add(new Person("Jake"));
        people.add(new Person("Jarad"));
        people.add(new Person("Daniel"));
        people.add(new Person("Keith"));


        System.out.println("What name are you looking for?");
        String enteredName = new Scanner(System.in).nextLine();


        boolean found = false;
        // GOAL: See if a person in "names" has the name
        // we entered in

        // looping through names
        for (int i = 0;i < people.size();i++) {
            Person currentPerson = people.get(i);

            // comparing the name of each person to the name we entered.
            if (currentPerson.getName().equals(enteredName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("You found " + enteredName + "!");
        } else {
            System.out.println("Better luck next time hombre");
        }
    }

    public double areaOfCircle(double r) {
        // / * - +
        return 3.14 * r * r;
    }

    public double getYFromLine(double m, double x, double b) {
        return (m * x) + b;
    }
}
