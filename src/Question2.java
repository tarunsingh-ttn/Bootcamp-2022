//Write a program to read user input until user writes XDONE
// and then show the entered text by the user on commandline

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String input=" ";
        String str ="";
        String match="XDONE";
        while(!input.equals(match)){
            input=scan.next();
            str=str.concat(input);
        }
        System.out.println(str);
    }
}
