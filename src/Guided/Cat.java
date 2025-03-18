package Guided;

public class Cat extends Animal{
    @Override
    public void bark() {
        System.out.println("Bark Bark Cihuyyy");
    }
    public static void main(String[] args) {
        Cat gurame = new Cat();
        gurame.bark();
    }
}
