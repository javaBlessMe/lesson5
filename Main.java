public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Alina",965333556,50000,25);
        employees[1] = new Employee("Pavel",999333556,70000,30);
        employees[2] = new Employee("Dmitry",999444556,170000,41);
        employees[3] = new Employee("Kristin",999444666,150000,43);
        employees[4] = new Employee("Vlad",999444666,45000,23);

        for (Employee e: employees) {
            if (e.getAge() > 40)
                e.getAllInformation();
        }
    }
}
