package Javalessons.lessons1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculate calculator = new Calculate();

        System.out.println("¬ведите какое действие хотите совршить: +, -. *. /");
        String action = scan.nextLine();

        System.out.println("¬ведите первое число:");
        String firstArg = scan.nextLine();

        System.out.println("¬ведите второе число:");
        String secondArg = scan.nextLine();

        Double result = calculator.calculate(Double.parseDouble(firstArg), Integer.parseInt(secondArg), action);
        System.out.println("–узультат вычеслени€: " + result);


    }

}