import java.util.Random;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IEmployeeWage empWageBuilder = new EmpWageBuilder();

        // Adding multiple companies to the builder
        empWageBuilder.addCompanyEmpWage("Company A", 20, 20, 100);
        empWageBuilder.addCompanyEmpWage("Company B", 25, 22, 120);
        empWageBuilder.addCompanyEmpWage("Company C", 30, 18, 90);

        // Compute wages for all companies
        empWageBuilder.computeEmployeeWage();
    }
}