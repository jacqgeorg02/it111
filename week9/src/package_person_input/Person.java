package package_person_input;

public class Person {
//    no main method
//    we'll be creating fields

    String name;
    char gender;
    int age;
    String zipCode;
    int cityCode;


//    we have our individual violations as well as the main violations
    boolean violations;
    boolean violationDUI;
    boolean violationRedLight;
    boolean violationSpeeding;
    double creditScore;
    double baselineRate = 900;

//    creating a method named display so that we can print the information in one fell swoop
    public void display() {
        System.out.println("This is what you have provided!");

        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(zipCode);
        System.out.println("Your baseline rate: $"+baselineRate+ " dollars");
        System.out.println("Don't forget that your total rate may change due to violations, age and credit score.");
        System.out.println("Violations: "+violations);
        System.out.println("DUI Violations: "+violationDUI);
        System.out.println("Red Light Violations: "+violationRedLight);
        System.out.println("Speeding Violations: "+violationSpeeding);
        System.out.println("Credit Score: "+creditScore);
    }
//    we're going to create a method talking about violations and credit score
//    this time, we'll have violations or credit score
//    if your credit score or violations will be true, you'll pay more!

    public double getRate(double monthlyRate) {
        if(violations == true || creditScore <=700) {
            monthlyRate = 300;
        } else {
            monthlyRate = 0;
        }
        return monthlyRate;
    }
//    new method for age
//    if you are young or older, you will be paying more money for insurance

    public double ageCategory(double adjustedRate) {
        if(age <= 25 || age >= 65) {
            adjustedRate = 300;
        }else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

//   our methods for states/zip codes / strings / changing your string to an integer
//    zip codes for CA are 90-96 Oregon is 97 and Seattle is 98 and 99

    public int identifyRegion(int states) {
        String zip2;
        zip2 = zipCode.substring(0, 2);
        cityCode = Integer.parseInt(zip2);

        if(cityCode >=90 && cityCode<97) {
            System.out.println("You entered "+zipCode+ " and you're from California");
        } else if (cityCode == 97) {
            System.out.println("You entered "+zipCode+ " and you're from Oregon");
        } else if (cityCode >=98 && cityCode<=99) {
            System.out.println("You entered "+zipCode+ " and you're from Washington");
        }else {
            System.out.println("You're not from the Pacific Coast; please contact our National Office");
        }
        return states;
    }
//    create method to charge a surcharge to people from California because there are so many cars, pollution, accidents, etc...
    public double californiaRegion(double surcharge) {
        if(cityCode >=90 && cityCode<97) {
            surcharge = 200;
        } else {
            surcharge = 0;
        }
        return surcharge;
    }


}
