package GardenApplication;

public class Plant {
    String color;
    double waterAmount = 0;
    boolean needWatering;
    String type;
    double waterMinimum;
    double sbsorbing;

    public Plant(String color) {
        this.color = color;
    }
    public boolean isNeedWatering(){
        if (waterAmount < waterMinimum){
            needWatering = true;
        }else {
            needWatering = false;
        }
        return needWatering;
        }
        public  double wateringPlant(double amountOfWaterForOnePlant){
            double absorbing;
            return waterAmount += amountOfWaterForOnePlant * absorbing;
    }

    public void setNeedWatering() {
    }
}
