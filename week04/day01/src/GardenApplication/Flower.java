package GardenApplication;

public class Flower extends Plant {

    public Flower(String color){
    super(color);
    type = "Flower";
    waterMinimum = 5;
        double absorbing = 0.75;
    }
}
