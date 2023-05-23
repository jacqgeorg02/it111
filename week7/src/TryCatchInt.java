import java.util.Scanner;

public class TryCatchInt {

    public static void main(String[] args){

//        we're going to ask the end user to enter a number

        System.out.println("Please enter a number!!!");
//        I am trying the code in my try block

        try {

            int i ;

            Scanner input = new Scanner(System.in);

            i = input.nextInt();

            System.out.println("Your integer is: " +i);

//            if there are problems... it will render in the catch

        } catch(Exception e) {

            System.out.println("We have an error: " +e);

        }


    }
}
