package basicJavaTest;

import java.util.Scanner;

public class inputFloat {
    public static void main(String[] args){

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your percentage of 12 class : ");
        float percentage= sc.nextFloat();

        System.out.println("Congratulations You have scored "+percentage+" in 12 class");


    }
}
