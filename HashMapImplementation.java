package HashMap;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class HashMapImplementation
{
	public static void main(String [] args)
	{
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("India", 120);
		map.put("China", 135);
		map.put("Japan", 40);
		map.put("Lanka", 35);
		
		//remove
		map.remove("Lanka");
		
		//get elements
		System.out.println(map.get("India"));
		
		//check for element
		
		if(map.containsKey("China"))
		{
			System.out.println(map.get("China"));
		}
		//replacing value for specific key
		
		map.replace("India", 100);

		
		//Iteartion through set
		for(Map.Entry<String, Integer> e:map.entrySet()) 
		{
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
		}
		Set<String> keys=map.keySet();
		for(String key:keys)
		{
			System.out.println(key+"-->"+map.get(key));
			
		}
		// clear all elements from map
		map.clear();
		System.out.println(map.size());
	}
}
