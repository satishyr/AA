
 class CountTheWord
{
    public static void main(String[] args)
    {
        String str="Iam the Bunny";
  
        String[] arr = str.trim().split(" ");
 
        System.out.println("Number of words in the string = "+arr.length);
    }
}