public class SecondsAndMinutesChallenge {
    public static void main(String[] args) {
        System.out.println(getDurantionString(543,46));
        System.out.println(getDurationString(3600));

    }

    public static String getDurationString(int seconds){
        if(seconds>=0){
        int minutes=seconds/60;
            return getDurantionString(minutes,seconds);
        }
        return "invalid value passed";
    }

    public static String getDurantionString(int minutes, int seconds){
        if(minutes>=0){
            int hrs=minutes/60;
            int remainingMinutes=minutes%60;
            int remainingSeconds=seconds%60;
            return (hrs+"h "+remainingMinutes+"m "+remainingSeconds+"s");

        }
        return "invalid value passed";
    }

}
