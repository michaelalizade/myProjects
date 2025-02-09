import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Mike's Java Calculator Program");

        double num1;

        double num2;

        char operation;

        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter your desired operator (+, -, /, *): ");
        operation = scanner.nextLine().charAt(0);

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();
        scanner.nextLine();

        if(operation == '+'){
            result = num1 + num2;
            System.out.println(result);
        }else if(operation == '-'){
            result =  num1 - num2;
            System.out.println(result);
        }else if(operation == '/'){
            result = num1 / num2;
            System.out.println(result);
        }else if(operation == '*'){
            result = num1 * num2;
            System.out.println(result);
        }else{
            System.out.printf("%c is not an operator. Please restart and select an appropriate operator\n", operation);
        }

        System.out.println("Thank you for using Mike's Java Calculator Program!");

        scanner.close();
    }
}