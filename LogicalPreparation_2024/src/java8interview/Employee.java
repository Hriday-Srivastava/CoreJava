package java8interview;

public class Employee {

	String name;
	String gender;
	int age;
	double salary;
	String department;
	/**
	 * @param name
	 * @param age
	 */
	public Employee(String name, int age, double salary, String department,String gender  ) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.department = department;
		this.gender = gender;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", gender=" + gender + ", age=" + age + ", salary=" + salary + ", department="
				+ department + "]";
	}
	
	


	
}
