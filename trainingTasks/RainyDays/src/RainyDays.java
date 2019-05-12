import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class RainyDays {
    public static void main(String[] args) {
        // Vytvorim path aby sme mohli nacitat subor
        Path path = Paths.get("/Users/matuspasko/Desktop/matuspasko/trainingTasks/RainyDays/src/cities.csv");
        //Vytvorim Array list aby sme mohli nacitat subor do neho a dalej s nim pracovat
        List<String> calenderOfRainyDaisLInCities = new ArrayList<>();
        // Hsh map sme vytvorili asi preto aby sme tam mohli zaznamenat kolko v jednotlivich mestach prsalo
        HashMap<String, Integer> rainPercity = new HashMap<>();
        // vzdy ked pracujeme z file musime vytvorit Try Catch
        try {
            // nacitame si do Array Listu info z file
            calenderOfRainyDaisLInCities = Files.readAllLines(path);
            // pouzijeme exeption ak by sa subor nenacital, neexistoval alebo ina chyba pri citani suboru
        } catch (IOException exaption) {
            System.out.println("something wrong with file");
        }
        // pomocou foreach prehladavame Array List a nacteme prvky Arraz Listu do premennej line
        for (String line : calenderOfRainyDaisLInCities) {
            // vytvorime nove String pole v ktorom rozdelime text z line pomocou ","
            String[] words = line.split(",");
            // urcime ze vsetky elementy na 1 mieste budu city
            String city = words[1];
            // a na druhom mieste weather
            String weather = words[2];
            // porovname ci String weather je rovnaky ako String "RAINY"
            if (weather.equals("RAINY")) {
                // zistime ci Hsh Map rainPerCity obsahuje String city
                if (rainPercity.containsKey(city)) {
                    // ak su podmienky splnene tak int previous number bude obsahovat vrateny Key city
                    int previousnumber = rainPercity.get(city);
                    // prida sa key value z city + 1
                    rainPercity.put(city, previousnumber + 1);
                    // inak sa prida hodnota 1
                } else {
                    rainPercity.put(city, 1);
                }
            }
        }
        // tento zvisok sluzi na vypocet ktore mesto z mostRainyCity  ma najviac RAINY
        int max = 0;
        String mostRainyCity = "";
        for (String city : rainPercity.keySet()) {
            if (mostRainyCity.equals("")) {
                mostRainyCity = city;
            }
            int countOfRains = rainPercity.get(city);
            rainPercity.get(city);
            if (countOfRains > max) {
                max = countOfRains;
                mostRainyCity = city;
            }
        }
        System.out.println(mostRainyCity);
    }
}

