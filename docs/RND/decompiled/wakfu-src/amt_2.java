/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from amT
 */
public abstract class amt_2
extends amu_1 {
    private boolean cJh = false;

    @Override
    public void bDx() {
        this.cJh = !this.cJh;
    }

    protected boolean bDz() {
        return this.cJh;
    }

    public static void a(amx_1 ... amx_1Array) {
        if (amx_1Array.length != 2) {
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique au mauvais nombre d'arguments ");
        }
        for (amx_1 amx_12 : amx_1Array) {
            if (amx_12.bDv() == amz_1.cJy) continue;
            throw new amw_2("On essaie d'appliquer un op\u00e9rateur num\u00e9rique \u00e0 autre chose que des nombres...");
        }
    }
}

