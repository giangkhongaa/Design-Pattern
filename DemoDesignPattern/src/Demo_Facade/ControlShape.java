package Demo_Facade;

/**
 * @author Giang 
 * uses the concrete classes to delegate user calls to these classes
 * this is class facade
 */
public class ControlShape {
	private IShape circle;//delegate circle
	private IShape rectangle;//delegate rectangle
	private IShape square;//delegate square

	//initialize class ShapeMaker
	public ControlShape() {
		circle = new CircleImpl(); //referenced to CircleImpl
		rectangle = new RectangleImpl();//referenced to RectangleImpl
		square = new SquareImpl();//referenced to SquareImpl
	}
	
    //function call draw by IShape referenced to CircleImpl
	public void drawCircle() {
		circle.draw();
	}
	
	//function call draw by IShape referenced to RectangleImpl
	public void drawRectangle() {
		rectangle.draw();
	}
	
	//function call draw by IShape referenced to SquareImpl
	public void drawSquare() {
		square.draw();
	}
}
