public class Calculator {
    private double floor;
    private double carpet;

    public Calculator(double floor, double carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost () {
        return this.floor * this.carpet;
    }
}
