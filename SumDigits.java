public class SumDigits {
    public static void main(String[] args) {
        System.out.println(sumDigits(6));
    }

    public static int sumDigits(int num){
        int sum=0;int rem=0;
        if(num>0){
            while(num>0){
                rem=num%10;
                sum+=rem;
                num=num/10;
            }
            return sum;
        }
        return -1;
    }
}
