public class PersonRegular {

    public static void main(String[]args) {
//create our variables
        String firstPersonName = "Cathy";
        String secondPersonName = "Kendall";
        char firstPersonGender = 'F';
        char secondPersonGender = 'M';
        int firstPersonAge = 33;
        int secondPersonAge = 22;
        String firstPersonCar = "Volkswagon Bug";
        String secondPersonCar = "Mustang";
        boolean firstPersonViolations = false;
        boolean secondPersonViolations = true;
        int firstPersonCreditScore = 690;
        int secondPersonCreditScore = 670;

        double monthlyRate1;
        double monthlyRate2;


//        logic in the car insurance industry -- if you have traffic tickets, DUIs, other violations, you'll have to pay more for insurance

        if(firstPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate1 = 500;
        } else {
            monthlyRate1 = 100;
        }

        if(secondPersonViolations == true && firstPersonCreditScore <= 700) {
            monthlyRate2 = 500;
        }else {
            monthlyRate2 = 100;
        }

        System.out.println("First Person Name: "+firstPersonName);
        System.out.println("First Person Gender: "+firstPersonGender);
        System.out.println("First Person Age: "+firstPersonAge);
        System.out.println("First Person Car: "+firstPersonCar);
        System.out.println("First Person Violations: "+firstPersonViolations);
        System.out.println("First Person Credit Score: "+firstPersonCreditScore);
        System.out.println("First Person Monthly Rate: "+monthlyRate1);


        System.out.println();
        System.out.println("Second Person Name: "+secondPersonName);
        System.out.println("Second Person Gender: "+secondPersonGender);
        System.out.println("Second Person Age: "+secondPersonAge);
        System.out.println("Second Person Car: "+secondPersonCar);
        System.out.println("Second Person Violations: "+secondPersonViolations);
        System.out.println("Second Person Credit Score: "+secondPersonCreditScore);
        System.out.println("Second Person Monthly Rate: "+monthlyRate2);

    }
}
