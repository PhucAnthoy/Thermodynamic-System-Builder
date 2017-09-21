package Model;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class SystemBuilder {

    /**
     * Declares the two frames used
     * systemBuilder is the frame used with all of the moving blocks
     * stateViewer will be used for editing state properties of a block
     */
    private JFrame systemBuilder = new JFrame();
    private JFrame stateViewer = new JFrame();
    private static final int tileSize = 32;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                SystemBuilder window = new SystemBuilder();
                window.systemBuilder.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

    }

    /**
     * Create the application.
     */
    private SystemBuilder() {
        initialize();
    }

    /**
     * Initialize the contents of the System Builder.
     */
    private void initialize() {

        /*
         * Initializes the window frames for the system builder and the state viewer
         */
        //systemBuilder = new JFrame();
        systemBuilder.setBounds(100, 100, 1000, 600);
        systemBuilder.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //stateViewer = new JFrame();
        stateViewer.setBounds(100,100,250,250);
        stateViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        /*
         * Main panels for both systemBuilder and stateViewer
         */
        JLayeredPane systemBuilderPanel = new JLayeredPane();
        systemBuilder.getContentPane().add(systemBuilderPanel, BorderLayout.CENTER);
        JLayeredPane stateViewerPane = new JLayeredPane();
        stateViewer.getContentPane().add(stateViewerPane, BorderLayout.CENTER);

        //Just declares a Block called temp for moving around
        Block temp = new Block();

        /*
         * Initializes the icons used by the components
         */
        ImageIcon testCross = new ImageIcon("src/Tiles/testCross.png");
        ImageIcon state1 = new ImageIcon("src/Tiles/state1.png");

        //pipes
        ImageIcon horizontalPipe = new ImageIcon("src/Tiles/horizontalPipe.png");
        ImageIcon verticalPipe = new ImageIcon("src/Tiles/verticalPipe.png");
        ImageIcon topLeftPipe = new ImageIcon("src/Tiles/topLeftPipe.png");
        ImageIcon topRightPipe = new ImageIcon("src/Tiles/topRightPipe.png");
        ImageIcon bottomLeftPipe = new ImageIcon("src/Tiles/bottomLeftPipe.png");
        ImageIcon bottomRightPipe = new ImageIcon("src/Tiles/bottomRightPipe.png");

        //Just trying to make the code later much shorter
        ImageIcon[] pipes = {horizontalPipe, verticalPipe, topLeftPipe, topRightPipe, bottomLeftPipe, bottomRightPipe};

        //elements or components
        ImageIcon nozzle = new ImageIcon("src/Tiles/nozzle.png");
        ImageIcon diffuser = new ImageIcon("src/Tiles/diffuser.png");
        ImageIcon evaporator = new ImageIcon("src/Tiles/evaporator.png");
        ImageIcon condenser = new ImageIcon("src/Tiles/condenser.png");
        ImageIcon heatExchanger = new ImageIcon("src/Tiles/heatExchanger.png");
        ImageIcon turbine = new ImageIcon("src/Tiles/turbine.png");
        ImageIcon compressor = new ImageIcon("src/Tiles/compressor.png");
        ImageIcon pump = new ImageIcon("src/Tiles/pump.png");

        //Just trying to make the code later much shorter
        ImageIcon[] components = {nozzle, diffuser, evaporator, condenser, heatExchanger, turbine, compressor, pump};

        /*
         * Initializes all the components used in a thermodynamic system
         * Assigns components their icons
         * Sets the size and location of the initial components on the screen
         * Adds the JLabel onto the panel at the lowest layer
         */
        JLabel testLbl = new JLabel();
        testLbl.setIcon(testCross);
        testLbl.setBounds(32, 144, tileSize, tileSize);
        systemBuilderPanel.add(testLbl, 0);

        JLabel state1Block = new JLabel();
        state1Block.setIcon(state1);
        state1Block.setBounds(32, 320, tileSize, tileSize);
        systemBuilderPanel.add(state1Block, 0);

        int pipeStart = 112;

        for (ImageIcon icon: pipes) {
            JLabel pipe = new JLabel();
            pipe.setIcon(icon);
            pipe.setBounds(64, pipeStart += 32, tileSize, tileSize);
            systemBuilderPanel.add(pipe, 0);
        }

        int componentStart = 112;

        for (ImageIcon icon: components) {
            JLabel component = new JLabel();
            component.setIcon(icon);
            component.setBounds(96, componentStart += 32, tileSize, tileSize);
            systemBuilderPanel.add(component, 0);
        }

        /*
         * Initializes the area for component placement/system building
         */
        JPanel systemContainer = new JPanel();
        systemContainer.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        systemContainer.setBounds(190, 30, 788, 548);
        systemBuilderPanel.add(systemContainer, 0, -1);

        /*
         * 2D array to hold the properties of states at each tile on the grid
         */
        //State[][] StateGrid = new State[systemContainer.getWidth() / tileSize][systemContainer.getHeight() / tileSize];

        /*
         * Mouse listener for the main panel
         */
        systemBuilderPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                int leftBound = systemContainer.getX() + 2;
                int rightBound = systemContainer.getX() + systemContainer.getWidth() - 2;
                int topBound = systemContainer.getY() + 2;
                int bottomBound = systemContainer.getY() + systemContainer.getHeight() - 2;
                boolean isInsideBox = ((e.getX() >= leftBound) && (e.getX() <= rightBound)
                        && (e.getY() >= topBound) && (e.getY() <= bottomBound));

                /*
                 * This statement ensures that the mouse was released while dragging a temp Block over the building area
                 */
                if(e.getComponent().getComponentAt(e.getPoint()).equals(temp) && isInsideBox) {
                    Block perm = new Block();

                    /*
                     * The first line snaps the perm Block onto the grid
                     * The following lines copy data from the temp Block to the perm Block
                     */
                    perm.setBounds(e.getX() - e.getX() % tileSize, e.getY() - e.getY() % tileSize, tileSize, tileSize);
                    perm.setIcon(temp.getIcon());
                    perm.setBlockAccess(temp.getBlockAccess());
                    perm.setComponentType(temp.getComponentType());

                    /*
                     * These two lines record the position of the Block relative to the grid
                     */
                    perm.setGridX((e.getX() - 193) % tileSize);
                    perm.setGridY((e.getY() - 33) % tileSize);

                    /*
                     * The first line adds the newly made perm Block onto the panel
                     * The second line repaints the area of the perm Block,
                     * forcing the perm Block down from the drag layer to the drawing layer
                     */
                    systemBuilderPanel.add(perm, 0, 1);
                    systemBuilderPanel.repaint(perm.getBounds());

                    /*
                     * Adds a mouse listener to detect when a perm Block is pressed
                     * When it is pressed, opens a state property viewer window and currently prints connection details
                     */
                    perm.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            stateViewer.setVisible(true);

                            /*
                             * This loop goes through each edge/face of the Block
                             * and prints out the row, column, and face of a possible connection
                             */
                            int side = -1;
                            for (boolean[][] x: perm.getBlockAccess()) {
                                for (boolean[] y: x) {
                                    for (boolean z: y) {
                                        side++;
                                        if (z) {
                                            int row = side / 12;
                                            int col = (side % 12) / 4;
                                            int fac = side % 4;
                                            System.out.println(row + " " + col + " " + fac);
                                        }
                                    }
                                }
                            }
                            //These were just for testing/debugging
                            //perm.printAccess();
                            //System.out.println(perm.getComponentType());
                        }
                    });
                }

                /*
                 * The first line removes the temp Block from the system building pane
                 * The second line removes the leftovers of the temp Block from view
                 */
                systemBuilderPanel.remove(temp);
                systemBuilderPanel.repaint(temp.getBounds());
            }
        });

        /*
         * Adds the mouse motion listener to detect when the mouse is being dragged
         */
        systemBuilderPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                /*
                 * Checks if mouse is on a JLabel
                 * The if statement only runs once as a Block object will be created above the JLabel
                 */
                String mouseIsOn = e.getComponent().getComponentAt(e.getPoint()).getClass().getSimpleName();
                if (mouseIsOn.equals("JLabel")) {
                    //This line initializes the blockAccess array and also resets it for every temp Block made
                    temp.resetBlockAccess();
                    /*
                     * Assigns components their type and attributes
                     * What they represent is currently shown in the setComponentType method
                     */
                    if (e.getY() >= testLbl.getY() && e.getY() <= testLbl.getY() + testLbl.getHeight() - 1) {
                        temp.setIcon(testCross);
                        temp.setComponentType("testCross");
                    /*} else if (e.getY() >= horizontalPipeBlock.getY() && e.getY() <= horizontalPipeBlock.getY() + horizontalPipeBlock.getHeight() - 1) {
                        temp.setIcon(horizontalPipe);
                        temp.setComponentType("Pipe");
                        temp.giveBlockAccess(0,0,1);
                        temp.giveBlockAccess(0,0,3);
                    } else if (e.getY() >= turbineBlock.getY() && e.getY() <= turbineBlock.getY() + turbineBlock.getHeight() - 1) {
                        temp.setIcon(turbine);
                        temp.setComponentType("Turbine");
                        temp.giveBlockAccess(0,0,3);
                        temp.giveBlockAccess(2,1,1);*/
                    } else if (e.getY() >= state1Block.getY() && e.getY() <= state1Block.getY() + state1Block.getHeight() - 1) {
                        temp.setIcon(state1);
                        temp.setComponentType("State 1");
                        temp.giveBlockAccess(0,0,0);
                        temp.giveBlockAccess(0,0,1);
                        temp.giveBlockAccess(0,0,2);
                        temp.giveBlockAccess(0,0,3);
                    }

                    /*
                     * Copies the bounds of the JLabel component
                     */
                    temp.setBounds(e.getComponent().getComponentAt(e.getPoint()).getBounds());

                    /*
                     * Places the Block temp above the drawing layer onto a drag layer
                     */
                    systemBuilderPanel.add(temp, 1);
                }

                /*
                 * Makes the Block drag with the mouse
                 * Runs continuously until mouse is released
                 */
                temp.setLocation(e.getX() - 16, e.getY() - 16);
            }
        });
    }
}
