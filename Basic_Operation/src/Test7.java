
public class Test7 {

	public static void main(String[] args) {

		try {
			String x = null;
			int i = Integer.parseInt("123");
			System.out.println(x.length());
		} catch (NullPointerException x) {
			System.out.println(x.getMessage() + "Mess");
		} finally {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
		}
	}

}
