package Demo_Adapter;

/**
 * @author Giang
 * 
 * container function in order to client use
 */
public interface IMassageTarget {
	/**
	 * get massage
	 * 
	 * @param String
	 * 
	 * @return String
	 */
	public String getContent(String massage);
}
