package listdemo;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;

public class TestHashmap {

	public static void main(String[] args) {
		HashMap<String, String> countryCurr=new HashMap<>();	
		countryCurr.put("IND", "Rupe");
		countryCurr.put("USA","Dollar");
		countryCurr.put("UK", "Pound");
		countryCurr.put(null, null);
		countryCurr.put(null, null);
		System.out.println(countryCurr.get("IND"));
		countryCurr.put("IND", "Rupee");
		System.out.println(countryCurr);
		System.out.println(countryCurr.size());
		System.out.println(countryCurr.containsKey("UK"));
		System.out.println(countryCurr.containsValue("Dollar"));
					//Hash Map has 3 views
					//1.keyview
		Set<String> keys=countryCurr.keySet();
		for(String key:keys) {
			System.out.println(key);
		}	//2.values view
		Collection<String> values=countryCurr.values();
		for(String value:values) {
			System.out.println(value);
		}	//3. key values together-EntrySet
		Set<Entry<String,String>> entries=countryCurr.entrySet();
		for(Entry<String, String> entry:entries)
			System.out.println(entry);
	}
		

	}


