package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args){
        //System.out.println("Hello World");
        //orange color = reserved words
        // int hours = 40;
        //double PayRate = 25.50;

        //taking input from the user:-
        int hours = 0;
        System.out.println("how many hours?");
        Scanner scanner = new Scanner(System.in);
        hours = scanner.nextInt();

        double payRate = 0;
        System.out.println("what's the pay rate?");
        Scanner sc = new Scanner(System.in);
        payRate = scanner.nextDouble();

        scanner.close();
        double grossPay = hours * payRate;
        System.out.println("Gross pay = " + grossPay);
        System.out.println("just to check changes!");
    }
}
