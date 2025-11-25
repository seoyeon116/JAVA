import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 저장된 ID-password
        Map<String, String> data = new HashMap<>();
        data.put("myId", "myPass");
        data.put("myId2", "myPass2");
        data.put("myId3", "myPass3");

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            // ID 입력
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            // ID 없으면 처음으로
            if (!data.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;   // 가장 처음으로 돌아감
            }

            // 비밀번호 입력
            System.out.print("password : ");
            String pwd = sc.nextLine().trim();

            // 비밀번호 틀림 → 처음으로
            if (!data.get(id).equals(pwd)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            // 로그인 성공
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
    }
}
