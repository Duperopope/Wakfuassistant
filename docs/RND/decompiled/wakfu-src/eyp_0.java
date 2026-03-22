/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eyP
 */
public final class eyp_0
extends Enum<eyp_0> {
    public static final /* enum */ eyp_0 pmN = new eyp_0();
    public static final /* enum */ eyp_0 pmO = new eyp_0(pmN);
    public static final /* enum */ eyp_0 pmP = new eyp_0(pmN);
    public static final /* enum */ eyp_0 pmQ = new eyp_0(pmP);
    public static final /* enum */ eyp_0 pmR = new eyp_0();
    public static final /* enum */ eyp_0 pmS = new eyp_0();
    private final eyp_0 pmT;
    private static final /* synthetic */ eyp_0[] pmU;

    public static eyp_0[] values() {
        return (eyp_0[])pmU.clone();
    }

    public static eyp_0 valueOf(String string) {
        return Enum.valueOf(eyp_0.class, string);
    }

    private eyp_0() {
        this.pmT = null;
    }

    private eyp_0(eyp_0 eyp_02) {
        this.pmT = eyp_02;
    }

    public boolean a(eyp_0 eyp_02) {
        eyp_0 eyp_03 = this;
        while (eyp_03 != null) {
            if (eyp_03 == eyp_02) {
                return true;
            }
            eyp_03 = eyp_03.pmT;
        }
        return false;
    }

    private static /* synthetic */ eyp_0[] fkm() {
        return new eyp_0[]{pmN, pmO, pmP, pmQ, pmR, pmS};
    }

    static {
        pmU = eyp_0.fkm();
    }
}

