package domain;
/**
 * класс Manager, який наслідує клас Employee
 * @author admin
 */
public class Manager extends Employee {
    /**
     * конструктор для обєкту класу Manager
     * @param employees - співробітники
     * @param name - імя
     * @param jobTitle - професія
     * @param level - рівень
     * @param dept - відділ
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }
    /**
     * метод toString()
     * @return string
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees(); 
    }

    /**
     * конструктор для обєкту класу Manager
     * @param employees - співробітники
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }
    /**
     * конструктор для обєкту класу Manager
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    private Employee[] employees;
    /**
     * метод getEmployees() повертає значення змінної String s
     * @return param s - навички
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }
    /**
     * метод setEmployees() присвоює значення параметру employees
     * @param employees - співробітники
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }
    /**
     * метод getEmployeesList() повертає значення параметру employees
     * @return employees - співробітники
     */
    public Employee[] getEmployeesList() {
        return employees;
    }

    
}
