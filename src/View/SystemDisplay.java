package View;

import javax.swing.*;
import java.awt.*;

/**
 * Sectioned off part of SystemBuilder.java when switching to MVC model
 *
 * @author Anthony Tran
 * @since 2017-09-16
 */
public class SystemDisplay {
    /**
     * Declaration of the windows to be used
     */
    private static JFrame programWindow = new JFrame();
    private static JFrame propertyWindow = new JFrame();

    /**
     * This is the class constructor
     */
    public SystemDisplay() {
        initialize();
    }

    /**
     * This is the method that runs everything
     */
    private void initialize() {
        /**
         * Panel upon which all other components will be placed
         */
        JLayeredPane programWindowPanel = new JLayeredPane();

        /**
         * Panel for all of the state property related things
         */
        JLayeredPane propertyWindowPanel = new JLayeredPane();

        /**
         * Just a border for the system building area
         */
        JPanel systemBuildingArea;

        /**
         *
         */
        JLabel components;
        Model.Block temp;

        /**
         * Initializes the icons used by the components
         */
        ImageIcon testCrossImage = new ImageIcon("src/Tiles/testCross.png");
        ImageIcon horizontalPipeImage = new ImageIcon("src/Tiles/horizontalPipe.png");
        ImageIcon turbineImage = new ImageIcon("src/Tiles/turbine.png");
        ImageIcon state1Image = new ImageIcon("src/Tiles/state1.png");

        /**
         *
         */
        programWindow.setBounds(0,0,1000,600);
        programWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /**
         *
         */
        propertyWindow.setBounds(0,0,250,250);
        propertyWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        /**
         * I hope this is self-explanatory
         */
        programWindow.add(programWindowPanel, BorderLayout.CENTER);
        propertyWindow.add(propertyWindowPanel, BorderLayout.CENTER);

        /**
         *
         */

    }

    public static void turnOnInputWindow(Model.Block block) {
        if (propertyWindow.isShowing()) {
            return;
        } else {
            propertyWindow.setVisible(true);
        }
        //get property values from block object
    }

    public static void addToProgramWindow(java.awt.Component component, int layer, int priority) {
        programWindow.add(component, layer, priority);
    }
}
