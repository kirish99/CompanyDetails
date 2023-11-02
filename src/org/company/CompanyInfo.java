package org.company;

public class CompanyInfo {

	private void companyName() {
		System.out.println("Company Name");
	}
	
	private void companyName(int PIN,long Phno) {
		System.out.println("Company PIN="+ PIN);
		System.out.println("Company Phno="+ Phno);
	}
	
	private void companyName(float Dis,double Space ) {
		System.out.println("Company Dis="+ Dis);
        System.out.println("Company Space="+ Space);
	}
	
	
	public static void main(String[]args) {
		
		CompanyInfo c=new CompanyInfo();
		c.companyName();
		c.companyName(636903, 9789129143l);
		c.companyName(55.5f,555.5 );
    System.out.println("hello")
    System.out.println("hi")
    

	}
		
}
