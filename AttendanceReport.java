public class AttendanceReport extends Report{
    private int attendedLessons;
    private int overallLessons;
    public AttendanceReport(Formatter formatter,  int attendedLessons, int overallLessons, String title){
        super(formatter, title, null);
        this.attendedLessons = attendedLessons;
        this.overallLessons = overallLessons;
    }
    public int calculateAttendance(){
        if(overallLessons == 0){ 
            return 0;
        }
        return (attendedLessons*100)/overallLessons;
    }
    @Override 
    public String execute(){
        setText(attendedLessons + " of " + overallLessons + " was taken, which is " + calculateAttendance() + "%");
        return getFormatter().format(getTitle(), getText());
    }
}
