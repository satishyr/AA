import java.util.*;
import java.util.Map;
class Test{
 HashMap<Integer,String> hm=new HashMap<Integer,String>();;
 public void put(int a,String x){
   hm.put(a,x);
  }
 public static void main(String[] args){
  Test t1=new Test();
  t1.put(5,"Bunny");
  t1.put(6,"Arya");
  t1.put(7,"Surya");
  Test t2=new Test();
  t2.put(10,"Bunny");
  System.out.println(t1.hm);
  System.out.println(t2.hm);
  
 }
}