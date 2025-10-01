import java.util.Scanner;

class Student {
    int studentId;
    String name;
    String major;
    long phoneNumber;

    // Getter & Setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFormattedPhoneNumber() {
        String phone = Long.toString(phoneNumber);

        if (!phone.startsWith("0")) {
            phone = "0" + phone;
        }

        if (phone.length() == 11) {
            return phone.substring(0, 3) + "-"
                    + phone.substring(3, 7) + "-"
                    + phone.substring(7);
        } else {
            return phone;
        }
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];

        String[] order = {"첫번째", "두번째", "세번째"};

        for (int i = 0; i < students.length; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");
            int id = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student();
            students[i].setStudentId(id);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhoneNumber(phone);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%s 학생: %d %s %s %s\n",
                    order[i],
                    students[i].getStudentId(),
                    students[i].getName(),
                    students[i].getMajor(),
                    students[i].getFormattedPhoneNumber()
            );
        }
    }
}
