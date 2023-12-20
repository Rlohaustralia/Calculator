import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    public static double int1;
    public static double int2;
    public static String operator;
    public static double result;


    public static void Calculate (double int1, double int2, String operator) {
        if (Objects.equals(operator, "+")){
            result = int1 + int2;
        } else if (Objects.equals(operator, "-")){
            result = int1 - int2;
        } else if (Objects.equals(operator, "*")){
            result = int1 * int2;
        } else if (Objects.equals(operator, "%")){
            if (int2 != 0) {
                result = int1 / int2;
            } else {
                System.out.println("Cannot divide by zero");
            }
        }
        System.out.println("Result is : "+ result);

    }

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        int1 = keyboard.nextDouble();

        System.out.println("Please choose the operator [ + , - , * , % ]");
        operator = keyboard.next();

        System.out.println("Please enter the second number: ");
        int2 = keyboard.nextDouble();

        // Calculate the result
        Calculator.Calculate(int1, int2, operator);



    }
}