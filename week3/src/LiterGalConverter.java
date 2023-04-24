public class LiterGalConverter {
    public static void main(String[] args) {

//        gallon = liter * 0.264712
//        liter = gal * 3.79

        double lit, gal;
        int count = 0;


        for(gal = 1; gal <= 100; gal = gal+4) {
             lit = gal * 3.78541
             ;

//             System.out.printf("%.2f", lit);

             if(gal == 1) {
                 System.out.printf("%.2f Liters = %.1f Gallon", lit, gal);
                 System.out.println();
             } else {
                 System.out.printf("%.2f Liters = %.1f Gallons", lit, gal);
                 System.out.println();
             }

             count += 1;
             if(count == 5){
                 System.out.println("");
                 count=0;
             }





//             if(gal == 1) {
//                 System.out.printf("%.2f", lit);
//                 System.out.print(" Liters = ");
//                 System.out.printf("%.1f", gal);
//                 System.out.println(" Gallon");
//             } else {
//                 System.out.printf("%.2f", lit);
//                 System.out.print(" Liters = ");
//                 System.out.printf("%.1f", gal);
//                 System.out.println(" Gallons");
//             }


             }

        System.out.println("We are done!!!!");
         }

    }

