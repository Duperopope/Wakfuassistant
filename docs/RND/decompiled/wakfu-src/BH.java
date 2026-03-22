/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.StringCharacterIterator;
import java.util.Base64;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class BH {
    public static final char avn = '=';
    public static final char avo = '-';
    private static final DecimalFormat avp = new DecimalFormat("###,###");
    private static final String avq = "0123456789abcdef";

    public static byte[] aP(String string) {
        if (string == null) {
            return Bv.auq;
        }
        try {
            return string.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    public static String dc(byte[] byArray) {
        return BH.a(byArray, 0, byArray.length);
    }

    @Nullable
    public static String a(byte[] byArray, int n, int n2) {
        if (byArray == null) {
            return null;
        }
        if (n2 == 0) {
            return "";
        }
        try {
            return new String(byArray, n, n2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray);
        }
    }

    public static String eD(ByteBuffer byteBuffer) {
        short s = byteBuffer.getShort();
        if (byteBuffer.remaining() < s) {
            throw new BufferUnderflowException();
        }
        byte[] byArray = new byte[s];
        byteBuffer.get(byArray);
        return BH.dc(byArray);
    }

    @NotNull
    public static String eE(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get();
        if (byteBuffer.remaining() < by) {
            throw new BufferUnderflowException();
        }
        byte[] byArray = new byte[by];
        byteBuffer.get(byArray);
        return BH.dc(byArray);
    }

    @Contract(value="!null -> !null;null -> null")
    public static String aQ(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    @Contract(value="!null -> !null;null -> null")
    public static String aR(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public static String aS(String string) {
        char[] cArray = string.trim().toLowerCase().toCharArray();
        boolean bl = false;
        int n = cArray.length;
        for (int i = 0; i < n; ++i) {
            if (Character.isLetter(cArray[i])) {
                if (bl) continue;
                cArray[i] = Character.toUpperCase(cArray[i]);
                bl = true;
                continue;
            }
            bl = false;
        }
        return String.valueOf(cArray);
    }

    public static boolean f(@NotNull String string, @NotNull String string2) {
        return BH.aT(string).contains(BH.aT(string2));
    }

    @Contract(value="!null -> !null;null -> null")
    @Nullable
    public static String aT(@Nullable String string) {
        if (string == null) {
            return null;
        }
        return BH.bd(string).trim();
    }

    public static String o(int n, int n2) {
        return BH.a(String.valueOf(n), n2);
    }

    private static String a(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int i = 0; i < n - string.length(); ++i) {
            stringBuilder.append('0');
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String cl(long l) {
        Date date = new Date(l);
        String string = date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900);
        String string2 = String.valueOf(date.getHours() < 10 ? "0" + date.getHours() : Integer.valueOf(date.getHours())) + ":" + String.valueOf(date.getMinutes() < 10 ? "0" + date.getMinutes() : Integer.valueOf(date.getMinutes()));
        return string + " \u00e0 " + string2;
    }

    public static boolean aU(String string) {
        return string == null || string.trim().isEmpty() || "null".equals(string);
    }

    public static boolean aV(String string) {
        return !BH.aU(string) && Pattern.matches("^[-]?\\d+$", string);
    }

    public static boolean aW(String string) {
        return !BH.aU(string) && Pattern.matches("^[-]?((\\d+([.]\\d*)?)|(\\d*([.]\\d+)?))$", string);
    }

    public static String aX(String string) {
        return string.replaceAll("&(?!amp;|quot;|apos;|lt;|gt;|#\\d+;)", "&amp;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }

    public static int a(char c2, String string) {
        int n = 0;
        int n2 = string.length();
        for (int i = 0; i < n2; ++i) {
            if (string.charAt(i) != c2) continue;
            ++n;
        }
        return n;
    }

    public static int a(char c2, char[] cArray) {
        int n = 0;
        for (char c3 : cArray) {
            if (c3 != c2) continue;
            ++n;
        }
        return n;
    }

    public static boolean a(String string, String string2, boolean bl) {
        if (bl) {
            if (BH.aU(string)) {
                return BH.aU(string2);
            }
        } else {
            if (string == null) {
                return string2 == null;
            }
            if (string2 == null) {
                return false;
            }
        }
        return string.equals(string2);
    }

    public static boolean g(@NotNull String string, @NotNull String string2) {
        return BH.aT(string).equals(BH.aT(string2));
    }

    public static int h(String string, String string2) {
        if (string == null) {
            return string2 == null ? 0 : "".compareTo(string2);
        }
        return string.compareTo(string2 == null ? "" : string2);
    }

    public static int i(String string, String string2) {
        return BI.avr.b(string, string2);
    }

    public static String aY(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(string);
        char c2 = stringCharacterIterator.current();
        while (c2 != '\uffff') {
            if (c2 == '<') {
                stringBuilder.append("&lt;");
            } else if (c2 == '>') {
                stringBuilder.append("&gt;");
            } else if (c2 == '\"') {
                stringBuilder.append("&quot;");
            } else if (c2 == '\'') {
                stringBuilder.append("&#039;");
            } else if (c2 == '&') {
                stringBuilder.append("&amp;");
            } else {
                stringBuilder.append(c2);
            }
            c2 = stringCharacterIterator.next();
        }
        return stringBuilder.toString();
    }

    public static String dd(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            int n = by & 0xFF;
            stringBuilder.append(avq.charAt(n >>> 4)).append(avq.charAt(n & 0xF));
        }
        return stringBuilder.toString();
    }

    public static byte[] aZ(String string) {
        int n = string.length();
        if (n % 2 != 0) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: " + string);
        }
        byte[] byArray = new byte[n / 2];
        for (int i = 0; i < n; i += 2) {
            int n2 = BH.a(string.charAt(i));
            int n3 = BH.a(string.charAt(i + 1));
            if (n2 == -1 || n3 == -1) {
                throw new IllegalArgumentException("contains illegal character for hexBinary: " + string);
            }
            byArray[i / 2] = (byte)(n2 * 16 + n3);
        }
        return byArray;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - 65 + 10;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        return -1;
    }

    public static String mk(int n) {
        return avp.format(n);
    }

    @Deprecated
    public static String d(int[] nArray) {
        if (nArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < nArray.length - 1; ++i) {
            stringBuilder.append(nArray[i]).append(',');
        }
        stringBuilder.append(nArray[nArray.length - 1]);
        return stringBuilder.toString();
    }

    @Deprecated
    public static String a(String[] stringArray, char c2) {
        if (stringArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < stringArray.length - 1; ++i) {
            stringBuilder.append(stringArray[i]).append(c2);
        }
        stringBuilder.append(stringArray[stringArray.length - 1]);
        return stringBuilder.toString();
    }

    public static int[] ba(@NotNull String string) {
        Object[] objectArray = Bv.c(BH.bb(string));
        HashSet hashSet = Sets.newHashSet((Object[])objectArray);
        return Bv.a(hashSet.toArray(new Integer[hashSet.size()]));
    }

    public static int[] bb(@NotNull String string) {
        String[] stringArray;
        if (string.isEmpty()) {
            return Bv.auu;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (String string2 : stringArray = BH.a(string, ',')) {
            hashSet.add(Integer.parseInt(string2.trim()));
        }
        return Bv.a(hashSet.toArray(new Integer[hashSet.size()]));
    }

    public static String a(String string, String string2, Object object) {
        int n = string.indexOf(string2);
        return string.substring(0, n) + String.valueOf(object) + string.substring(n + string2.length());
    }

    @NotNull
    public static String[] j(@NotNull String string, String string2) {
        if (string.isEmpty()) {
            return new String[]{""};
        }
        return string.split(Pattern.quote(string2));
    }

    @NotNull
    public static String[] a(@NotNull String string, char c2) {
        if (string.isEmpty()) {
            return new String[]{""};
        }
        return string.split(Pattern.quote(String.valueOf(c2)));
    }

    public static String b(String string, int n) {
        String string2 = string;
        do {
            byte[] byArray;
            if ((byArray = BH.aP(string2)).length <= n) {
                return string2;
            }
            string2 = string2.substring(0, string2.length() - 1);
        } while (!string2.isEmpty());
        return "";
    }

    public static String bc(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return string.length() == 1 ? String.valueOf(Character.toUpperCase(string.charAt(0))) : Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
    }

    public static String bd(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD).toLowerCase().replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replace("\u0153", "oe").replace("\u00e6", "ae").replace("\u2014", "-");
    }

    public static String be(@NotNull String string) {
        return string.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    @NotNull
    @Contract(pure=true)
    public static String bf(@NotNull String string) {
        return string.replaceAll("[\\x00-\\x1F]", "");
    }

    public static String de(byte[] byArray) {
        String string = Base64.getEncoder().withoutPadding().encodeToString(byArray) + "=";
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = string.charAt(0);
        int n = 1;
        for (int i = 1; i < string.length(); ++i) {
            if (string.charAt(i) == c2) {
                if (++n == 35) {
                    stringBuilder.append('-').append(Integer.toString(n, 36)).append(c2);
                    n = 0;
                }
            } else {
                if (n < 4) {
                    stringBuilder.append(string, i - n, i);
                } else {
                    stringBuilder.append('-').append(Integer.toString(n, 36)).append(c2);
                }
                n = 1;
            }
            c2 = string.charAt(i);
        }
        return stringBuilder.toString();
    }

    public static byte[] bg(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < string.length()) {
            if (string.charAt(n) == '-') {
                int n2 = Integer.parseInt(String.valueOf(string.charAt(n + 1)), 36);
                char c2 = string.charAt(n + 2);
                stringBuilder.append(String.valueOf(c2).repeat(n2));
                n += 3;
                continue;
            }
            stringBuilder.append(string.charAt(n));
            ++n;
        }
        return Base64.getDecoder().decode(stringBuilder.toString());
    }

    public static boolean bh(String string) {
        try {
            Pattern.compile(string);
            return true;
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return false;
        }
    }

    public static boolean bi(@Nullable String string) {
        return string != null && !string.isEmpty();
    }

    @Contract(value="null -> null;!null -> !null")
    public static String bj(String string) {
        if (string == null) {
            return null;
        }
        return string.replaceAll("\n", ", ").replaceAll("\\s{2,}", " ");
    }
}

