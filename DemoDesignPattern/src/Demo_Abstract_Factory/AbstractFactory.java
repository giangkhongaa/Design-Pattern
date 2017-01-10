package Demo_Abstract_Factory;

/**
 * @author Giang
 * 
 * Container two function in order to create 2 object : Shape and Color
 */
public abstract class AbstractFactory {
	/**
	 * initialization object IShape
	 * 
	 * @param String
	 * 
	 * @param IShape
	 */
	public abstract IShape getShape(String shape);

	/**
	 * initialization object IColor
	 * 
	 * @param String
	 * 
	 * @param IColor
	 */
	public abstract IColor getColor(String color);
}
