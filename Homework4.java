import java.util.Scanner;

class CalculatorGCD {
    int gcd(int m, int n) {
        if (n == 0) { return m; }

        if (m > n) {
            return gcd(n, m % n);
        }
        else {
            return gcd(m, n % m);
        }
    }
}

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorGCD calc = new CalculatorGCD();
        System.out.print("두 수를 입력하세요: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int result = calc.gcd(m, n);
        System.out.printf("두 수의 최대공약수는 %d입니다.\n", result);
    }
}
