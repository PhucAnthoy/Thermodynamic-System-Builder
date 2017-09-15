import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

class Block extends JLabel {
    String type;
    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    boolean flag = false;
    public void set() {
        this.flag = true;
    }
    public void reset() {
        this.flag = false;
    }
    public boolean check() {
        return flag;
    }

    State input = new State();
    State output = new State();

    int gridX;
    int gridY;
    public int getGridX() {
        return gridX;
    }
    public void setGridX(int gridX){
        this.gridX = gridX;
    }
    public int getGridY() {
        return gridY;
    }
    public void setGridY(int gridY) {
        this.gridY = gridY;
    }

    boolean[][][] blockAccess = new boolean[3][3][4];
    public void giveBlockAccess(int row, int column, int face) {
        blockAccess[--row][--column][--face] = true;
    }
    public boolean checkBlockAccess(int row, int column, int face) {
        return blockAccess[--row][--column][--face];
    }
    public void resetBlockAccess() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    blockAccess[i][j][k] = false;
                }
            }
        }
    }
    public boolean[][][] getBlockAccess() {
        return blockAccess;
    }
    public void setBlockAccess(boolean[][][] x) {
        blockAccess = x;
    }
    public void printAccess() {
        String blockAccessStates = "Block Access:\n";
        int X = 0;
        int Y = 0;
        int Z = 0;
        for (boolean[][] x: this.getBlockAccess()) {
            X++;
            for (boolean[] y: x) {
                blockAccessStates += "Row " + X + ": Col " + ++Y + ": ";
                for (boolean z: y) {
                    //System.out.println(z);
                    blockAccessStates += "Face " + ++Z + ": " + z + ", ";
                    if (z) {
                        blockAccessStates += " ";
                    }
                }
                Z = 0;
                blockAccessStates += "\n";
            }
            Y = 0;
        }
        X = 0;
        System.out.println(blockAccessStates);
    }

}

public class System_Builder {

    private JFrame systemBuilder;
    private JFrame viewer;

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

        viewer = new JFrame();
        viewer.setBounds(100,100,250,250);
        viewer.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        /**
         * Main window frames and panels
         */
        JLayeredPane systemBuilderPanel = new JLayeredPane();
        systemBuilder.getContentPane().add(systemBuilderPanel, BorderLayout.CENTER);
        systemBuilderPanel.setLayout(null);

        JLayeredPane viewerPane = new JLayeredPane();
        viewer.getContentPane().add(viewerPane, BorderLayout.CENTER);
        viewerPane.setLayout(null);

        int firstColX = 32;

        //Initializes icon that will be moved around
        Block temp = new Block();
        ImageIcon testCross = new ImageIcon("src/Tiles/testCross.png");
        ImageIcon horizontalPipe = new ImageIcon("src/Tiles/horizontalPipe.png");
        ImageIcon turbine = new ImageIcon("src/Tiles/turbine.png");
        ImageIcon state1 = new ImageIcon("src/Tiles/state1.png");

        /**
         * Initializes all the elements used in a thermodynamic system
         */
        JLabel testLbl = new JLabel("");
        testLbl.setIcon(testCross);
        testLbl.setBounds(firstColX, 144, 32, 32);
        systemBuilderPanel.add(testLbl, new Integer(0));

        JLabel testLbl2 = new JLabel("");
        testLbl2.setIcon(new ImageIcon(System_Builder.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
        testLbl2.setBounds(firstColX, 176, 16, 16);
        systemBuilderPanel.add(testLbl2, new Integer(0));

        JLabel horizontalPipeBlock = new JLabel();
        horizontalPipeBlock.setIcon(horizontalPipe);
        horizontalPipeBlock.setBounds(firstColX,192,32,32);
        systemBuilderPanel.add(horizontalPipeBlock, new Integer(0));

        JLabel turbineBlock = new JLabel();
        turbineBlock.setIcon(turbine);
        turbineBlock.setBounds(firstColX,224,64,96);
        systemBuilderPanel.add(turbineBlock, new Integer(0));

        JLabel state1Block = new JLabel();
        state1Block.setIcon(state1);
        state1Block.setBounds(firstColX, 320, 32, 32);
        systemBuilderPanel.add(state1Block, new Integer(0));

        /**
         * Initializes the area for element placement/system building
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
                Boolean isInsideBox = ((e.getX() >= systemContainer.getX() + 2) && (e.getX() <= systemContainer.getX() + systemContainer.getWidth() - 2) && (e.getY() >= systemContainer.getY() + 2) && (e.getY() <= systemContainer.getY() + systemContainer.getHeight() - 2));
                if(e.getComponent().getComponentAt(e.getPoint()).equals(temp) && isInsideBox) {
                    Block perm = new Block();
                    perm.setIcon(temp.getIcon());
                    perm.setBounds(e.getX() - e.getX() % 32, e.getY() - e.getY() % 32, temp.getWidth(), temp.getHeight());
                    perm.setBlockAccess(temp.getBlockAccess());
                    perm.setType(temp.getType());
                    perm.setGridX((e.getX() - 193) % 32);
                    perm.setGridY((e.getY() - 33) % 32);
                    systemBuilderPanel.add(perm, 0, 0);
                    systemBuilderPanel.repaint(perm.getBounds());
                    perm.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            //viewer.setVisible(true);
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
                            //perm.printAccess();
                            //System.out.println(perm.getType());
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
                     * Assigns element type and attributes
                     */
                    temp.resetBlockAccess();
                    if (e.getY() >= testLbl.getY() && e.getY() <= testLbl.getY() + testLbl.getHeight() - 1) {
                        temp.setIcon(testCross);
                        temp.setType("testCross");
                    } else if (e.getY() >= testLbl2.getY() && e.getY() <= testLbl2.getY() + testLbl2.getHeight() - 1) {
                        temp.setIcon(new ImageIcon(System_Builder.class.getResource("/javax/swing/plaf/basic/icons/JavaCup16.png")));
                        temp.setType("JavaIcon");
                    } else if (e.getY() >= horizontalPipeBlock.getY() && e.getY() <= horizontalPipeBlock.getY() + horizontalPipeBlock.getHeight() - 1) {
                        temp.setIcon(horizontalPipe);
                        temp.setType("Pipe");
                        temp.giveBlockAccess(1,1,2);
                        temp.giveBlockAccess(1,1,4);
                    } else if (e.getY() >= turbineBlock.getY() && e.getY() <= turbineBlock.getY() + turbineBlock.getHeight() - 1) {
                        temp.setIcon(turbine);
                        temp.setType("Turbine");
                        temp.giveBlockAccess(1,1,4);
                        temp.giveBlockAccess(3,2,2);
                    } else if (e.getY() >= state1Block.getY() && e.getY() <= state1Block.getY() + state1Block.getHeight() - 1) {
                        temp.setIcon(state1);
                        temp.setType("State 1");
                        temp.giveBlockAccess(1,1,1);
                        temp.giveBlockAccess(1,1,2);
                        temp.giveBlockAccess(1,1,3);
                        temp.giveBlockAccess(1,1,4);
                    }

                    Component label = e.getComponent().getComponentAt(e.getPoint());
                    temp.setBounds(label.getBounds());
                    temp.set();
                }
                if (temp.check()) {
                    systemBuilderPanel.add(temp, new Integer(1));
                    temp.reset();
                }
                temp.setLocation(e.getX() - 8, e.getY() - 8);
            }
        });

        viewerPane.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }
        });
    }
}
