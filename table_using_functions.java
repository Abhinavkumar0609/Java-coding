import java.util.*;
public class table_using_functions {
    public static void table(int n){
        if(n>=1){
            for(int i=1;i<=10;i++){
                System.out.println(i*n + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        table(n);
    }
}
