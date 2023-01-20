public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9  ,99,999));
    }

    public static boolean hasSameLastDigit(int a,int b,int c){
        if(isValid(a) && isValid(b) && isValid(c)){
            int lastDigitInA=a%10;
            int lastDigitInB=b%10;
            int lastDigitInC=c%10;
            if(lastDigitInA==lastDigitInB || lastDigitInB==lastDigitInC || lastDigitInC== lastDigitInA){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int a){
        if(a>=10 && a<=1000){
            return true;
        }
        return false;
    }
}
