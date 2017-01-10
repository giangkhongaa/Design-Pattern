package Demo_Strategy;

/**
 * @author Giang
 * 
 * Client
 */
public class DemoStrategyPattern {

	public static void main(String[] args) {
		Context context = new Context(new AddImpl());//initialization
		System.out.println("20 + 5 = " + context.executeStrategy(20, 5));

		context = new Context(new SubstractImpl());//initialization
		System.out.println("20 - 5 = " + context.executeStrategy(20, 5));

		context = new Context(new MultiplyImpl());//initialization
		System.out.println("20 * 5 = " + context.executeStrategy(20, 5));

		context = new Context(new DivisionImpl());//initialization
		System.out.println("20 * 5 = " + context.executeStrategy(20, 5));
	}

}
