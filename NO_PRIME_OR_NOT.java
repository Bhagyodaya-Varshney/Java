import java.util.Scanner;
public class NO_PRIME_OR_NOT{
    public static void main(String[]args){
        System.out.print("Enter the No:");
        Scanner st=new Scanner(System.in);
        int sc=st.nextInt();
        st.close();
        int c=0;
        for(int i=1;i<=sc;i++){
            if(sc%i==0){
                c++;
            }}
        if(c==2){
            System.out.print("Prime");
        }
        else{
            System.out.print("Not Prime");
        }
    }}