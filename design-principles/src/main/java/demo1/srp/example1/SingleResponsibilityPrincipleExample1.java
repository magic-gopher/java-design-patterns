package demo1.srp.example1;

/**
 * @Author: Matrix
 * @CreateDate: 2024-03-03 01:45:25
 * @Version: v1.0.1
 * @Description: 没有遵循单一职责原则
 */
public class SingleResponsibilityPrincipleExample1 {
    public static void main(String[] args) {
        // 员工实例
        Employee employee = new Employee("张三", "技术部", 10000);
        employee.saveEmployee();
        employee.calculateSalary();
        employee.sendNotification();
        employee.generateReport();
    }
}

/**
 * 员工类
 */
class Employee {
    private String name;
    private String department;
    private double salary;

    public Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void saveEmployee() {
        // 保存员工信息到数据库
        System.out.println("保存员工信息到数据库");
    }

    public void calculateSalary() {
        // 计算员工薪水
        System.out.println("计算员工薪水");
    }

    public void sendNotification() {
        // 发送通知给员工
        System.out.println("发送通知给员工");
    }

    public void generateReport() {
        // 生成员工报表
        System.out.println("生成员工报表");
    }
}
