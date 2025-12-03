import java.io.*;
import java.util.*;

public class Homework9 {
    public static void main(String[] args) {
        Map<String, String> db = new HashMap<>();

        try {
            Scanner sc = new Scanner(new File("db.txt"));

            while (sc.hasNextLine()) {
                String line = sc.nextLine().trim();
                if(line.isEmpty())
                    continue;

                String[] token = line.split("\\s+");
                if (token.length == 2) {
                    String id = token[0].trim();
                    String pwd = token[1].trim();
                    db.put(id, pwd);
                }
            }
            sc.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("db.txt 파일을 찾을 수 없습니다.");
            return;
        }


        // 로그인 기능 구현
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("id와 password를 입력해주세요.");

            // ID 입력
            System.out.print("id : ");
            String id = sc.nextLine().trim();

            // ID 존재하지 않으면 다시 입력
            if (!db.containsKey(id)) {
                System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요.\n");
                continue;   // 가장 처음으로 돌아감
            }

            // 비밀번호 입력
            System.out.print("password : ");
            String pwd = sc.nextLine().trim();

            // 비밀번호 틀림 -> 처음으로
            if (!db.get(id).equals(pwd)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.\n");
                continue;
            }

            // 로그인 성공
            System.out.println("id와 비밀번호가 일치합니다.");
            break;
        }
        sc.close();
    }
}
