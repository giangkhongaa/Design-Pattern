package Demo_Facade;

/**
 * @author Giang 
 * Client
 */
public class DemoFacadePattern {

	public static void main(String[] args) {
		
		ControlShape shapeMaker = new ControlShape();// initialization class facade
		shapeMaker.drawCircle();//call drawCircle
		shapeMaker.drawRectangle();//call drawRectangle
		shapeMaker.drawSquare();//call drawSquare
	}
	
}
