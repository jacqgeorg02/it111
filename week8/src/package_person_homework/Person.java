package package_person_homework;

public class Person {


    String name;
    char gender;
    int age;
    String car;
    int CarAge;
    boolean violations;
    double creditScore;

    public void display () {
        System.out.println("Customer Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
        System.out.println("Vehicle: "+car);
        System.out.println("Vehicle Age: "+CarAge+ " years");
        System.out.println("Violations: "+violations);
        System.out.println("Credit Score: "+creditScore);
    }

    public double getRate(double monthlyRate) {
        if (violations == true && creditScore <=700) {
            monthlyRate = 200.00;
        } else {
            monthlyRate = 100.00;
        }
        return monthlyRate;
    }

    public double assumeGender(double adjustedRate) {
        if(gender == 'M' && age <=25){
            adjustedRate = 50;
        }else {
            adjustedRate=0;
        }
        return adjustedRate;
    }

    public double assumeCarAge(double adjustedRate2) {
        if(CarAge == 2){
            adjustedRate2 = 100;
        } else if (CarAge == 6) {
            adjustedRate2 = 50;
        }else {
            adjustedRate2 = 0;
        }
        return adjustedRate2;
    }
}
