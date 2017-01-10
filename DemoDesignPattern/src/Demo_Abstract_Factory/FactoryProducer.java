package Demo_Abstract_Factory;

/**
 * @author Giang
 * to inherit AbtractFactory and create concrete object
 */
public class FactoryProducer {
	
	public static AbstractFactory getFactory(String choice) {
		if (choice.equalsIgnoreCase("SHAPE")) {
			return new ShapeFactory();

		} else if (choice.equalsIgnoreCase("COLOR")) {
			return new ColorFactory();
		}

		return null;
	}
}
