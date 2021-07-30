import java.util.HashMap;
import java.util.Hashtable;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class sdgsgsg{
	public static void main(String[]args) {
		Hashtable< String, String> t=new Hashtable<String, String>();
		ConcurrentHashMap<String, String>cm=new ConcurrentHashMap<String, String>();
		HashMap<String, String> hm=new HashMap();
		TreeMap tm=new TreeMap();
		//tm.put(null, "xyz");
		tm.put("123", null);
		System.out.println(hm);
		//t.put(null, "123");
		//t.put("1", null);
	}
}