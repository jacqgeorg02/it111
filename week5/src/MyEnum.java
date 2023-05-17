import java.util.Scanner;

public class MyEnum {

    enum WhoWins {HOME, VISITOR, NEITHER}

    public static void main(String[]args){
//Now I am going to declare a variable

        WhoWins who;

        int seahawks, broncos;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the final score for the Seahawks");
        seahawks = input.nextInt();

        System.out.println("Please enter the final score for the Broncos");
        broncos = input.nextInt();

//        if the Seahawks score is greater than the Broncos...
//        WhoWins.HOME is the object of the WhoWins type

        if(seahawks>broncos) {
            who = WhoWins.HOME;
            System.out.println(who+" team won!");
            System.out.print("Seahawks win by ");
            System.out.print(seahawks-broncos+ " points!");

        } else if (broncos>seahawks) {
            who = WhoWins.VISITOR;
            System.out.println(who+" team won!");
            System.out.println("Broncos win by");
            System.out.println(broncos-seahawks+" points!");

        } else {
            who = WhoWins.NEITHER;
            System.out.println(who+" team won!");
            System.out.println("It's a tie!");


    }

    }
}
