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
  ComponentType type;
  BlockProp prop;

  /**
   * Construct an instance of a block, values can be null (indicating a lack of block)
   * @param top The block on top of the current block
   * @param right The block on the right side of the current block
   * @param bottom The block at the bottom of the current block
   * @param left The block at the left of the current block
   * @param type Indicates the component type of this block
   * @param prop The properties of the current block
   */
  // This constructor is private because you don't want the user to directly make a block using
  // its actual constructor because it leaks information about how the block works internally. A
  // better way for the user to construct a block is provided at the bottom of this piece of code.
  // (the reason behind why leaking this information could be bad is a bit complicated, but it
  // could be summarized as: The user (people who work on this piece of code) )doesn't need the
  // other information to make a block, and you don't want to people to make weird blocks (so you
  // have full control over the parameters of the blocks) For more information about this design
  // choice, read on Principle of Least Knowledge https://en.wikipedia.org/wiki/Law_of_Demeter
  private Block(Block top, Block right, Block bottom, Block left, ComponentType type, BlockProp prop) {
    this.top = top;
    this.right = right;
    this.bottom = bottom;
    this.left = left;
    this.type = type;
    this.prop = prop;
  }

  /**
   * This connects two blocks by changing their fields so they know about each other
   * @param direction the direction of the to-be-connected block in relation to the current block.
   * @param that the block to be connected withe current block.
   */
  void connect(Direction direction, Block that) {

  }

  // This piece of code does not work right now but it is necessary.
  // When making a block the user only need to know what type of block they are making and this is
  // ideal because it require no parameters other than that. The user also doesn't need to give
  // the block property when making a block because they are different but have default values.
  // However, since I don't know what block is suppose to have what property as default I am
  // going leave it as it is right now.
  /**
  public static Block makeBlock(ComponentType type) {
    return new Block(null,null,null,null,type,type.getProperty);
  }
   **/


}
