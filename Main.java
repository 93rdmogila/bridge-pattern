public class Main {
    public static void main(String[] args) {
        Report attendanceReport = new AttendanceReport(new HtmlFormatter(), 3, 5, "Attendance");
        System.out.println(attendanceReport.execute());
        attendanceReport.setImplementation(new TextFormatter());
        System.out.println(attendanceReport.execute());
        attendanceReport.setImplementation(new MarkDownFormatter());
        System.out.println(attendanceReport.execute());
        
        Report gradeReport = new GradeReport(new HtmlFormatter(), new int[]{3, 4, 5, 2, 5, 3}, "Average grade");
    }
    

}
