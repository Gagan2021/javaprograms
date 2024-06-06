package basicJavaTest;

import java.util.Scanner;

public class inputDoubleLong {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // let's try to take long input from user;
        System.out.println("Enter a long int value : ");
        long varlong = sc.nextLong();

        // let's try  to take double as input from user;
        System.out.println("Enter a Double float value : ");
        double varDouble = sc.nextDouble();

        if(varlong>0){
            System.out.println("Congratulations , Long int successfully stored in local variable");

        }else{
            System.out.println("Oops ! , Sorry there are some error while storing value long int in variable ");


        }
        if(varDouble>0){
            System.out.println("Congratulations , Double float successfully stored in local variable");

        }else{
            System.out.println("Oops ! , Sorry there are some error while storing value Double float in variable ");


        }



    }
}
