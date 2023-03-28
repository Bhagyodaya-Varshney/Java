import java.util.Scanner;
public class Unlimited_Value_Addition{
        static int sum(int ...arr){
        int result=0;
        for (int a : arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[]args){
        Scanner st= new Scanner(System.in);
        System.out.print("Enter the No. of Element:");
        int sc=st.nextInt();
        int []array=new int[sc];
        for(int i=0;i<sc;i++){
            System.out.print("Enter Element:");
            array[i]=st.nextInt();
        }
        System.out.print(sum(array));
    }
}