/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amS
 */
public abstract class ams_2
extends ang_2 {
    public static void a(amx_1 ... amx_1Array) {
        if (amx_1Array.length != 2) {
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique au mauvais nombre d'arguments ");
        }
        if (amx_1Array[0] == null || amx_1Array[1] == null) {
            throw new amw_2("Un des 2 param\u00e8tres a \u00e9t\u00e9 impossible \u00e0 parser");
        }
        for (amx_1 amx_12 : amx_1Array) {
            if (amx_12.bDv() == amz_1.cJy || amx_12.bDv() == amz_1.cJC) continue;
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique \u00e0 autre chose que des nombres...");
        }
    }
}

