package Block;

/**
 * This class represents blocks that can be put in the grid, the blocks have different types
 * with different types having different properties. A block can also be connected in four ways
 * top, right, bottom, left.
 */
public class Block {

  Block top;
  Block right;
  Block bottom;
  Block left;
  BlockProp prop;

  /**
   * Construct an instance of a block, values can be null (indicating a lack of block)
   * @param top The block on top of the current block
   * @param right The block on the right side of the current block
   * @param bottom The block at the bottom of the current block
   * @param left The block at the left of the current block
   * @param prop The properties of the current blcok
   */
  Block(Block top, Block right, Block bottom, Block left, BlockProp prop) {
    this.top = top;
    this.right = right;
    this.bottom = bottom;
    this.left = left;
    this.prop = prop;
  }

  

}
