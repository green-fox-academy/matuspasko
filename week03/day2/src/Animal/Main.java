package Animal;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Animal(45, 33);
        Animal cat = new Animal();

        System.out.println("dog value:" + dog.hunger);
        System.out.println(cat.thirst);

        dog.eat();
        dog.drin();


    }
}