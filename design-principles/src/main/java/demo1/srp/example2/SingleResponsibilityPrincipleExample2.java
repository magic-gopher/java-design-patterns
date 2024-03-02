package demo1.srp.example2;

/**
 * @Author: Matrix
 * @CreateDate: 2024-03-03 01:48:08
 * @Version: v1.0.2
 * @Description: 遵循单一职责原则
 */
public class SingleResponsibilityPrincipleExample2 {
    public static void main(String[] args) {
        // 员工实例
        Employee employee = new Employee("李四", "销售部", 12000);
        employee.saveEmployeeToDatabase();

        // 薪水计算实例
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(employee);

        // 通知发送者实例
        NotificationSender sender = new NotificationSender();
        sender.sendNotification(employee);

        // 报表生成器实例
        ReportGenerator generator = new ReportGenerator();
        generator.generateReport(employee);
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

    // 省略其他员工信息的 getter 和 setter 方法

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void saveEmployeeToDatabase() {
        // 保存员工信息到数据库
        System.out.println("保存员工信息到数据库");
    }
}

/**
 * 薪水计算类
 */
class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        // 计算员工薪水
        System.out.println("计算员工薪水");
        return employee.getSalary();
    }
}

/**
 * 通知发送者类
 */
class NotificationSender {
    public void sendNotification(Employee employee) {
        // 发送通知给员工
        System.out.println("发送通知给员工");
    }
}

/**
 * 报表生成器类
 */
class ReportGenerator {
    public void generateReport(Employee employee) {
        // 生成员工报表
        System.out.println("生成员工报表");
    }
}