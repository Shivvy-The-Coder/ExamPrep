//Write a Program to check the distance of 2D points from the origin and the print the point with highest-distance.

//Create class Point with attributes as below
// double x
// double y

//In Solution class, define the main method to read the values for three points objects.
//Next,Create below method in Solution class which will take three point objects as input parameters and return the point
//with highest-distance from origin.
//public static Point pointWithHighestOriginDistance(Point p1, Point p2, Point p3)

//Consider sample input as below to read values for six point objects.

//Input: 2 2 3 3 -4 -4
//Output: -4.0
//        -4.0

package TCS_IPA;
import java.util.*;

class Solution
{
    public static void main(String[] args) {
       point one = new point(2,2);
       point two = new point(3,3);
       point three = new point(-4,-4);
       pointWithHighestOriginDistance(one, two, three);
    }

    public static void pointWithHighestOriginDistance(point p1, point p2, point p3)
        {
            double dis1=caluclateDistanceFromOrigin(p1.x, p1.y);
            double dis2=caluclateDistanceFromOrigin(p2.x, p2.y);
            double dis3=caluclateDistanceFromOrigin(p3.x, p3.y);
            if(dis1>=dis2 && dis1>=dis3)    
                System.out.print(p1.x+" "+p1.y);
            else if(dis2>=dis1 && dis2>=dis3)    
            System.out.print(p2.x+" "+p2.y);
            else
            System.out.print(p3.x+" "+p3.y);
                
        }

    public static double caluclateDistanceFromOrigin(double x, double y)
    {
        double ans = (double)(Math.pow(x, 2)+Math.pow(y, 2));
        return Math.sqrt(ans);
    }
    
}



class point
{
    double x;
    double y;
    point(double x,double y)
        {
            this.x=x;
            this.y=y;
        }
}
