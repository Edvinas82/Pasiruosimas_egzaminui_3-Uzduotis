public class Main {
    public static void main(String[] args) {
        double pirmoX =5.15;
        double pirmoY = 4.20;
        double antroX = 4.12;
        double antroY = 5.17;
        System.out.println(atsumasTarpDviejuTasku(pirmoX, pirmoY, antroX, antroY));
    }

    public static double atsumasTarpDviejuTasku(double x1, double y1, double x2, double y2){
        return Math.sqrt((Math.pow(x2 - x1, 2)) + (Math.pow(y2 - y1, 2)));
    }
}