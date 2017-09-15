import javax.swing.*;

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
