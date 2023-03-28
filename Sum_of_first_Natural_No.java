import java.util.Scanner;
public class Sum_of_first_Natural_No{
    static int Natural_No_sum(int n){
        if (n==0){
            System.out.print("Error");
        }
        else{        
            return n+Natural_No_sum(n-1);
        }
}
    public static void main(String[]args){
        Scanner st = new Scanner(System.in);
        System.out.print("Enter the No.:");
        int sc= st.nextInt();
        System.out.print(Natural_No_sum(sc));


    }
}