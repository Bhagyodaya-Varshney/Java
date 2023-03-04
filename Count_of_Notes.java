import java.util.Scanner;
public class Count_of_Notes{
    public static void main(String[]args){
        Scanner st = new Scanner(System.in);
        System.out.print("Enter the Amount:");
        int sc = st.nextInt();
         int a = sc/2000;
         sc=sc-a*2000;
         int b=sc/500;
         sc=sc-b*500;
         int c=sc/200;
         sc=sc-c*200;
         int d=sc/100;
         sc=sc-d*100;
         int e=sc/50;
         sc=sc-e*50;
         int f=sc/20;
         sc=sc-f*20;
         int g=sc/10;
         sc=sc-g*10;
        System.out.println("2000:"+a);
        System.out.println("500:"+b);
        System.out.println("200:"+c);
        System.out.println("100:"+d);
        System.out.println("50:"+e);
        System.out.println("20:"+f);
        System.out.println("10:"+g);
    }
}