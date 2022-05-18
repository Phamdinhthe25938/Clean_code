package CYlinder;

public class Cylinder {
    private int radius;
    private int height;
    public static double getVolume(int radius, int height){
        double baseArea = getBaseArea(radius);
        double perimeter = getPerimeter(radius);
        double volume = perimeter * height + 2 * baseArea;
        return volume;
    }
    private static double getPerimeter(int radius) {
        return 2 * Math.PI  * radius;
    }

    private static double getBaseArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(Cylinder.getVolume(4,8));
    }

}
