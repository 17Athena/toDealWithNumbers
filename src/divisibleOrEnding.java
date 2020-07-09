import java.util.Scanner;

public class divisibleOrEnding {

public static void main(String[] agrs) {
    Scanner sc = new Scanner(System.in);
    int i;
    System.out.println("Enter the number:");
    i=sc.nextInt();
    if(i%7==0)
    {
        System.out.print("The number is divisible by 7.");
    }
    else if(i%10==7)
    {
        System.out.print("The number ends with 7.");
    }
}
}


