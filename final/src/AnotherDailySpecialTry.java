import java.util.Scanner;

public class AnotherDailySpecialTry {

    public static void main(String[] args) {

        String specials;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee = null;
        double price = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }


        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);

            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
            }

            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
            }

            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
            }

        }

        System.out.println("How many " + coffee + "s would you like to order?");
        quantity = input.nextInt();

        if (quantity == 0) {
            System.out.println("Looks like you don't like " + coffee + "s! So sad!!!");
        } else if (quantity == 1) {
            System.out.println("Looks like you will be ordering only 1 " + coffee + " today!");
        }else {
            System.out.printf(quantity + " " + coffee + "s have been ordered totalling $");
            System.out.printf("%.2f", (quantity * price));
            System.out.println(" dollars.");
        }

    }

}
