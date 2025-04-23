public class MyOperators2 {

    public static void main(String[] args) {

//        boolean operators

//        boolean tuna = true;
//        boolean bread = true;
//        if(tuna == true && bread == true) {
//            System.out.println("We are having a sandwich!");
//        } else {
//            System.out.println("We are not!");
//        }

        boolean tuna = true;
        boolean bread = false;
        if(tuna == true || bread == true) {
            System.out.println("We are having some food products!");
        } else {
            System.out.println("We will not be eating any food products today!");
        }

//        age= drinking age

        int age = 23;
        if(age >= 21) {
            System.out.println("Yippy skippy, we are ordering an adult beverage!");

        } else {
            System.out.println("We will have a Diet Coke.");
        }

//        amusement park roller coaster ride -- smaller than 4 feet
//        int height = 3;
//        if(height < 4) {
//            System.out.println("You will not be able to ride the roller coaster.");
//
//        }else {
//            System.out.println("Have a great trip on the roller coaster.");
//
//        }

        float height = 3.9F;
        if(height < 4) {
            System.out.println("You will not be able to ride the roller coaster.");

        }else {
            System.out.println("Have a great trip on the roller coaster.");
        }

    }

}
