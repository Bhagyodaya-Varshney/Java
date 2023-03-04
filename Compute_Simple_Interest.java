import java.util.Scanner;
public class Compute_Simple_Interest{
    public static void main(String[]args){
        System.out.print("Intial Balance:");
        Scanner st=new Scanner(System.in);
        int sc=st.nextInt();
        System.out.print("Annual Interest Rate:");
        Scanner sr=new Scanner(System.in);
        int sd=sr.nextInt();
        System.out.print("Time(in years):");
        Scanner sq=new Scanner(System.in);
        int se=sq.nextInt();
        int a = sc*(1+sd*se);
        System.out.print("Final Amount:"+a);

    }
}