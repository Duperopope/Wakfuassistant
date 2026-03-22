/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from eTT
 */
public final class ett_0
extends Enum<ett_0> {
    public static final /* enum */ ett_0 rqv = new ett_0(0);
    public static final /* enum */ ett_0 rqw = new ett_0(1);
    public static final /* enum */ ett_0 rqx = new ett_0(2);
    public static final /* enum */ ett_0 rqy = new ett_0(3);
    public static final /* enum */ ett_0 rqz = new ett_0(4);
    public static final /* enum */ ett_0 rqA = new ett_0(5);
    public static final /* enum */ ett_0 rqB = new ett_0(10);
    private final byte rqC;
    private static final /* synthetic */ ett_0[] rqD;

    public static ett_0[] values() {
        return (ett_0[])rqD.clone();
    }

    public static ett_0 valueOf(String string) {
        return Enum.valueOf(ett_0.class, string);
    }

    private ett_0(byte by) {
        this.rqC = by;
    }

    public byte aJr() {
        return this.rqC;
    }

    public static ett_0 fj(byte by) {
        for (ett_0 ett_02 : ett_0.values()) {
            if (ett_02.rqC != by) continue;
            return ett_02;
        }
        return rqB;
    }

    private static /* synthetic */ ett_0[] fJx() {
        return new ett_0[]{rqv, rqw, rqx, rqy, rqz, rqA, rqB};
    }

    static {
        rqD = ett_0.fJx();
    }
}

