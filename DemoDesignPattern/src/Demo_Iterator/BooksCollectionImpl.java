package Demo_Iterator;

/**
 * @author Giang
 * 
 */

public class BooksCollectionImpl implements IContainer{
	private String listContent[] = { "Design Patterns", "Abstract Factory", "Adapter Pattern", "Facade Pattern", "Iteratr Pattern" };

	public IIterator createIterator() {
		BookIterator result = new BookIterator();
		return result;
	}

	private class BookIterator implements IIterator {
		
		private int position; // position current

		//use check next element have exist 
		public boolean hasNext() {
			if (position < listContent.length)
				return true;
			else
				return false;
		}
		//get element next
		public Object next() {
			if (this.hasNext())
				return listContent[position++];
			else
				return null;
		}
	}
}
