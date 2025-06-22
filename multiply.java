import java.util.*;
public class multiply {
    public static int multiply(int a,int b){
        int m=a*b;
        return m;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int m=multiply(a,b);
        System.out.println("sum of two numbers is:"+ m);
}
}
