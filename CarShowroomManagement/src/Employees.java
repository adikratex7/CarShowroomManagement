import java.util.*;

import java.util.UUID;

public class Employees extends Showroom implements Utility{
	
	String emp_id;
	String emp_name;
	int emp_age;
	String emp_department;
	
	public void get_details()
	{
		System.out.println("ID:"+emp_id);
		System.out.println("NAME:"+emp_name);
		System.out.println("AGE:"+emp_age);
		System.out.println("DEPARTMENT:"+emp_department);
		System.out.println("SHOWROOM:"+showroom_name);
		
		
	}
	
	public void set_details()
	{
		Scanner sc=new Scanner(System.in);
		 UUID uuid = UUID.randomUUID();
	     emp_id = String.valueOf(uuid);
	     System.out.println("======================= *** ENTER EMPLOYEE DETAILS *** =======================");
	     System.out.println("EMPLOYEE NAME: ");
	     emp_name=sc.nextLine();
	     System.out.println("EMPLOYEE AGE: ");
	     emp_age=sc.nextInt();
	     System.out.println("EMPLOYEE DEPARTMENT: ");
	     emp_department=sc.nextLine();
	     System.out.println("SHOWROOM NAME: ");
	     showroom_name=sc.nextLine();
	     
		
	}
	
	

}
