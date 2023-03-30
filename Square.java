
public class Square {
	private double side;

	
public Square () {
	side=0;
} // square constructor without perimeter
public Square(double s ) {
	side=s;
	
}// Square constructor with perimeter
public double getAreaSquare() {
    return side * side;

}// end getArea
public String toString() {
	return "Square sides : " + side;
}// end toString
}// end Square
