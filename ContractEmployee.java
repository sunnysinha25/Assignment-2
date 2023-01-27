package Assignment2;

public class ContractEmployee extends Employee {
	private double wage;
	private float hoursWorked;
	
	public ContractEmployee(int empId, String name, double wage, float hoursWorked) 
	{
		super(empId, name);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
		System.out.println("ContractEmployee(CHILD) CLASS CONSTRUCTOR CALLED!");
	}
	
	public void calculateSalary(){
        double salary=hoursWorked*wage;
        super.setSalary(salary);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
	
}
