public class celsiusFarConverter {

    public static void main(String[] args) {
// far = cel * 9/5 +32

        int cel, far;

        for(cel = 0; cel <= 101; cel = cel+3) {
            far = (cel * 9/5) + 32;
//            System.out.println(cel);
//            System.out.println(far);

            System.out.println(cel+" degrees Celsius is equal to "+far+ " degrees Fahrenheit.");


        }

    }
}
