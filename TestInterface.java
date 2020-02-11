interface Printable{  
void print();  
}  
interface Showable extends Printable{  
void show();  
}  
class TestInterface implements Showable{  
public void print(){System.out.println("I Love You");}  
public void show(){System.out.println("      " + "Rakul");}  
  
public static void main(String args[]){  
TestInterface obj = new TestInterface();  
obj.print();  
obj.show();  
 }  
}  