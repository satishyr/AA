public class RemoveDuplicateString 
{
   public static void main(String[] args)
    {
	String str="Welcome to Java Session Java Session Session Java"; 		
	String[] arr=str.split(" ");	
	for(int i=0;i<arr.length;i++)				
	{
	  if(arr[i]!=null)
	 {		
	   for(int j=i+1;j<arr.length;j++)	
	   {		
	    if(arr[i].equals(arr[j]))	
	     {
	       arr[j]=null;			
	     }
	   }
         }
       }
       for(int k=0;k<arr.length;k++)		
       {
        if(arr[k]!=null)
        {
         System.out.println(arr[k]);
        }			
      }  
   }
}
