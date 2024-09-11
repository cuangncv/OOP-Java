import java.util.Scanner;

class Rectange {
    private double width;
    private double height;
    private String color;
    public Rectange (double width, double height,String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }
    public double findPerimeter(){
        return (width+height)*2;
    }
    public double findArea(){
        return (width*height);
    }
    public String Color(){
        return color.substring(0,1).toUpperCase()+color.substring(1).toLowerCase();
    }
    public boolean check(){
        int p = (int)width;
        int q = (int)height;
        if(p!= width || q!=height || p < 1 || q < 1){
            return false;
        }
        else return true;
    }
}
public class J04002_KHAI_BAO_LOP_HINH_CHU_NHAT {
     public static void main (String [] args){
         Scanner in = new Scanner(System.in);
         Rectange x = new Rectange(in.nextDouble(), in.nextDouble(), in.next());
         if(x.check()){
             System.out.printf("%.0f %.0f %s",x.findPerimeter(),x.findArea(),x.Color());
         }
         else System.out.println("INVALID");
         in.close();
     }
}
