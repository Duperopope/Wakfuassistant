/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from beL
 */
public final class bel_2 {
    public static final int hNV = 15;
    public static final long hNW = 900000L;
    private static final Runnable hNX = new bem_2();

    private bel_2() {
    }

    public static void a(eHC eHC2) {
        String string = aum_0.cWf().c("antiAddictionLevel.name." + eHC2.aJr(), new Object[0]);
        String string2 = aum_0.cWf().c("antiAddictionLevel.desc." + eHC2.aJr(), new Object[0]);
        if (BH.aU(string) && BH.aU(string2)) {
            return;
        }
        dcd dcd2 = new dcd(string, string2, biu_1.kiv, 600011);
        aaw_1.bUq().h(dcd2);
        aPh.czg().iZ(string2);
        if (eHC2 == eHC.qsu) {
            bel_2.deM();
            abg_2.bUP().a(hNX, 900000L, 1);
        }
    }

    public static void deM() {
        abg_2.bUP().h(hNX);
    }
}

