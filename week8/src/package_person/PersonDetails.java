package package_person;

public class PersonDetails {
//    this file will have a main method
    public static void main(String[]args) {
        Person firstPerson;
        Person secondPerson;
//        in the process of creating an object from my Person class

        firstPerson = new Person();
        secondPerson = new Person();

//        we will be entering the info, assigning values to our fields

        firstPerson.name= "Cathy";
        firstPerson.gender = 'F';
        firstPerson.age = 33;
        firstPerson.car = "Volkswagon Bug";
        firstPerson.violations = false;
        firstPerson.creditScore = 690;
        secondPerson.name= "Kendall";
        secondPerson.gender = 'M';
        secondPerson.age = 22;
        secondPerson.car = "Ford Mustang";
        secondPerson.violations = true;
        secondPerson.creditScore = 670;

//        System.out.println(firstPerson.name);
//        System.out.println(firstPerson.gender);
//        System.out.println(firstPerson.age);
//        System.out.println(firstPerson.car);
//        System.out.println(firstPerson.violations);
//        System.out.println(firstPerson.creditScore);
//        System.out.println();
//        System.out.println(secondPerson.name);
//        System.out.println(secondPerson.gender);
//        System.out.println(secondPerson.age);
//        System.out.println(secondPerson.car);
//        System.out.println(secondPerson.violations);
//        System.out.println(secondPerson.creditScore);

        double monthlyRate = 0;
        double adjustedRate = 0;

        firstPerson.display();
        System.out.println("Preliminary Monthly Rate for "+firstPerson.name+ ": " +firstPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+firstPerson.assumeGender(adjustedRate)+" dollars");


        System.out.println();


        secondPerson.display();
        System.out.println("Preliminary Monthly Rate for "+secondPerson.name+ ": " +secondPerson.getRate(monthlyRate)+" dollars");
        System.out.println("Adjustments: "+secondPerson.assumeGender(adjustedRate)+" dollars");


    }
}
