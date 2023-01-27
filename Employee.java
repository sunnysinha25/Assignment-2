package Assignment2;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName) 
	{
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		System.out.println("Employee(PARENT) CLASS CONSTRUCTOR CALLED!");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public double getVariableComponent(float experience){
        if(experience<3)
            return 0;
        else if(experience>=3 && experience<5)
            return 5;
        else if(experience>=5 && experience<10)
            return 7;
        else if (experience>=10)
            return 12;

        return 0;
    }
	
	@Override
    public String toString() {
        return "Employee { " + "\n\tTYPE OF EMPLOYEE: " + this.getClass().getSimpleName() +
                ",\n\tEMPLOYEE ID: " + employeeId +
                ",\n\tEMPLOYEE NAME: '" + employeeName + '\'' +
                ",\n\tSALARY: " + salary;
    }
	
}
