class Fibb{
 public static void main(String [] ar){
 int a=0,b=1,c;
 System.out.print(a + " ");
 System.out.print(b + " ");
 c=a+b;
 System.out.print(c +" ");
 while(c<89){
 a=b;
 b=c;
 c=a+b;
 System.out.print(c + " ");
}}}