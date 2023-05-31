package package_person_homework;

public class PersonDetails {

    //    this file will have a main method
    public static void main (String[] args) {

//        we will use the Person class Person.java -- this is where we create our object
        package_person_homework.Person firstPerson;
        package_person_homework.Person secondPerson;
        package_person_homework.Person thirdPerson;
//        in the process of creating an object from my Person class

        firstPerson = new package_person_homework.Person();
        secondPerson = new package_person_homework.Person();
        thirdPerson = new package_person_homework.Person();
//        we will be entering the info for Cathy and Kendall, but we are assigning values to our fields
        firstPerson.name = "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = 2022;
        firstPerson.violations = false;
        firstPerson.creditScore = 690;

        secondPerson.name = "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = 2005;
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

        thirdPerson.name = "Arial";
        thirdPerson.gender = 'F';
        thirdPerson.age = 54;
        thirdPerson.car = 2021;
        thirdPerson.violations = true;
        thirdPerson.creditScore = 600;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRate2 = 0;



        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": $" +firstPerson.getRate(monthlyRate)+ " per month.");
        System.out.println("Adjustments: $" +firstPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments: $" +firstPerson.assumeAge(adjustedRate2));
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: $");
        System.out.println(+firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate)+ firstPerson.assumeAge(adjustedRate2));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": $" +secondPerson.getRate(monthlyRate)+ " per month.");
        System.out.println("Adjustments: $" +secondPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments: $" +secondPerson.assumeAge(adjustedRate2));
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: $");
        System.out.println(+secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate)+ secondPerson.assumeAge(adjustedRate2));

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": $" +thirdPerson.getRate(monthlyRate)+ " per month.");
        System.out.println("Adjustments: $" +thirdPerson.assumeGender(adjustedRate));
        System.out.println("Adjustments: $" +thirdPerson.assumeAge(adjustedRate2));
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: $");
        System.out.println(+thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate)+ thirdPerson.assumeAge(adjustedRate2));


    }
}
