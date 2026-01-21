package buoi4;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return this.lastName + " " + this.firstName;
    }

    public int getSalary() {
        return this.salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void upSalary(int percent) {
        this.salary = this.salary + (this.salary * percent) / 100;
    }

    public String toString() {
        return "Id: " + this.id + ", LastName: " + this.lastName + ", FirstName: " + this.firstName + ", Salary: "
                + this.salary;
    }
}
