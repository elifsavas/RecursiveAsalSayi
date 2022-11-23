import java.util.Scanner;

public class Main {
    static boolean isPrime(int num, int i) {
        if ((num == i)) {
            System.out.println("asal sayıdır ");
            return true;

        } else if (num % i == 0) {
            System.out.println("asal sayı değildir");
            return false;

        }
        return isPrime(num, i +1);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int num = input.nextInt();

        isPrime(num,2) ;
    }
}
