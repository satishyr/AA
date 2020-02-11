public class FactorsOfLimitNum{

    public static void main(String[] args) {

        int n = 120;
        System.out.print("Factors of " + n + " are: ");
        for(int i = 1; i <= n; ++i) {
            if (n % i == 0) {
                
                System.out.print(i + " ");
               
                }  
               System.out.println("Factors of " + i + " are: ");
               for(int j=1;j<=i;j++){
                 if(i%j==0)
                 System.out.println(j +" ");}
        }
    }
}