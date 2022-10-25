import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter second number");
        int secondNumber=sc.nextInt();

        int sum=firstNumber + secondNumber;
        System.out.println(sum);

    }
}
