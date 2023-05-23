public class VariableScope {

    public static void main (String[] args) {
//        We are inside the main method

        String txt = "This is the local variable inside the main method!";
        System.out.println(txt);
//        In order for the sub method to run, we have to call the method in the main method
        sub();

    }
    public static void sub() {
        String txt = "This is the local variable inside the sub method!";
        System.out.println(txt);

    }
}
