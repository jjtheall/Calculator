import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        System.out.println("Add or subtract? (Enter \"+\" or \"-\")");
        String operation = sc.nextLine();
        if(operation.equals("+")){
            System.out.println(num1 + num2);
        }
        else{
            System.out.println(num1 - num2);
        }
    }
}
