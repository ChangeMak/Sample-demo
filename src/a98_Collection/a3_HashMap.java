package a98_Collection;

import java.util.HashMap;
import java.util.Map;

public class a3_HashMap {

	public static void main(String[] args) {
		
		Map map = new HashMap();      // map is object name 
		
		map.put("Name","Viresh");
		map.put("Class","Spotter");
		map.put("Id","123");
		map.put("City","buldhana");
		//map.put("URL"," mapcnsdjfhdlfsdfhsdfdsnfichndf");
		
		System.out.println(map);                 // {Class=Spotter, Id=123, City=buldhana, Name=Viresh}
        System.out.println(map.get("Name"));      // Viresh
        System.out.println(map.get("City"));       //Buldhana
         
	}

	
}
