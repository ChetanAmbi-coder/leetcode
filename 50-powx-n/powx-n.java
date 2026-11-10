import java.util.Scanner;
class Solution {
    public   static double myPow(double x, int n) {
         int  N = n;
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
          public static double power(double x, int  n){
            
         
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
   
}