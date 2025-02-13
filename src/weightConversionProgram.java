import java.util.Scanner;

public class weightConversionProgram {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // WELCOME

        System.out.println("Mike's Java Weight Conversion Program");
        System.out.println("*************************************");
        System.out.println("Please select an option: ");

        // VARIABLES

        double weight = 0;
        double result;
        int option;

        // OPTIONS

        System.out.println("Option 1 : lbs to kg");

        System.out.println("Option 2 : kg to lbs");

        option = scanner.nextInt();

        // FUNCTIONAL PART

        if(option == 1 || option == 2){
            if(option == 1) {
                System.out.print("Enter the desired weight in lbs: ");
                weight = scanner.nextDouble();
                result = weight * 0.45359237;
                System.out.printf("%.2f lbs equals to %.2f kgs\n", weight, result);
            } else if (option == 2) {
                System.out.print("Enter the desired weight in kg: ");
                weight = scanner.nextDouble();
                result = weight / 0.4536;
                System.out.printf("%.2f kg equals to %.2f lbs\n", weight, result);
            }
        }else{
            System.out.println("Please enter one of the given options!");
        }

        // THANK YOU

        System.out.println("*************************************");
        System.out.println("Thank you for using Mike's Java Weight Conversion Program!");

        scanner.close();
    }
}
