import Block.ComponentType;
/**
 * This class represents the frame that would be used to put the blocks in.
 */
public class Frame {

  int column;
  int row;
  Block[][] grid;

  /**
   * This constructor allows the user to construct a grid based on the dimension given.
   * @param column the number of columns the grid will have
   * @param row the number of rows the grid will have
   */
  Frame(int column, int row) {
    this.column = column;
    this.row = row;
    this.grid = new Block[column][row];
  }

  /**
   * This allows the user to put a block at a certain position in the grid
   * @param type the type of block to be placed at the position
   * @param columnNum the number of the column in which the block will be placed, starts from 0.
   * @param rowNum the number of the row in which the block will be placed, starts from 0.
   */
  void setBlock(ComponentType type, int columnNum, int rowNum) {
    if (columnNum >= this.column || rowNum >= this.row) {
      throw new IllegalArgumentException("Invalid frame position! Please try again.");
    }
    // This makes a block at the give position, see class Block to see how the method
    // makeBlock works.
    // this.grid[columnNum][rowNum] = makeBlock(type);

  }

}
