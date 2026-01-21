package buoi4;

public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name, int blance) {
        this.id = id;
        this.name = name;
        this.balance = blance;
    }

    public String getID() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getBalance() {
        return this.balance;
    }

    public void credit(int amount) {
        if (amount > 0)
            this.balance += amount;
    }

    public void debit(int amount) {
        if (amount > this.balance)
            System.out.println("Thanh toan khong thanh cong!");
        else
            this.balance -= amount;

    }

    public void tranferTo(Account account, int amount) {
        if (amount < 0 || amount > this.balance)
            System.out.println("Chuyen khong thanh cong!");
        else {
            this.balance -= amount;
            account.credit(amount);
        }
    }
}
