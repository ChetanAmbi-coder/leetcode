class Solution {
    public boolean isPalindrome(String s) {
        String org = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder sb = new StringBuilder(org);
        
        sb.reverse();
        if(org.equals(sb.toString())){
            return true;
        }
        else{
            return false;
        }
        
    }
}