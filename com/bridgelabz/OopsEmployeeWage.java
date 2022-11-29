package com.bridgelabz;

public class OopsEmployeeWage {
//	instance variable	
	int IS_PART_TIME = 0;
	int IS_FULL_TIME =1;
	int TotalWage;
	
//	static variable
	static int EMP_RATE_PER_HOUR = 20;
	static int empHrs = 0;
	static int empWage = 0;
	static int totalWorkingDays=0;
	static int totalEmpHour=0;
	
	public static void OopsEmployeewage() {
		  while(totalEmpHour <= 100 && totalWorkingDays <= 19) {
	            totalWorkingDays++;
		        double empCheck=Math.floor(Math.random()*10)%2;
		switch ((int) empCheck) {
		case 0:
			empHrs =4;
			break;
		case 1:
			empHrs = 8;
			break;
		default:
			empHrs=0;
		 }
		
		  }
}
public void DisplayingResult() {
	empWage=empHrs*EMP_RATE_PER_HOUR;
	totalEmpHour += empHrs;
	System.out.println("Days: "+totalWorkingDays);
	System.out.println("emp hours: "+empHrs);

	TotalWage=totalEmpHour*EMP_RATE_PER_HOUR;
	System.out.println("Total wage is: " + TotalWage);
}
public static void main(String[] args){
			OopsEmployeewage();
			OopsEmployeeWage obj=new OopsEmployeeWage();
			obj.DisplayingResult();
		}
}


