import javax.swing.*;
import java.util.Arrays;

/**
 * This class gives JLabel more variables and methods to take location and linkages of elements
 * Blocks are composed to 32x32 px tiles which can be seen in the Tiles folder
 */
class Block extends JLabel {
    /**
     * Just what type of component the block represents
     */
    String componentType;

    /**
     * Records the properties of the state at the input and at the output
     * Not sure if this will be used yet
     */
    State input = new State();
    State output = new State();

    /**
     * These two track the position of the topleft-most 32x32 tile relative to the system building space,
     * i.e. position in the box
     */
    int gridX;
    int gridY;

    /**
     * Tracks which edges of component blocks have connections
     *
     * First index is row
     * Second index is column
     * Third index is face. 0 = North, 1 = East, 2 = South, 3 = West
     *
     * True when pipes can connect to this edge
     * False when nothing can connect to this edge
     *
     * Due to component blocks having various sizes,
     * this array tracks the edge of every 32x32 tile including inside edges
     */
    boolean[][][] blockAccess = new boolean[3][3][4];

    /**
     * Names which component the block represents
     *
     * @param componentType literally type of component
     */
    public void setComponentType(String componentType) {
        this.componentType = componentType;
    }
    public String getComponentType() {
        return componentType;
    }

    /**
     * Returns and records the location of block upon the grid
     */
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

    /**
     * The first method sets an item in blockAccess to true when a connection is available on that edge/face
     * The second returns the boolean of the selected edge
     * The third resets blockAccess to be entirely false
     *
     * @param row       Row that tile belongs to
     * @param column    Column that tile belongs to
     * @param face      Face of the tile, 0 for north, 1 for east, etc
     */
    public void giveBlockAccess(int row, int column, int face) {
        blockAccess[row][column][face] = true;
    }
    public boolean checkBlockAccess(int row, int column, int face) {
        return blockAccess[row][column][face];
    }
    public void resetBlockAccess() {
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 4; k++) {
                    blockAccess[i][j][k] = false;
                }
            }
        }*/
        Arrays.fill(blockAccess, false);
    }

    /**
     * These two methods are used to transfer the blockAccess array from one object to another
     *
     * @return the entire blockAccess array
     */
    public boolean[][][] getBlockAccess() {
        return blockAccess;
    }
    public void setBlockAccess(boolean[][][] x) {
        blockAccess = x;
    }

    /**
     * This method was only used for debugging purposes
     * It prints out every boolean in the blockAccess array
     */
    public void printAccess() {
        //This is the string that will be printed to the console
        String blockAccessStates = "Block Access:\n";

        /**
         * This for loop appends the row, column, and face numbers and also the boolean to the string and prints it
         */
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                blockAccessStates += "Row " + i + ": Col " + j + ": ";
                for (int k = 0; k < 4; k++) {
                    blockAccessStates += "Face " + k + ": " + blockAccess[i][j][k] + ", ";
                    if (blockAccess[i][j][k]) {
                        blockAccessStates += " ";
                    }
                }
                blockAccessStates += "\n";
            }
        }
        System.out.println(blockAccessStates);
    }

}
