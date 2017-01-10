package Demo_Facade;

/**
 * @author Giang
 * to inherit IShape and override separate function
 */
public class CircleImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("Draw Circle");
	}

}
