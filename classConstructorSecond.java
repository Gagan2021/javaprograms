import java.util.Scanner;

public class classConstructorSecond {
    classConstructorSecond (String name){
        System.out.println("Hello Mr/Mrs. "+name);


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // idhr apun log user se name le rhe hain

        System.out.println("Enter your Name : ");
        //us name ko name variable mein store kr rhe hain
        String name= sc.nextLine();
         // yaha pe String pass krna tha constructor initialie krne ko,
        // but humne String variable pass kar diya , aur kaam kr rha hai
        classConstructorSecond ccs = new classConstructorSecond(name);


    }
}
