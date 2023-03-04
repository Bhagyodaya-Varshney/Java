import java.util.Scanner;
public class Entered_Char_Vowel_Or_Consonant{
    public static void main(String[]args){
        System.out.print("Enter the Char:");
        Scanner st=new Scanner(System.in);
        char sd=st.next().charAt(0);
        if(sd=='a'||sd=='e'||sd=='i'||sd=='o'||sd=='u'||sd=='A'||sd=='E'||sd=='I'||sd=='O'||sd=='U'){
            System.out.print("V");
        }
        else{
            System.out.print("C");
        }
         }}