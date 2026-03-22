/*
 * Decompiled with CFR 0.152.
 */
public final class fed
extends Enum<fed> {
    public static final /* enum */ fed rZF = new fed(fee.rZN);
    public static final /* enum */ fed rZG = new fed(fem.rZS);
    public static final /* enum */ fed rZH = new fed(fek.rZR);
    public static final /* enum */ fed rZI = new fed(feg.rZO);
    public static final /* enum */ fed rZJ = new fed(feo.rZT);
    public static final /* enum */ fed rZK = new fed(fee.rZN);
    private final aza_2<fec> rZL;
    private static final /* synthetic */ fed[] rZM;

    public static fed[] values() {
        return (fed[])rZM.clone();
    }

    public static fed valueOf(String string) {
        return Enum.valueOf(fed.class, string);
    }

    private fed(aza_2<fec> aza_22) {
        this.rZL = aza_22;
    }

    public static fec gd(byte by) {
        fed fed2 = fed.values()[by];
        if (fed2 == null) {
            throw new UnsupportedOperationException("Impossible de trouver le type d'action " + String.valueOf((Object)fed2));
        }
        return fed2.rZL.createNew();
    }

    private static /* synthetic */ fed[] fUu() {
        return new fed[]{rZF, rZG, rZH, rZI, rZJ, rZK};
    }

    static {
        rZM = fed.fUu();
    }
}

