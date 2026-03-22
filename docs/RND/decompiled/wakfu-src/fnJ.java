/*
 * Decompiled with CFR 0.152.
 */
public final class fnJ
extends Enum<fnJ> {
    public static final /* enum */ fnJ sKp = new fnJ(127);
    public static final /* enum */ fnJ sKq = new fnJ(1);
    public static final /* enum */ fnJ sKr = new fnJ(127);
    public static final /* enum */ fnJ sKs = new fnJ(8);
    public static final /* enum */ fnJ sKt = new fnJ(127);
    public final byte sKu;
    private static final /* synthetic */ fnJ[] sKv;

    public static fnJ[] values() {
        return (fnJ[])sKv.clone();
    }

    public static fnJ valueOf(String string) {
        return Enum.valueOf(fnJ.class, string);
    }

    private fnJ(int n2) {
        this.sKu = (byte)n2;
    }

    private static /* synthetic */ fnJ[] geK() {
        return new fnJ[]{sKp, sKq, sKr, sKs, sKt};
    }

    static {
        sKv = fnJ.geK();
    }
}

