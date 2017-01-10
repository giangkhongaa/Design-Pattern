package Demo_Factory;

/**
 * @author Giang
 *
 */
public class ShapeFactory {
	/*
	 *  to get object of type shape 
	 * 
	 * @param String
	 * 
	 * @return IShape
	 */
	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new CircleImpl();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new RectangleImpl();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new SquareImpl();
		}
		return null;
	}
}
