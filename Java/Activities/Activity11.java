package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args){
        HashMap<Integer, String> colours = new HashMap<>();
        colours.put(0, "Green");
        colours.put(1, "Red");
        colours.put(2, "Yellow");
        colours.put(3, "White");
        colours.put(4, "Blue");

        System.out.println("Colours added in the map are: "+colours);
        System.out.println("Size of the map is "+colours.size());

        colours.remove(2);

        System.out.println("Colours after removing yellow from the map are: "+colours);

        System.out.println("Does White exists in the map? "+colours.containsValue("White"));
        System.out.println("Does Orange exists in the map? "+colours.containsValue("Orange"));
        
        System.out.println("Size of the map after removal "+colours.size());
    }
}
