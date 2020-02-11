class SecondLargest{
 static int getLargest(int[] a,int total){
   int temp;
   for(int i=0;i<total;i++){
    for(int j=i+1;j<total;j++){
     if(a[i]>a[j]){
         temp=a[i];
         a[i]=a[j];
         a[j]=temp;
}
}
} 
return a[total-2];
}
 public static void main(String[] ar){
 int a[]={1,3,44,43,22,98,6,99};
 System.out.println("2nd Lar:" + getLargest(a,a.length));
}
}