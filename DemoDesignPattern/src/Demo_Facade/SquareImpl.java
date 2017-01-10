package Demo_Facade;
/**
 * @author Giang
 * to inherit IShape and override separate function
 */
public class SquareImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("Draw Square");

	}

}
