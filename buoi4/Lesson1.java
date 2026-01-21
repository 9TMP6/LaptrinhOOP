package buoi4;

public class Lesson1 {
    public static void main(String[] args) {
        Circle a = new Circle(4, "Blue");
        a.setRadius(2);
        a.setColor("Yellow");
        System.out.println("Dien tich hinh tron: " + a.Area());
        System.out.println("Ban kinh: " + a.getRadius());
        System.out.println("Mau sac: " + a.getColor());
        System.out.println(a.toString());
        System.out.println("---------------------------");

        Rectangle b = new Rectangle(2, 3);
        b.setLength(4);
        b.setWidth(5);
        System.out.println("Dien tich hinh chu nhat: " + b.Area());
        System.out.println("Chieu dai: " + b.getLength());
        System.out.println("Chieu rong: " + b.getWidth());
        System.out.println(b.toString());
        System.out.println("---------------------------");

        Employee c = new Employee(96, "Dat", "Nguyen Thanh", 11);
        c.setId(21);
        c.setFirstName("Dan");
        c.setLastName("Ngao Tu");
        c.setSalary(1000);
        System.out.println("Id: " + c.getId());
        System.out.println("Lastname: " + c.getLastName());
        System.out.println("Firstname: " + c.getFirstName());
        System.out.println("Fullname: " + c.getFullName());
        c.upSalary(9);
        System.out.println("Luong: " + c.getSalary());
        System.out.println(c.toString());
        System.out.println("---------------------------");

        Account acc1 = new Account("111", "Acc1", 1000);
        Account acc2 = new Account("222", "Acc2", 990);
        System.out.println("Id: " + acc1.getID());
        System.out.println("Name: " + acc1.getName());
        System.out.println("Balance: " + acc1.getBalance());
        // acc1.credit(500);
        // acc1.debit(400);
        acc1.tranferTo(acc2, 100);
        System.out.println("Tai khoan 1: " + acc1.getBalance());
        System.out.println("Tai khoan 2: " + acc2.getBalance());

        Date date = new Date(21, 9, 2006);
        System.out.println("Ngay: " + date.getDay());
        System.out.println("Month: " + date.getMonth());
        System.out.println("Year: " + date.getYear());
        date.setYear(2000);
        date.setMonth(7);
        date.setDay(31);
        System.out.println(date.toString());
    }
}
