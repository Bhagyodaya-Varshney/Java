import java.util.Scanner;
public class Student_percentage{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Marks of 5 Student");
    System.out.print("Marks of 1 Subject Out of 100:");
    int a= sc.nextInt();
    System.out.print("Marks of 2 Subject Out of 100:");
    int b= sc.nextInt();
    System.out.print("Marks of 3 Subject Out of 100:");
    int c= sc.nextInt();
    System.out.print("Marks of 4 Subject Out of 100:");
    int d= sc.nextInt();
    System.out.print("Marks of 5 Subject Out of 100:");
    int e= sc.nextInt();
    float f= (a+b+c+d+e)/5;
    System.out.print(f+"%");
    }
}