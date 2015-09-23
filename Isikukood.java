import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Isikukood {

    private int[] kordaja_1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1};
    private int[] kordaja_2 = {3, 4, 5, 6, 7, 8, 9, 1, 2, 3};
    private String kood = "";

    public Isikukood(String nr) {
        kood = nr;
    }

    public boolean oigekiri() {
        Pattern p = Pattern.compile("[0-9]{11}");
        Matcher m = p.matcher(kood);

        return m.matches();
    }

    public int kontrollsumma() {

        int summa = 0;

        for (int i = 0; i < kordaja_1.length; i++) {
            int v = Character.getNumericValue(kood.charAt(i));
            summa += kordaja_1[i] * v;
        }

        int j22k = summa % 11;

        if (j22k == 10) {
            for (int i = 0; i < kordaja_2.length; i++) {
                int v = Character.getNumericValue(kood.charAt(i));
                summa += summa + kordaja_2[i] * v;
            }
            j22k = summa % 11;
        }

        return j22k;
    }

    public String sugu() {

        int sajand = Character.getNumericValue(kood.charAt(0));

        if (sajand % 2 == 1) {
            return "mees";
        } else {
            return "naine";
        }
    }

    public int synniaasta() {

        int s = Character.getNumericValue(kood.charAt(0));
        int aasta = Integer.parseInt(kood.substring(1, 3));
        int sajand = 0;

        if (s == 1 || s == 2) sajand = 1800;
        else if (s == 3 || s == 4) sajand = 1900;
        else if (s == 5 || s == 6) sajand = 2000;

        return sajand + aasta;
    }
}