package hm_wrk2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Ввести число");
        Scanner in = new Scanner(System.in);
        int n = (int) in.nextLong();
        int number = n;
        int largestPrimeFactor = n;
        int i = 2;
        while (i <= n && n != 1) {
            if (n % i == 0) {
                n = n / i;
                largestPrimeFactor = i;
            } else {
                i = i + 1;
            }
        }
        System.out.println("Больший делитель числа  " + number + " это = " + largestPrimeFactor);
    }
}