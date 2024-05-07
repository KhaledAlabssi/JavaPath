public class Account {
    private long accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void accountInfo() {
        System.out.println("Account Number: " + this.accountNumber + "\n" +
                "Name: " + this.customerName + "\n" +
                "Balance: " + this.balance + "\n" +
                "||||||========|||||||" + "\n" );
    }

    public double deposite (double amount) {
        this.balance += amount;
        return this.balance;
    }

    public double withdrow (double amount) {
        if(amount > this.balance) {
            System.out.println("No sufficint funds");
            return -1;
        }
        this.balance -= amount;
        return this.balance;
    }
}
