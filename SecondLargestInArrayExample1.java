import java.util.*;
class SecondLargestInArrayExample1{
static int getSecondLargest(int[] a,int total){
 Arrays.sort(a);
 return a[total-2];
 }
 public static void main(String []arg){
 int a[]={1,2,3,4,67,8};
 System.out.println("2nd Largest No :" + getSecondLargest(a,a.length));
 }
}