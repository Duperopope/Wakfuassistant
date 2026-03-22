/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

/*
 * Renamed from UO
 */
public class uo_0 {
    public static boolean o(String string, String string2) {
        return ur_0.buN.matcher(string).matches() && Pattern.compile(uo_0.dl(string)).matcher(string2).matches();
    }

    static String dl(String string) {
        String string2 = string;
        for (US uS : US.values()) {
            string2 = string2.replaceAll(String.valueOf(US.bxd.bkg()) + uS.bkg(), uS.bkh());
        }
        return string2;
    }
}

