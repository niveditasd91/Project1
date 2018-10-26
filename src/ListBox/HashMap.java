package ListBox;
import java.util.LinkedHashMap;

public class HashMap {
	public static void main(String[] args) {
		LinkedHashMap<String, Integer> classRoom=new LinkedHashMap<String, Integer>(); 
		classRoom.put("PC", 2);
		classRoom.put("Projector", 2);
		classRoom.put("Chair", 130);
		classRoom.put("Marker", 2);
		
		System.out.println(classRoom.get("Chair"));
		if(classRoom.containsKey("Projector")) 
		{
			System.out.println("Yes,classroom contains projector");
		}
		else {
			
		
		System.out.println("No,classroom  does notcontains projector");
		
	}

}}
