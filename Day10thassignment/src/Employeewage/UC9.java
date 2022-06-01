package Employeewage;

public class UC9 {
    /* declaration of instance variables. */
    public String name; //public instance
    String department;    //default instance
    private int salary;    //private instance
    /* Constructor that initialize an instance variable. */
    public UC9(String sname)
    {
        name = sname;
    }

    /* Method to intialize an instance variable. */
    public void setDeprt(String sdeprt)
    {
        department = sdeprt;
    }

    /* Method to intialize an instance variable. */
    private void setSalary(int ssalary)
    {
        salary = ssalary;
    }

    /* Method to display the values of instance variables. */
    public void printemployeewage()
    {
        System.out.println("Emplyee Name: " + name );
        System.out.println("Department: " + department );
        System.out.println("Salary: " + salary );
    }

    /* Driver Code */
    public static void main(String args[])
    {
        UC9 Empwg = new UC9("Monica");
        Empwg.setSalary( 30000);
        Empwg.setDeprt("Accounts");
        Empwg.printemployeewage();
    }


}



