public class LeapYear {
    public static void main(String[] args) {
        System.out.println(getDaysInMonth(3,-2929));
    }

    public static boolean isLeapYear(int year){
        if (year >= 0 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        int numberOfDays=0;
        if(month < 1 || month >12 || year<1 || year>9999){
            return -1;
        }
        else{
            switch(month){
                case 1, 3, 5, 7, 8, 10, 12: numberOfDays= 31; break;
                case 2:  numberOfDays=isLeapYear(year) ?29 : 28;break;
                case 4, 6, 9, 11: numberOfDays= 30;break;
            }
        }
        return numberOfDays;
    }
}
