
public class EmployeeFactory {
	
	public static Employee getInstance(String str) {
		Employee e = null;
		Object o = null;
		try {
			o = Class.forName(str).newInstance();
		} catch (InstantiationException e1) {
			e1.printStackTrace();
		} catch (IllegalAccessException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			System.out.println(e1.getMessage()+ " is not a type of employee.");
		} 
		if (o instanceof Employee) {
			e = (Employee) o;
		}
		
		/*
		 * if(str.equalsIgnoreCase("manager")) { e = new Manager(); }else
		 * if(str.equalsIgnoreCase("clerk")){ e = new Clerk(); }else { e = new
		 * Employee(); }
		 */
		return e;
	}
}
