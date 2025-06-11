import java.util.Scanner;

public class DailyWithWhile {

    public static void main(String[] args) {

        String specials = null;
        int quantity;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee = null;
        double price = 0;

        boolean weekendDay = true;

        while (weekendDay) {
            System.out.println("Please enter a weekday only!");
            specials = input.next();

            switch (specials) {
                case "Monday" -> {
                    weekendDay = false;
                    coffee = "Latte";
                    price = 4.95;
                }
                case "Tuesday" -> {
                    weekendDay = false;
                    coffee = "Frappe";
                    price = 5.95;
                }

                case "Wednesday" -> {
                    weekendDay = false;
                    coffee = "Cappuccino";
                    price = 4.35;
                }

                case "Thursday" -> {
                    weekendDay = false;
                    coffee = "Regular Joe";
                    price = 2.95;
                }

                case "Friday" -> {
                    weekendDay = false;
                    coffee = "Green Tea Latte";
                    price = 6.95;
                }


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
                } else if (quantity >= 5 && quantity <10) {
                    System.out.print(quantity + " " + coffee + "s have been ordered, which qualifies for a 10% discount. Your original cost was $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.printf(", but your new price is $");
                    System.out.printf("%.2f", ((quantity * price) * .9));
                    System.out.println();
                    System.out.println("See you at the window!");
                } else if (quantity >= 10) {
                    System.out.print(quantity + " " + coffee + "s have been ordered, which qualifies for a 20% discount. Your original cost was $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.printf(", but your new price is $");
                    System.out.printf("%.2f", ((quantity * price) * .8));
                    System.out.println();
                    System.out.println("See you at the window!");
                } else {
                    System.out.printf(quantity + " " + coffee + "s have been ordered totalling, $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.println();
                    System.out.println("See you at the window!");

                }
            }
        }


