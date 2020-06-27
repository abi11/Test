import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;


public class Test {
	
	public Comparator<Map<String, Object>> mapComparator = new Comparator<Map<String, Object>>() {
	    public int compare(Map<String, Object> m1, Map<String, Object> m2) {
	    	
	    	//return(Integer.parseInt((String)m1.get("id")).compareTo(Integer.parseInt((String)m1.get("id"))));
	        //return m1.get("name").compareTo(m2.get("name"));
	    	int a= Integer.parseInt((String)m1.get("id"));
	    	int b= Integer.parseInt((String)m2.get("id"));
	    	if(a>b){
	    		 System.out.println("m1 value more:"+Integer.parseInt((String)m1.get("id")));
	    		 System.out.println("m2 value :"+Integer.parseInt((String)m2.get("id")));
	    		return +1;
	    	}
	    	if(a<b){
	    		 System.out.println("m1 value less :"+Integer.parseInt((String)m1.get("id")));
	    		 System.out.println("m2 value :"+Integer.parseInt((String)m2.get("id")));
	    		return -1;
	    	}
	    	if(a==b){
	    		 System.out.println("m1 value  ==:"+Integer.parseInt((String)m1.get("id")));
	    		 System.out.println("m2 value :"+Integer.parseInt((String)m2.get("id")));
	    		return 0;
	    	}
	    	return 0;
	    }
	    
	};

	

	public  ArrayList<Map<String,Object>> myList(){
		ArrayList<Map<String,Object>> list1 = new ArrayList<Map<String,Object>>();
		
		Map<String,Object> m = new HashMap<String,Object>(); 
		Map<String,Object> m1 = new HashMap<String,Object>(); 
		Map<String,Object> m2 = new HashMap<String,Object>(); 
		m.put("name","Abhi");
		m.put("id", "123");
		m.put("code", "labour");
		
		m1.put("name","Raj");
		m1.put("id", "223");
		m1.put("code", "min");
		
		m2.put("name","killer");
		m2.put("id", "1233");
		m2.put("code", "King");
		m2.put("name","kk");
		m2.put("id", "001");
		m2.put("code", "kind");
	    list1.add(m);
	    list1.add(m1);
	    list1.add(m2);

	    for (Iterator<Map<String,Object>> it = list1.iterator(); it.hasNext();) {
			Map<String,Object> s = it.next();
			for(Iterator<Map.Entry<String, Object>> ent=s.entrySet().iterator();ent.hasNext();){
				Entry<String, Object> h=ent.next();
				 System.out.println("before remove key :"+ h.getKey());
				 System.out.println("before remove value :"+ h.getValue());
			}
		   
		    
		    
		}
	for (Iterator<Map<String,Object>> it = list1.iterator(); it.hasNext();) {
		Map<String,Object> s = it.next();
//		for(Iterator<Map.Entry<String, Object>> ent=s.entrySet().iterator();ent.hasNext();){
//			Entry<String, Object> h=ent.next();
//			if(h.getKey().equalsIgnoreCase("code")){
//				//h.getKey().re
//			}
//		}
		s.remove("code");
	    if (s.containsValue("1233")) {
	        it.remove();
	    }
	    
	    
	}
	
	
	
	for (Iterator<Map<String,Object>> it = list1.iterator(); it.hasNext();) {
		Map<String,Object> s = it.next();
		for(Iterator<Map.Entry<String, Object>> ent=s.entrySet().iterator();ent.hasNext();){
			Entry<String, Object> h=ent.next();
			 System.out.println("ent key :"+ h.getKey());
			 System.out.println("ent key value:"+ h.getValue());
		}
	   
	    
	    
	}
	Collections.sort(list1, mapComparator);
	return list1;
	}
	public static void main(String []args){
		
		Test a = new Test();
		ArrayList<Map<String,Object>> list1 = a.myList();
		for (Iterator<Map<String,Object>> it = list1.iterator(); it.hasNext();) {
			Map<String,Object> s = it.next();
			for(Iterator<Map.Entry<String, Object>> ent=s.entrySet().iterator();ent.hasNext();){
				Entry<String, Object> h=ent.next();
				 System.out.println("after key :"+ h.getKey());
				 System.out.println("after key value:"+ h.getValue());
			}
		   
		    
		    
		}
		Arrays.asList( "a", "e", "d" ).sort( ( e1, e2 ) -> {
			    int result = e1.compareTo( e2 );
			    return result;
			} );
		
		//.forEach( e -> System.out.println( e ) );

		Arrays.asList( "a", "b", "d" ).forEach( (String e) -> System.out.println( e ) );

	}
}
