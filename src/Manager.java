
public class Manager extends Employee{
   int dailyAllowance = 5000;
   
   void showSalary() {
	   int totalSalary = baseSalary +dailyAllowance;
	   System.out.println("Managers salary is :: " + totalSalary);
   }
   void incrementSalary() {
	    int totalSalary = baseSalary +dailyAllowance+ 3000;
		System.out.println("Incremented salary for manager is :: " + totalSalary);
	}
}
