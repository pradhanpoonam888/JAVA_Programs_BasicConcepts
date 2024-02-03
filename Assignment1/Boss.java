package Assignment1;

public class Boss extends employee {
	
	public Boss(long Id, String Name, String Address, long Phone, long Salary) {
		employeeId= Id;
		employeeName = Name;
		employeeAddress = Address ;
		employeePhone = Phone ;
		basicSalary = Salary;
	}
	
	public double getTravelAllowance() {
		double travelAllowance = 15/100*getBasicSalary();
		return travelAllowance;
	}

}
