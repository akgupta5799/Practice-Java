public class ByIncrement implements Series
{
    private int factor;
    private int start;
    private int value;

    public ByIncrement()
    {
        factor = 1;
        start = 0;
        value = 0;
    }
    public ByIncrement(int factor, int start)
    {
        this.factor = factor;
        this.start = start;
        this.value = start;
    }
    public ByIncrement(int factor)
    {
        this.factor = factor;
        this.start = 0;
        this.value = 0;
    }
    public int getNext()
    {
        this.value+=this.factor;
        return this.value;
    }
    public void setStart(int start)
    {
        this.start = start;
        this.value = start;
    }
    public void reset()
    {
        this.value = this.start;
    }

}