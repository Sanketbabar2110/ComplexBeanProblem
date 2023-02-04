package com.pro.wings;

public abstract class Employee {

	private int empId;
	private String f_name;
	private String l_name;
	private Address add;

	public Employee() {
		super();
	}

	public Employee(int empId, String f_name, String l_name, Address add) {
		super();
		this.empId = empId;
		this.f_name = f_name;
		this.l_name = l_name;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", f_name=" + f_name + ", l_name=" + l_name + ", add=" + add + "]";
	}

	public abstract Address newAddress();
	
	public void findAddress() {
		System.out.println("find new addresss : "+newAddress());
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
}
