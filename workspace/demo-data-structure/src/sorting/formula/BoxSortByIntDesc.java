package sorting.formula;


import sorting.Box;

public class BoxSortByIntDesc implements BoxSort{
  @Override
  public int compare(Box b1, Box b2) {
    // b1 (-1), b2 (1)
    return b2.getValue() > b1.getValue() ? 1 : -1;
  }
}
