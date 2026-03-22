/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cBE
 */
public final class cbe_0
extends Enum<cbe_0> {
    public static final /* enum */ cbe_0 myy = new cbe_0(0, new cbf_0());
    public static final /* enum */ cbe_0 myz = new cbe_0(1, new cbg_0());
    public static final /* enum */ cbe_0 myA = new cbe_0(2, new cbh_0());
    public static final /* enum */ cbe_0 myB = new cbe_0(3, new cbi_0());
    public static final /* enum */ cbe_0 myC = new cbe_0(4, new cbj_0());
    public static final /* enum */ cbe_0 myD = new cbe_0(6, new cbk_0());
    public static final /* enum */ cbe_0 myE = new cbe_0(5, new cbl_0());
    public static final /* enum */ cbe_0 myF = new cbe_0(7, new cbm_0());
    public static final /* enum */ cbe_0 myG = new cbe_0(8, new cbn_0());
    private final byte myH;
    private final cbq_0 myI;
    private static final /* synthetic */ cbe_0[] myJ;

    public static cbe_0[] values() {
        return (cbe_0[])myJ.clone();
    }

    public static cbe_0 valueOf(String string) {
        return Enum.valueOf(cbe_0.class, string);
    }

    private cbe_0(byte by, cbq_0 cbq_02) {
        this.myH = by;
        this.myI = cbq_02;
    }

    public byte aJr() {
        return this.myH;
    }

    public cbp_0 eIW() {
        return this.myI.eIW();
    }

    public static cbe_0 dU(byte by) {
        for (cbe_0 cbe_02 : cbe_0.values()) {
            if (cbe_02.myH != by) continue;
            return cbe_02;
        }
        return null;
    }

    public String toString() {
        switch (this.ordinal()) {
            case 0: {
                return "Saison";
            }
            case 1: {
                return "Temp\u00e9rature";
            }
            case 2: {
                return "P\u00e9riode de la journ\u00e9e";
            }
            case 3: {
                return "Type de zone";
            }
            case 4: {
                return "Wakfu";
            }
            case 5: {
                return "Et";
            }
            case 6: {
                return "Ou";
            }
            case 7: {
                return "Joueurs alentours";
            }
            case 8: {
                return "Altitude";
            }
        }
        return super.toString();
    }

    public static cbp_0 E(apl_1 apl_12) {
        cbp_0 cbp_02 = cbe_0.dU(apl_12.aIy()).eIW();
        cbp_02.a(apl_12);
        return cbp_02;
    }

    public static void a(fs_0 fs_02, cbp_0 cbp_02) {
        fs_02.g(cbp_02.eIT());
        cbp_02.b(fs_02);
    }

    private static /* synthetic */ cbe_0[] eIX() {
        return new cbe_0[]{myy, myz, myA, myB, myC, myD, myE, myF, myG};
    }

    static {
        myJ = cbe_0.eIX();
    }
}

