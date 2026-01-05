import java.util.Scanner;

public class Esercizio2 {
    public static void printStrings(String s1, String s2, String s3) {
        System.out.println("Stringhe concatenate: " + (s1 + s2 + s3));
        System.out.println("Stringhe concatenate invertite: " + (s3 + s2 + s1));

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("prima stringa");
        String s1 = sc.nextLine();
        System.out.println("seconda stringa");
        String s2 = sc.nextLine();
        System.out.println("terza stringa");
        String s3 = sc.nextLine();
        printStrings(s1, s2, s3);

    }
}
