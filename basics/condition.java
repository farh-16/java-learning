import java.util.*;

public class condition{
    public static void main(String[] args) {

//  Scanner sc = new Scanner(System.in);
 
//  System.out.println("press any button between 1 to 5");
//  int button = sc.nextInt();

//  if (button==1){
//     System.out.println("Hello");
//  }else if(button ==2){
// System.out.println("Hola");
//  }else if(button ==3){
//     System.out.println("Bonjour");
//  }else if(button ==4){
//     System.out.println("konnichiwa");
//  }else if(button ==5){
// System.out.println("Ciao");
//  }
// else{
//     System.out.println("Invalid Button");
// }

     // NOW USING SWITCH

Scanner sc = new Scanner(System.in);

System.out.println("Press any button between 1 to 5");
int button =sc.nextInt();

switch (button) {
    case 1:System.out.println("Hello");
         break;
     case 2:System.out.println("Hola");
     break;
     case 3:System.out.println("Bonjour");
     break;
     case 4:System.out.println("Kunnoichiwa");
     break;
     case 5:System.out.println("Ciao");
     break;
    default:System.out.println("Invalid Button");
}

    }
}