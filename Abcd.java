import java.util.*;
class Test{
  ArrayList<String> al=new ArrayList<String>();
 public static int add(int a){
   al.add(a);
  }
 public static void main(String[] args){
  Test t1=new Test();
  t1.add(5);
  Test t2=new Test();
  t2.add(10);
  System.out.println(t1.list);
  System.out.println(t2.list);
 }
}