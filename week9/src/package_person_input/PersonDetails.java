package package_person_input;

import java.util.Scanner;

public class PersonDetails {

    public static void main(String[] args) {
//        we will create our wonderful object - customer

        Person customer;
        customer = new Person ();
//        we will be entering and initializing additional variables
        int states = 0;

        System.out.println("Please enter your name!");
        Scanner input = new Scanner(System.in);
        customer.name = input.next();

        System.out.println("Please enter your age!");
        customer.age = input.nextInt();



        System.out.println("Please enter your gender by entering F or M or N!");
        customer.gender = input.next().charAt(0);

        System.out.println("Please enter your zip code (only 5 numbers, please!");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for yes, and false for no.");
        customer.violations = input.nextBoolean();

//        add an if else statement:
        if(customer.violations == true) {
            System.out.println("Please type true if you've had a DUI or false if not.");
            customer.violationDUI = input. nextBoolean();

            System.out.println("Please type true if you've had a Red Light violation or false if not.");
            customer.violationRedLight = input.nextBoolean();

            System.out.println("Have you received any speeding tickets? Please type true for yes or false for no tickets.");
            customer.violationSpeeding = input.nextBoolean();

        }
        System.out.println("Please type in your credit score");
        customer.creditScore = input.nextDouble();
        customer.display();
        System.out.println(customer.identifyRegion(states));

        double surcharge = 0;
        System.out.println("Your California surcharge: $" +customer.californiaRegion(surcharge));

        double adjustedRate = 0;
        System.out.println("Adjustment for age: $" +customer.ageCategory(adjustedRate));

        double monthlyRate = 0;
        System.out.println("Adjustment for Violations and Credit Score: $" +customer.getRate(monthlyRate));

        System.out.print("Your new monthly premium will be: $");
        System.out.print(customer.baselineRate + customer.ageCategory(adjustedRate) + customer.californiaRegion(surcharge) + customer.getRate(monthlyRate));









    }
}
