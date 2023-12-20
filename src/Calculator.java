import java.util.Objects;
import java.util.Scanner;

public class Calculator {

    private double result;


    public void calculate (double int1, double int2, String operator) {
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
        double int1 = keyboard.nextDouble();

        System.out.println("Please choose the operator [ + , - , * , % ]");
        String operator = keyboard.next();

        System.out.println("Please enter the second number: ");
        double int2 = keyboard.nextDouble();

        // Calculate the result
        Calculator calculator = new Calculator();
        calculator.calculate(int1, int2, operator);

    }
}