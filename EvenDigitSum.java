public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2252));
    }

    public static int getEvenDigitSum(int number){
        int sum=0;
        if(number>0){
            while(number>0){
                int digit=number%10;
                number=number/10;
                if(digit%2==0){
                    sum+=digit;
                }
            }
            return sum;
        }
        return -1;
    }
}
