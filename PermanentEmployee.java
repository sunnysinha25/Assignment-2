package Assignment2;

public class PermanentEmployee extends Employee {
	private double basicPay;
	private double hra;
	private float experience;
	
	public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
		super(empId, name);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
		System.out.println("PermanentEmployee(CHILD) CLASS CONSTRUCTOR CALLED!");
	}
	
	public void calculateMonthlySalary(){
        double salary = basicPay + hra  + getVariableComponent(experience);
        super.setSalary(salary);
    }

	public double getBasicPay() {
		return basicPay;
	}

	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public float getExperience() {
		return experience;
	}

	public void setExperience(float experience) {
		this.experience = experience;
	}
	
	
	
	
}
