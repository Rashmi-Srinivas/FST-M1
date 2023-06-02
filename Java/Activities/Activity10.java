package Activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args){
        HashSet<String> hs = new HashSet<>();
        hs.add("AAA");
        hs.add("BBB");
        hs.add("CCC");
        hs.add("DDD");
        hs.add("EEE");
        hs.add("FFF");

        System.out.println("Original set is");
        for(String str: hs){
          System.out.println(str);
        }

        System.out.println("Size of hashset is "+hs.size());

        hs.remove("CCC");

        if(hs.remove("Rashmi")){
            System.out.println("Rashmi element removed from set");
        }
        else{
            System.out.println("Rashmi element not removed from set");
        }

        System.out.println("Is element DDD present in set? "+hs.contains("DDD"));
        System.out.println("Is element Rashmi present in set? "+hs.contains("Rashmi"));

        System.out.println("Updated set is");

        for(String str: hs){
            System.out.println(str);
        }
    }
}
