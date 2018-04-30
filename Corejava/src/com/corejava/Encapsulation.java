package com.corejava;

public class Encapsulation {

	public static void main(String[] args) {
		//What object knows -> Variable
		//What object does -> Methods
	mainclass obj=new mainclass();
	obj.setEmpId(4);
	obj.setEmpName("Krishna");
	System.out.println(obj.getEmpName());
	}
}
class mainclass
{
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	private int empId;
	private String empName;
	}
	

