import java.util.*;
public class calculatorSwitch {
    public static void main(String[] args) {
      
        Scanner sc= new Scanner(System.in);

        System.out.println("Value of a");
        int a= sc.nextInt();
        System.out.println("Value of b");
        int b =sc.nextInt();

        System.out.println("select operator");
        char operator = sc.next().charAt(0);

        switch(operator){
            case '+': System.out.println(a+b);
            break;
            case '-':System.out.println("a-b");
            break;
            case '*':System.out.println(a*b);
            break;
            case '/':System.out.println(a/b);
            case '%': System.out.println(a%b);
        }
        
    }
}
