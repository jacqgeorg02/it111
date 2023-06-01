package package_person_homework;

public class Person {

//    this file does not have a main method
//    we will start typing fields (variables) We declared our fields

    String name;
    char gender;
    int age;
    int car;

    boolean violations;
    double creditScore;
//    We can't print because we have no method, so we need to make a new java class named PersonDetails;

    public void display(){
        System.out.println("Customer name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Car: " +car);
        System.out.println("Violations: " +violations);
        System.out.println("Credit Score: " +creditScore);
    }

//    our logic is regarding our credit score and violations
//    we'll practice with creating methods instead of using if/else

    public double getRate(double monthlyRate) {
        if(violations == true && creditScore <= 700) {
            monthlyRate = 500.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;

    }

    public double assumeGender(double adjustedRate) {

        if (gender == 'M' && age <= 25) {
            adjustedRate = 100.00;
        }else {
            adjustedRate = 0;
        }
        return adjustedRate;
    }

    public double assumeAge(double adjustedRate2) {

        if (car >= 2015) {
            adjustedRate2 = 200.00;
        }else {
            adjustedRate2 = 0;
        }
        return adjustedRate2;
    }




}
