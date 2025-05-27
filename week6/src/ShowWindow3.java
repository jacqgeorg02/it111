import javax.swing.*;
import java.awt.*;

public class ShowWindow3 {




        public static void main(String[] args) {
//        declare our variables
//        we are going to make them CONSTANTS

            final int WINDOW_WIDTH = 350;
            final int WINDOW_HEIGHT = 250;

//        create a window
            JFrame window = new JFrame();
            JLabel MyLabel1, MyLabel2;
            JTextField MyTextField1, MyTextField2;

//        set the title
            window.setTitle("My Simple Window");

//        setting the size of our window
            window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//         close the window and exit the program
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            window.setLocation(600,400);

            window.getContentPane().setBackground(Color.green);

            MyLabel1 = new JLabel("Click Here");
            MyLabel1.setBounds(25,25,300,30);





//        we need to display the window -- if don't display it, it won't show!
//        displaying the window is a boolean

            window.setVisible(true);



        }
    }


