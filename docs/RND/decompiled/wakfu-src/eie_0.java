/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;

/*
 * Renamed from eIE
 */
public final class eie_0
extends Enum<eie_0> {
    public static final /* enum */ eie_0 qwM = new eie_0(0, true);
    public static final /* enum */ eie_0 qwN = new eie_0(1, false);
    public static final /* enum */ eie_0 qwO = new eie_0(2, false);
    private static final eie_0[] qwP;
    private final int qwQ;
    private final boolean qwR;
    private static final /* synthetic */ eie_0[] qwS;

    public static eie_0[] values() {
        return (eie_0[])qwS.clone();
    }

    public static eie_0 valueOf(String string) {
        return Enum.valueOf(eie_0.class, string);
    }

    private eie_0(int n2, boolean bl) {
        this.qwQ = n2;
        this.qwR = bl;
    }

    public boolean aGv() {
        return this.qwR;
    }

    public byte aJr() {
        return (byte)this.qwQ;
    }

    public static Optional<eie_0> mL(int n) {
        if (n < 0 || n >= qwP.length) {
            return Optional.empty();
        }
        return Optional.of(qwP[n]);
    }

    private static /* synthetic */ eie_0[] fwF() {
        return new eie_0[]{qwM, qwN, qwO};
    }

    static {
        qwS = eie_0.fwF();
        qwP = eie_0.values();
    }
}

