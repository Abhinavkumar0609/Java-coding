import java.util.*;
public class even_odd_functions {
    public static void even_odd(int n){
        if(n%2==0 && n!=0){
            System.out.println("even number");
            return;
        }
        else if(n%2==1){
            System.out.println("odd number");
            return;
        }
        else
        {
            System.out.println("invalid input");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        even_odd(n);
    }
}
