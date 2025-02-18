package java11_17;

sealed class  Animal permits Dog, Cat{
    void sound(){
        System.out.println();
    }
}
non-sealed class Dog extends Animal{

}
final class Cat extends Animal{

}
class Human{

}
public class F_SealedClasses {
    public static void main(String[] args) {

    }
}