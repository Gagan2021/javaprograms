package profGaganLearning;

public class useOfThisThird {

    String name;
    int age;
    int salary;

    useOfThisThird(String name, int age, int salary){
        this.name=name;
        this.age=age;
        this.salary= salary;


    }
    useOfThisThird getsalary(){
        System.out.println(salary);
        return this;

    }
    useOfThisThird getage(){
        System.out.println(age);

        return this;

    }
    useOfThisThird getname(){
        System.out.println(name);
        return this;

    }

    public static void main(String[] args) {
        useOfThisThird utt= new useOfThisThird("Gagan chaudhary", 21, 9999999);

        // here we are going to create chaining of calling methods of class using object

       System.out.println(utt.getname().getage().getsalary());
    }
}
