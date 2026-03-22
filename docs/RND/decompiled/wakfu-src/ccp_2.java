/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cCP
 */
public final class ccp_2
extends Enum<ccp_2> {
    public static final /* enum */ ccp_2 mRE = new ccp_2(0);
    public static final /* enum */ ccp_2 mRF = new ccp_2(1);
    public static final /* enum */ ccp_2 mRG = new ccp_2(2);
    public static final /* enum */ ccp_2 mRH = new ccp_2(3);
    public static final /* enum */ ccp_2 mRI = new ccp_2(4);
    public static final /* enum */ ccp_2 mRJ = new ccp_2(5);
    public static final /* enum */ ccp_2 mRK = new ccp_2(6);
    public static final /* enum */ ccp_2 mRL = new ccp_2(7);
    public static final /* enum */ ccp_2 mRM = new ccp_2(8);
    public static final /* enum */ ccp_2 mRN = new ccp_2(9);
    private final int mRO;
    private static final /* synthetic */ ccp_2[] mRP;

    public static ccp_2[] values() {
        return (ccp_2[])mRP.clone();
    }

    public static ccp_2 valueOf(String string) {
        return Enum.valueOf(ccp_2.class, string);
    }

    private ccp_2(int n2) {
        this.mRO = n2;
    }

    public String byf() {
        try {
            return String.format(auc_0.cVq().bS("messageBoxIconsPath"), this.mRO);
        }
        catch (fu_0 fu_02) {
            return null;
        }
    }

    private static /* synthetic */ ccp_2[] eJL() {
        return new ccp_2[]{mRE, mRF, mRG, mRH, mRI, mRJ, mRK, mRL, mRM, mRN};
    }

    static {
        mRP = ccp_2.eJL();
    }
}

