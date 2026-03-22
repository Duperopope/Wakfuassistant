/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.StringUtils
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

/*
 * Renamed from aQf
 */
public final class aqf_0 {
    private static final Pattern eBD = Pattern.compile("<mob id=\"(\\d+)\"/>");

    private aqf_0() {
    }

    public static String jC(String string) {
        String string2 = aqf_0.jD(string);
        return string2;
    }

    private static String jD(String string) {
        String string2 = string;
        Matcher matcher = eBD.matcher(string2);
        while (matcher.find()) {
            String string3 = matcher.group(1);
            if (!StringUtils.isNumeric((CharSequence)string3)) continue;
            String string4 = aum_0.cWf().a(7, (long)Integer.parseInt(string3), new Object[0]).trim();
            string2 = StringUtils.replace((String)string2, (String)matcher.group(), (String)(string3 + " (" + string4 + ")"));
        }
        return string2;
    }
}

