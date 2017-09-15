import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class System_Builder {

    /**
     * Declares the two frames used
     * systemBuilder is the frame used with all of the moving blocks
     * stateViewer will be used for editing state properties of a block
     */
    private JFrame systemBuilder;
    private JFrame stateViewer;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    System_Builder window = new System_Builder();
                    window.systemBuilder.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public System_Builder() {
        initialize();
    }

    /**
     * Initialize the contents of the System Builder.
     */
    private void initialize() {

        /**
         * Initializes the window frames for the system builder and the state viewer
         */
        systemBuilder = new JFrame();
        systemBuilder.setBounds(100, 100, 1000, 600);
        systemBuilder.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        stateViewer = new JFrame();
        stateViewer.setBounds(100,100,250,250);
        stateViewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        /**
         * Main panels for both systemBuilder and stateViewer
         */
        JLayeredPane systemBuilderPanel = new JLayeredPane();
        systemBuilder.getContentPane().add(systemBuilderPanel, BorderLayout.CENTER);
        systemBuilderPanel.setLayout(null);
        JLayeredPane stateViewerPane = new JLayeredPane();
        stateViewer.getContentPane().add(stateViewerPane, BorderLayout.CENTER);
        stateViewerPane.setLayout(null);

        //Just declares a Block called temp for moving around
        Block temp = new Block();

        /**
         * Initializes the icons used by the components
         */
        ImageIcon testCross = new ImageIcon("src/Tiles/testCross.png");
        ImageIcon horizontalPipe = new ImageIcon("src/Tiles/horizontalPipe.png");
        ImageIcon turbine = new ImageIcon("src/Tiles/turbine.png");
        ImageIcon state1 = new ImageIcon("src/Tiles/state1.png");

        /**
         * Initializes all the components used in a thermodynamic system
         * Assigns components their icons
         * Sets the size and location of the initial components on the screen
         * Adds
         */
        JLabel testLbl = new JLabel("");
        testLbl.setIcon(testCross);
        testLbl.setBounds(32, 144, 32, 32);
        systemBuilderPanel.add(testLbl, 0);

        JLabel testLbl2 = new JLabel("");
        testLbl2.setIcon(new ImageIcon(System_Builder.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
        testLbl2.setBounds(32, 176, 16, 16);
        systemBuilderPanel.add(testLbl2, 0);

        JLabel horizontalPipeBlock = new JLabel();
        horizontalPipeBlock.setIcon(horizontalPipe);
        horizontalPipeBlock.setBounds(32,192,32,32);
        systemBuilderPanel.add(horizontalPipeBlock, 0);

        JLabel turbineBlock = new JLabel();
        turbineBlock.setIcon(turbine);
        turbineBlock.setBounds(32,224,64,96);
        systemBuilderPanel.add(turbineBlock, 0);

        JLabel state1Block = new JLabel();
        state1Block.setIcon(state1);
        state1Block.setBounds(32, 320, 32, 32);
        systemBuilderPanel.add(state1Block, 0);

        /**
         * Initializes the area for component placement/system building
         */
        JPanel systemContainer = new JPanel();
        systemContainer.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
        systemContainer.setBounds(190, 30, 788, 548);
        systemBuilderPanel.add(systemContainer, 0, -1);

        State[][] StateGrid = new State[systemContainer.getWidth() / 32][systemContainer.getHeight() / 32];

        systemBuilderPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {
                int leftBound = systemContainer.getX() + 2;
                int rightBound = systemContainer.getX() + systemContainer.getWidth() - 2;
                int topBound = systemContainer.getY() + 2;
                int bottomBound = systemContainer.getY() + systemContainer.getHeight() - 2;
                boolean isInsideBox = ((e.getX() >= leftBound) && (e.getX() <= rightBound)
                        && (e.getY() >= topBound) && (e.getY() <= bottomBound));
                if(e.getComponent().getComponentAt(e.getPoint()).equals(temp) && isInsideBox) {
                    Block perm = new Block();
                    perm.setIcon(temp.getIcon());
                    perm.setBounds(e.getX() - e.getX() % 32, e.getY() - e.getY() % 32,
                            temp.getWidth(), temp.getHeight());
                    perm.setBlockAccess(temp.getBlockAccess());
                    perm.setComponentType(temp.getComponentType());
                    perm.setGridX((e.getX() - 193) % 32);
                    perm.setGridY((e.getY() - 33) % 32);
                    systemBuilderPanel.add(perm, 0, 0);
                    systemBuilderPanel.repaint(perm.getBounds());
                    perm.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            //stateViewer.setVisible(true);
                            //ViewWindow.main(new String[0]);
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
                                        //System.out.println(z);
                                    }
                                }
                            }
                            perm.printAccess();
                            //System.out.println(perm.getComponentType());
                        }
                    });
                    /*for (boolean[][] x: perm.getBlockAccess()) {
                        for (boolean[] y: x) {
                            for (boolean z: y) {
                                System.out.println(z);
                            }
                        }
                    }*/
                    //System.out.println(perm.getBlockAccess());
                    //temp.printAccess();
                }
                //temp.printAccess();
                systemBuilderPanel.remove(temp);
                systemBuilderPanel.repaint(temp.getBounds());

                //State_Input start = new State_Input();
                //System.out.println(e.getComponent());
            }
        });
        systemBuilderPanel.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                //Checks if mouse is on a JLabel
                String mouseLocation = e.getComponent().getComponentAt(e.getPoint()).getClass().getSimpleName();
                if (mouseLocation.equals("JLabel")) {
                    /**
                     * Assigns components their type and attributes
                     */
                    temp.resetBlockAccess();
                    if (e.getY() >= testLbl.getY() && e.getY() <= testLbl.getY() + testLbl.getHeight() - 1) {
                        temp.setIcon(testCross);
                        temp.setComponentType("testCross");
                    } else if (e.getY() >= testLbl2.getY() && e.getY() <= testLbl2.getY() + testLbl2.getHeight() - 1) {
                        temp.setIcon(new ImageIcon(System_Builder.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
                        temp.setComponentType("JavaIcon");
                    } else if (e.getY() >= horizontalPipeBlock.getY() && e.getY() <= horizontalPipeBlock.getY() + horizontalPipeBlock.getHeight() - 1) {
                        temp.setIcon(horizontalPipe);
                        temp.setComponentType("Pipe");
                        temp.giveBlockAccess(0,0,1);
                        temp.giveBlockAccess(0,0,3);
                    } else if (e.getY() >= turbineBlock.getY() && e.getY() <= turbineBlock.getY() + turbineBlock.getHeight() - 1) {
                        temp.setIcon(turbine);
                        temp.setComponentType("Turbine");
                        temp.giveBlockAccess(0,0,3);
                        temp.giveBlockAccess(2,1,1);
                    } else if (e.getY() >= state1Block.getY() && e.getY() <= state1Block.getY() + state1Block.getHeight() - 1) {
                        temp.setIcon(state1);
                        temp.setComponentType("State 1");
                        temp.giveBlockAccess(0,0,0);
                        temp.giveBlockAccess(0,0,1);
                        temp.giveBlockAccess(0,0,2);
                        temp.giveBlockAccess(0,0,3);
                    }

                    Component label = e.getComponent().getComponentAt(e.getPoint());
                    temp.setBounds(label.getBounds());
                    systemBuilderPanel.add(temp, 1);
                    //temp.set();
                }
                /*if (temp.check()) {

                    temp.reset();
                }*/
                temp.setLocation(e.getX() - 8, e.getY() - 8);
            }
        });

        stateViewerPane.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });
    }
}
