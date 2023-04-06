package Java_assignment_partB;

public class Main {
    public static void main(String[] args) {
        // create a NormalEmployee
        NormalEmployee emp1 = new NormalEmployee();
        emp1.setName("Arya");
        emp1.setBasicSalary(21000);

        // create a BonusEmployee
        BonusEmployee emp2 = new BonusEmployee();
        emp2.setName("Itkyal");
        emp2.setBasicSalary(21000);

        // print the salary details for emp1
        System.out.println("Name\t\t" + emp1.getName());
        System.out.println("Employee ID\t" + "EMP123");
        System.out.println("Designation\t" + "Software Engineer");
        System.out.println("Department\t" + "IT");
        System.out.println("Bank Name\t" + "ABC Bank");
        System.out.println("Bank A/C No\t" + "1234567890");
        System.out.println("\nEarnings\t\t");
        System.out.println("Monthly Earnings\t\t" + emp1.getMonthlySalary());
        System.out.println("Total Earnings\t\t" + emp1.getBasicSalary());

        // print the salary details for emp2
        System.out.println("\nName\t\t" + emp2.getName());
        System.out.println("Employee ID\t" + "EMP456");
        System.out.println("Designation\t" + "Software Engineer");
        System.out.println("Department\t" + "IT");
        System.out.println("Bank Name\t" + "ABC Bank");
        System.out.println("Bank A/C No\t" + "1234567890");
        System.out.println("\nEarnings\t\t");
        System.out.println("Monthly Earnings\t\t" + emp2.getMonthlySalary());
        System.out.println("Total Earnings\t\t" + emp2.getMonthlySalary()*12);
    }
}