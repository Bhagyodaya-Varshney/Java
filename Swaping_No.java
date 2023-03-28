import java.util.Scanner;
public class Swaping_No{
    public static void main(String[]args){
        System.out.print("A value:");
        Scanner st=new Scanner(System.in);
        int sc=st.nextInt();
        System.out.print("B value:");
        Scanner sq=new Scanner(System.in);
        int sd=sq.nextInt();

        sc=sc^sd;
        sd=sc^sd;
        sc=sc^sd;
        System.out.println(sc+"  "+sd);
        System.out.println();
        System.out.print("Value A:"+sc);


    }
}