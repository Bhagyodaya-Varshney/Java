import java.util.Scanner;
public class Function_for_multi_value_add{
    static int sum(int ...arr){
        int result=0;
        for (int a : arr){
            result+=a;
        }
        return result;
    }
    public static void main(String[]args){
        System.out.print(sum(1,3));

    }
}