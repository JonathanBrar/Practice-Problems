//pop and push method inversing the number
class Reverseinteger {
    public int reverse(int x) {
        // reverse contains the reversed number
        int reverse = 0;
        // while loops that pops the last number out and inserts into reverse
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            //checks for overflow in 32 bit integer
            if (reverse > Integer.MAX_VALUE/10 || (reverse == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (reverse < Integer.MIN_VALUE/10 || (reverse == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            reverse = reverse * 10 + pop;
        }
        return reverse;
        
        
    }
}