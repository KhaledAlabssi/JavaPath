public class Main {
    public static void main(String[] args) {


        for(int i = 1; i <= 5; i++){
            StudentPojo s = new StudentPojo(
                    "Sp112233" + i ,
                    switch (i) {
                        case 1 -> "KA";
                        case 2 -> "MA";
                        case 3 -> "OO";
                        case 4 -> "BB";
                        case 5 -> "SS";
                        default -> "Unknown";
                    },
                    "1/1/2022",
                    "Java");
            System.out.println(s);
        }
//        Customer cus1 = new Customer();
//        Customer cus2 = new Customer("KAA", "k@email.com");
//        Customer cus3 = new Customer("MAA", 3500d, "m@mail.com");

//  Account Class Test:
//        Account firstAcc = new Account();
//
//        Account secAcc = new Account("Ellie", "e@mail.com", "456");
//        Account thiAcc = new Account("433343", 1000d, "Kall", "k@mail.com", "011888");
//        firstAcc.accountInfo();
//        secAcc.accountInfo();
//        thiAcc.accountInfo();
//        firstAcc.deposite(65.5);
//        secAcc.withdrow(13.22);
//        firstAcc.accountInfo();
//        secAcc.accountInfo();

    }
}
