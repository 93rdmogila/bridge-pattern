public class TextFormatter implements Formatter{
    @Override 
    public String format(String title, String text){
        return "Title: "+title+"\n"+
                "Text: " + text;
    }
}
