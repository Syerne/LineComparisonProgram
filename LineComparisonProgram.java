package Com.bl.Practice;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program ");

        int x1,y1,x2,y2;

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter x1 value");
        x1 = userInput.nextInt();
        System.out.println("enter y1 value");
        y1 = userInput.nextInt();
        System.out.println("enter x2 value");
        x2 = userInput.nextInt();
        System.out.println("enter y2 value");
        y2 = userInput.nextInt();

        double lengthOfLine =Math.sqrt((x2- x1)*(x2-x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length of the line between points " + "("+x1+","+y1+"),("+x2+","+y2+") = " +lengthOfLine);


    }
}
