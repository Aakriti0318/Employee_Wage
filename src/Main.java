import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EmpWageBuilder companyA = new EmpWageBuilder("Company A", 20, 20, 100);
        companyA.computeEmployeeWage();

        EmpWageBuilder companyB = new EmpWageBuilder("Company B", 25, 22, 120);
        companyB.computeEmployeeWage();

        EmpWageBuilder companyC = new EmpWageBuilder("Company C", 30, 18, 90);
        companyC.computeEmployeeWage();
    }
}