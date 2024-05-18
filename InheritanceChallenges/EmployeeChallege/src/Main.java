public class Main {
    public static void main(String[] args) {

        SalariedEmployee s1 = new SalariedEmployee("Sam", "1991",  "2001", 1000.00);
        System.out.println(s1.toString());
        System.out.println(s1.getAge());
        s1.retire("2025");
        System.out.println(s1);

        HourlyEmployee h1 = new HourlyEmployee("Pam", "1993", "2011", 1600.00);
        System.out.println(h1.toString());
        System.out.println(h1.getAge());
        h1.getDoublePay("2021");
        System.out.println(h1);


    }
}
