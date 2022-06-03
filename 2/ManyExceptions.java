import java.util.*;

public class ManyExceptions{
    public void sayHello(){
        System.out.println("Hello");
    }
    
    public static void main(String[] args){
        try{
        System.out.println("The third argument is "+args[2]);
        }catch(ArrayIndexOutOfBoundsException e1){
            System.out.println(e1);
        }
        Scanner sc = new Scanner(System.in);
        try{
        System.out.println("Enter a number");
        int a = sc.nextInt();
        System.out.println("Enter another number");
        int b = sc.nextInt();
        
        int c = a/b;
        
        System.out.println("The result of the division is "+c);
        
        sc.close();
        }catch(ArithmeticException e2){
            System.out.println(e2);
        }
        try{
        int d = sc.nextInt();
        }catch(IllegalStateException e3){
            System.out.println(e3);
        }
        try{
        ManyExceptions me=new ManyExceptions();
        me = null;
        me.sayHello();
        }catch(NullPointerException e4){
            System.out.println(e4);
        }
        
        
        
    }
}