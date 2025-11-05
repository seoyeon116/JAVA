class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    // 생성자
    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    // 전원 켜기
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    // 정보 출력
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println(" CPU: " + cpu);
        System.out.println(" Memory: " + memory);
        System.out.println(" HDD: " + hdd);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}


class Monitor {
    private String monitorSize;
    private String color;
    private String power;

    // 생성자
    public Monitor(String monitorSize, String color, String power) {
        this.monitorSize = monitorSize;
        this.color = color;
        this.power = power;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println(" Size: " + monitorSize);
        System.out.println(" Color: " + color);
        System.out.println(" Power: " + power);
    }
}


class PersonalComputer {
    private Computer computer;
    private Monitor monitor;

    // 생성자
    public PersonalComputer(Computer computer, Monitor monitor) {
        this.computer = computer;
        this.monitor = monitor;
    }

    // 전원 켜기
    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    // 정보 출력
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }
}


public class Homework5 {
    public static void main(String[] args) {
        // Computer 객체 생성
        Computer computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");

        // Monitor 객체 생성
        Monitor monitor = new Monitor("24 inch", "Black", "45W");

        // PersonalComputer 객체 생성
        PersonalComputer pc = new PersonalComputer(computer, monitor);

        // 메서드 호출
        pc.turnOn();
        pc.printInfo();
    }
}
