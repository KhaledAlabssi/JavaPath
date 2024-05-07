public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountNumber(4443222l);
        account.setBalance(0l);
        account.setEmail("k@mail.com");
        account.setCustomerName("Khaled Al");
        account.accountInfo();
        account.withdrow(10.00);
        account.accountInfo();
        account.deposite(200.00);
        account.withdrow(6.5);
        account.accountInfo();
    }
}
