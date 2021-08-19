import java.util.*;
public class MapTest {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();
        map.put(10, 100);
        map.put(20, 200);
        System.out.println(map);
        map.remove(10);
        System.out.println(map);
    }
}
