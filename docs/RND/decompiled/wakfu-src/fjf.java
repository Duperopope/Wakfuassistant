/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

@Deprecated(forRemoval=true)
public final class fjf
extends Enum<fjf> {
    public static final /* enum */ fjf swZ = new fjf(0, 1);
    public static final /* enum */ fjf sxa = new fjf(1, 10);
    public static final /* enum */ fjf sxb = new fjf(2, 50);
    public static final /* enum */ fjf sxc = new fjf(3, 100);
    private static final fjf[] sxd;
    private static final short[] sxe;
    public static final byte sxf = -1;
    private final byte sxg;
    private final short sxh;
    private static final /* synthetic */ fjf[] sxi;

    public static fjf[] values() {
        return (fjf[])sxi.clone();
    }

    public static fjf valueOf(String string) {
        return Enum.valueOf(fjf.class, string);
    }

    private fjf(byte by, short s) {
        this.sxg = by;
        this.sxh = s;
    }

    public byte aJr() {
        return this.sxg;
    }

    public short bfd() {
        return this.sxh;
    }

    public static Optional<fjf> eL(byte by) {
        for (fjf fjf2 : sxd) {
            if (fjf2.sxg != by) continue;
            return Optional.of(fjf2);
        }
        return Optional.empty();
    }

    public static Optional<fjf> fm(short s) {
        for (fjf fjf2 : sxd) {
            if (fjf2.sxh != s) continue;
            return Optional.of(fjf2);
        }
        return Optional.empty();
    }

    public static fjf Ww(int n) {
        return sxd[n];
    }

    public static short gM(byte by) {
        return sxe[by];
    }

    public static short Wx(int n) {
        return sxe[n];
    }

    private static /* synthetic */ fjf[] gaK() {
        return new fjf[]{swZ, sxa, sxb, sxc};
    }

    static {
        sxi = fjf.gaK();
        sxd = fjf.values();
        sxe = new short[sxd.length];
        for (fjf fjf2 : sxd) {
            fjf.sxe[fjf2.sxg] = fjf2.sxh;
        }
    }
}

