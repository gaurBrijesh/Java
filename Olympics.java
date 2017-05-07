package dataStructure;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by brijesh on 10/4/17.
 */
public class Olympics {
    public static void main(String[] args) {
        //some olympics sports

        ArrayList<String> olympicSports = new ArrayList<String>();
        olympicSports.add("Football");
        olympicSports.add("BasketBall");
        olympicSports.add("Cricket");
        olympicSports.add("Driving");
        olympicSports.add("Boxing");

        System.out.println("They are " + olympicSports.size() + " olympics sport in this list. They are :");

        for (String sports: olympicSports) {
            System.out.println(sports);
        }

        //host cities and year they are hosted summer olympics

        HashMap<String, Integer> hostCities = new HashMap<String, Integer>();
        hostCities.put("London", 2008);
        hostCities.put("Beijing", 2010);
        hostCities.put("India", 2017);

        for (String city : hostCities.keySet()) {
            if (hostCities.get(city) < 2017){
                System.out.println(city + " hosted summer olympics in " + hostCities.get(city) + ".");

            }
            else {
                System.out.println(city + " will host summer olympics in " + hostCities.get(city) + ".");
            }

        }



    }

}
