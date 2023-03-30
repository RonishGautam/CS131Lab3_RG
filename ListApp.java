
public class ListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Square> squareList = new ArrayList<Square>();
		squareList.addItem(new Square (2.1));
		squareList.addItem(new Square (6.52));


		ArrayList<String> stringList = new ArrayList<String>();
		stringList.addItem("Elementry");
		stringList.addItem("Middle");
		stringList.addItem("High");

		
		ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();		
		pointList.addItem(new PointThreeD (1,2,3));


				
		System.out.println(pointList.toString());
		System.out.println(squareList.toString());
		System.out.println("The Strings: " + stringList.toString());
		
		
		
		//ListApp class. This method creates and populates several ArrayList objects, and then prints 
		
	}// end main


}// end ListApp
