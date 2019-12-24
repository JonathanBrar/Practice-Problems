class Solution {
    public boolean isPalindrome(int x) {
        // if x is a negative number the - won't be the same in reverse
        if (x < 0){
            return false;
        }

        int original = x;
        int reverse = 0;
        //reverse is the reversed x value 
        while (x != 0){
            // reverses x and stores in reverse variable
            int pop = x % 10;
            x /= 10;
            
            reverse = reverse * 10 + pop;
            
            }
            //compare reverse to the original value
        return (original == reverse);
        
            
            
            
            
    }
       
        
       
    


}