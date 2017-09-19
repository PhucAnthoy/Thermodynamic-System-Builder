package Block;

/**
 * This is the enumeration of all possible functional blocks.
 */
// Enumeration is great when you are listing something, it's quick, easy, and it allows the user
// to look at all possible types.
public enum ComponentType {
  PIPE, TURBINE,COMPRESSER, PUMP, NOZZLE, DEFUSER, BOILER, CONDENSER, HEAT_EXCHANGER;

  /**
   * Returns the property of the type being called.
   * @return the property of the type
   */
  // This piece of code is incomplete, we will return to this later to fill in the blanks.
  public BlockProp getProperty() {
    // this switch statement is basically saying: when I am called, I will check
    // myself (hence "this"), if I am PIPE, then return..., if I am PUMP, then return...
    switch (this) {
      case PIPE: return new BlockProp();
      case PUMP: return new BlockProp();
      // and so on..,
      // the line below (default) would only be reached when none of the cases matches
      default: throw new IllegalArgumentException("Such block does not have a property!");
    }
  }

}
