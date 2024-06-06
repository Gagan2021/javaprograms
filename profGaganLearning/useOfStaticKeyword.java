package profGaganLearning;

public class useOfStaticKeyword {
    static String name;

    static void greeting(){
        int count=0;
        while(count<=10) {


            System.out.println("Hello Buddy");
            count++;
        }
        }

        void otherGreeting(){
        System.out.println("hiii");
        }
    public static void main(String[] args) {
        // herre we are directly accessing static variable , without creating object of it...

        name= "prof. Gagan chaudhary";
        greeting();
        // let's try to access non static method , in static method without creating object of class;
        //   otherGreeting();
        // we are unable to acces it ...............


    }

}
