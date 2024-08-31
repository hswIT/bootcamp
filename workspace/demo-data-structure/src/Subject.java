public class Subject {
  private int score;
  private String desc;

  public Subject(int score, String desc) {
    this.score = score;
    this.desc = desc;
  }

  public void setScore(int score) {
    this.score = score;
  }

  public int getScore() {
    return this.score;
  }

  

  @Override
  public String toString() {
    return "Subject(" //
        + "score=" + this.score //
        + ", description=" + this.desc //
        + ")";
  }
}
