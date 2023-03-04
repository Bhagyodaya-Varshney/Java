import java.util.Scanner;
public class Day_of_Week{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter:");
        int day= sc.nextInt();
        switch (day){
        case 1->System.out.print("Its Monday");
        case 2->System.out.print("Its Tuesday");
        case 3->System.out.print("Its Wednesday");
        case 4->System.out.print("Its Thursday");
        case 5->System.out.print("Its Friday");
        case 6->System.out.print("Its Saturday");
        case 7->System.out.print("Its Sunday");

        }
            
    }
}