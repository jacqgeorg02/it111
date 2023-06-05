package package_person_input;

public class Person {
//    no main method
//    we'll be creating our fields

    String name;
    char gender;
    int age;
    double baselineRate = 300;

    String zipCode;
    int cityCode;

    //    we have our individual violations as well as the main violation
//    we have several booleans for our specific violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;

    double creditScore;


//    creating a method named display so that we can print everything out eventually
//    now we are going to create a method to display our inputs

    public void display() {
        System.out.println("This is the information that you have provided.");
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(zipCode);
        System.out.println("Baseline rate: $" +baselineRate);
        System.out.println("Don't forget that your total rate may change due to violations, age & credit score.");
        System.out.println("Violations: " +violations);
        System.out.println("DUI Violation: " +violationDUI);
        System.out.println("Red Light Violation: " +violationRedLight);
        System.out.println("Speeding Violation: " +violationSpeeding);
        System.out.println("Credit Score: " +creditScore);

    }
// create a method -- violations and credit score
//    violations or credit score -- if your credit score or violations is true, you'll be paying more!

    public double getRate(double monthlyRate) {
        if(violations == true || creditScore <= 700) {
            monthlyRate = 300;
        } else {
            monthlyRate = 0;
        }return monthlyRate;
    }
//    new method for age
//    if you are young or older, you'll be paying more money

public double ageCategory (double adjustedRate) {
        if(age <=25 || age >= 65) {
            adjustedRate = 300;

    } else {
            adjustedRate = 0;
        }
        return adjustedRate;
}
//our method for states/zipcodes/strings
// /changing your string to an integer!
    public int identifyRegion (int states) {
//        90-96 is CA 97 OR 98 & 99 is WA
        String zip2;
        zip2 = zipCode.substring(0, 2);

//        when the end user types a zipCode, this zipCode is a string, but we want only the first 2 numbers take out of this zip code and assigned to zip2
        cityCode = Integer.parseInt(zip2);

        if (cityCode >= 90 && cityCode < 97) {
            System.out.println("You entered " +zipCode+ " and you're from California.");
        } else if (cityCode == 97) {
            System.out.println("You entered " +zipCode+ " and you're from Oregon.");
        } else if (cityCode >= 98 && cityCode <= 99 ) {
            System.out.println("You entered " +zipCode+ " and you're from Washington.");
        } else {
            System.out.println("You're not from the Pacific Northwest, please contact our National office.");
        }
        return states;
    }
//    creating method to charge a surcharge to people who live in California because there are so many cars, pollution, accidents, etc...
    public double californiaRegion(double surcharge) {
        if (cityCode >= 90 && cityCode < 97) {
            surcharge = 200;
        } else {
            surcharge = 0;
        }
        return surcharge;


    }

}

