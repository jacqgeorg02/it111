public class MyATM {
    public static void main(String[] args) {
       int withdrawal, amount;
       withdrawal = 25;
       amount = 200;

       while(amount != 0) {
           amount -= withdrawal;
//           amount = amount - withdrawal;
//           System.out.println("Your present amount after the withdrawal is $"+amount+ " dollars");
        if(amount == 0) {
                       System.out.println("You have no money!");

        } else {
                       System.out.println("Your present amount after the withdrawal is $"+amount+ " dollars");
        }

       }
//       line above ended the while loop
//        Once the conditon is false, the while loop stops!
//        If we say that the withdrawal is 30, it will never ZERO out and it won't stop running!
    }

}
