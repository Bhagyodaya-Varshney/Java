import java.util.Scanner;
public class Method_of_Add{
    static int add(int x,int y){
            int z = x+y;
            return z;
        }
    public static void main(String[]args){
        System.out.print("Enter 1 No.:");
        Scanner st=new Scanner(System.in);
        int sc=st.nextInt();
        System.out.print("Enter  No.:");
        Scanner sb=new Scanner(System.in);
        int sa=sb.nextInt();
        int a=add(sc,sa);
        System.out.print("Addition of "+sc+" and "+sa+" is ");
        System.out.print(a);
    }
}