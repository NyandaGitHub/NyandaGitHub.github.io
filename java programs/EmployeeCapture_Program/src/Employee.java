public class Employee {

    //private members
    private int IDnumber;
    private String Fname;
    private String Lname;
    private String Initial;
    private int Salary;
    private String department;
    private double EmployeeScore;

    private String EmploymentType;

    //constructor
    public Employee(int ID, String F, String L, String Init, int Sal, String depart,double Score, String Type){

        IDnumber=ID;
        Fname=F;
        Lname=L;
        Initial=Init;
        Salary=Sal;
        department=depart;
        EmployeeScore=Score;
        EmploymentType=Type;

    }
    //method
     void MyMethod()
    {
        System.out.println("ID number: " + IDnumber);
        System.out.println("First name: " + Fname);
        System.out.println("Last name: " + Lname);
        System.out.println("Initials: " + Initial);
        System.out.println("Salary: " + Salary);
        System.out.println("department: " + department);
        System.out.println("Employee Score: " + EmployeeScore);
        System.out.println("EmploymentType: " + EmploymentType);
        System.out.println("        ");


    }

}
