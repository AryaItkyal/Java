package Java_assignment_partB;

public class NormalEmployee extends Employee{
    public int getMonthlySalary(){
        int ans = basicSalary/12;
        return ans;
    }
}
