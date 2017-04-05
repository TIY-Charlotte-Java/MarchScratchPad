package com.theironyard.charlotte;

import java.util.ArrayList;

/**
 * Created by Ben on 4/5/17.
 */
public class Event {
    private String venue;
    private ArrayList<String> attendees = new ArrayList<>();
    private int maxAttendees;

    public Event(int maxAttendees, String venue) {
        this.maxAttendees = maxAttendees;
        this.venue = venue;
    }

    // add registration method
    public void addRegistration(String name) {
        if (attendees.size() < maxAttendees) {
            attendees.add(name);
        } else {
            System.err.println("Max attendees reached. Cannot add.");
        }
    }

    // get registrants method
    public ArrayList<String> getAttendees() {
        return attendees;
    }


    // remaining seats method
    public int remainingSeats() {
        return maxAttendees - attendees.size();
    }
}
