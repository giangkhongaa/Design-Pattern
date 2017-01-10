package Demo_Strategy;

/**
 * @author Giang
 *
 * to inherit IStrategy and write own function
 */
public class SubstractImpl implements IStrategy {

	@Override
	public double operation(double num_a, double num_b) {
		return num_a - num_b;
	}

}
