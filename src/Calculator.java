import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Add, subtract, multiply, or divide? (Enter \"+\", \"-\", \"*\", or \"/\")");
        String operation = sc.nextLine();
        if(operation.equals("+")){
            System.out.println(num1 + num2);
        }
        else if(operation.equals("-")){
            System.out.println(num1 - num2);
        }
        else if(operation.equals("*")){
            System.out.println(num1 * num2);
        }
        else System.out.println(num1/num2);
    }
}
