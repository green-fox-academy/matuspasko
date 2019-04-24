package GardenApplication;

public class Tree extends Plant{

    public Tree(String color){
        super(color);
        type = "Tree";
        waterMinimum = 10;
        double absorbing = 0.4;
    }
}
