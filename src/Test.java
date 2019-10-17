import java.util.HashMap;
import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		 
		//example of Override with factory pattern
	        Employee e = EmployeeFactory.getInstance(args[0]);
	        if(e != null) {
	        	e.showSalary();
				e.incrementSalary();
	        }else {
	        	System.out.println("Employee not found");
	        }
	        
	        //Hashmap examples
	        HashMap<Clerk, String> m = new HashMap<Clerk, String>();
	        Clerk c1 = new Clerk();
	        Clerk c2 = new Clerk();
	        Clerk c3 = new Clerk();
	        
	        m.put(c1, "Vivek");
	        m.put(c2, "Vivek1");
	        m.put(c3, "Vivek2");
	        
	        Object m2 = m.clone();
	        
	        //String aa = (String) m.put("3", "Vivek3");
	        //m.replace("3", "Vivek3","Vivek9");
	        
	        Iterator<Clerk> itr = (m.keySet()).iterator();
	        while(itr.hasNext()) {
	        	Clerk key = itr.next();
	        	System.out.println("Key :: "+key + " Value :: "+ m.get(key));
	        }
	        
	       
	        Iterator<Clerk> itr1 = (((HashMap) m2).keySet()).iterator();
	        while(itr1.hasNext()) {
	        	Clerk key = itr1.next();
	        	System.out.println("Key m2:: "+key + " Value m2:: "+ m.get(key));
	        }
	        
	}

}
