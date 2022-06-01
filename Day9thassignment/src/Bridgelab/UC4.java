package Bridgelab;

public class UC4 {
    public static final int is_part_time=4;
    public static final int is_full_time=8;
    public static final int emp_wage_per_hr=20;
    public static void main(String[] args) {
        int empHrs=0;
        int empWage=0;
        int empCheck=(int) Math.floor(Math.random()*10)%2;
        switch(empCheck)
        {
            case is_part_time:
                empHrs=4;
                break;
            case is_full_time:
                empHrs=8;
                break;
            default:
                empHrs=2;
        }
        empWage=empHrs*emp_wage_per_hr;
        System.out.println("Emp Wage:"+empWage);
    }
}
