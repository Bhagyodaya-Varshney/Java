import java.util.Scanner;
public class Armstrong_No{
    public static void main(String[]args){
        int a,b,c,sum=0;
        int d;
        System.out.print("Enter No.:");
        Scanner sd=new Scanner(System.in);
        a=sd.nextInt();
        d=a;
        while(a>0){
            b=a%10;
            c=b*b*b;
            sum=sum+c;
            a=a/10;
        }
    if(d==sum){
        System.out.print("Armstrong no.");
    }
    else{
        System.out.print("not armstrong no.");
    }}}