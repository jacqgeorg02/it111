import javax.swing. *;
import java.awt.*;

public class ShowWindow2 {
    public static void main(String[] args) {

//        declare our variables
//        we are going to make them constants so that their values cannot change

        final int WINDOW_WIDTH = 450;
        final int WINDOW_HEIGHT = 350;

//        Create a window -- just start typing the JFrame and it will show up

        JFrame window = new JFrame();
//        Scanner input = new Scanner(System.in) It looks the same as setting the JFrame
        JLabel myLabel1, myLabel2;
        JTextField textField1, textField2;

//        setting the title of the window
        window.setTitle("My Second Simple Window");

//        setting the size of our window
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

//        setting the background color
        window.getContentPane().setBackground(Color.red);

//        setting the location
        window.setLocation(600,400);


//        close the window and exit from the program
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myLabel1 = new JLabel("My First Big Label!!!");
        myLabel1.setBounds(50,50, 400,30);
        textField1 = new JTextField();
        textField1.setBounds(50,100, 100,30);
        window.add(myLabel1);
        window.add(textField1);

        myLabel2 = new JLabel("My Second Big Label!!!");
        myLabel2.setBounds(50,150, 400,30);
        textField2 = new JTextField();
        textField2.setBounds(50,200, 100,30);
        window.add(myLabel2);
        window.add(textField2);

        myLabel1.setFont(new Font("Comic Sans", Font.PLAIN,14));
        myLabel2.setFont(new Font("Georgia", Font.BOLD,16));

        window.setLayout(null);


//        don't forget to display the window. If we do not display the window, it will not display
//        displaying the window is a boolean
        window.setVisible(true);


    }
}
