import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.JEditorPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;
import javax.swing.JTextField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFormattedTextField;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.beans.PropertyChangeEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseMotionAdapter;

/**
 * Please note that this class is currently unused and needs to be rebuilt
 */
public class State_Input {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    State_Input window = new State_Input();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public State_Input() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);




        JPanel panel = new JPanel();
        panel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println("(" + e.getX() + "," + e.getY() + ")" + " detected on " + e.getComponent().getClass().getName());

            }
        });
        panel.setBounds(0, 0, 700, 478);
        frame.getContentPane().add(panel);
        panel.setLayout(null);


        JTextField txtpnOkay = new JTextField();
        txtpnOkay.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                System.out.println(txtpnOkay.getText());
                Double yer = Double.parseDouble(txtpnOkay.getText());
                System.out.println(yer);
            }
        });
        txtpnOkay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(txtpnOkay.getText());
            }
        });
        txtpnOkay.setText("okay");
        txtpnOkay.setBounds(114, 35, 53, 16);
        panel.add(txtpnOkay);

        JLabel lblElement = new JLabel("Element");
        lblElement.setFont(new Font("Times", Font.PLAIN, 16));
        lblElement.setHorizontalAlignment(SwingConstants.CENTER);
        lblElement.setBounds(320, 25, 60, 16);
        panel.add(lblElement);

        JEditorPane dtrpnPipe = new JEditorPane();
        dtrpnPipe.setEditable(false);
        dtrpnPipe.setFont(new Font("Times", Font.PLAIN, 16));
        dtrpnPipe.setBounds(275, 50, 150, 75);
        panel.add(dtrpnPipe);

        JButton btnYes = new JButton("yes");
        btnYes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(e.toString());
                txtpnOkay.setText(null);
            }
        });

        btnYes.setBounds(6, 6, 75, 29);
        panel.add(btnYes);

        JPanel panel_1 = new JPanel();
        panel_1.setBounds(12, 100, 250, 325);
        panel.add(panel_1);
        panel_1.setLayout(null);

        JLabel lblState = new JLabel("State 1");
        lblState.setBounds(95, 25, 60, 16);
        panel_1.add(lblState);
        lblState.setHorizontalAlignment(SwingConstants.CENTER);
        lblState.setFont(new Font("Times", Font.PLAIN, 16));

        JTextField txt1 = new JTextField();
        txt1.setBounds(125, 50, 120, 20);
        panel_1.add(txt1);
        txt1.setFont(new Font("Times", Font.PLAIN, 16));
        txt1.setHorizontalAlignment(SwingConstants.CENTER);
        txt1.setColumns(10);

        JTextField txt2 = new JTextField();
        txt2.setBounds(125, 75, 120, 20);
        panel_1.add(txt2);
        txt2.setFont(new Font("Times", Font.PLAIN, 16));
        txt2.setHorizontalAlignment(SwingConstants.CENTER);
        txt2.setColumns(10);

        JTextField txt3 = new JTextField();
        txt3.setBounds(125, 100, 120, 20);
        panel_1.add(txt3);
        txt3.setFont(new Font("Times", Font.PLAIN, 16));
        txt3.setHorizontalAlignment(SwingConstants.CENTER);
        txt3.setColumns(10);

        JTextField txt4 = new JTextField();
        txt4.setBounds(125, 125, 120, 20);
        panel_1.add(txt4);
        txt4.setFont(new Font("Times", Font.PLAIN, 16));
        txt4.setHorizontalAlignment(SwingConstants.CENTER);
        txt4.setColumns(10);

        JTextField txt5 = new JTextField();
        txt5.setBounds(125, 150, 120, 20);
        panel_1.add(txt5);
        txt5.setFont(new Font("Times", Font.PLAIN, 16));
        txt5.setHorizontalAlignment(SwingConstants.CENTER);
        txt5.setColumns(10);

        JTextField txt6 = new JTextField();
        txt6.setBounds(125, 175, 120, 20);
        panel_1.add(txt6);
        txt6.setFont(new Font("Times", Font.PLAIN, 16));
        txt6.setHorizontalAlignment(SwingConstants.CENTER);
        txt6.setColumns(10);

        JTextField txt7 = new JTextField();
        txt7.setBounds(125, 200, 120, 20);
        panel_1.add(txt7);
        txt7.setFont(new Font("Times", Font.PLAIN, 16));
        txt7.setHorizontalAlignment(SwingConstants.CENTER);
        txt7.setColumns(10);

        JTextField txt8 = new JTextField();
        txt8.setEditable(false);
        txt8.setBounds(125, 225, 120, 20);
        panel_1.add(txt8);
        txt8.setFont(new Font("Times", Font.PLAIN, 16));
        txt8.setHorizontalAlignment(SwingConstants.CENTER);
        txt8.setColumns(10);

        JTextField txt9 = new JTextField();
        txt9.setBounds(125, 250, 120, 20);
        panel_1.add(txt9);
        txt9.setFont(new Font("Times", Font.PLAIN, 16));
        txt9.setHorizontalAlignment(SwingConstants.CENTER);
        txt9.setColumns(10);

        JTextField txt10 = new JTextField();
        txt10.setBounds(125, 275, 120, 20);
        panel_1.add(txt10);
        txt10.setFont(new Font("Times", Font.PLAIN, 16));
        txt10.setHorizontalAlignment(SwingConstants.CENTER);
        txt10.setColumns(10);

        JTextField txt11 = new JTextField();
        txt11.setBounds(125, 300, 120, 20);
        panel_1.add(txt11);
        txt11.setFont(new Font("Times", Font.PLAIN, 16));
        txt11.setHorizontalAlignment(SwingConstants.CENTER);
        txt11.setColumns(10);

        JLabel lbl1 = new JLabel("Temperature:");
        lbl1.setFont(new Font("Times", Font.PLAIN, 16));
        lbl1.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl1.setBounds(5, 51, 115, 20);
        panel_1.add(lbl1);

        JLabel lbl2 = new JLabel("Pressure:");
        lbl2.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl2.setFont(new Font("Times", Font.PLAIN, 16));
        lbl2.setBounds(5, 76, 115, 20);
        panel_1.add(lbl2);

        JLabel lbl3 = new JLabel("Specific Volume:");
        lbl3.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl3.setFont(new Font("Times", Font.PLAIN, 16));
        lbl3.setBounds(0, 101, 120, 20);
        panel_1.add(lbl3);

        JLabel lbl4 = new JLabel("Mass Flow:");
        lbl4.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl4.setFont(new Font("Times", Font.PLAIN, 16));
        lbl4.setBounds(5, 126, 115, 20);
        panel_1.add(lbl4);

        JLabel lbl5 = new JLabel("Internal Energy:");
        lbl5.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl5.setFont(new Font("Times", Font.PLAIN, 16));
        lbl5.setBounds(0, 151, 120, 20);
        panel_1.add(lbl5);

        JLabel lbl6 = new JLabel("Enthalpy:");
        lbl6.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl6.setFont(new Font("Times", Font.PLAIN, 16));
        lbl6.setBounds(5, 176, 115, 20);
        panel_1.add(lbl6);

        JLabel lbl7 = new JLabel("Entropy:");
        lbl7.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl7.setFont(new Font("Times", Font.PLAIN, 16));
        lbl7.setBounds(5, 201, 115, 20);
        panel_1.add(lbl7);

        JLabel lbl8 = new JLabel("Entropy Naught:");
        lbl8.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl8.setFont(new Font("Times", Font.PLAIN, 16));
        lbl8.setBounds(5, 226, 115, 20);
        panel_1.add(lbl8);

        JLabel lbl9 = new JLabel("Exergy:");
        lbl9.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl9.setFont(new Font("Times", Font.PLAIN, 16));
        lbl9.setBounds(5, 251, 115, 20);
        panel_1.add(lbl9);

        JLabel lbl10 = new JLabel("Humidity Ratio:");
        lbl10.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl10.setFont(new Font("Times", Font.PLAIN, 16));
        lbl10.setBounds(5, 276, 115, 20);
        panel_1.add(lbl10);

        JLabel lbl11 = new JLabel("Relative Humidity:");
        lbl11.setHorizontalAlignment(SwingConstants.RIGHT);
        lbl11.setFont(new Font("Times", Font.PLAIN, 16));
        lbl11.setBounds(0, 301, 120, 20);
        panel_1.add(lbl11);

        JPanel panel_2 = new JPanel();
        panel_2.setLayout(null);
        panel_2.setBounds(438, 100, 250, 325);
        panel.add(panel_2);

        JLabel lblState_1 = new JLabel("State 2");
        lblState_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblState_1.setFont(new Font("Times", Font.PLAIN, 16));
        lblState_1.setBounds(95, 25, 60, 16);
        panel_2.add(lblState_1);

        JTextField textField = new JTextField();
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setFont(new Font("Times", Font.PLAIN, 16));
        textField.setColumns(10);
        textField.setBounds(125, 50, 120, 20);
        panel_2.add(textField);

        JTextField textField_1 = new JTextField();
        textField_1.setHorizontalAlignment(SwingConstants.CENTER);
        textField_1.setFont(new Font("Times", Font.PLAIN, 16));
        textField_1.setColumns(10);
        textField_1.setBounds(125, 75, 120, 20);
        panel_2.add(textField_1);

        JTextField textField_2 = new JTextField();
        textField_2.setHorizontalAlignment(SwingConstants.CENTER);
        textField_2.setFont(new Font("Times", Font.PLAIN, 16));
        textField_2.setColumns(10);
        textField_2.setBounds(125, 100, 120, 20);
        panel_2.add(textField_2);

        JTextField textField_3 = new JTextField();
        textField_3.setHorizontalAlignment(SwingConstants.CENTER);
        textField_3.setFont(new Font("Times", Font.PLAIN, 16));
        textField_3.setColumns(10);
        textField_3.setBounds(125, 125, 120, 20);
        panel_2.add(textField_3);

        JTextField textField_4 = new JTextField();
        textField_4.setHorizontalAlignment(SwingConstants.CENTER);
        textField_4.setFont(new Font("Times", Font.PLAIN, 16));
        textField_4.setColumns(10);
        textField_4.setBounds(125, 150, 120, 20);
        panel_2.add(textField_4);

        JTextField textField_5 = new JTextField();
        textField_5.setHorizontalAlignment(SwingConstants.CENTER);
        textField_5.setFont(new Font("Times", Font.PLAIN, 16));
        textField_5.setColumns(10);
        textField_5.setBounds(125, 175, 120, 20);
        panel_2.add(textField_5);

        JTextField textField_6 = new JTextField();
        textField_6.setHorizontalAlignment(SwingConstants.CENTER);
        textField_6.setFont(new Font("Times", Font.PLAIN, 16));
        textField_6.setColumns(10);
        textField_6.setBounds(125, 200, 120, 20);
        panel_2.add(textField_6);

        JTextField textField_7 = new JTextField();
        textField_7.setEditable(false);
        textField_7.setHorizontalAlignment(SwingConstants.CENTER);
        textField_7.setFont(new Font("Times", Font.PLAIN, 16));
        textField_7.setColumns(10);
        textField_7.setBounds(125, 225, 120, 20);
        panel_2.add(textField_7);

        JTextField textField_8 = new JTextField();
        textField_8.setHorizontalAlignment(SwingConstants.CENTER);
        textField_8.setFont(new Font("Times", Font.PLAIN, 16));
        textField_8.setColumns(10);
        textField_8.setBounds(125, 250, 120, 20);
        panel_2.add(textField_8);

        JTextField textField_9 = new JTextField();
        textField_9.setHorizontalAlignment(SwingConstants.CENTER);
        textField_9.setFont(new Font("Times", Font.PLAIN, 16));
        textField_9.setColumns(10);
        textField_9.setBounds(125, 275, 120, 20);
        panel_2.add(textField_9);

        JTextField textField_10 = new JTextField();
        textField_10.setHorizontalAlignment(SwingConstants.CENTER);
        textField_10.setFont(new Font("Times", Font.PLAIN, 16));
        textField_10.setColumns(10);
        textField_10.setBounds(125, 300, 120, 20);
        panel_2.add(textField_10);

        JLabel label_1 = new JLabel("Temperature:");
        label_1.setHorizontalAlignment(SwingConstants.RIGHT);
        label_1.setFont(new Font("Times", Font.PLAIN, 16));
        label_1.setBounds(5, 51, 115, 20);
        panel_2.add(label_1);

        JLabel label_2 = new JLabel("Pressure:");
        label_2.setHorizontalAlignment(SwingConstants.RIGHT);
        label_2.setFont(new Font("Times", Font.PLAIN, 16));
        label_2.setBounds(5, 76, 115, 20);
        panel_2.add(label_2);

        JLabel label_3 = new JLabel("Specific Volume:");
        label_3.setHorizontalAlignment(SwingConstants.RIGHT);
        label_3.setFont(new Font("Times", Font.PLAIN, 16));
        label_3.setBounds(0, 101, 120, 20);
        panel_2.add(label_3);

        JLabel label_4 = new JLabel("Mass Flow:");
        label_4.setHorizontalAlignment(SwingConstants.RIGHT);
        label_4.setFont(new Font("Times", Font.PLAIN, 16));
        label_4.setBounds(5, 126, 115, 20);
        panel_2.add(label_4);

        JLabel label_5 = new JLabel("Internal Energy:");
        label_5.setHorizontalAlignment(SwingConstants.RIGHT);
        label_5.setFont(new Font("Times", Font.PLAIN, 16));
        label_5.setBounds(0, 151, 120, 20);
        panel_2.add(label_5);

        JLabel label_6 = new JLabel("Enthalpy:");
        label_6.setHorizontalAlignment(SwingConstants.RIGHT);
        label_6.setFont(new Font("Times", Font.PLAIN, 16));
        label_6.setBounds(5, 176, 115, 20);
        panel_2.add(label_6);

        JLabel label_7 = new JLabel("Entropy:");
        label_7.setHorizontalAlignment(SwingConstants.RIGHT);
        label_7.setFont(new Font("Times", Font.PLAIN, 16));
        label_7.setBounds(5, 201, 115, 20);
        panel_2.add(label_7);

        JLabel label_8 = new JLabel("Entropy Naught:");
        label_8.setHorizontalAlignment(SwingConstants.RIGHT);
        label_8.setFont(new Font("Times", Font.PLAIN, 16));
        label_8.setBounds(5, 226, 115, 20);
        panel_2.add(label_8);

        JLabel label_9 = new JLabel("Exergy:");
        label_9.setHorizontalAlignment(SwingConstants.RIGHT);
        label_9.setFont(new Font("Times", Font.PLAIN, 16));
        label_9.setBounds(5, 251, 115, 20);
        panel_2.add(label_9);

        JLabel label_10 = new JLabel("Humidity Ratio:");
        label_10.setHorizontalAlignment(SwingConstants.RIGHT);
        label_10.setFont(new Font("Times", Font.PLAIN, 16));
        label_10.setBounds(5, 276, 115, 20);
        panel_2.add(label_10);

        JLabel label_11 = new JLabel("Relative Humidity:");
        label_11.setHorizontalAlignment(SwingConstants.RIGHT);
        label_11.setFont(new Font("Times", Font.PLAIN, 16));
        label_11.setBounds(0, 301, 120, 20);
        panel_2.add(label_11);

        JLabel lblHeat = new JLabel("Heat Transfer:");
        lblHeat.setHorizontalAlignment(SwingConstants.CENTER);
        lblHeat.setBounds(275, 150, 150, 20);
        panel.add(lblHeat);

        JTextField txtHeat = new JTextField();
        txtHeat.setHorizontalAlignment(SwingConstants.CENTER);
        txtHeat.setBounds(285, 175, 130, 20);
        panel.add(txtHeat);
        txtHeat.setColumns(10);

        JLabel lblWork = new JLabel("Work:");
        lblWork.setHorizontalAlignment(SwingConstants.CENTER);
        lblWork.setBounds(275, 225, 150, 20);
        panel.add(lblWork);

        JTextField txtWork = new JTextField();
        txtWork.setHorizontalAlignment(SwingConstants.CENTER);
        txtWork.setBounds(285, 250, 130, 20);
        panel.add(txtWork);
        txtWork.setColumns(10);

        JLabel lblEntropy = new JLabel("Entropy Production:");
        lblEntropy.setHorizontalAlignment(SwingConstants.CENTER);
        lblEntropy.setBounds(275, 300, 150, 20);
        panel.add(lblEntropy);

        JTextField txtEntropy = new JTextField();
        txtEntropy.setHorizontalAlignment(SwingConstants.CENTER);
        txtEntropy.setBounds(285, 325, 130, 20);
        panel.add(txtEntropy);
        txtEntropy.setColumns(10);

        JTextField[] fields_1 = {txt1, txt2, txt3, txt4, txt5, txt6, txt7, txt8, txt9, txt10, txt11};
        JTextField[] fields_2 = {textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7, textField_8, textField_9, textField_10};
        double state_1[] = new double[11];
        double state_2[] = new double[11];

        JButton btnCalculate = new JButton("Calculate");
        btnCalculate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //System.out.println((fields_1[1].getText().isEmpty()));
                for(int i = 0; i < 11; i++) {
                    if (!fields_1[i].getText().isEmpty()) {
                        state_1[i] = Double.parseDouble(fields_1[i].getText());
                        System.out.println(state_1[i]);
                    }
                    if (!fields_2[i].getText().isEmpty()) {
                        state_2[i] = Double.parseDouble(fields_2[i].getText());
                        System.out.println(state_2[i]);
                    }
                }
            }
        });
        btnCalculate.setBounds(291, 421, 118, 29);
        panel.add(btnCalculate);


    }
}
