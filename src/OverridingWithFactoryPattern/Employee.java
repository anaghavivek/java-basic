
public class Employee {
	protected int baseSalary = 10000;
	
	void showSalary(){
		System.out.println("Base salary is "+ this.baseSalary);
	}
	void incrementSalary() {
		int totalSalary = this.baseSalary + 1000;
		System.out.println("Incremented salary is :: " + totalSalary);
	}
}
