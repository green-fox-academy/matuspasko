public class Animal {
    int hunger;

    public Animal(int hunger) {
        this.hunger = hunger;
    }

    public void eat(int food) {
        if (food > 0) {
            hunger = hunger - food;
        }
    }

    public int getHunger(){
    return hunger}
}
