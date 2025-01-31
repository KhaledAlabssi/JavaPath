public class Worker {
    private String name;
    private String birthDate;
    private String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = "";
    }
    public int getAge() {
        int currentYear = 2024;
        return currentYear - Integer.parseInt(this.birthDate);
    }
    public double collectPay() {
        return 0.00;
    }
    public void terminate (String date) {
        this.endDate = date;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
