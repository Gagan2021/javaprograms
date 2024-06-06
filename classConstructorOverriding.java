import overridingTRY.testOverriding;


public class classConstructorOverriding extends testOverriding  {

    @Override
    public void tester() {
        System.out.println("I'm method of OverridingTry package and class testOverriding");
        System.out.println("I'm overridden by Prof.Gagan chaudhary");
    }

    public static void main(String[] args){

        classConstructorOverriding ccor = new classConstructorOverriding();

        ccor.tester();

    }

}
