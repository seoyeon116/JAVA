import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. 몇 개의 수를 입력할 예정인지 입력받기
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int n = sc.nextInt();

        // 2. 배열 생성
        int[] numbers = new int[n];

        // 3. 정수 입력 (공백으로 구분)
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // 4. 최소값과 최대값을 배열의 첫 번째 요소로 초기화
        int min = numbers[0];
        int max = numbers[0];

        // 5. 배열 탐색하면서 최소값과 최대값 갱신
        for (int i = 1; i < n; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 6. 결과 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
    }
}
