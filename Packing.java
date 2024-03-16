/**
 * Class used for packing a 2D suitcase with items using various strategies.
 */
public class Packing {
  /**
   * Tries to pack each item in the items list in-order.
   * If an item can fit, it must be packed. Otherwise, it should be skipped.
   * Must be a recursive method.
   *
   * @param suitcase current Suitcase object
   * @return a Suitcase representing the outcome of a strategy in which the items
   * were attempted to be packed in-order.
   */
  public static Suitcase rushedPacking(Suitcase suitcase) {
    // TODO: Implement this method recursively
    // TODO: Add inline comments to explain your algorithm and recursive thinking
    return null; // default return value
  }

  /**
   * Packs items by greedily packing the largest item which can currently be packed.
   * Must be a recursive method.
   *
   * @param suitcase current Suitcase object
   * @return a Suitcase representing the outcome of a greedy strategy in which at each
   * point the largest item that can fit is packed.
   */
  public static Suitcase greedyPacking(Suitcase suitcase) {
    // TODO: Implement this method recursively
    // TODO: Add inline comments to explain your algorithm and recursive thinking
    return null; // default return value
  }

  /**
   * Finds the optimal packing of items by trying all packing orders.
   * Must be a recursive method.
   *
   * @param suitcase current Suitcase
   * @return a Suitcase representing the optimal outcome.
   */
  public static Suitcase optimalPacking(Suitcase suitcase) {
    // TODO: Implement this method recursively
    // TODO: Add inline comments to explain your algorithm and recursive thinking
    return null; // default return value
  }
}
