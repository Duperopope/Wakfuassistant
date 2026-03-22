/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

/*
 * Renamed from aUG
 */
public class aug_0 {
    private static final Logger hrc = Logger.getLogger(aug_0.class);
    private static final boolean hrd = true;
    private static final Pattern hre = Pattern.compile("(\\\\\\$([a-zA-Z_]+)\\$)|([^(\\\\\\$([a-zA-Z_]+)\\$)]*)");
    private static final aug_0 hrf = new aug_0();

    private aug_0() {
    }

    public static aug_0 cWd() {
        return hrf;
    }

    private static String kL(String string) {
        assert (string != null);
        try {
            return "<b>" + auh_0.valueOf(string).getValue() + "</b>";
        }
        catch (Exception exception) {
            hrc.error((Object)("la variable est inconnu " + string), (Throwable)exception);
            return string;
        }
    }

    public static String kM(String string) {
        Matcher matcher = hre.matcher(string);
        StringBuilder stringBuilder = new StringBuilder(string.length());
        while (matcher.find()) {
            String string2 = matcher.group(2);
            if (string2 == null) {
                stringBuilder.append(matcher.group(3));
                continue;
            }
            stringBuilder.append(aug_0.kL(string2));
        }
        return stringBuilder.toString();
    }
}

