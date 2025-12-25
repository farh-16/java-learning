import java.util.*;
public class calculatorElseIf {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("value of a");
        int a = sc.nextInt();
        System.out.println("value of b");
        int b = sc.nextInt();

        System.out.println("select operator");
        char operator=sc.next().charAt(0);
        if(operator =='+'){
            System.out.println(a+b);
        }else if(operator == '-'){
            System.out.println(a-b);
        }else if(operator=='*'){
            System.out.println(a*b);
        }else if (operator=='/'){
            System.out.println(a/b);
        }else if (operator=='%'){
            System.out.println(a%b);
        }else{
            System.out.println("invalid operation");
        }
    }
}
