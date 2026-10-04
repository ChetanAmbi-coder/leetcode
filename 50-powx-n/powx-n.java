import java.util.Scanner;
class Solution {
    public   static double myPow(double x, int n) {
         long N = n;
         boolean negative = false;

         if(n<0){
            N = -N;
            negative = true;

         }
    
         double result = power(x,N);
         if(negative){
            return 1.0 / result;
         }
         return result;
    }
          public static double power(double x, long n){
            
         
         if(n==0){
            return 1.0;
            
         }
         double half = power(x,n/2);
         if(n%2==0){
            return half*half;
         }
         else{
            return x*half*half;
         }
         
        
    }
    public static void main(String[] args){
        double x;
        int n;
        Scanner in = new Scanner(System.in);
         x = in.nextDouble();
         n = in.nextInt();
         double result = myPow(x,n);
         System.out.println("result is:" +result);
         in.close();
        

    }
}