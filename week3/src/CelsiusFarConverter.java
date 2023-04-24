public class CelsiusFarConverter {
    public static void main(String[] args){
//fahr = (celsius * 9/5) + 32

        int cel, far;

        for(cel = -20; cel <= 100; cel = cel+2) {
            far = (cel * 9/5) + 32;
//            System.out.println(cel);
//            System.out.println(far);
            System.out.println(cel+ " degrees Celsius is equal to " +far+ " degrees Fahrenheit");

        }
        System.out.println("All Done!");

    }
}
