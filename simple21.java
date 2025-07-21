package learnInit;
class Employee{
	int salary;
    String name;
	public int getSalary() {
		return salary;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name =n;
		
	}
}
public class simple21 {
    public static void main (String [] args) {
		Employee harry = new Employee();
		harry.salary=230000;
		harry.name="Stiti prangya";
		System.out.println(harry.salary);
		System.out.println(harry.name);
		
	}

}
