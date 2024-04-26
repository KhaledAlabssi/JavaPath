public class ForLoop {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
            if(i % 5 == 0 && i % 3 == 0) {
                sum += i;
                count ++;

            }
            if(count == 5){
                System.out.println("We reched the count of: " + count + " and the sum is: " +sum);
                break;
            }

        }
    }
}
