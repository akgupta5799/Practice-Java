import java.util.*;
public class UseSeries
{
    public static void printSeries(Series a, int howmany){
        for (int i=0;i<howmany;i++){
            System.out.println("Next number in Series: "+a.getNext());
        }
    }
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of factor: ");
    int factor = sc.nextInt();
    ByIncrement bi = new ByIncrement(factor);
    bi.setStart(1);
    printSeries(bi,10);
  }  
}