package Demo_Adapter;

/**
 * @author Giang
 * to inherit IMassageTarget
 * to task cohesive(gắn kết) between IMassageTarget and  FormatMassageAaptee
 */
public class MassageAdapterImpl implements IMassageTarget {

	@Override
	public String getContent(String content) {
		FormatMassageAaptee format = new FormatMassageAaptee();
		return format.getFormatMassage(content);
	}

}
