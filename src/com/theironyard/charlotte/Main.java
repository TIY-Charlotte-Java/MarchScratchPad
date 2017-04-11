package com.theironyard.charlotte;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
//        String[] names = new String[3];
//        String[] heights = new String[3];

//        names[0] = "Alice";
//        heights[0] = "5' 10\"";
//        names[1] = "Bob";
//        heights[1] = "2' 00\"";
//        names[2] = "Charlie";
//        heights[2] = "6' 1\"";
//        names[3] = "Dan";
//        heights[3] = "5' 4\"";

        // for loop
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Hello From For Loop");
//        }
//
//        // for each loop
//        for(String name : names) {
//            System.out.println(name);
//        }

        // while loop
//        int i = 0;
//        while (i < 5) {
//            System.out.println("Hello");
//        }
        // do while loop
//        Person examplePerson = new Person("Ben");
//
//        Event e = new Event(3, "Time Warner Arena");
//
//        Scanner inputScanner = new Scanner(System.in);
//
//        while (true) {
//            e.addRegistration(inputScanner.nextLine());
//        }

        ArrayList<String> names = new ArrayList<>();
        names.add("Charlie");
        names.add("Alice");
        names.add("Bob");

        Collections.sort(names);

        for (String name : names) {
            System.out.println(name);
        }

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 10));
        people.add(new Person("Charlie", 15));
        people.add(new Person("Bob", 7));

        Collections.sort(people);

        for (Person person : people) {
            System.out.println(person);
        }


    }
}
