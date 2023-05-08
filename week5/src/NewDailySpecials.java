import java.util.Scanner;

public class NewDailySpecials {

    public static void main(String[] args) {

        String specials;
        int quantity = 0;



        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if (saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
            System.out.println("Please enter a weekday, not weekend!");
            specials = input.next();
        }


        double cost = quantity * price;


        switch (specials) {
            case "Monday" -> {
                coffee = "Latte";
                price = 4.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Lattes would you like to order?");
                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Lattes! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 Latte today!");
                }else {
                    System.out.printf(quantity + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.println(" dollars.");
                }

            }
            case "Tuesday" -> {
                coffee = "Frappe";
                price = 5.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Frappes would you like to order?");
                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Frappes! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 Frappe today!");
                }else {
                    System.out.print(quantity + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.print(" dollars.");
                }
            }

            case "Wednesday" -> {
                coffee = "Cappuccino";
                price = 4.35;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Cappuccinos would you like to order?");
                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Cappuccinos! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 Cappuccino today!");
                }else {
                    System.out.printf(quantity + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.println(" dollars.");
                }
            }

            case "Thursday" -> {
                coffee = "Regular Joe";
                price = 2.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Regular Joes would you like to order?");
                quantity = input.nextInt();


                if (quantity == 0) {
                    System.out.println("Looks like you don't like Regular Joes! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 Regular Joe today!");
                }else {
                    System.out.printf(quantity + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.println(" dollars.");
                }
            }

            case "Friday" -> {
                coffee = "Green Tea Latte";
                price = 6.95;
                System.out.println(specials + "'s Coffee of the Day is a " + coffee + " and the price will be $" + price);
                System.out.println("How many Lattes would you like to order?");
                quantity = input.nextInt();

                if (quantity == 0) {
                    System.out.println("Looks like you don't like Green Tea Lattes! So sad!!!");
                } else if (quantity == 1) {
                    System.out.println("Looks like you will be ordering only 1 Green Tea Latte today!");
                }else {
                    System.out.printf(quantity + " " + coffee + "s have been ordered totalling $");
                    System.out.printf("%.2f", (quantity * price));
                    System.out.println(" dollars.");
                }
            }

        }




    }

}
