
public class Clerk extends Employee{
   int dailyAllowance = 1000;
   
   void showSalary() {
	   int totalSalary = baseSalary +dailyAllowance;
	   System.out.println("Clerk salary is :: " + totalSalary);
   }
   void incrementSalary() {
	   int totalSalary = baseSalary +dailyAllowance + 2000;
		System.out.println("Incremented salary for clerk is :: " + totalSalary);
	}
   
   /* change added */
}

/* this is another comment */
