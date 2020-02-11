import java.util.*;
class HashMapRemovie{
 public static void main(String[] args){
 HashMap<String,String> hm=new HashMap<String,String>();
 hm.put("Sachin","cricket");
 hm.put("Gamming","Vollyball");
 
 System.out.println(hm);
 Set s=hm.keySet();
 System.out.println("Keys :" + s);
 Collection c= hm.values();
 System.out.println(c);
 Iterator it= s.iterator();
 while(it.hasNext()){
 Object obj= it.next();
 Integer i=(Integer)obj;
 System.out.println(i+" "+ hm.get(i));
}
}
}