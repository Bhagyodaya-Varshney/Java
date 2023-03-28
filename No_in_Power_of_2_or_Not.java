import java.util.Scanner;
public class No_in_Power_of_2_or_Not{
    public static void main(String[]args){
        System.out.print("Enter No.:");
        Scanner st = new Scanner(System.in);
        int sc=st.nextInt();
        int a = sc;
        int flag=0;
        while(a!=1){
        if(a%2==0){
            flag=1;
            break;
        }
        a=a/2;
        }
        if(flag==1){
            System.out.print(sc+" is a number that is the power of 2.");
        }
        else{
            System.out.print(sc+" is not the power of 2.");
        }
    }
}