public class GradeReport extends Report{
    private int[] grades;
    public GradeReport(Formatter formatter, int[] grades, String title){
        super(formatter, title, null);
        this.grades = grades;
    }
    public int calculateAverageGrade(){
        if(grades.length == 0 || grades == null){
            return 0;
        }
        int sum = 0;
        for(int i : grades){
            sum += i;
        }
        return sum/grades.length;
    }
    @Override 
    public String execute(){
        setText("Average grade is " + calculateAverageGrade());
        return getFormatter().format(getTitle(), getText());
    }
}
