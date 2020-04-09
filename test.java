import java.util.Scanner;

public class test {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int a = scan.nextInt();
        scan.nextLine();
        final String str = scan.nextLine();
        System.out.println(a);
        System.out.println(str);
        scan.close();
    }
}