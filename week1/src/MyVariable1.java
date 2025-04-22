public class MyVariable1 {

    public static void main(String[] args) {

        String name = "Jacquie";
//        after a statement, don't forget your semicolon!
        int hours = 40;
//        we are assigning 40 to the hours variable
//        Please note, when we have a string value, it is nested in ""
//        when we are referring to numbers/integers, no quotes!
        System.out.println(name);
        System.out.println(hours);

//        String building, tree, lake, ocean;
//        tree = "Japanese Maple";
//        building = "Space Needle";
//        lake = "Priest Lake";
//        ocean = "Pacific Ocean";

        String building = "Space Needle", tree = "Japanese Maple", lake = "Priest Lake", ocean = "Pacific Ocean";

//        int weeks, decades, months, years;
//        weeks = 4;
//        decades = 10;
//        months = 3;
//        years = 5;

        int weeks = 4, decades = 10, months = 3, years = 5;

        System.out.println(tree);
        System.out.println(building);
        System.out.println(lake);
        System.out.println(ocean);
        System.out.println(weeks);
        System.out.println(decades);
        System.out.println(months);
        System.out.println(years);

        System.out.println("My favorite tree is a "+tree+".");
        System.out.println("My favorite lake is "+lake+", which is in Idaho.");


    }
}
