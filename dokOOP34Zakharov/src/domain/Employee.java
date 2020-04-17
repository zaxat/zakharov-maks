package domain;
/**
 * клас Employee
 * @author admin
 */
public class Employee {
    /**
     * метод toString() 
     * @return string
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    private String name;
    private String jobTitle;
    private int ID;
    private int level;
    private String dept;

   // private static int employeesCount = 0;
    /**
     * конструктор Employee
     * @param name- имя
     * @param jobTitle - професія 
     * @param level - рівень
     * @param dept - відділ
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }
    /**
     * конструктор для обєкту класу Employee
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }
    /**
     * метод setJobTitle() присвоює значення змінної jobTitle 
     * @param job 
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }
    /**
     * метод getJobTitle() повертає значення змінної jobTitle 
     * @return jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }
    /**
     * метод getName() повертає значення змінної name
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * метод setLevel()
     * @param level 
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }
    /**
     * метод getLevel() повертає значення змінної level
     * @return level 
     */
    public int getLevel() {
        return level;
    }
    /**
     * метод getDept() повертає значення змінної dept
     * @return dept
     */
    public String getDept() {
        return dept;
    }
    /**
     * метод setDept() присвоює значення змінної dept
     * @param dept 
     */
    public void setDept(String dept) {
        this.dept = dept;
    }
    /**
     * метод setName() присвоює значення змінної name
     * @param name 
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
