import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calc extends JFrame {
    private JTextField textField1;
    private JTextField textField2;
    private JButton fshijButton;
    private JButton mbledhButton;
    private JButton daljeButton;
    private JTextField textField3;
    public Calc() {
        daljeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fshijButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
            }
        });
        mbledhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                float nr1, nr2, shuma;
                //inputin text e konvertojme ne nr Float
                nr1 = Float.parseFloat(textField1.getText());
                nr2 = Float.parseFloat(textField2.getText());
                //llogarisim shumen
                shuma = nr1+nr2;
                //shuma vendoset si tekst tek hapsira 3
                textField3.setText(String.valueOf(shuma));

            }
        });
    }
}
