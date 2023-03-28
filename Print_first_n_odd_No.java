import java.util.Scanner;
public class Print_first_n_odd_No{
    public static void main( String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter:");
        int st = sc.nextInt();
        for (int i=0; i<=st ;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}