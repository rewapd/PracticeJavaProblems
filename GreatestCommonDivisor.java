public class GreatestCommonDivisor {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
        System.out.println(getGreatestCommonDivisor(45,78));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int gcd=0;int min=0;
        if(first>=10 && second>=10 ){
            if(first<second){
                min=first;
            }
            else{
                min=second;
            }
            for(int i=1;i<=min;i++){
                if(first%i==0 && second%i==0){
                    gcd= i;
                }
            }
            return gcd;
        }
        return -1;
    }
}
