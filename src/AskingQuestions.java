import java.util.Scanner;

public class AskingQuestions {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        //initialize my three double variables
        double num1, num2, num3;
        //Explain program function to user.
        System.out.println("Enter 2 numbers to find the average.");
        //Prompt for inputs
        System.out.println("Enter first number: ");
        num1 = keyboard.nextDouble();
        System.out.println("Enter second number: ");
        num2 = keyboard.nextDouble();
        //assign calculation to 3rd double variable
        num3 = (num1+num2)/2;
        //print results
        System.out.println("The average between "+num1+" and "+num2+" is "+num3);

    }
}
