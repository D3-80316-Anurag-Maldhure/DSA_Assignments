package com.employee;

public class Employee {
	int empId;
	String fnameString;
	String lnameString;
	double salary;
	String departmentNameString;
	
	public Employee() {
	}
	
	public Employee(int empId, String fnameString, String lnameString, double salary, String departmentNameString) {
		this.empId = empId;
		this.fnameString = fnameString;
		this.lnameString = lnameString;
		this.salary = salary;
		this.departmentNameString = departmentNameString;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", fnameString=").append(fnameString)
				.append(", lnameString=").append(lnameString).append(", salary=").append(salary)
				.append(", departmentNameString=").append(departmentNameString).append("]");
		return builder.toString();
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFnameString() {
		return fnameString;
	}

	public void setFnameString(String fnameString) {
		this.fnameString = fnameString;
	}

	public String getLnameString() {
		return lnameString;
	}

	public void setLnameString(String lnameString) {
		this.lnameString = lnameString;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartmentNameString() {
		return departmentNameString;
	}

	public void setDepartmentNameString(String departmentNameString) {
		this.departmentNameString = departmentNameString;
	}
	
}
