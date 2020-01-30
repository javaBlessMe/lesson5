public class Employee {
    private String fullName;
    private int  salary, age;
    private long phoneNumber;

    public Employee(String fullName, long phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void getAllInformation(){
        System.out.println("\n all information");
        System.out.println("Name "+fullName);
        System.out.println("Phone "+phoneNumber);
        System.out.println("Salary "+salary);
        System.out.println("Age "+age);
    }

    public int getAge() {
        return age;
    }
}
