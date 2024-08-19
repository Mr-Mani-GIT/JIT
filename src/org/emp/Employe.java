package org.emp;

public class Employe {
	public void empId(int a) {
		System.out.println("Employee name:"+a);
		
	}
	public void empId(int a,long m,String s) {
		System.out.println("Employee id:"+a+"\nEmployee data:"+m+"\tEmployee branch"+s);
		
	}
	public void empId(String a,char b) {
	System.out.println("Employee:"+a+"\t gender:"+b);
	
}
	public void empId(char b,String a) {
	System.out.println("gender:"+b+"\nName:"+a);
	
}

	public static void main(String[] args) {
		Employe e = new Employe();
		e.empId(1234);
		e.empId('M', "Mani");
		e.empId("Gender", 'M');
		e.empId(56, 5678, "Numbers");

	}

}
