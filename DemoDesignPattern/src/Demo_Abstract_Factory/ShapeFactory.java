package Demo_Abstract_Factory;

/**
 * @author Giang
 *
 * to inherit AbstractFactory and Override IShape function
 */
public class ShapeFactory extends AbstractFactory {

	@Override
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

	@Override
	public IColor getColor(String colorType) {

		return null;
	}
}
