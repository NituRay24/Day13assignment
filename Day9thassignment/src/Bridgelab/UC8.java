package Bridgelab;

public class UC8 {
    public static final int IS_PART_TIME= 2;
    public static final int IS_FULL_TIME = 8;
    public static int computeEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth)
    {
        //Variables
        int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
        //Computation
        while (totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
        {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck)
            {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 1;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day#: " + totalWorkingDays + " Emp Hr: " +empHrs);
        }
        int totalEmpWage = totalEmpHrs * empRatePerHour;
        System.out.println("Total Emp Wage For Company: " +company+" is:" +totalEmpWage);
        return totalEmpWage;
    }

    public static void main(String[] args)
    {
        computeEmpWage("Dmart", 20 , 2 , 10);
        computeEmpWage("Relaince", 10 , 4, 20);

    }

}
