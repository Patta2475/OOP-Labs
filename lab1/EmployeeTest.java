package lab1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Victor", "Chernov", 30000);
        System.out.println(e1.GetF_name()+" "+e1.GetL_name()+" salary: " + e1.Get_Salary());
        e1.setF_name("Vicky");
        e1.setSalary(35000);
        System.out.println(e1.GetF_name()+" "+e1.Get_Salary());
        System.out.println();

        Employee e2 = new Employee("Daniel", "Harrington", 70000);
        System.out.println(e2.GetF_name()+" "+e2.GetL_name()+" yearly salary: " + e2.Yearly_Salary());

        Employee e3 = new Employee("Kirsty", "Dorsey", 50000);
        System.out.println(e3.GetF_name()+" "+e3.GetL_name()+" yearly salary: " + e3.Yearly_Salary());
        System.out.println();

        e2.raise_salary(10);
        e3.raise_salary(10);
        System.out.println(e2.GetF_name()+" "+e2.GetL_name()+" yearly salary after 10% raise: " + e2.Yearly_Salary());
        System.out.println(e3.GetF_name()+" "+e3.GetL_name()+" yearly salary after 10% raise: " + e3.Yearly_Salary());

    }
}
