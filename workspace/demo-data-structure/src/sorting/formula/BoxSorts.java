package sorting.formula;

public class BoxSorts { // with "s" means that this class only consists of static methods
  private BoxSorts() {} // no intend to be instantiated

  // return interface type
  public static BoxSort ofAsc() {
    return new BoxSortByIntAsc();
  }

  public static BoxSort ofDesc() {
    return new BoxSortByIntDesc();
  }
}
