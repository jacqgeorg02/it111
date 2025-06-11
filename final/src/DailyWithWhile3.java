import java.util.Scanner;

public class DailyWithWhile3 {
    public static void main(String[] args) {

        String specials;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee = null;
        double price = 0;

        boolean weekendDay = specials.equals("Saturday") || specials.equals("Sunday");

        while (weekendDay == true) {

            if (specials.equals("Saturday") || specials.equals("Sunday")) {
                System.out.println("Please enter a weekday, not weekend!");
                specials = input.next();
            } else if
            (specials.equals("Monday") || specials.equals("Tuesday") || specials.equals("Wednesday") || specials.equals("Thursday") || specials.equals("Friday")) {
                weekendDay = false;
            }

        }

        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                weekendDay = false;
            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                weekendDay = false;
            }

            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                weekendDay = false;
            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                weekendDay = false;
            }

            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                weekendDay = false;
            }
        }

        System.out.println("Don't forget: we offer a 10% discount when you order 5-9 drinks and a 20% discount when you order 10 or more!!");
        System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        } else if (quantity >= 5 && quantity < 10) {
            System.out.print(quantity + " " + coffee + "s have been ordered, which qualifies for a 10% discount. Your original cost was $");
            System.out.printf("%.2f", (quantity * price));
            System.out.printf(", but your new price is $");
            System.out.printf("%.2f", ((quantity * price) - ((quantity * price) * .1)));
        } else if (quantity >= 10) {
            System.out.print(quantity + " " + coffee + "s have been ordered, which qualifies for a 20% discount. Your original cost was $");
            System.out.printf("%.2f", (quantity * price));
            System.out.printf(", but your new price is $");
            System.out.printf("%.2f", ((quantity * price) - ((quantity * price) * .2)));
        } else {
            System.out.printf(quantity + " " + coffee + "s have been ordered totalling, $");
            System.out.printf("%.2f", (quantity * price));

        }
    }
}

