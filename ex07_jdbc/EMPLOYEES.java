package ex07_jdbc;

// dto : 데이터를 담아서 옮기는 목적
public class EMPLOYEES {
	private int employee_id;
	private String first_name;
	private int salary;
	private String hire_date;
	
	public EMPLOYEES() {
		super();
	}

	public EMPLOYEES(int employee_id, String first_name, int salary, String hire_date) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.salary = salary;
		this.hire_date = hire_date;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	@Override
	public String toString() {
		return "EMPLOYEES [employee_id=" + employee_id + ", first_name=" + first_name + ", salary=" + salary
				+ ", hire_date=" + hire_date + "]";
	}


	
	
	
	
	
}
