package profGaganLearning;

public class useOfThisSecond {

    int age;
    useOfThisSecond(int age){
        // here we have used this keyword to represent the class variable
        this.age= age;
    }

    public static void main(String[] args) {
        useOfThisSecond uts= new useOfThisSecond(12);
        System.out.println(uts.age);
    }
}
