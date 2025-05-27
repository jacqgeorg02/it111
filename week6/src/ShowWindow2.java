import javax.swing.*;
import java.awt.*;

public class ShowWindow2 {

    public static void main(String[]args) {
//        declare our variables & make them constants (final) so that their values cannot change
        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 600;

//        Create a window -- just start typing the JFrame, and it will show up
        JFrame window = new JFrame();
        JLabel myLabel1, myLabel2;
        JTextField textField1, textField2;

//        setting the title of the window
        window.setTitle("My Second Show Window");

//        setting the size of the window
        window.setSize (WINDOW_WIDTH, WINDOW_HEIGHT);

//        setting the background color
        window.getContentPane().setBackground(Color.green);

//        setting the location of the window
        window.setLocation(600,400);

//        close the window and exit
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myLabel1 = new JLabel("My First Big Label!!!");
        myLabel1.setBounds(50,70,400,30);
        textField1 = new JTextField();
        textField1.setBounds(50,100,200,30);
        myLabel1.setFont(new Font("Comic Sans", Font.PLAIN,14 ));
        window.add(myLabel1);
        window.add(textField1);

        myLabel2 = new JLabel("My Second Big Label!!!");
        myLabel2.setBounds(50,160,400,30);
        textField2 = new JTextField();
        textField2.setBounds(50,200,200,30);
        myLabel2.setFont(new Font("Georgia",Font.BOLD,16));
        window.add(myLabel2);
        window.add(textField2);

//        I think that this undoes the default layout
        window.setLayout(null);

//        Don't forget to display the window, If we do not display the window, it will not display and don't forget that it's a Boolean!
        window.setVisible(true);

    }
}
