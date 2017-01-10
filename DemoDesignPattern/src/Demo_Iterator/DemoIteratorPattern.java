package Demo_Iterator;

/**
 * @author Giang
 * Client
 */
public class DemoIteratorPattern {

	public static void main(String[] args) {
		BooksCollectionImpl namesRepository = new BooksCollectionImpl();
		IIterator iterator = namesRepository.createIterator();
		while (iterator.hasNext()) {
			String pattern = (String) iterator.next();
			System.out.println("Pattern : " + pattern);
		}
	}

}
