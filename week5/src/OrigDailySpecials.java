import java.util.Scanner;



    public class OrigDailySpecials {

        public static void main(String[] args) {
            String specials = "";

            Scanner input = new Scanner(System.in);

            System.out.println("Please enter a day of the week excluding weekends (Monday - Friday only!)");

            specials = input.next();

//        input.close();
//        in the world of coffee, I need a name of a coffee beverage and a price

            String coffee;
            double price;

            boolean saturday = specials.equals("Saturday");
            boolean sunday = specials.equals("Sunday");

            if(saturday || sunday){
                System.out.println("Please enter a weekday, not weekend!");

                specials = input.next();
            }




            switch (specials) {

//             my cases will be the day of the week
                case "Monday":
                    coffee = "Latte";
                    price = 4.95;
                    System.out.println(specials+"'s Coffee of the Day is a " +coffee+ " and the price will be $" +price);
                    break;

                case "Tuesday":
                    coffee = "Frappe";
                    price = 5.95;
                    System.out.println(specials+"'s Coffee of the Day is a " +coffee+ " and the price will be $" +price);
                    break;

                case "Wednesday":
                    coffee = "Cappuccino";
                    price = 4.35;
                    System.out.println(specials+"'s Coffee of the Day is a " +coffee+ " and the price will be $" +price);
                    break;

                case "Thursday":
                    coffee = "Regular Joe";
                    price = 2.95;
                    System.out.println(specials+"'s Coffee of the Day is a " +coffee+ " and the price will be $" +price);
                    break;

                case "Friday":
                    coffee = "Green Tea Latte";
                    price = 6.95;
                    System.out.println(specials+"'s Coffee of the Day is a " +coffee+ " and the price will be $" +price);
                    break;

//            default:
//                System.out.println("Please enter a valid day, or check your spelling!");
//            this has been commented out along with line 14 because we are going to use Booleans in order to make this all work.







            }



        }
    }

