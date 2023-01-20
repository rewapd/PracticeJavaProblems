public class SumFirstLastDigit {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(654));
    }

    public static int sumFirstAndLastDigit(int number){
        int sum =0;int lastDigit=0;int firstDigit=0;
        if(number>0){
            lastDigit=number%10;
            while(number>0){
                firstDigit=number;
                number=number/10;
            }
            return lastDigit+firstDigit;
        }
        return -1;
    }
}
