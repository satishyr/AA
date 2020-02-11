class Per{
 public static void main(String[] ar){
 int limit=1000;
 boolean isPerfect=false;
 int i;
 for(i=2;i<limit;i++){
   isPerfect=isNumPerfect(i);
   if(isPerfect){
   System.out.println(i);
   }
  }
 }
 public static boolean isNumPerfect(int i){
 boolean isPerfect=false;
 int sum=1;
 int x;
 for(x=2;x<=i/2;x++){
 if(i%x==0){
 sum += x;
 }
}
  if(sum==i){
    isPerfect=true;
  } 
   return isPerfect;
 }
}