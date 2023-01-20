public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=1;i<=1000;i++){
            if(prime(i)){
                System.out.println(i+ " is Prime number" );
                if(count++==3){
                    break;
                };

            }
        }

        System.out.println("Total Prime number between 0 to 1000 are="+count);
    }

    public static boolean prime(int number) {
        if (number <= 2) {
            return (number == 2);
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}

