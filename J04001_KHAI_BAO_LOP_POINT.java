import java.util.Scanner;

class Point {
    private double x;
    private double y;
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public double distance (Point a, Point b){
        return Math.sqrt(Math.pow((a.x-b.x),2) + Math.pow((a.y-b.y),2));
    }
}
public class J04001_KHAI_BAO_LOP_POINT {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- >0){
            Point a = new Point(in.nextDouble(), in.nextDouble());
            Point b = new Point(in.nextDouble(), in.nextDouble());
            System.out.printf("%.4f\n",b.distance(a,b));
        }
        in.close();
    }
}
