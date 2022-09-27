//Write a java program to show following menu to the user:
//
//        *******Menu*******
//        1. Calculate Area of Circle
//        2. Calculate Circumference of a Circle
//        3. Exit.
//        Choose an option (1-3):
//
//        Take radius as user input.
//
//        Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static


import java.awt.*;
import java.util.Scanner;

public class Question3 {

    static void calArea(double radius){
        System.out.println(3.17*radius*radius);
    }
    static void calCircumference(double radius){
        System.out.println(2*3.17*radius);
    }
    void calStuff(){
        while(true){
            System.out.println("1. Calculate Area of Circle\n" +
                    "2. Calculate Circumference of a Circle\n" +
                    "3. Exit.");
            Scanner scan=new Scanner(System.in);

            int input = scan.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Enter radius");
                    calArea(scan.nextInt());
                    break;
                case 2:
                    System.out.println("Enter radius");
                    calCircumference(scan.nextInt());
                    break;
                case 3: return;
            }
        }
    }
    public static void main(String[] args){
                Question3 obj =new Question3();
                obj.calStuff();

    }
}
