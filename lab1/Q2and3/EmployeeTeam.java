package lab1.Q2and3;

public class EmployeeTeam {
    private Employee boss;
    private Employee employee;

    public EmployeeTeam(Employee boss, Employee employee){
        this.boss = boss;
        this.employee = employee;
    }

    public void printEmployeeDetails(){
        System.out.println(employee.GetF_name() + " " + employee.GetL_name() + " Salary = " + employee.Get_Salary());
    }

    public void printAllEmployeesDetails(){
        System.out.println(employee.GetF_name() + " " + employee.GetL_name() + " Salary = " + employee.Get_Salary());
        System.out.println(boss.GetF_name() + " " + boss.GetL_name() + " Salary = " + boss.Get_Salary());
    }

    public void updateSalaryOfEmployee(String firstname, double newSalary){
        if (newSalary>0){
            if (boss.GetF_name().equals(firstname)){
                boss.setSalary(newSalary);
            }
            if (employee.GetF_name().equals(firstname)){
                employee.setSalary(newSalary);
            }
        }
    }

    public void giveRaiseToAllEmployees(){
        boss.raise_salary(10);
        employee.raise_salary(10);
    }
}
