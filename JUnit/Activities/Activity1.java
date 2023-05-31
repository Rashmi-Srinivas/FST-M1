import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

public class Activity1 {
    ArrayList<String> list;

    @BeforeEach
    void setUp(){
     list = new ArrayList<String>();
     list.add("AAA");
     list.add("BBB");
     list.add("CCC");
    }

    @Test
    void insertTest(){
     assertEquals(3, list.size(), "Size mismatch");
     list.add("DDD");
     assertEquals(4, list.size(), "Size mismatch");
     for(int i=0; i<list.size(); i++){
         assertEquals("AAA", list.get(0), "Element mismatch");
         assertEquals("BBB", list.get(1), "Element mismatch");
         assertEquals("CCC", list.get(2), "Element mismatch");
         assertEquals("DDD", list.get(3), "Element mismatch");
     }
    }


    @Test
    void replaceTest(){
     assertEquals(3, list.size(), "Size mismatch");
     list.add("EEE");
     assertEquals(4, list.size(), "Size mismatch");
     list.set(1, "Rashmi");
     assertEquals("AAA", list.get(0), "Element mismatch");
     assertEquals("Rashmi", list.get(1), "Element mismatch");
     assertEquals("CCC", list.get(2), "Element mismatch");
     assertEquals("EEE", list.get(3), "Element mismatch");
    }
}
