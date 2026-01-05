import java.util.Arrays;

public class Esercizio1 {
    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static String concat(int num3, String string) {
        return num3 + string;
    }

    public static String[] inserisciInArray(String[] array, String stringa) {
        String[] nuovoArray = new String[6];
        nuovoArray[0] = array[0];
        nuovoArray[1] = array[1];
        nuovoArray[2] = stringa;
        nuovoArray[3] = array[2];
        nuovoArray[4] = array[3];
        nuovoArray[5] = array[4];
        return nuovoArray;
    }

    public static void main(String[] args) {
        int res = multi(3, 4);
        System.out.println(res);

        String concatenata = concat(3, " ciao");
        System.out.println(concatenata);

        String[] array = {"1", "2", "4", "5", "6"};
        String[] newArray = inserisciInArray(array, "3");
        System.out.println(Arrays.toString(newArray));

    }

}
