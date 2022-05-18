package Refactoring;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        CalculatorTest calculatorTest = new CalculatorTest();
        Scanner sc = new Scanner(System.in);
        System.out.println("firstOperand:");
        int firstOperand= Integer.parseInt(sc.nextLine());
        System.out.println("secondOperand:");
        int secondOperand= Integer.parseInt(sc.nextLine());
        System.out.println("operator:");
        String operators= sc.nextLine();
        char operator=operators.charAt(0);
        System.out.println( calculatorTest.calculate(firstOperand,secondOperand,operator));
    }
}
