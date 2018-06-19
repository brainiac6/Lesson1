
import java.util.Scanner;

public class main {
    public static String onoma;
    public static int ilikia;
    public static Scanner sc;

    public static void main(String[] args) {
        // Onoma:   Ilikia:  + mporis/ en mporis na peeis poto
        // Onoma: Sotiris Ilikia: 24 mporis na peeis poto na kamoume to error tis ilikias
        // Save
        sc = new Scanner(System.in);

        System.out.println("pe m to onoma sou");
        onoma = sc.next();
        System.out.println("pe m thn ilikia sou");
        ilikia = sc.nextInt();
        System.out.print("Onoma:" + onoma + " " + "Ilikia:" + ilikia + " ");
        checkare();

    }

    public static void checkare() {
        String mporis;
        if (ilikia >= 19) {
            mporis = "mporis";
        } else {
            mporis = "en mporis";
        }
        System.out.println(mporis + " na peeis poto");
    }

}
