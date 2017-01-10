package Demo_Strategy;

/**
 * @author Giang
 * 
 * container function
 */

public interface IStrategy {
	/**
	 * compute between two number
	 * 
	 * @param1 double @param2 double
	 * 
	 * @return double
	 */
	double operation(double num_a, double num_b);
}
