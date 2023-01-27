package Assignment2;

public class Tester {
	
	public static String getEmployeeDetails(Employee e) {
	    if(e instanceof ContractEmployee)
	        return e + ",\n\tWAGE: " + ((ContractEmployee) e).getWage() +
	            ",\n\tTOTAL NUMBER OF HOURS WORKED: " + ((ContractEmployee) e).getHoursWorked() +
	            " HOURS\n}\n";

	    if(e instanceof PermanentEmployee)
	        return e + ",\n\tBASIC PAY: " +  ((PermanentEmployee) e).getBasicPay()+
	            ",\n\tHOUSE RENT ALLOWANCE: " + ((PermanentEmployee) e).getHra() +
	            ",\n\tEXPERIENCE: " + ((PermanentEmployee) e).getExperience() +
	            " YEARS\n}\n";

	    return e.toString();
	}

	public static void main(String[] args) {
		PermanentEmployee e1 = new PermanentEmployee(101, "SUNNY SINHA", 49576.7, 14128.0, 4);
        e1.calculateMonthlySalary();
        System.out.println(getEmployeeDetails(e1));

        ContractEmployee e2 = new ContractEmployee(201, "MOHNISH NAMA KAMALESH", 1500.0, 3.0f);
        e2.calculateSalary();
        System.out.println(getEmployeeDetails(e2));

	}

}

/*
EXPECTED INPUT/OUTPUT

Employee(PARENT) CLASS CONSTRUCTOR CALLED!
PermanentEmployee(CHILD) CLASS CONSTRUCTOR CALLED!
Employee { 
	TYPE OF EMPLOYEE: PermanentEmployee,
	EMPLOYEE ID: 101,
	EMPLOYEE NAME: 'SUNNY SINHA',
	SALARY: 63709.7,
	BASIC PAY: 49576.7,
	HOUSE RENT ALLOWANCE: 14128.0,
	EXPERIENCE: 4.0 YEARS
}

Employee(PARENT) CLASS CONSTRUCTOR CALLED!
ContractEmployee(CHILD) CLASS CONSTRUCTOR CALLED!
Employee { 
	TYPE OF EMPLOYEE: ContractEmployee,
	EMPLOYEE ID: 201,
	EMPLOYEE NAME: 'MOHNISH NAMA KAMALESH',
	SALARY: 4500.0,
	WAGE: 1500.0,
	TOTAL NUMBER OF HOURS WORKED: 3.0 HOURS
}
*/
