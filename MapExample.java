import java.util.*;    
class Games {    
    
public String name,sport ;   
public Games(String name, String sport) {    
    
    this.name = name;    
    this.sport=sport;
}    
}    
public class MapExample {    
public static void main(String[] args) {    
    
    Map<Integer,String> hm=new HashMap<Integer,String>();    
     
    Games b1=new Games("Sachin","cricket");    
    Games b2=new Games("Trump","Vollyboll");    
       
   
 hm.put(1,b1);  
 hm.put(2,b2); 
 System.out.println(hm);
 Set s= hm.keySet();
 System.out.println("Keys :"+ s);
 Collection c=hm.values();
 System.out.println("Collection :"+ c);
 
 Iterator it=s.iterator();
 while(it.hasNext()){
 Object obj=it.next();
 Integer i=(Integer)obj;
  System.out.println(i+" "+hm.get(i));

} 
   
      
   
    }    
}    
   