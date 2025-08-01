import java.util.*;

class QoL {
    public static int round(double value, int nearest) {
        return (int) Math.round(value / nearest) * nearest;
    }
    public static void clear() {
        System.out.print('\u000C');
    }
    public static Scanner in(Object s) {
        Scanner inpt = new Scanner(System.in);
        System.out.println(s);
        return inpt;
    }
    public static void print(Object s) {
        System.out.print(s); //@FlareX
    }
    public static void println(Object s) {
        System.out.println(s); //@FlareX
    }
    public static void println() {
        System.out.println();
    }
    public static double lerp(double t, double a, double b) {
        return a + t * (b - a);
    }
    public static int random(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public static double random(double min, double max) {
        return ((Math.random() * (max - min)) + min);
    }
}
