/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 */
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

public class Bz {
    static final Logger auM = Logger.getLogger(Bz.class);
    public static final Pattern auN = Pattern.compile("\\{((\\[[^\\[\\]\\{\\}?:]*\\])+)\\s*\\?([^\\{\\}]*):([^\\{\\}]*)\\}");
    public static final Pattern auO = Pattern.compile("\\[([^\\[\\]]*)([~\\*\\+\\-><!=])([^\\[\\]]*)\\]");
    public static final Pattern auP = Pattern.compile("\\[((,)*[\\\u00a3#])([0-9]+)(?:.([0-9]+))?\\]");
    public static final Pattern auQ;
    public static final Pattern auR;
    private static final String auS = "(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?";
    protected static final Pattern auT;
    protected static final Pattern auU;
    public static final byte auV = 0;
    protected static byte auW;
    public static final String auXX = "Unknown";
    protected static String auY;
    protected static String auZ;
    protected static String ava;
    protected static Callable<String> avb;
    protected static Callable<String> avc;
    protected static Callable<String> avd;
    public static bj_0 ave;

    public static byte aHR() {
        return auW;
    }

    public static String a(String string, Object ... objectArray) {
        String string2;
        boolean bl;
        Object object;
        Object object2;
        do {
            object2 = new StringBuilder();
            object = auN.matcher(string);
            while (((Matcher)object).find()) {
                bl = true;
                String string3 = ((Matcher)object).group(1);
                Matcher matcher = auO.matcher(string3);
                block16: while (matcher.find()) {
                    string2 = matcher.group(1);
                    int n = 1;
                    if (string2.length() > 0) {
                        n = Bw.m(string2);
                    }
                    int n2 = matcher.group(2).charAt(0);
                    String string4 = matcher.group(3);
                    int n3 = -1;
                    if (string4.length() > 0) {
                        n3 = Bw.m(string4);
                    }
                    switch (n2) {
                        case 60: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Bz.d(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 62: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Bz.c(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 61: {
                            if (objectArray.length < n3) continue block16;
                            bl &= Bz.e(objectArray[n3 - 1], n);
                            continue block16;
                        }
                        case 126: {
                            bl &= objectArray.length >= n3 && (objectArray[n3 - 1] != null && !Bz.e(objectArray[n3 - 1], 0) || objectArray[n3 - 1] instanceof String && !Bz.e((String)objectArray[n3 - 1], ""));
                            continue block16;
                        }
                        case 33: {
                            bl &= objectArray.length < n3 || objectArray[n3 - 1] == null || Bz.e(objectArray[n3 - 1], 0) || objectArray[n3 - 1] instanceof String && Bz.e((String)objectArray[n3 - 1], "");
                            continue block16;
                        }
                        case 43: {
                            bl &= objectArray.length >= n3 && objectArray[n3 - 1] != null && Bz.b(objectArray[n3 - 1], 0, false);
                            continue block16;
                        }
                        case 45: {
                            bl &= objectArray.length >= n3 && objectArray[n3 - 1] != null && !Bz.b(objectArray[n3 - 1], 0, false);
                            continue block16;
                        }
                        case 42: {
                            bl &= Bz.mj(n);
                            continue block16;
                        }
                    }
                    auM.error((Object)("Impossible de formatter l'expression : " + string));
                }
                if (bl) {
                    ((Matcher)object).appendReplacement((StringBuilder)object2, ((Matcher)object).group(3));
                    continue;
                }
                ((Matcher)object).appendReplacement((StringBuilder)object2, ((Matcher)object).group(4));
            }
            ((Matcher)object).appendTail((StringBuilder)object2);
        } while (auN.matcher(string = ((StringBuilder)object2).toString()).find());
        object2 = auP.matcher(string);
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            bl = ((Matcher)object2).group(1).charAt(0) == '\u00a3';
            int n = Bw.m(((Matcher)object2).group(3)) - 1;
            int n4 = ((Matcher)object2).groupCount() == 4 ? Bw.m(((Matcher)object2).group(4)) : 0;
            if (objectArray.length <= n || objectArray[n] == null) continue;
            string2 = Bz.a(objectArray[n], bl, n4);
            ((Matcher)object2).appendReplacement((StringBuilder)object, string2);
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        object2 = auQ.matcher(((StringBuilder)object).toString());
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            String string5 = ((Matcher)object2).group(1);
            BA bA = BA.aO(string5);
            if (bA == null) {
                auM.error((Object)("Tag inconnu : " + string5));
                continue;
            }
            ((Matcher)object2).appendReplacement((StringBuilder)object, bA.getValue());
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        String string6 = ((StringBuilder)object).toString();
        object2 = auR.matcher(string6);
        object = new StringBuilder();
        while (((Matcher)object2).find()) {
            String[] stringArray = ((Matcher)object2).group(1).split("\\|");
            int n = ((Matcher)object2).end();
            if (string6.length() <= n) continue;
            boolean bl2 = false;
            for (String string7 : stringArray) {
                if (string7.isEmpty() || !string6.substring(n).startsWith(string7)) continue;
                ((Matcher)object2).appendReplacement((StringBuilder)object, ((Matcher)object2).group(3));
                bl2 = true;
                break;
            }
            if (bl2) continue;
            ((Matcher)object2).appendReplacement((StringBuilder)object, ((Matcher)object2).group(4));
        }
        ((Matcher)object2).appendTail((StringBuilder)object);
        if (ave != null) {
            object2 = auT.matcher(((StringBuilder)object).toString());
            object = new StringBuilder();
            while (((Matcher)object2).find()) {
                String string8 = ((Matcher)object2).group(2);
                String string9 = ((Matcher)object2).group(4);
                int n = Bw.b((Object)((Matcher)object2).group(6), -1);
                int n5 = Bw.b((Object)((Matcher)object2).group(7), -1);
                try {
                    ((Matcher)object2).appendReplacement((StringBuilder)object, ave.a(BK.avs, string8, string9, n, n5));
                }
                catch (Exception exception) {
                    auM.warn((Object)exception.getMessage());
                }
            }
            ((Matcher)object2).appendTail((StringBuilder)object);
            object2 = auU.matcher(((StringBuilder)object).toString());
            object = new StringBuilder();
            while (((Matcher)object2).find()) {
                String string10 = ((Matcher)object2).group(2);
                String string11 = ((Matcher)object2).group(4);
                int n = Bw.b((Object)((Matcher)object2).group(6), -1);
                int n6 = Bw.b((Object)((Matcher)object2).group(7), -1);
                try {
                    ((Matcher)object2).appendReplacement((StringBuilder)object, ave.a(BK.avt, string10, string11, n, n6));
                }
                catch (Exception exception) {
                    auM.warn((Object)exception.getMessage());
                }
            }
            ((Matcher)object2).appendTail((StringBuilder)object);
        }
        return ((StringBuilder)object).toString();
    }

    protected static boolean mj(int n) {
        if (n > 127) {
            auM.error((Object)("Constante trop grande pour le test du sex de l'interlocuteur : " + n));
            return false;
        }
        return (byte)n == auW;
    }

    protected static boolean c(Object object, int n) {
        return Bz.b(object, n, true);
    }

    protected static boolean d(Object object, int n) {
        return Bz.a(object, n, true);
    }

    public static boolean a(Object object, int n, boolean bl) {
        Number number = Bz.s(object);
        if (number == null) {
            return false;
        }
        if (bl) {
            number = Math.ceil(number.doubleValue());
        }
        return number.doubleValue() < (double)n;
    }

    public static boolean b(Object object, int n, boolean bl) {
        Number number = Bz.s(object);
        if (number == null) {
            return false;
        }
        if (bl) {
            number = Math.ceil(number.doubleValue());
        }
        return number.doubleValue() > (double)n;
    }

    public static boolean e(Object object, int n) {
        Number number = Bz.s(object);
        if (number == null) {
            return false;
        }
        return number.doubleValue() == (double)n;
    }

    protected static boolean e(String string, String string2) {
        return string.equals(string2);
    }

    protected static String a(Object object, boolean bl, int n) {
        if (object instanceof String) {
            if (bl || n > 0) {
                object = Bw.n(object);
            } else if (BH.aV((String)object)) {
                object = Bw.p(object);
            } else {
                return object.toString();
            }
        }
        if (!(object instanceof Number)) {
            return object.toString();
        }
        double d2 = ((Number)object).doubleValue();
        if (n > 0 && object instanceof GF) {
            d2 = ((GF)object).aNT();
        }
        if (n == 0) {
            d2 = GC.e(d2);
        } else if (n > 0) {
            d2 = GC.b(d2, n);
        }
        if (bl) {
            d2 = Math.abs(d2);
        }
        return My.aUV().w(d2);
    }

    public static void e(byte by) {
        auW = by;
    }

    public static void setName(String string) {
        auY = string;
    }

    public static void aM(String string) {
        auZ = string;
    }

    public static void aN(String string) {
        ava = string;
    }

    public static void a(Callable<String> callable) {
        avb = callable;
    }

    public static void b(Callable<String> callable) {
        avc = callable;
    }

    public static void c(Callable<String> callable) {
        avd = callable;
    }

    protected static Number s(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Number) {
            return (Number)object;
        }
        if (object instanceof String) {
            return Bw.a(object, 0.0);
        }
        return null;
    }

    static {
        auR = Pattern.compile("((\\|.*)+)\\?([^\\|]*):([^\\|]*)\\|");
        Object object = "\\[#(";
        for (BA bA : BA.values()) {
            if (bA != BA.values()[0]) {
                object = (String)object + "|";
            }
            object = (String)object + bA.aHV();
        }
        object = (String)object + ")\\]";
        auQ = Pattern.compile((String)object);
        auT = Pattern.compile("\\[(#icon)\\s*([0-9]+)(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?\\]");
        auU = Pattern.compile("\\[(#charac)\\s*([^:\\]\\s]+)(\\s*:\\s*(west|east|center))?(\\s*:\\s*([0-9]+)x([0-9]+))?\\]");
        auW = 0;
        auY = auXX;
        auZ = auXX;
        ava = auXX;
        avb = () -> auXX;
        avc = () -> auXX;
        avd = () -> auXX;
        ave = null;
    }
}

