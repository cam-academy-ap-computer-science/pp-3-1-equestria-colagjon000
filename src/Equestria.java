
public class Equestria {
	public static void main (String [] args) {
		//First Position
		double horizontalCoord1 = 28;
		double verticalCoord1 = 22;
		//Second Position
		double horizontalCoord2 = 16;
		double verticalCoord2 = 13;
		//Function
		double distance = getDistance(horizontalCoord1, horizontalCoord2, verticalCoord1, verticalCoord2);
		//print result
		System.out.println("The distance between the two locations is " + distance + " units");
	}
	public static double getDistance (double xOne, double xTwo, double yOne, double yTwo) {
		//first x value subtraction
		double xValsInit = xTwo - xOne;
		//first y value subtraction
		double yValsInit = yTwo - yOne;
		//squares the differences
		double xValsSquared = Math.pow(xValsInit, 2);
		double yValsSquared = Math.pow(yValsInit, 2);
		//adds the squares to find c squared
		double hypoSquare = xValsSquared + yValsSquared;
		//roots the hypotenuse
		double distance = Math.sqrt(hypoSquare);
		//throws back distance value
		return distance;
	}
}
