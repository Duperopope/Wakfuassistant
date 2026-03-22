/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Renamed from aHU
 */
public class ahu_2 {
    private static final Pattern dSG = Pattern.compile("&#([0-9]+);");

    private ahu_2() {
    }

    public static String il(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = dSG.matcher(string);
        int n = 0;
        while (matcher.find()) {
            String string2 = matcher.group(1);
            char c2 = (char)Bw.m(string2);
            matcher.appendReplacement(stringBuffer, String.valueOf(c2));
            n = matcher.end();
        }
        stringBuffer.append(string.substring(n));
        return stringBuffer.toString();
    }
}

