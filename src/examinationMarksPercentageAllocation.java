import java.util.Scanner;

public class examinationMarksPercentageAllocation {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        int a,b,c,aver;
        System.out.println("Enter Mathematics' Grade");
        a=sc.nextInt();
        System.out.println("Enter Physics' Grade");
        b=sc.nextInt();
        System.out.println("Enter Computer Science's Grade");
        c=sc.nextInt();
        System.out.println("Your Grade is");
        aver=(a+b+c)/3;
        System.out.println("The sum is "+aver);
        if(aver>100)
        {
            System.out.println("Error");
        }
        else if(aver>=81 && aver<=100)
        {
            System.out.println("You got an A! Congratulations, and keep it up!");
        }
        else if(aver>=61 && aver<=80)
        {
            System.out.println("You got a B! Try harder for an A, perhaps? Good job, nevertheless!");
        }
        else if(aver>=41 && aver<=60)
        {
            System.out.println("You got a C! You have the ability do better, stay motivated!");
        }
        else
        {
            System.out.println("You got a D! Work hard, and do well next time!");
        }
    }
}



