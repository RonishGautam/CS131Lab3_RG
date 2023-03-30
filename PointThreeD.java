
public class PointThreeD {
	
private double xpoint;
private double ypoint;
private double zpoint;
// All the variables are listed here. 

public PointThreeD() {
	
} // This is a PointThreeD constructor without perimeter 
public PointThreeD(double x, double y, double z) {
	this.xpoint=x;
	this.ypoint=y;
	this.zpoint=z;
}// This is with perimeter 
public String toString(){
	return "The Points are: " +"{"+"X point:" + xpoint + " Y point:"+ ypoint + " Z point:"+ zpoint +"}";
	}// end toString
}// end PointThreeD
