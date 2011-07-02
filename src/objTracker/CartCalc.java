package objTracker;

public class CartCalc {
        public static double[] getCoordinates(int pointIndex, Triangle triangle) {
        int x = 0, y = 1;
        double[] coordinates = new double[2];
        if (pointIndex == 0) {
            coordinates[x] = 0;
            coordinates[y] = 0;
            return coordinates;
        } else if (pointIndex == 1) {
            coordinates[x] = triangle.getSide(2);
            coordinates[y] = 0;
            return coordinates;
        } else {
            if (triangle.getAngle(0) > 90) {
                coordinates[x] = -Math.sqrt(Math.pow(triangle.getSide(1), 2) - Math.pow(triangle.getHeight(2), 2));
            } else if (triangle.getAngle(0) == 90) {
                coordinates[x] = 0;
            } else {
                coordinates[x] = Math.sqrt(Math.pow(triangle.getSide(1), 2) - Math.pow(triangle.getHeight(2), 2));
            }
            coordinates[y] = triangle.getHeight(2);
            return coordinates;
        }
    }
        public static double getDistance(Triangle triangle1, Triangle triangle2, int pointIndex){
            return Math.sqrt(Math.pow(getCoordinates(pointIndex, triangle1)[0]-getCoordinates(pointIndex, triangle2)[0], 2)+Math.pow(getCoordinates(pointIndex, triangle1)[1]-getCoordinates(pointIndex, triangle2)[1], 2));
            
        }
}
