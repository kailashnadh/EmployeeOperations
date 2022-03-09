import java.util.Comparator;
import java.util.Objects;

public class Employee {

    public Employee() {
    }

    public Employee(int employeeId, String employeeName, int employeeAssetId, EmployeeAssetBrand employeeAssetBrand) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAssetId = employeeAssetId;
        this.employeeAssetBrand = employeeAssetBrand;
    }

    private int employeeId;
    private String employeeName;
    private int employeeAssetId;
    private EmployeeAssetBrand employeeAssetBrand;

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeeAssetId() {
        return employeeAssetId;
    }

    public void setEmployeeAssetId(int employeeAssetId) {
        this.employeeAssetId = employeeAssetId;
    }

    public EmployeeAssetBrand getEmployeeAssetBrand() {
        return employeeAssetBrand;
    }

    public void setEmployeeAssetBrand(EmployeeAssetBrand employeeAssetBrand) {
        this.employeeAssetBrand = employeeAssetBrand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Employee other = (Employee) obj;
        return Objects.equals(employeeId, other.employeeId);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeAssetId=" + employeeAssetId +
                ", employeeAssetBrand=" + employeeAssetBrand +
                '}';
    }

    static class EmployeeComparatorAscending implements Comparator<Employee> {

        /*
         * This method will sort the Employee objects in the
         * ascending order
         */
        public int compare(Employee emp1, Employee emp2) {
            return emp1.getEmployeeId() - emp2.getEmployeeId();
        }
    }
}


