/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eHl
 */
public final class ehl_0
extends Enum<ehl_0> {
    public static final /* enum */ ehl_0 pFp = new ehl_0("none");
    public static final /* enum */ ehl_0 pFq = new ehl_0("caster");
    public static final /* enum */ ehl_0 pFr = new ehl_0("target");
    public static final /* enum */ ehl_0 pFs = new ehl_0("eventTriggerer");
    public static final /* enum */ ehl_0 pFt = new ehl_0("eventTarget");
    public static final /* enum */ ehl_0 pFu = new ehl_0("position");
    private final String pFv;
    private static final /* synthetic */ ehl_0[] pFw;

    public static ehl_0[] values() {
        return (ehl_0[])pFw.clone();
    }

    public static ehl_0 valueOf(String string) {
        return Enum.valueOf(ehl_0.class, string);
    }

    private ehl_0(String string2) {
        this.pFv = string2;
    }

    public String foh() {
        return this.pFv;
    }

    public static ehl_0 rV(String string) {
        for (ehl_0 ehl_02 : ehl_0.values()) {
            if (!ehl_02.pFv.equals(string)) continue;
            return ehl_02;
        }
        return pFp;
    }

    private static /* synthetic */ ehl_0[] foi() {
        return new ehl_0[]{pFp, pFq, pFr, pFs, pFt, pFu};
    }

    static {
        pFw = ehl_0.foi();
    }
}

