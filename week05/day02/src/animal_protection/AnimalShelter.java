//package animal_protection;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class AnimalShelter {
//    private List<Animal> animals = new ArrayList<Animal>();
//    private List<String> adoptersNames = new ArrayList<>();
//    private int budget;   //budget setneme v konstruktore
//
//    public AnimalShelter() {
//
//        this.budget = 50;
//    }
//
//    public int rescue(Animal animalTORescue) {    // size of list is allways Integer
//        animals.add(animalTORescue);
//        return animals.size();
//    }
//
//    public void addAdopter(String adopter) {
//        adoptersNames.add(adopter);
//    }
//
//    public int heal() {
//        //find the first not healthy animal
//        for (Animal animal : animals) {   // pridali sme jedno zviera
//            if (!animal.isHealthy()) {
//                //check if it can be heald ( check if we have the budget)
//                if (animal.getHealCost() <= budget) {
//                    animal.heal();
//                    return 1;
//                    //if can be healed: heal it and return 1
//                } else {
//                    return 0;
//                }
//            }
//        }
//        //if there is not sick animal :
//        return 0;
//    }
//
//    public void findNewOwner() {
//
//        if (!animals.isEmpty()) &&!adoptersNames.isEmpty() {
//
//
//            int randomIndex = (new Random()).nextInt(animals.size());
//            Animal randomAnimal = animals.get(randomIndex);
//
//            int randomIndex2 = (new Random()).nextInt(adoptersNames.size());
//            String adopterName = adoptersNames.get(randomIndex2);
//            //pair them
//
//            randomAnimal.setownerName(randomAdopterName);
//            // remove animal
//            animals.remove(randomAnimal);
//            //remove owner
//            adoptersNames.remove(randomAdopterName);
//
//        }
//    }
//
//    public int earnDonation(int amount) {
//        budget += amount;
//        return budget;
//    }
//
//    @Override
//    public String toString() {
//        String animalData = "";
//
//        for (Animal animal : animals) {
//            animalData += animal.toString() + "\n";
//
//        }
//
//        return "Budget: " + budget + "€,\n"
//                + "There are" + animals.size() + "animal (s) andv" + adoptersNames.size() + "\n"
//                + "potencial adopters" + "\n" + animalData;
//
//
//    }
//}
//

