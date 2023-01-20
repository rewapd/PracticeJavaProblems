public class ShareDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(77,64));
    }

    public static boolean hasSharedDigit(int a,int b){
        if(a>=10 && b>=10 && a<=99 && b<=99){
            while (a > 0) {
                int digit= a%10;
                int temp=b;
                while(temp>0){
                    int digitInb=temp%10;

                    if(digit==digitInb){
                        return true;
                    }
                    temp=temp/10;
                }
                a=a/10;
            }
        }
        return false;

    }
}
