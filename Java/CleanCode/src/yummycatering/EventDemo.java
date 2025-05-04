package yummycatering;

import java.util.Scanner;

public class EventDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Event event1 = new Event();
        System.out.print("Enter number of guests for event 1: ");
        int guests1 = scanner.nextInt();
        event1.setNumberOfGuests(guests1);

        Event event2 = new Event();
        System.out.print("Enter number of guests for event 2: ");
        int guests2 = scanner.nextInt();
        event2.setNumberOfGuests(guests2);

        Event event3 = new Event();
        System.out.print("Enter number of guests for event 3: ");
        int guests3 = scanner.nextInt();
        event3.setNumberOfGuests(guests3);

        displayEventDetails(event1, 1);
        displayEventDetails(event2, 2);
        displayEventDetails(event3, 3);

        Event largerEvent1 = getLargerEvent(event1, event2);
        displayLargerEvent(largerEvent1, "Event 1", "Event 2");

        Event largerEvent2 = getLargerEvent(event1, event3);
        displayLargerEvent(largerEvent2, "Event 1", "Event 3");

        Event largerEvent3 = getLargerEvent(event2, event3);
        displayLargerEvent(largerEvent3, "Event 2", "Event 3");
    }

    public static void displayEventDetails(Event event, int eventNumber) {
        System.out.println("\nEvent " + eventNumber + " Details:");
        System.out.println("Number of Guests: " + event.getNumberOfGuests());
        System.out.println("Total Price: $" + event.getTotalPrice());
    }

    public static Event getLargerEvent(Event event1, Event event2) {
        return event1.getNumberOfGuests() >= event2.getNumberOfGuests() ? event1 : event2;
    }

    public static void displayLargerEvent(Event largerEvent, String event1Name, String event2Name) {
        System.out.println("\nThe larger event between " + event1Name + " and " + event2Name + " is:");
        System.out.println("Number of Guests: " + largerEvent.getNumberOfGuests());
        System.out.println("Total Price: $" + largerEvent.getTotalPrice());
    }
}
