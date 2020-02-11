import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Iterator;
import java.util.*;

public class Detail{

    public static void main(String[] args) {

       HashMap<Integer, String> hm = new HashMap<Integer, String>();
         hm.put(25, "JAVA");
         hm.put(45, "UNIX");
         hm.put(32, "SQL");
         hm.put(12, ".NET");
         System.out.println("Before Sorting:");
       
         Set s=hm.keySet();
         System.out.println("Keys :" + s);
         Collection c= hm.values();
         System.out.println("Vals :"+c);
         Iterator it= s.iterator();
         while(it.hasNext()){
         Object obj= it.next();
         Integer i=(Integer)obj;
         System.out.println(i+" "+ hm.get(i));
            }
       Map<Integer, String> map = new TreeMap<Integer, String>(hm); 
         System.out.println("After Sorting:");

         Set s2 = map.keySet();
         System.out.println("Keys :" + s2);
         Collection c2= map.values();
         System.out.println("Vals :"+c2);
        
         Iterator it2= s2.iterator();
         while(it2.hasNext()){
         Object obj= it2.next();
         Integer i=(Integer)obj;
         System.out.println(i+" "+ map.get(i));
          }
         
         }
    }
