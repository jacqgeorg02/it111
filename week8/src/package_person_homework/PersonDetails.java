package package_person_homework;

public class PersonDetails {
    public static void main(String[]args) {

        Person firstPerson;
        Person secondPerson;
        Person thirdPerson;

//        in the process of creating an object from my person class
        firstPerson = new Person();
        secondPerson = new Person();
        thirdPerson = new Person();

//        wew will be entering the info by assigning values to our fields

        firstPerson.name="Cathy";
        firstPerson.gender='F';
        firstPerson.age=33;
        firstPerson.car="Volkswagen Bug";
        firstPerson.CarAge = 6;
        firstPerson.violations=false;
        firstPerson.creditScore=690;

        secondPerson.name="Kendall";
        secondPerson.gender='M';
        secondPerson.age=22;
        secondPerson.car="Mustang";
        secondPerson.CarAge = 2;
        secondPerson.violations=true;
        secondPerson.creditScore=670;

        thirdPerson.name="Arial";
        thirdPerson.gender='F';
        thirdPerson.age=54;
        thirdPerson.car="Lexus";
        thirdPerson.CarAge = 18;
        thirdPerson.violations=true;
        thirdPerson.creditScore=600;

        double monthlyRate = 0;
        double adjustedRate = 0;
        double adjustedRate2 = 0;

        firstPerson.display();
        System.out.println("Preliminary Rate for " +firstPerson.name+ ": " +firstPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " +firstPerson.assumeGender(adjustedRate) + " dollars");
        System.out.println("Vehicle Age Adjustment: " +firstPerson.assumeCarAge(adjustedRate2) + " dollars");
        System.out.print("Here is " +firstPerson.name+ "'s total monthly premium: ");
        System.out.println(firstPerson.assumeGender(adjustedRate) + firstPerson.getRate(monthlyRate) + firstPerson.assumeCarAge(adjustedRate2));

        System.out.println();

        secondPerson.display();
        System.out.println("Preliminary Rate for " +secondPerson.name+ ": " +secondPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " + secondPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.println("Vehicle Age Adjustment: " +secondPerson.assumeCarAge(adjustedRate2) + " dollars");
        System.out.print("Here is " +secondPerson.name+ "'s total monthly premium: ");
        System.out.println(secondPerson.assumeGender(adjustedRate) + secondPerson.getRate(monthlyRate)+ secondPerson.assumeCarAge(adjustedRate2));

        System.out.println();

        thirdPerson.display();
        System.out.println("Preliminary Rate for " +thirdPerson.name+ ": " +thirdPerson.getRate(monthlyRate) + " dollars");
        System.out.println("Adjustments: " + thirdPerson.assumeGender(adjustedRate)+ " dollars");
        System.out.println("Vehicle Age Adjustment: " +thirdPerson.assumeCarAge(adjustedRate2) + " dollars");
        System.out.print("Here is " +thirdPerson.name+ "'s total monthly premium: ");
        System.out.println(thirdPerson.assumeGender(adjustedRate) + thirdPerson.getRate(monthlyRate)+ thirdPerson.assumeCarAge(adjustedRate2));

    }
}
