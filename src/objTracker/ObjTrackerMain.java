package objTracker;
import java.util.*;
public class ObjTrackerMain {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double[] sides= new double[3];
		double[] angles= new double[3];
                System.out.println("-------Triangle 1-------");
		for(int i=0;i<3;i++){
			System.out.println("Enter side #"+(i+1));
			sides[i]=scn.nextDouble();
		}
		for(int i=0;i<3;i++){
			System.out.println("Enter angle #"+(i+1));
			angles[i]=scn.nextDouble();
		}
		Triangle triangle1 = new Triangle(sides[0],sides[1],sides[2],angles[0],angles[1],angles[2]);
                for(int i=0;i<3;i++){
			System.out.println("Angle #"+(i+1));
			System.out.println(triangle1.getAngle(i));
		}
		for(int i=0;i<3;i++){
			System.out.println("Side #"+(i+1));
			System.out.println(triangle1.getSide(i));
		}
                for(int i=0;i<3;i++){
                    System.out.println("Height with side #"+(i+1)+" as the base");
                    System.out.println(triangle1.getHeight(i));
                }
                for(int i=0;i<3;i++){
                    System.out.println("Coordinates for point #"+(i+1));
                    System.out.println("("+CartCalc.getCoordinates(i, triangle1)[0]+", "+CartCalc.getCoordinates(i, triangle1)[1]+")");
                }
                System.out.println("-------Triangle 2-------");
                for(int i=0;i<3;i++){
			System.out.println("Enter side #"+(i+1));
			sides[i]=scn.nextDouble();
		}
		for(int i=0;i<3;i++){
			System.out.println("Enter angle #"+(i+1));
			angles[i]=scn.nextDouble();
		}
                Triangle triangle2 = new Triangle(sides[0],sides[1],sides[2],angles[0],angles[1],angles[2]);
                for(int i=0;i<3;i++){
			System.out.println("Angle #"+(i+1));
			System.out.println(triangle1.getAngle(i));
		}
		for(int i=0;i<3;i++){
			System.out.println("Side #"+(i+1));
			System.out.println(triangle1.getSide(i));
		}
                for(int i=0;i<3;i++){
                    System.out.println("Height with side #"+(i+1)+" as the base");
                    System.out.println(triangle1.getHeight(i));
                }
                for(int i=0;i<3;i++){
                    System.out.println("Coordinates for point #"+(i+1));
                    System.out.println("("+CartCalc.getCoordinates(i, triangle2)[0]+", "+CartCalc.getCoordinates(i, triangle2)[1]+")");
                }
                for(int i=0;i<3;i++){
                    System.out.println("Distance between point #"+i);
                    System.out.println(CartCalc.getDistance(triangle1, triangle2, i));
                }
	}
}
