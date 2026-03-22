/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

@Deprecated(forRemoval=true)
public final class fnl
extends Enum<fnl> {
    public static final /* enum */ fnl sIp = new fnl(1, 604800000L, 0.3333333333333333);
    public static final /* enum */ fnl sIq = new fnl(2, 1209600000L, 0.5);
    public static final /* enum */ fnl sIr = new fnl(3, 2419200000L, 1.0);
    public final byte sIs;
    public final long sIt;
    public final uz_0 sIu;
    public final double sIv;
    private static final /* synthetic */ fnl[] sIw;

    public static fnl[] values() {
        return (fnl[])sIw.clone();
    }

    public static fnl valueOf(String string) {
        return Enum.valueOf(fnl.class, string);
    }

    private fnl(byte by, long l, double d2) {
        this.sIs = by;
        this.sIt = l;
        this.sIu = new uz_0(l / 1000L);
        this.sIv = d2;
    }

    @Nullable
    public static fnl gX(byte by) {
        for (fnl fnl2 : fnl.values()) {
            if (fnl2.sIs != by) continue;
            return fnl2;
        }
        return null;
    }

    private static /* synthetic */ fnl[] gec() {
        return new fnl[]{sIp, sIq, sIr};
    }

    static {
        sIw = fnl.gec();
    }
}

