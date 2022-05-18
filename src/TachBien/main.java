package TachBien;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input Number:");
        int number = sc.nextInt();
        System.out.println( TachBien.fizzBuzz(number));
    }
}
