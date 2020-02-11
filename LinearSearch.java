class LinearSearch{
 public static int linearSearch(int []arr,int value){
  for(int i=0;i<arr.length;i++){
   if(arr[i]==value){
    return i;
}
} return-1;
}
 public static void main(String []args){
  int[] a={10,23,45,54,55,6};
  int value=6;
  System.out.println(linearSearch(a,value));
}}