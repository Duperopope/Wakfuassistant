/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from amk
 */
public final class amk_2 {
    private static final Logger cHu = Logger.getLogger(amk_2.class);
    private static final String cHv = "";

    private amk_2() {
    }

    public static String bCU() {
        return cHv;
    }

    @Deprecated
    public static amm_1 a(amh_1 amh_12, String string) {
        List<anc_1> list = amk_2.b(amh_12, string);
        if (list == null) {
            return null;
        }
        return amk_2.p(list);
    }

    private static amm_1 p(List<anc_1> list) {
        return new amt_1(amn_1.q(list));
    }

    private static List<anc_1> b(amh_1 amh_12, String string) {
        Pattern pattern = Pattern.compile(amh_12.bCT());
        Matcher matcher = pattern.matcher(string);
        ArrayList<anc_1> arrayList = new ArrayList<anc_1>();
        while (matcher.find()) {
            anc_1 anc_12 = amh_12.fi(matcher.group());
            if (anc_12 != null) {
                arrayList.add(anc_12);
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder("Erreur de syntaxe : '").append(matcher.group()).append("' (");
            if (matcher.start() > 0) {
                stringBuilder.append(string.substring(0, matcher.start()));
            }
            stringBuilder.append(" # ").append(matcher.group()).append(" # ");
            if (matcher.end() < string.length()) {
                stringBuilder.append(string.substring(matcher.end(), string.length()));
            }
            stringBuilder.append(')');
            throw new aml_1(stringBuilder.toString());
        }
        return arrayList;
    }
}

