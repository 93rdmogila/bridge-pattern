public class HtmlFormatter implements Formatter{
    @Override 
    public String format(String title, String text){
        return "<div><h1>"+title+"</h1>\n"+
                "<p><b>"+text+"</b></p>";
    }
}
