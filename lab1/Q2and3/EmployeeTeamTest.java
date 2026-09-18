package lab1.Q2and3;
public class EmployeeTeamTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("Victor", "Chernov", 30000);
        Employee e2 = new Employee("Carl", "Junior", 80000);
        EmployeeTeam team1 = new EmployeeTeam(e2, e1);
        team1.printEmployeeDetails();
        System.out.println("");
        team1.printAllEmployeesDetails();
        System.out.println("");
        team1.updateSalaryOfEmployee("Victor", 44000);
        team1.printAllEmployeesDetails();
        System.out.println("");
        team1.giveRaiseToAllEmployees();
        team1.printAllEmployeesDetails();
    }
}
