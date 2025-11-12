class Course {
    protected String code;
    protected String name;

    // 생성자
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    // Getter 메소드
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}

// OnlineCourse 클래스 (Course 상속)
class OnlineCourse extends Course {
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

// OfflineCourse 클래스 (Course 상속)
class OfflineCourse extends Course {
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}

