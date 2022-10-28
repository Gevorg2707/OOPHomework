package Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hour,minute,sec;
        System.out.println("Hour: ");
        hour=scanner.nextInt();
        System.out.println("Minute: ");
        minute=scanner.nextInt();
        System.out.println("Sec: ");
        sec=scanner.nextInt();
        Time time=new Time(hour,minute,sec);
        System.out.println(time.toString());

    }
}
