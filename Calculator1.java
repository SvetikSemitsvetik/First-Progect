package Javalessons.lessons1;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculate calculator = new Calculate();

        System.out.println("������� ����� �������� ������ ��������: +, -. *. /");
        String action = scan.nextLine();

        System.out.println("������� ������ �����:");
        String firstArg = scan.nextLine();

        System.out.println("������� ������ �����:");
        String secondArg = scan.nextLine();

        Double result = calculator.calculate(Double.parseDouble(firstArg), Integer.parseInt(secondArg), action);
        System.out.println("��������� ����������: " + result);


    }

}