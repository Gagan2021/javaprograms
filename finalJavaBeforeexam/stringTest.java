package finalJavaBeforeexam;
import java.util.Scanner;


public class stringTest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name="Prof. Gagan Chaudhary";
        System.out.println("Hello "+name+" Welcome Sir, \n Please enter your instagram user name : ");
        String instahandle = sc.nextLine();
        System.out.println("We will DM  you at : "+instahandle);

    }
}
