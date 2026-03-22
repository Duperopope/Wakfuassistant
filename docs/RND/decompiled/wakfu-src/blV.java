/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  lombok.Generated
 */
import lombok.Generated;

final class blV
extends Enum<blV> {
    public static final /* enum */ blV ixQ = new blV(16027, "create", false);
    public static final /* enum */ blV ixR = new blV(18030, "modify", true);
    public static final /* enum */ blV ixS = new blV(16999, "copy", true);
    final short ixT;
    final String ixU;
    final boolean ixV;
    private static final /* synthetic */ blV[] ixW;

    public static blV[] values() {
        return (blV[])ixW.clone();
    }

    public static blV valueOf(String string) {
        return Enum.valueOf(blV.class, string);
    }

    @Generated
    private blV(short s, String string2, boolean bl) {
        this.ixT = s;
        this.ixU = string2;
        this.ixV = bl;
    }

    private static /* synthetic */ blV[] duV() {
        return new blV[]{ixQ, ixR, ixS};
    }

    static {
        ixW = blV.duV();
    }
}

