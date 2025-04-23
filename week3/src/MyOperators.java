public class MyOperators {

    public static void main (String[]args) {

//        arithmetic operators
//        employee, wage, hours worked, overtime, the whole enchilada!!

//        int regHours, overtimeHours;
//        double overtimePay, regularPay, total;
//        float wage;
//        double hourlyWithOvertime;
//
//        regHours = 40;
//        overtimeHours = 5;
//        wage = 25.50F;
//        regularPay = regHours * wage;
//        overtimePay = (wage  * 1.5) * overtimeHours;
//        total = overtimePay + regularPay;
//        hourlyWithOvertime = total / (regHours + overtimeHours);
//
//        System.out.println("Regular pay = $"+regularPay+ " dollars");
//        System.out.printf("$%.2f", regularPay);
//        System.out.println();
//        System.out.print("Regular pay: ");
//        System.out.printf("$%.2f", regularPay);
//        System.out.println();
//        System.out.println("Overtime pay = $"+overtimePay+ " dollars");
//        System.out.println("Total pay = $"+total+ " dollars");
//        System.out.println("Hourly rate with overtime = $"+hourlyWithOvertime+ " dollars");
//        System.out.print("Hourly rate with overtime:");
//        System.out.printf("$%.2f", hourlyWithOvertime);

        int number1, number2, number3;

        number1 = 2577;
        number2 = 2;
        number3 = number1 % number2;

        if(number3 == 0 ) {
            System.out.println(number1 + " is an even number!");

        } else {
            System.out.println(number1 + " is an odd number!");

        }

//         we are now going shopping

//        double tax, priceOfItem, taxOnItem, totalPrice;
//
//        tax = .10;
//        priceOfItem = 100.00;
//        taxOnItem = priceOfItem * tax;
//        totalPrice = priceOfItem + taxOnItem;
//
//        System.out.println("Price of Item: $" +priceOfItem+ " dollars");
//        System.out.println("Tax on Item: $" +taxOnItem+ " dollars");
//        System.out.println("Price including tax: $" +totalPrice+ " dollars");

        double priceOfItem = 100;
        priceOfItem *= 1.10;
        System.out.println("Total price of item is &"+priceOfItem+ " dollars");

        System.out.print("Total price of item is ");
        System.out.printf("$%.2f", priceOfItem);
        System.out.println(" dollars.");

        System.out.printf("$%.2f", priceOfItem);

    }
}


