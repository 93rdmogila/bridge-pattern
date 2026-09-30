public abstract class Report {
    private Formatter formatter;
    private String title;
    private String text;
    public Report(Formatter formatter, String title, String text){
        this.formatter = formatter;
        this.title = title;
        this.text = text;
    }
    public void setImplementation(Formatter formatter){
        this.formatter = formatter;
    }
    public Formatter getFormatter(){
        return this.formatter;
    }
    public String getTitle(){
        return title;
    }
    public String getText(){
        return text;
    }
    public void setText(String text){
        this.text = text;
    }
    public abstract String execute();
}
