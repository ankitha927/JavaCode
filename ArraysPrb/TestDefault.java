interface MyInterface{
    default void show(){
      System.out.println("default");

    }
    class MyClass implements MyInterface{

    }
}
public class TestDefault {
    public static void main (String[]args){
    MyInterface.MyClass obj= new MyInterface.MyClass();
    obj.show();
    }
}
