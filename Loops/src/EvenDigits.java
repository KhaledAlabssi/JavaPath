public class EvenDigits {
    public static void main(String[] args) {

        System.out.println(evenDigitSum(55555));
        System.out.println(evenDigitSum(-387555));
        System.out.println(evenDigitSum(538));
        System.out.println(evenDigitSum(123456));
        System.out.println(evenDigitSum(-842));
        System.out.println(evenDigitSum(98432));
//        Write a method named getEvenDigitSum with one parameter of type int called number.
//        The method should return the sum of the even digits within the number.
//        If the number is negative, the method should return -1 to indicate an invalid value.

    }
    public static int evenDigitSum (int number) {
        if(number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            if( number % 2 == 0){
                sum += number % 10;
            }
            number /= 10;
        }
        return sum;
    }
}
