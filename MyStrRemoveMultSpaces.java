import java.util.StringTokenizer;
 
public class MyStrRemoveMultSpaces {
    public static void main(String args[]){

        String str = "String        With       the         the        Multiple          Spaces";
        StringTokenizer st = new StringTokenizer(str, " ");
        StringBuffer sb = new StringBuffer();

        while(st.hasMoreElements()){
        sb.append(st.nextElement()).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}