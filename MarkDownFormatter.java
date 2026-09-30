public class MarkDownFormatter implements Formatter{
    @Override 
    public String format(String title, String text){
        return "#"+title+"\n"
                +"**"+text+"**";
    }
}