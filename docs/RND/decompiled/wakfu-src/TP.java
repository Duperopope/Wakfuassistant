/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

abstract sealed class TP
extends Enum<TP>
permits TQ, TR, TS {
    public static final /* enum */ TP bue = new TQ(0, Ub.class);
    public static final /* enum */ TP buf = new TR(1, Uc.class);
    public static final /* enum */ TP bug = new TS(2, TT.class);
    final byte buh;
    final Class<? extends TO> bui;
    private static final /* synthetic */ TP[] buj;

    public static TP[] values() {
        return (TP[])buj.clone();
    }

    public static TP valueOf(String string) {
        return Enum.valueOf(TP.class, string);
    }

    TP(byte by, Class<? extends TO> clazz) {
        this.buh = by;
        this.bui = clazz;
    }

    static TP j(Class<? extends TO> clazz) {
        for (TP tP : TP.values()) {
            if (tP.bui != clazz) continue;
            return tP;
        }
        throw new IllegalArgumentException("Pas s\u00e9rialisable: " + clazz.getSimpleName());
    }

    static TP ad(byte by) {
        for (TP tP : TP.values()) {
            if (tP.buh != by) continue;
            return tP;
        }
        throw new IllegalArgumentException("Pas s\u00e9rialisable: id " + by);
    }

    public void a(TO tO, ByteBuffer byteBuffer) {
        if (tO.getClass() != this.bui) {
            throw new IllegalArgumentException();
        }
        byteBuffer.put(this.buh);
        tO.eP(byteBuffer);
    }

    public int b(TO tO) {
        return 1 + tO.biD();
    }

    abstract TO biF();

    public static TO eQ(ByteBuffer byteBuffer) {
        return TP.ad(byteBuffer.get()).biF();
    }

    private static /* synthetic */ TP[] biG() {
        return new TP[]{bue, buf, bug};
    }

    static {
        buj = TP.biG();
    }
}

