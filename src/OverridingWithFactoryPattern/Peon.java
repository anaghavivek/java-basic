
public class Peon extends Employee{
   int dailyAllowance = 500;
   
   void showSalary() {
	   int totalSalary = baseSalary +dailyAllowance;
	   System.out.println("Peon salary is :: " + totalSalary);
   }
   void incrementSalary() {
	   int totalSalary = baseSalary +dailyAllowance + 1000;
		System.out.println("Incremented salary for Peon is :: " + totalSalary);
	}
}
