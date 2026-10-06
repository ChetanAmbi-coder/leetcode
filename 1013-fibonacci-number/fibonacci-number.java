class Solution {

    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;

        }
        else {
           return fib(n-1) + fib(n-2);

        }  
        
    
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(a);

    }
}