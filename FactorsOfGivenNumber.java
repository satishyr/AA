public class FactorsOfGivenNumber {

    public static void main(String[] args) {

        int n = 5;
        System.out.print("Factors of " + n + " are: ");
        for(int i = 1; i <= n; ++i)
        {
            if (n % i == 0)
              {  
              System.out.print(i + " ");
              }
        }
    }
}