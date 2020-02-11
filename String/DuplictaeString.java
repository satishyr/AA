import java.util.*;
class DuplictaeString{
public static void main(String []args){
  
    String st = "dduurrggaa ";

     char arr[] = st.toCharArray();
    Set<Character> s = new LinkedHashSet<Character>();
    for (char c : arr) {
    s.add(c);
  }

    StringBuilder sb = new StringBuilder();
    for (Character ch : s) {
    sb.append(ch);
  }
    System.out.println(sb.toString());
  }
 }
