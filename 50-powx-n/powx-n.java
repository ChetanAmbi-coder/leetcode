class Solution {
    public  static  double power(double x, int n){
        if(n==0){
            return 1.0;

        }
        double half= power(x,n/2);
        if(n%2==0){
            return half*half;
        }else{
            return x*half*half;
        }
    }
    public double myPow(double x, int n) {
        int m = n;
        boolean negative = false;
        double  result = power(x,m);
        if(n<0){
            m = -n;
            negative = true;
            return 1.0/result;
        }else{
            return result;

        }
   
    }
}