/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amx
 */
public abstract class amx_2
extends ang_2 {
    public static void a(amx_1 ... amx_1Array) {
        if (amx_1Array.length != 2) {
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur bool\u00e9en au mauvais nombre d'arguments ");
        }
        for (amx_1 amx_12 : amx_1Array) {
            if (amx_12.bDv() == amz_1.cJz) continue;
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur bool\u00e9en \u00e0 autre chose que des bool\u00e9ens...");
        }
    }
}

