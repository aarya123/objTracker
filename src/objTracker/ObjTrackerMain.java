package objTracker;
import java.util.*;
import objTracker.Triangle;
public class ObjTrackerMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double[] sides= new double[3];
		double[] angles= new double[3];
		for(int i=0;i<3;i++){
			System.out.println("Enter side #"+(i+1));
			sides[i]=scn.nextDouble();
		}
		for(int i=0;i<3;i++){
			System.out.println("Enter angle #"+(i+1));
			angles[i]=scn.nextDouble();
		}
		Triangle triangle = new Triangle(sides[0],sides[1],sides[2],angles[0],angles[1],angles[2]);
                for(int i=0;i<3;i++){
			System.out.println("Angle #"+(i+1));
			System.out.println(triangle.getAngle(i));
		}
		for(int i=0;i<3;i++){
			System.out.println("Side #"+(i+1));
			System.out.println(triangle.getSide(i));
		}
                for(int i=0;i<3;i++){
                    System.out.println("Height with side #"+(i+1)+" as the base");
                    System.out.println(triangle.getHeight(i));
                }
	}

}
