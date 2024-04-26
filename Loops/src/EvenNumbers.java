public class EvenNumbers {
    public static void main(String[] args) {

        int n = 5;
        while (true) {
            if(isEvenNumber(n)){
                System.out.println(n);
            }


            if(n > 20) {
                break;
            }
            n ++;


        }

    }

    public static boolean isEvenNumber (int number) {
        return number % 2 == 0;
    }

}
