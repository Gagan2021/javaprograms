package abstractionInterfaceTest;


public class testingabstraction extends testAbs {
    @Override
    public void abstester() {
        System.out.println("wow, Thanks for Defining me Dude");



    }
    public static void main(String[] args){
        testingabstraction tabs = new testingabstraction();
        tabs.abstester();
        tabs.noabstester();

        // Test Success
    }
}
