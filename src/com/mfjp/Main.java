package com.mfjp; // package statement terminated by ;
import java.util.Arrays;

import java.util.Scanner;



public class Main { // main class

    public static void main(String [] args) { // main method accessible by other parts of the program, static is important, will not return anything
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal:     ");
        double principal = scanner.nextDouble();
        System.out.println("Principal: " + principal);

p
        //byte age = 30;
        //long viewsCount = 3_124_456_789L; //need L so it is recognized as LONG
        //float price = 10.99F; //need F so it is recognized as FLOAT, otherwise it thinks it is double
       // char letter = 'A'; //surround single character with single quotes and multiple characters with double quotes
        //boolean isEligible = false;
        //byte x = 1;
        //byte y = x;
        //int[] numbers = {2, 3, 5, 1, 4};
        //Arrays.sort(numbers);

        //int [][] numberMat = new int[2][3];
        //numberMat[0][0] = 1;
       // System.out.println(Arrays.deepToString(numberMat));

        //String message = "Hello World!" + "!!";

        //Reference Types
       // Date now = new Date();
       // now.getTime();
       // System.out.println(Arrays.toString(numbers)); //executing print line method, surround textual data with ""
    }
}
