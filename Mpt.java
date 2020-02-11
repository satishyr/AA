class Mpt{
 public static void main(String []args){
   String str = "helloslkhellodjladfjhello";
String Str1 = "hello";
int lastIndex = 0;
int count = 0;

while (lastIndex != -1) {
    lastIndex = str.indexOf(Str1,lastIndex);

    if( lastIndex != -1)
        count++;

    lastIndex += Str1.length();
}

System.out.println(count);
}}