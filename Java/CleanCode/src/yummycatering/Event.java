package yummycatering;

public class Event {
    private final int LOW_PRICE_PER_GUEST = 32;
    private final int HIGH_PRICE_PER_GUEST = 35;
    private int numberOfGuests;
    private double pricePerGuest;
    private double totalPrice;

    public void setNumberOfGuests(int guests) {
        numberOfGuests = guests;
        if (isLargeEvent()) {
            pricePerGuest = LOW_PRICE_PER_GUEST;
        } else {
            pricePerGuest = HIGH_PRICE_PER_GUEST;
        }
        calculateTotalPrice();
    }

    public boolean isLargeEvent() {
        return numberOfGuests >= 50;
    }

    private void calculateTotalPrice() {
        totalPrice = numberOfGuests * pricePerGuest;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public double getTotalPrice() {
        return totalPrice;
    }
}
