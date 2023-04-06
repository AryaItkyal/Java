package Java_assignment_partB;

public class BonusEmployee extends Employee {

    public int getMonthlySalary() {
        return (basicSalary + (int) (0.1 * basicSalary))/12;
    }
}
