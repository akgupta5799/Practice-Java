public class ByThrees implements Series
{
    private int start;
    private int val;
    
    public ByThrees(){
        start = 0;
        val = 0;
    }
    
    public int getNext(){
        val +=3;
        return val;
    }
    
    public void reset(){
        val = start;
    }
    
    public void setStart(int x){
        start = x;
        val = x;
    }
    
}