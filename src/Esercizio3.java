public class Esercizio3 {
    public static double perimetroRettangolo(double base, double altezza) {
        return (base + altezza) * 2;
    }

    public static int pariDispari(int n) {
        if (n % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    // formula di Erone: Area = \(\sqrt{p(p-a)(p-b)(p-c)}\)
    public static double perimetroTriangolo(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}
