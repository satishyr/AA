import java.util.*;
 class SpcesDeleted{
   public static void main(String []args){

    String str = "hi   iam    durga   prasad";
    StringTokenizer st= new StringTokenizer(str," ");
    StringBuilder sb= new StringBuilder();
      while(st.hasMoreElements()){
      sb.append(st.nextElement()).append(" ");  
      } 
       System.out.println(sb.toString().trim());
  }
}