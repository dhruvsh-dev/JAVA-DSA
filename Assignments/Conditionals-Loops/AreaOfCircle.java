import java.util.Scanner;

public class AreaOfCircle{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the radius to find the area of circle: ");
        double radius= sc.nextDouble();

        double area= 3.14 *(radius*radius);
        System.out.print("Area of circle: "+area);
    }
}