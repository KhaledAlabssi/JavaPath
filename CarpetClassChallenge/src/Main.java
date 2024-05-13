public class Main {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(55.20);
        Floor floor = new Floor(6.5, 12);
        System.out.println(carpet);
        System.out.println(floor);
        Calculator calculate = new Calculator(floor.getArea(), carpet.getCost());
        System.out.println(calculate.getTotalCost());
    }
}
