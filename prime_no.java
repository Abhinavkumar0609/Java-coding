import java.util.*;
public class prime_no {
    public static void prime(int n){
        if(n==2){
            System.out.println("prime number");
            return;
        }
        else if(n<=1){
            System.out.println("not prime");
            return;
        }
        else {
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0){
                    System.out.println("Not a prime number");
                    return;
                }
                System.out.println("prime number");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        prime(n);
    }
}
