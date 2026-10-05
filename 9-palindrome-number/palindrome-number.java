 import java.util.Scanner;
class Solution {
    public  static boolean isPalindrome(int x ){
         int orginal = x;
          int reverse = 0;
          while(x>0){

          
        int  digit = x%10;
       
          reverse = (reverse *10 +digit);
         x =  x/10 ;
          }

        if(orginal == reverse){
            return true;
        }
        else{
            return false;
        }  
    }
    public static void main(String[] args){
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        isPalindrome(n);
    }

}
