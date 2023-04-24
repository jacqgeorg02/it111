import java.sql.SQLOutput;

public class litgalcon {
    public static void main(String [] args) {

        double lit, gal;
        int count = 0;

        for(gal = 1; gal <= 100; gal = gal +4) {
            lit = gal * 3.78541;

            if(gal == 1) {
                System.out.printf("%.2f Liters  =  %.1f Gallon", lit, gal);
                System.out.println();
            }else {
                System.out.printf("%.2f Liters  =  %.1f Gallons", lit, gal);
                System.out.println();
                }
            count += 1;
            if(count == 5){
                System.out.println();
                count = 0;
            }



        }
         System.out.println("We are done!!!!");
    }
}


