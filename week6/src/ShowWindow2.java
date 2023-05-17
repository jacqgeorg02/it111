import javax.swing. *;


public class ShowWindow2 {
    public static void main(String[] args) {
//        declare our variables
//        we are going to make them constants so that their values cannot change

        final int WINDOW_WIDTH = 350;
        final int WINDOW_HEIGHT = 250;

//        Create a window -- just start typing the JFrame and it will show up

        JFrame window = new JFrame();
//        Scanner input = new Scanner(System.in)
//        It looks the same as setting the JFrame
//        setting the title of the window
        window.setTitle("My Simple Window");

//        setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//        close the window and exit from the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        don't forget to display the window. If we do not display the window, it will not display
//        displaying the window is a boolean
        window.setVisible(true);


    }
}
