public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Customer() {
        this("Unkonw", "Invalid Value");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
        System.out.println("New Customer been created with name: " + this.name + "\n" +
                "Credit Limit: " + this.creditLimit + "\n" +
                "Email: " + this.email + ".\n");

    }
}
