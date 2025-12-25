
import java.util.*;
public class variables{
    public static void main(String[] args) {
        
    Scanner sc = new Scanner (System.in);  
    
    System.out.println("What's your name?");
    String name = sc.next();

    System.out.println("Hello " + (name) + " please enter first number");
    int a =sc.nextInt();
    System.out.println("now please enter second number");
    int b = sc.nextInt();
    int sum = a+b;

    System.out.println("Sum of these numbers is" + (sum));
    }
}