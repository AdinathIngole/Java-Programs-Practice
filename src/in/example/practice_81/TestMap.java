package in.example.practice_81;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<String,String> countryMap = new HashMap<>();

        countryMap.put("India","New Delhi");
        countryMap.put("Shrilanka","Colombo");
        countryMap.put("USA","New Yorke");
        countryMap.put("UK","London");
        countryMap.put("UAE","Dubai");

        System.out.print("Enter the country name which you want to find Captal : ");
        String country = input.next();

        if (countryMap.containsKey(country)){
            System.out.printf("Capital of %s is %s " ,country, countryMap.get(country));
        }else {
            System.out.println("Sorry ,We don't know tha Capitals.");
        }
    }
}
