public class SumChallenge {
    public static void main(String[] args) {
        int count=0,sum=0;
        for(int i=1;count<5 && i<=1000;i++){
            if(i%3==0 && i%5==0){
                sum+=i;
                count++;
                System.out.println(i);
            }
        }
        System.out.println("Sum= "+sum);
    }

}
