package Assignment1;

public class employee {
	public long employeeId;
	public String employeeName;
	public String employeeAddress;
	public long employeePhone;
	public double basicSalary;
	public double specialAllowance = 250.80;
	public double HRA= 1000.50;
	
	public employee() {
		
	}
	
	public employee(long Id, String Name, String Address, long Phone) {
		employeeId= Id;
		employeeName = Name;
		employeeAddress = Address ;
		employeePhone = Phone ;
	}
	
	public double calculateSalary() {
		double Salary=0.0;
		Salary=basicSalary+    (basicSalary*specialAllowance/100)    + (basicSalary* HRA/100);
		return Salary;
		
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public long getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(long employeePhone) {
		this.employeePhone = employeePhone;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}
	
	public double getTravelAllowance() {
		double travelAllowance = 10/100*getBasicSalary();
		return travelAllowance;
	}
	
	public void print() {
		System.out.println("Employee Details : " + "\n"
				+"Employee Name : "+ getEmployeeName() +" \n"
				+"Employee ID : " + getEmployeeId() +" \n"
				+"Employee Address : " + getEmployeeAddress() +" \n"
				+"Employee Phone No. : " + getEmployeePhone() +" \n"
				+"Employee Basic Sal : " + getBasicSalary() +" \n"
				+"Employee Tavel Allowance : " + getTravelAllowance() +" \n"
				+"Employee Salary : " + calculateSalary()
				);
	}
}
