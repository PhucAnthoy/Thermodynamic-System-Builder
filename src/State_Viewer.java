import javax.swing.*;
import java.awt.*;

/**
 * Currently obsolete
 */
public class State_Viewer {
    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    State_Viewer window = new State_Viewer();
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
    public State_Viewer() {
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

        JPanel mainPanel = new JPanel();
        frame.getContentPane().add(mainPanel, BorderLayout.CENTER);
        mainPanel.setLayout(null);

        
    }
}
