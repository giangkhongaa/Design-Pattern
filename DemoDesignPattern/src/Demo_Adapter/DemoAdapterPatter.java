package Demo_Adapter;

/**
 * @author Giang
 *
 * Client
 */
public class DemoAdapterPatter {

	public static void main(String[] args) {
		IMassageTarget massage=new MassageAdapterImpl();
		System.out.println(massage.getContent("  giang heo  "));
	}

}
