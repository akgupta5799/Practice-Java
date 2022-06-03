import java.util.*;
import java.util.Scanner;
class Swapping
{
    public static void main(String[] args)
    {
        System.out.println("Enter two numbers: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("a = " +a+ " b = "+b);
    }
}
