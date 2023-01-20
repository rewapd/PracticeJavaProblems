public class WhileLoop {
    public static void main(String[] args) {
        int start=5;int countEven=0, countOdd=0;
        while(start<=20) {
            if(isEvenNumber(start)){
                System.out.println(start);
                countEven++;
            }
            else{
                countOdd++;
            }
            start++;

        }
        System.out.println("Count of even : "+countEven);
        System.out.println("Count of Odd : "+countOdd);
    }

    public static boolean isEvenNumber(int num){
        if(num%2==0){
                return true;
            }
        return false;
    }

}
