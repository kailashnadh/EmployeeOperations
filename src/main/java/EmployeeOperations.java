import java.util.*;

public class EmployeeOperations {
    public static void main(String[] args) {
        Set<Employee> employeeList = new HashSet<>(Arrays.asList(
                new Employee(2, "Kailash", 4, EmployeeAssetBrand.HP),
                new Employee(1, "Sawan", 2, EmployeeAssetBrand.DELL),
                new Employee(1, "Mounica", 3, EmployeeAssetBrand.LENOVO),
                new Employee(4, "Kumar", 1, EmployeeAssetBrand.HCL),
                new Employee(5, "Narmada", 4, EmployeeAssetBrand.HP)
        ));
        printEmployee(employeeList);
        employeeList = sortEmployee(employeeList);
        Employee employee6 = new Employee(2, "Sawan", 2, EmployeeAssetBrand.DELL);
        addEmployee(employeeList,employee6);
        Employee employee7 = new Employee(7, "Sawan", 2, EmployeeAssetBrand.DELL);
        addEmployee(employeeList, employee7);
        printEmployee(employeeList);
        Map<Integer, Employee> employeeMap = new HashMap();
        for (Employee e: employeeList) {
            employeeMap.put(e.getEmployeeId(),e);
        }
        removeHclfromMap(employeeMap);
        employeeMap.entrySet().forEach(entry -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });
    }

    private static void removeHclfromMap(Map<Integer,Employee> employeeMap) {
        employeeMap.keySet().removeIf(emp -> employeeMap.get(emp).getEmployeeAssetBrand().equals(EmployeeAssetBrand.HCL));
    }

    private static void addEmployee(Set<Employee> employeeList, Employee employee) {
        boolean success = employeeList.add(employee);
        if (!success) {
            System.out.println("Failed to insert value");
        }
    }

    private static Set<Employee> sortEmployee(Set<Employee> employeeList) {
        TreeSet<Employee> treeSetEmployeeAsc = new TreeSet<Employee>(new Employee.EmployeeComparatorAscending());
        treeSetEmployeeAsc.addAll(employeeList);
        return treeSetEmployeeAsc;
    }

    private static void printEmployee(Set<Employee> employeeList) {
        employeeList.forEach(System.out::println);
    }
}
