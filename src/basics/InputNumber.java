package basics;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputNumber {

    public static void main(String[] args) throws InputMismatchException {
        int integerValue;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter an integer value");


        integerValue = scanner.nextInt();

        System.out.println("Entered value is" + integerValue);


    }


}
