import java.util.*;
public class StringsCount{

    public static void main(String args[]) {

        String str = "This is testing Program testing Program";

        String arr[] = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        for (String t : arr) {
            if(map.containsKey(t)){

                map.put(t, map.get(t) + 1);
             }
            
             else {
                map.put(t, 1);
               }
        }
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }

    }
}
