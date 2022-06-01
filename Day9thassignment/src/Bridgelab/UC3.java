package Bridgelab;

public class UC3 {
    public static void main(String[] args) {
        int Part_Time=1;
        int Full_Time=2;
        int emp_wage_per_hr=20;
        int empWage=0;
        int empHrs=0;
        double empCheck=Math.floor(Math.random()*10)%3;
        if (empCheck==Part_Time) {
            empHrs=5;
        }
        else if(empCheck==Full_Time)
        {
            empHrs=8;
        }
        else
        {
            empHrs=2;
        }
        empWage=empHrs*emp_wage_per_hr;
        System.out.println("Emp Wage:"+empWage);
    }

}
