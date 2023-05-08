import java.util.Scanner;

public class AnotherTryDailySpecials {

    public static void main(String[] args){

        String specials = "";

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a day of the the week, excluding weekends (Monday - Friday only!)");

        specials = input.next();

        String coffee;
        double price = 0;

        boolean saturday = specials.equals("Saturday");
        boolean sunday = specials.equals("Sunday");

        if(saturday || sunday) {
            System.out.println("Please enter a weekday, not weekend");
            specials = input.next();
            System.out.println("Please enter a weekday, not weekend");
            specials = input.next();
        }

//        int quantity = input.nextInt();
//        double total = quantity * price;


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


    }
}
