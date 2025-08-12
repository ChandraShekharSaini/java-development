// Java Example: Demonstrating Race Condition

//1. This is problem

class BankAccount {
    private int balance = 1000;

    public void withdraw(String name, int amount) {
        System.out.println(name + " is trying to withdraw $" + amount);

        if (balance >= amount) {
            System.out.println(name + " is proceeding with withdrawal...");
            try {
                Thread.sleep(1000); // simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
            System.out.println(name + " completed withdrawal. Remaining balance: $" + balance);
        } else {
            System.out.println("Insufficient balance for " + name);
        }
    }
}

class Customer implements Runnable {
    private BankAccount account;
    private String name;
    private int amount;

    public Customer(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }

    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        Thread t1 = new Thread(new Customer(sharedAccount, "Alice", 700));
        Thread t2 = new Thread(new Customer(sharedAccount, "Bob", 700));

        t1.start();
        t2.start();
    }
}
