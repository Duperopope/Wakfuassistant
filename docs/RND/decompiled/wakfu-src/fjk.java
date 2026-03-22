/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class fjk
extends Enum<fjk>
implements aoq_1 {
    public static final /* enum */ fjk sxM = new fjk(0, "NONE");
    public static final /* enum */ fjk sxN = new fjk(1, "DRAGOTURKEY");
    public static final /* enum */ fjk sxO = new fjk(2, "GOBALL");
    public static final /* enum */ fjk sxP = new fjk(3, "BOOWOLF");
    public static final /* enum */ fjk sxQ = new fjk(4, "DRHELLER");
    public static final /* enum */ fjk sxR = new fjk(5, "DRAGON");
    public static final /* enum */ fjk sxS = new fjk(6, "TOFU");
    public static final /* enum */ fjk sxT = new fjk(7, "BOUNE");
    public static final /* enum */ fjk sxU = new fjk(8, "CHACHA");
    public static final /* enum */ fjk sxV = new fjk(9, "GODRON");
    public static final /* enum */ fjk sxW = new fjk(10, "MECHA");
    public static final /* enum */ fjk sxX = new fjk(11, "FLYING_CARPET");
    public static final /* enum */ fjk sxY = new fjk(12, "SOAPBOX");
    public static final /* enum */ fjk sxZ = new fjk(13, "REPTILIAN");
    public static final /* enum */ fjk sya = new fjk(14, "BOAT");
    public static final /* enum */ fjk syb = new fjk(15, "MOTORCYCLE");
    public static final /* enum */ fjk syc = new fjk(16, "DEER");
    public static final /* enum */ fjk syd = new fjk(17, "ELEPHANT");
    public static final /* enum */ fjk sye = new fjk(18, "TIGER");
    public static final /* enum */ fjk syf = new fjk(19, "DRAGON_2");
    private final int syg;
    private final String syh;
    private static final /* synthetic */ fjk[] syi;

    public static fjk[] values() {
        return (fjk[])syi.clone();
    }

    public static fjk valueOf(String string) {
        return Enum.valueOf(fjk.class, string);
    }

    private fjk(int n2, String string2) {
        this.syg = n2;
        this.syh = string2;
    }

    public int d() {
        return this.syg;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.syg);
    }

    @Override
    public String aXB() {
        return this.syh;
    }

    @Override
    public String aXC() {
        return null;
    }

    @NotNull
    public static fjk gP(byte by) {
        for (fjk fjk2 : fjk.values()) {
            if (fjk2.syg != by) continue;
            return fjk2;
        }
        return sxM;
    }

    private static /* synthetic */ fjk[] gaR() {
        return new fjk[]{sxM, sxN, sxO, sxP, sxQ, sxR, sxS, sxT, sxU, sxV, sxW, sxX, sxY, sxZ, sya, syb, syc, syd, sye, syf};
    }

    static {
        syi = fjk.gaR();
    }
}

