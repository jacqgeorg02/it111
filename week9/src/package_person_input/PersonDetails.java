package package_person_input;

import java.util.Scanner;

public class PersonDetails {
    public static void main(String[]args) {
//        we need to create an object
//        we get that object from our class of Person

        Person customer;
        customer = new Person();
        int states = 0;
//        please note that we will be initializing additional variables
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name!");
        customer.name = input.next();

        System.out.print("Please enter your age!");
        customer.age = input.nextInt();

        System.out.print("Please enter your gender -- M or F!");
        customer.gender = input.next().charAt(0);

        System.out.print("Please enter your zip code (only 5 numbers, please!");
        customer.zipCode = input.next();

        System.out.println("Any traffic violations? Please enter true for YES and false for NO");
        customer.violations = input.nextBoolean();
//        add an if else statement about violations
        if(customer.violations == true) {
            System.out.println("Please type true if you have had a DUI or false if you haven't.");
            customer.violationDUI = input.nextBoolean();
            System.out.println("Please type true if you have had a Red Light violation or false if you haven't.");
            customer.violationRedLight = input.nextBoolean();
            System.out.println("Have you received any speeding tickets? Please type true for yes or false for no tickets.");
            customer.violationSpeeding = input.nextBoolean();
        }
        System.out.println("Please enter your credit score");
        customer.creditScore = input.nextDouble();
        customer.display();
        System.out.println(customer.identifyRegion(states));

        double surcharge = 0;
        System.out.println("Your California surcharge is: "+customer.californiaRegion(surcharge));
        double adjustedRate = 0;
        System.out.println("Age adjustment: "+customer.ageCategory(adjustedRate));
        double monthlyRate = 0;
        System.out.println("Violations and Credit Score Adjustment: "+customer.getRate(monthlyRate));

        System.out.print("Your new monthly premium will be ");
        System.out.println((customer.baselineRate
                +customer.ageCategory(adjustedRate)
                + customer.californiaRegion(surcharge)
                + customer.getRate(monthlyRate))/12);

    }
}
