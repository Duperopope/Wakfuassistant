/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from eAJ
 */
public class eaj_0 {
    public static byte a(String string, List<amz_1[]> list, List<amx_1> list2) {
        if (list2 == null) {
            return -1;
        }
        for (byte by = 0; by < list.size(); by = (byte)(by + 1)) {
            amz_1[] amz_1Array = list.get(by);
            boolean bl = true;
            boolean bl2 = false;
            int n = 0;
            int n2 = amz_1Array.length - 1;
            for (int n3 = 0; n3 < list2.size(); n3 = (int)((byte)(n3 + 1))) {
                boolean bl3;
                if (n > n2) {
                    bl2 = true;
                    break;
                }
                amz_1 amz_12 = list2.get(n3).bDv();
                if (amz_1Array[n] == amz_1.cJA && amz_12 != amz_1.cJA) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list2.size()) {
                        if (amz_12 != amz_1.cJy) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (amz_1Array[n] == amz_1.cJB) {
                    bl = false;
                    bl3 = true;
                    while (n3 < list2.size()) {
                        if (amz_12 != amz_1.cJx) {
                            bl3 = false;
                            break;
                        }
                        n3 = (byte)(n3 + 1);
                    }
                    if (bl3) {
                        if (n != n2) {
                            bl2 = true;
                            break;
                        }
                        return by;
                    }
                    n3 = (byte)(n3 - 1);
                    n = (byte)(n + 1);
                    continue;
                }
                if (amz_12 != amz_1Array[n]) {
                    bl2 = true;
                    break;
                }
                n = (byte)(n + 1);
            }
            if (bl2 || bl && list2.size() != amz_1Array.length) continue;
            return by;
        }
        String string2 = "La fonction " + string + " n'est pas utilis\u00e9e avec le bon nombre (ou type) d'arguments. \n";
        string2 = string2 + "Les arguments possibles sont :";
        string2 = string2 + eaj_0.aM(list);
        throw new amw_2(string2);
    }

    private static String aM(Iterable<amz_1[]> iterable) {
        StringBuilder stringBuilder = new StringBuilder();
        for (amz_1[] amz_1Array : iterable) {
            stringBuilder.append("\n (");
            eaj_0.a(stringBuilder, amz_1Array);
            stringBuilder.append(')');
        }
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, amz_1 ... amz_1Array) {
        int n = amz_1Array.length;
        if (n == 0) {
            return;
        }
        stringBuilder.append(amz_1Array[0].name());
        for (int n2 = 1; n2 < n; n2 = (int)((byte)(n2 + 1))) {
            stringBuilder.append(", ").append(amz_1Array[n2].name());
        }
    }
}

