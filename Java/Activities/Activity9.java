package Activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args){
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Cricket");
        myList.add("Volleyball");
        myList.add("Football");
        myList.add("Hockey");
        myList.add("TableTennis");

        System.out.println("Elements in the array list are: ");
        for(String str: myList){
            System.out.println(str);
        }

        System.out.println("\n3rd element in the list is: "+myList.get(2));

        System.out.println("\nDoes Hockey exists in the list? "+myList.contains("Hockey"));

        System.out.println("\nSize of the arraylist is: "+myList.size());

        myList.remove("Football");

        System.out.println("\nSize of the list after removing the element is: "+myList.size());

        System.out.println("\nElements in the list after removal of an element are: ");

        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }

        System.out.println("\n**********Done***********");
    }
}