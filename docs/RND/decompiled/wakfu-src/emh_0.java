/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from eMH
 */
public final class emh_0
extends Enum<emh_0>
implements qa_0 {
    public static final /* enum */ emh_0 qMS = new emh_0(0);
    public static final /* enum */ emh_0 qMT = new emh_0(1);
    public static final /* enum */ emh_0 qMU = new emh_0(2);
    public static final /* enum */ emh_0 qMV = new emh_0(3);
    private final byte qMW;
    private static final /* synthetic */ emh_0[] qMX;

    public static emh_0[] values() {
        return (emh_0[])qMX.clone();
    }

    public static emh_0 valueOf(String string) {
        return Enum.valueOf(emh_0.class, string);
    }

    private emh_0(int n2) {
        this.qMW = (byte)n2;
    }

    public byte aJr() {
        return this.qMW;
    }

    public String qq(long l) {
        return this.name().toLowerCase() + l;
    }

    @NotNull
    public static emh_0 fd(byte by) {
        emh_0[] emh_0Array = emh_0.values();
        for (int i = 0; i < emh_0Array.length; ++i) {
            emh_0 emh_02 = emh_0Array[i];
            if (emh_02.qMW != by) continue;
            return emh_02;
        }
        return qMS;
    }

    private static /* synthetic */ emh_0[] fAG() {
        return new emh_0[]{qMS, qMT, qMU, qMV};
    }

    static {
        qMX = emh_0.fAG();
    }
}

