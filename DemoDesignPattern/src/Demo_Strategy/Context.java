package Demo_Strategy;

/**
 * @author Giang
 *
 * use field is interface Strategy execute functions
 */
/**
 * @author Giang
 *
 */
public class Context {
	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}

	/**
	 * compute between two number and use field call function
	 * 
	 * @param1 double @param2 double
	 * 
	 * @return double
	 */
	public double executeStrategy(double num_a, double num_b) {
		return strategy.operation(num_a, num_b);
	}
}
