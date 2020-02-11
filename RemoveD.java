class RemoveD{
 static int getDuplicates(int[] arr,int n){
    if(n==0||n==1){
    return n;
   } 
   int j=0;
   for(int i=0;i<n-1;i++){
     if(arr[i] !=arr[i+1]){
      arr[j++]=arr[i];
    }
  } 
   arr[j++]=arr[n-1];
   return j;
  }
   public static void main(String[] args){
    int[] arr={11,11,22,33,33,4444,55,6,66,77,77};
    int length=arr.length;
    length= getDuplicates(arr,length);
    for(int i=0;i<length;i++){
     System.out.print(arr[i] + " ");
    }
  }
}		