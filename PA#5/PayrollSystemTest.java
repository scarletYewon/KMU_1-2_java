package Payroll_System_Modification;

public class PayrollSystemTest {
	public static void main(String[] args) {
		int today_month = 11;

		SalariedEmployee salariedEmployee = new SalariedEmployee("John", "Smith", "111-11-1111", new Date(12, 4, 2002),
				800.00);
		HourlyEmplyee hourlyEmplyee = new HourlyEmplyee("Karen", "Price", "222-22-2222", new Date(1, 6, 1994), 16.75,
				40);
		CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "333-33-3333",
				new Date(7, 24, 1992), 10000, .06);
		BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bob", "Lewis",
				"444-44-4444", 5000, new Date(11, 7, 2002), .04, 300);

		System.out.println("Employees processed individually:");

		System.out.printf("%n%s%n%s: $%,.2f%n%n",
				salariedEmployee, "earned", salariedEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				hourlyEmplyee, "earned", hourlyEmplyee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				commissionEmployee, "earned", commissionEmployee.earnings());
		System.out.printf("%s%n%s: $%,.2f%n%n",
				basePlusCommissionEmployee, "earned", basePlusCommissionEmployee.earnings());

		Employee[] employees = new Employee[4];

		employees[0] = salariedEmployee;
		employees[1] = hourlyEmplyee;
		employees[2] = commissionEmployee;
		employees[3] = basePlusCommissionEmployee;

		System.out.printf("Employees processed polymorphically:%n%n");

		for (Employee currentEmployee : employees) {
			System.out.println(currentEmployee);

			if (currentEmployee instanceof BasePlusCommissionEmployee) {
				BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;

				employee.setBaseSalary(1.10 * employee.getBaseSalary());

				System.out.printf("new base salary with 10%% increase is: $%,.2f%n", employee.getBaseSalary());
			}

			if (currentEmployee.getBirthDate().getMonth() == today_month) {
				System.out.println("birthday bonus is: $100.00");
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings() + 100.00);
			} else
				System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
		}

		for (int j = 0; j < employees.length; j++) {
			System.out.printf("Employee %d is a %s%n", j, employees[j].getClass().getName());
		}
	}

}
