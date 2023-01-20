public class Switch {
    public static void main(String[] args) {
        String month="xyz";
        System.out.println(getQuarter(month));
        char c= 'A';
        System.out.println(switchChallenge(c));
        System.out.println(printDayOfWeek(2));
    }

    public static String getQuarter(String month){
        return switch (month) {
            case "Jan", "Feb", "Mar" -> { yield "1st";}
            case "Apr", "May", "Jun" -> "2nd";
            case "Jul", "Aug", "Sept" -> "3rd";
            case "Oct", "Nov", "Dec" -> "4rth";
            default -> {
                String result ="bad";
                yield result;
            }
            };


    }

    public static String switchChallenge(char c){

            switch (c) {
                case 'A':
                    return "Able";

                case 'B':
                    return "Baker";

                case 'C':
                    return "Charlie";

                case 'D':
                    return "Dog";

                case 'E':
                    return "Easy";

                default:
                    return "Invalid char";

            }

    }
    public static String printDayOfWeek(int number){
        return switch (number) {
            case 0 -> "Sunday";
            case 1 -> "Monday";
            default -> "invalid number";
        };
    }
    }

