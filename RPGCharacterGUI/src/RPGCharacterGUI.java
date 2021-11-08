import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RPGCharacterGUI {

    JFrame frame;
    static JTextField inputField1;
    static JTextField inputField2;
    static JTextField inputField3;
    static JTextField inputField4;


    public RPGCharacterGUI(){

        frame = new JFrame("RPG Character");
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        JLabel inputLabel1 = new JLabel("What is the characters strength?");
        JLabel inputLabel2 = new JLabel("What is the characters speed?");
        JLabel inputLabel3 = new JLabel("What is the characters intelligence?");
        JLabel inputLabel4 = new JLabel("What is your characters dumbness?");

        inputField1 = new JTextField(10);
        inputField2 = new JTextField(10);
        inputField3 = new JTextField(10);
        inputField4 = new JTextField(10);

        JButton calculateDamage = new JButton("Click to calculate how much damage your character does.");
        calculateDamage.addActionListener((new RPGCharacterGUI.ButtonListenerDamage()));


        JPanel panel = new RPGCharacterPanel();

        frame.add(panel);
        panel.add((inputLabel1));
        panel.add(inputField1);

        panel.add(inputLabel2);
        panel.add(inputField2);

        panel.add(inputLabel3);
        panel.add(inputField3);

        panel.add(inputLabel4);
        panel.add(inputField4);


        panel.add(calculateDamage);

        frame.setVisible(true);

    }



    private class RPGCharacterPanel extends JPanel{

        public RPGCharacterPanel(){

            setBackground(Color.yellow);
        }
    }

    private static class ButtonListenerDamage implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double number1 = Double.parseDouble(inputField1.getText());
            double number2 = Double.parseDouble(inputField2.getText());
            double number3 = Double.parseDouble(inputField3.getText());
            double number4 = Double.parseDouble(inputField4.getText());

            double damage = (number1 + number2 + number3) / number4;

            JOptionPane.showMessageDialog(null, "Your Character Can Deal " + damage + " Points Of Damage.");

        }
    }
}
