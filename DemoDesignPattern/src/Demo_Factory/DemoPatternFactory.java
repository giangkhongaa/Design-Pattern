package Demo_Factory;

/**
 * @author Giang
 *
 * Client
 */
public class DemoPatternFactory {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();

		// tao ra doi tuong CircleImpl bang phuong thuc getShape
		IShape shape_1 = shapeFactory.getShape("CIRCLE");

		// tham chieu toi phuong thuc draw of CricleImpl
		shape_1.draw();

		// tao ra doi tuong RectangleImpl bang phuong thuc getShape
		IShape shape_2 = shapeFactory.getShape("RECTANGLE");

		// tham chieu toi phuong thuc draw of RectangleImpl
		shape_2.draw();

		// tao ra doi tuong SquareImpl bang phuong thuc getShape
		IShape shape_3 = shapeFactory.getShape("SQUARE");

		// tham chieu toi phuong thuc draw of SquareImpl
		shape_3.draw();

	}

}
