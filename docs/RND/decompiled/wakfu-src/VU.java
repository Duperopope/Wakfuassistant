/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.iterator.TShortObjectIterator
 *  gnu.trove.map.hash.TShortObjectHashMap
 */
import gnu.trove.iterator.TShortObjectIterator;
import gnu.trove.map.hash.TShortObjectHashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VU {
    public static final String bKT = "(([^\\p{L}]|\\A)(";
    public static final String bKU = ")([^\\p{L}]|\\z))";
    public static final String bKV = "((";
    public static final String bKW = "))";
    public static final String bKX = "([\\p{L}]*((";
    public static final String bKY = ")+)[\\p{L}]*)";
    public static final int bKZ = 10000;
    private static final char[] bLa = new char[]{'&', '~', '#', '@', '\u00a3', '\u00a4', '\u00b5', '%', '!'};

    private VU() {
    }

    private static ArrayList<Pattern> a(List<String> list, String string, String string2, int n) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        int n2 = 0;
        while (n2 < list.size()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string);
            boolean bl = true;
            while (n2 < list.size()) {
                if (bl) {
                    bl = false;
                } else {
                    stringBuilder.append('|');
                }
                stringBuilder.append(Pattern.quote(list.get(n2)));
                if (stringBuilder.length() > 10000) break;
                ++n2;
            }
            stringBuilder.append(string2);
            arrayList.add(Pattern.compile(stringBuilder.toString(), n));
        }
        return arrayList;
    }

    public static ArrayList<Pattern> b(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (VS.ao(tShortObjectIterator.key()).bkU()) {
                arrayList.addAll(VU.a((List)tShortObjectIterator.value(), bKT, bKU, 2));
                continue;
            }
            arrayList.addAll(VU.a((List)tShortObjectIterator.value(), bKT, bKU, 2));
        }
        return arrayList;
    }

    public static ArrayList<Pattern> c(TShortObjectHashMap<ArrayList<String>> tShortObjectHashMap) {
        ArrayList<Pattern> arrayList = new ArrayList<Pattern>();
        TShortObjectIterator tShortObjectIterator = tShortObjectHashMap.iterator();
        while (tShortObjectIterator.hasNext()) {
            tShortObjectIterator.advance();
            if (VS.ao(tShortObjectIterator.key()).bkU()) {
                arrayList.addAll(VU.a((List)tShortObjectIterator.value(), bKV, bKW, 2));
                continue;
            }
            arrayList.addAll(VU.a((List)tShortObjectIterator.value(), bKX, bKY, 2));
        }
        return arrayList;
    }

    public static String c(String string, ArrayList<Pattern> arrayList) {
        for (int i = 0; i < arrayList.size(); ++i) {
            Pattern pattern = arrayList.get(i);
            string = VU.a(string, pattern);
        }
        return string;
    }

    public static String d(String string, ArrayList<Pattern> arrayList) {
        for (int i = 0; i < arrayList.size(); ++i) {
            Pattern pattern = arrayList.get(i);
            string = VU.b(string, pattern);
        }
        return string;
    }

    private static String a(String string, Pattern pattern) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        String string3 = BH.aT(string2);
        Matcher matcher = pattern.matcher(string3);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start());
            n = matcher.end();
            int n2 = matcher.end() - matcher.start();
            VU.a(stringBuilder, n2);
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    private static String b(String string, Pattern pattern) {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = string.trim();
        String string3 = BH.aT(string2);
        Matcher matcher = pattern.matcher(string3);
        int n = 0;
        while (matcher.find()) {
            stringBuilder.append(string2, n, matcher.start(2));
            n = matcher.end(2);
            int n2 = matcher.end(2) - matcher.start(2);
            VU.a(stringBuilder, n2);
        }
        stringBuilder.append(string2, n, string2.length());
        return stringBuilder.toString();
    }

    public static void a(StringBuilder stringBuilder, int n) {
        for (int i = 0; i < n; ++i) {
            stringBuilder.append(bLa[GC.mR(bLa.length)]);
        }
    }
}

