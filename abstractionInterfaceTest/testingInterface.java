package abstractionInterfaceTest;

public class testingInterface implements testInterface {
    @Override
    public void interfaceTester() {
        System.out.println("Apun Interface ka method hai , but waha pe apni koi definition nhi, ab isne implement\n kiya hai toh definition bhi de di......");

    }

    @Override
    public void nodefine() {
        System.out.println("Hellooo beeeeeeeeeeeeeeee");
    }

    public static void main(String[] args){
        testingInterface ti= new testingInterface();
        ti.interfaceTester();
        ti.nodefine();
    }
}
