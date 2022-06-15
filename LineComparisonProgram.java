package Com.bl.Practice;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[] args) {

        System.out.println("Welcome to Line Comparison Computation Program ");

        int x1,y1,x2,y2;

        Scanner userInput = new Scanner(System.in);
        System.out.println("enter coordinates for line 1");
        System.out.println("enter x1 value");
        x1 = userInput.nextInt();
        System.out.println("enter y1 value");
        y1 = userInput.nextInt();
        System.out.println("enter x2 value");
        x2 = userInput.nextInt();
        System.out.println("enter y2 value");
        y2 = userInput.nextInt();

        int f1,g1,f2,g2;// represent coordinate f=x, g=y
        System.out.println("enter coordinates for line 2");
        System.out.println("enter f1 value");
        f1 = userInput.nextInt();
        System.out.println("enter g1 value");
        g1 = userInput.nextInt();
        System.out.println("enter f2 value");
        f2 = userInput.nextInt();
        System.out.println("enter g2 value");
        g2 = userInput.nextInt();


        double lengthOfLine1 =Math.sqrt((x2- x1)*(x2-x1) + (y2 - y1)*(y2 - y1));
        System.out.println("Length of the line between points " + "("+x1+","+y1+"),("+x2+","+y2+") = " +lengthOfLine1);
        double lengthOfLine2 =Math.sqrt((f2- f1)*(f2-f1) + (g2 - g1)*(g2 - g1));
        System.out.println("Length of the line between points " + "("+f1+","+g1+"),("+f2+","+g2+") = " +lengthOfLine2);

        if(lengthOfLine1 == lengthOfLine2){
            System.out.println("line1 and line 2 are equal");
        }
        else if( lengthOfLine1 < lengthOfLine2){
            System.out.println("line1 is less than line2");
        }
        else {
            System.out.println("line2 is greater than line1");
        }
    }
}
