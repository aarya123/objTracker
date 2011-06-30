//REFERENCE TRIANGLE http://2000clicks.com/mathhelp/TriangleABC.gif
package objTracker;

public class Triangle {

    double sides[] = new double[3];
    double angles[] = new double[3];

    public Triangle(double sideA, double sideB, double sideC, double angleA, double angleB, double angleC) {
        //MUST HAVE ATLEAST TWO ANGLES (IN DEGREES) AND ONE SIDE
        if (angleA == 0.0) {
            angleA = 180.0 - angleB - angleC;
        }
        if (angleB == 0.0) {
            angleB = 180.0 - angleA - angleC;
        }
        if (angleC == 0.0) {
            angleC = 180.0 - angleB - angleA;
        }
        angles[0] = angleA;
        angles[1] = angleB;
        angles[2] = angleC;
        sides[0] = sideA;
        sides[1] = sideB;
        sides[2] = sideC;
        int knownSide = 3;
        for (int i = 0; i < 3; i++) {
            if (sides[i] != 0.0) {
                knownSide = i;
            }
        }
        if (sideA == 0.0) {
            sideA = ((Math.sin(Math.toRadians(angles[0]))) * sides[knownSide]) / Math.sin(Math.toRadians(angles[knownSide]));
            sides[0] = sideA;
        }
        if (sideB == 0.0) {
            sideB = ((Math.sin(Math.toRadians(angles[1]))) * sides[knownSide]) / Math.sin(Math.toRadians(angles[knownSide]));
            sides[1] = sideB;
        }
        if (sideC == 0.0) {
            sideC = ((Math.sin(Math.toRadians(angles[2]))) * sides[knownSide]) / Math.sin(Math.toRadians(angles[knownSide]));
            sides[2] = sideC;
        }
    }

    public double getHeight(int baseIndex) {
        if (baseIndex == 2) {
            return sides[1] * Math.sin(Math.toRadians(angles[0]));
        } else if (baseIndex == 1) {
            return sides[0] * Math.sin(Math.toRadians(angles[2]));
        } else {
            return sides[2] * Math.sin(Math.toRadians(angles[1]));
        }
    }

    public double getSide(int index) {
        return sides[index];
    }

    public double getAngle(int index) {
        return angles[index];
    }

    public double[] getCoordinates(int pointIndex) {
        int x = 0, y = 1;
        double[] coordinates = new double[2];
        if (pointIndex == 0) {
            coordinates[x] = 0;
            coordinates[y] = 0;
            return coordinates;
        } else if (pointIndex == 1) {
            coordinates[x] = sides[2];
            coordinates[y] = 0;
            return coordinates;
        } else {
            if (angles[0] > 90) {
                coordinates[x] = Math.sqrt(Math.pow(sides[1], 2) - Math.pow(getHeight(2), 2));
            } else if (angles[0] == 90) {
                coordinates[x] = 0;
            } else {
                coordinates[x] = Math.sqrt(Math.pow(sides[0], 2) - Math.pow(getHeight(2), 2));
            }
            coordinates[y] = getHeight(2);
            return coordinates;
        }
    }
}
