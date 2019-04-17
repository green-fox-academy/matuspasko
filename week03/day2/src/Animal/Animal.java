
package Animal;

public class Animal {
    int hunger;
    int thirst;


    public Animal(int hunger, int thirst){
        this.hunger = hunger;
        this.thirst = thirst;
    }

    public Animal(){
        this.thirst = 50;
        this.hunger = 50;
    }

    public void eat(){
        this.hunger--;
    }

    public  void drin(){
        this.thirst--;
    }
    public void play(){
        this.thirst++;
        this.hunger++;
    }
    public void print(){

    }

}