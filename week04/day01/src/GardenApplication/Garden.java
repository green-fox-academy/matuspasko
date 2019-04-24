package GardenApplication;

import java.util.ArrayList;

public class Garden {
    ArrayList flowers;
    ArrayList trees;
    int amountOfWaterGardenHold;

    public TheGarden() {
    }

    public TheGarden(ArrayList flowers, ArrayList trees, int amountOfWaterGardenHold) {
        this.trees = trees;
        this.flowers = flowers;
        this.amountOfWaterGardenHold = amountOfWaterGardenHold;
    }
    public ArrayList addFlower(TheFlower aFlower) {
        flowers.add(aFlower);
        return flowers;
    }
    public ArrayList addTree(TheTree aTree){
        trees.add(aTree);
        return trees;
    }

}
