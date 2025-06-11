import java.util.*;;

public class calculator {
    public static void main(String args[]) {
 Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int b = sc.nextInt();
         int result;
         System.out.println("Input operation");
         char choice = sc.next().charAt(0);
         switch(choice){
            case '+': 
            result = a+b;
            System.out.println(result);
            break;
            case '-': 
            result=a-b;
            System.out.println(result);
            break;
             case '*': 
             result=a*b;
             System.out.println(result);
            break;
             case '/': 
             result=a/b;
             System.out.println(result);
            break;
            default: System.out.println("wrong input");
         }
}
}
