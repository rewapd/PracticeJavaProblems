public class Methods {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(9,4));
    }

    public static double convertToCentimeters(int height){
        double heightCm=height*2.54;
        return heightCm;
    }

    public static double convertToCentimeters(int heightFt, int heightIn){
        int heightToIn=heightFt*12+heightIn;
        double heightToCm=convertToCentimeters(heightToIn);
        return heightToCm;
    }
}
