public class classConstructorOverloading {
    classConstructorOverloading(){
        System.out.println(" Gannda hai re tu, Kuch input nhi diya tune toh..");

    }
    classConstructorOverloading(String name){
        System.out.println("Hello Mr."+name);

    }
    public static void main(String[] args){
        classConstructorOverloading cco= new classConstructorOverloading();
        cco= new classConstructorOverloading("Prof. Gagan chaudhary");
    }
}
