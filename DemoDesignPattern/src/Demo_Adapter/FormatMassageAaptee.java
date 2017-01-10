package Demo_Adapter;

/**
 * @author Giang
 * container function getFormatMassage in oder to IMassageTarget need use.
 */
public class FormatMassageAaptee {
	/**
	 * delete whitespace
	 * @param String
	 * @return String
	 */
	public String getFormatMassage(String massage) {
		return massage.trim();
	}

}
