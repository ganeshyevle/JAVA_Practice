import java.util.Scanner;;
public class EncapsulationEX {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Employee emp=new Employee();

        System.out.println("Enter Employee Id :");
        emp.setEmployee_id(sc.nextInt());

        System.out.println("Enter Eployee Name :");
        emp.setEmployee_name(sc.next());

        System.out.println("Enter Employee salary :");
        emp.setEmployee_salary(sc.nextLong());


        System.out.println("Name of Eployee :"+emp.getEmployee_name());
        System.out.println("Id of Employee :"+emp.getEmployee_id());
        System.out.println("Salary of Employee :"+emp.getEmployee_salary());

        sc.close();
    }
}

class Employee{

    private int employee_id;
    private String employee_name;
    private long employee_salary;


    public int getEmployee_id() {
        return employee_id;
    }
    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }
     public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public long getEmployee_salary() {
        return employee_salary;
    }
    public void setEmployee_salary(long employee_salary) {
        this.employee_salary = employee_salary;
    }
}