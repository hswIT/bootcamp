

public class Schedule {

  private String subject;
  private String day;
  private String time;

  public Schedule(String subject, String day, String time) {
    this.subject = subject;
    this.day = day;
    this.time = time;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getSubject(){
    return this.subject;
  }

  public void setDay(String day) {
    this.day = day;
  }

  public String getDay(){
    return this.day;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public String getTime(){
    return this.time;
  }

  public String checkTodayEvent(String day) {
    return this.subject;
  }

  public String checkTodayTime(String day){
    if (day.equals(this.day)) {
      return this.day + " has " + this.subject + " class at " + this.time;
    } 
    return "no event";
  }

  public static void main(String[] args) {
    
    Schedule schedule1 = new Schedule("Math", "Monday", "10:00");
    System.out.println(schedule1.checkTodayTime("Monday"));
    System.out.println(schedule1.getDay() + " has " + schedule1.checkTodayEvent("Math"));

    schedule1.setSubject("English");
    System.out.println(schedule1.checkTodayTime("Monday"));
    
  }
}
