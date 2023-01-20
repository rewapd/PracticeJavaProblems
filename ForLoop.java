public class ForLoop {
    public static void main(String[] args) {
        for(double rate=7.5; rate<=10;rate+=0.25){
            System.out.println("The amount at rate is = "+calculateInterest(10000,rate));
        }
    }

    public static double calculateInterest(double amount, double rate){
        return (amount*(rate/100));
    }
}
