package sunshineseashore;

public class Rental {
    private int hours;
    private int minutes;
    private int price;

    public Rental(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
        calculatePrice();
    }

    private void calculatePrice() {
        int totalMinutes = hours * 60 + minutes;
        if (totalMinutes <= 40) {
            price = 40;
        } else {
            int extraMinutes = totalMinutes - 40;
            price = 40 + extraMinutes;
        }
    }

    public int getPrice() {
        return price;
    }

    public int getTotalTimeInMinutes() {
        return hours * 60 + minutes;
    }

    public String getTimeAsString() {
        return hours + " hours " + minutes + " minutes";
    }

    public static void main(String[] args) {
//        take input from user as array of number


    }
}
