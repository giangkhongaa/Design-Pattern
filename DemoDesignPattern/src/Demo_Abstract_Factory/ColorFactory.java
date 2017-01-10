package Demo_Abstract_Factory;


/**
 * @author Giang
 *
 * to inherit AbstractFactory and Override IColor function
 */
public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		return null;
	}

	@Override
	public IColor getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("BLUE")) {
			return new BlueImpl();
		} else if (colorType.equalsIgnoreCase("RED")) {
			return new RedImpl();
		} else if (colorType.equalsIgnoreCase("WHITE")) {
			return new WhiteImpl();
		}
		return null;
	}
}
