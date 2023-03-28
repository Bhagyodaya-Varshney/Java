import java.util.Scanner;
public class Student_Pass_or_Not{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter SUbject 1 Marks out of 100:");
        int a = sc.nextInt();
        System.out.print("Enter SUbject 2 Marks out of 100:");
        int b = sc.nextInt();
        System.out.print("Enter SUbject 3 Marks out of 100:");
        int c = sc.nextInt();
        int d = a+b+c;
        if (a>33 && b>33 && c>33 && d>120 ){
                System.out.println("You Are passed!");
        }
        else{
            System.out.println("You Are FAil!");
        }
        System.out.print("You got "+d/3+"%");
    }
}