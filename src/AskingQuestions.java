import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Enter 2 numbers to find the average.");
        System.out.println("Enter first number: ");
        num1 = keyboard.nextInt();
        System.out.println("Enter second number: ");
        num2 = keyboard.nextInt();
        num3 = (num1+num2)/2;
        System.out.println("The average between "+num1+" and "+num2+" is "+num3);

    }
}
