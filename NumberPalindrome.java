public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
    }

    public static boolean isPalindrome(int number){
        int reverse=0;
        int temp=number;
        if(number<0){
            number=number*-1;
        }

        while(number>0){
            int lastDigit=number%10;
            reverse=(reverse*10)+lastDigit;
            number=number/10;
        }
        System.out.println(reverse);
        if(temp==reverse){
            return true;
        }else {
            return false;
        }
    }
}
