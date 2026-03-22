/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from ezX
 */
public final class ezx_0
extends Enum<ezx_0> {
    public static final /* enum */ ezx_0 pve = new ezx_0(-128, 0);
    public static final /* enum */ ezx_0 pvf = new ezx_0(0, 1);
    public static final /* enum */ ezx_0 pvg = new ezx_0(1, 0);
    public static final /* enum */ ezx_0 pvh = new ezx_0(2, 0);
    public static final /* enum */ ezx_0 pvi = new ezx_0(3, 0);
    public static final /* enum */ ezx_0 pvj = new ezx_0(127, 0);
    private static final ezx_0[] pvk;
    private final byte pvl;
    private final int pvm;
    private static final /* synthetic */ ezx_0[] pvn;

    public static ezx_0[] values() {
        return (ezx_0[])pvn.clone();
    }

    public static ezx_0 valueOf(String string) {
        return Enum.valueOf(ezx_0.class, string);
    }

    private ezx_0(byte by, int n2) {
        this.pvl = by;
        this.pvm = n2;
    }

    public byte aJr() {
        return this.pvl;
    }

    public int aYs() {
        return this.pvm;
    }

    public static Optional<ezx_0> eL(byte by) {
        for (ezx_0 ezx_02 : pvk) {
            if (ezx_02.pvl != by) continue;
            return Optional.of(ezx_02);
        }
        return Optional.empty();
    }

    private static /* synthetic */ ezx_0[] fnq() {
        return new ezx_0[]{pve, pvf, pvg, pvh, pvi, pvj};
    }

    static {
        pvn = ezx_0.fnq();
        pvk = ezx_0.values();
    }
}

