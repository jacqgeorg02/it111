import javax.swing.*;

public class KiloConverter extends JFrame {

    //    panel that is on the JFrame
    JPanel panel;

    JLabel messageLabel;

    JTextField kiloTextField;

    JButton calcButton;

    final int WINDOW_WIDTH = 350;
    final int WINDOW_HEIGHT = 450;

//    always be aware of the colors that IntelliJ is using

//    now we have to create a Constructor which is a special method to initialize our Objects

    public KiloConverter () {

        setTitle("Kilometer Converter");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        buildPanel();
//        we need to build a method

        add(panel);

        setVisible(true);

    }

    public void buildPanel() {
        messageLabel = new JLabel("Enter a distance in Kilometers");
//        need to add text, button information, and the panel

        kiloTextField = new JTextField(10);

        calcButton = new JButton("Calculate");

        panel = new JPanel();
//         we now have to add the three components above to the JPanel

        panel.add(messageLabel);
        panel.add(kiloTextField);
        panel.add(calcButton);

    }
//We have to add our main method!!

    public static void main(String[]args) {
        new KiloConverter();
    }
}
