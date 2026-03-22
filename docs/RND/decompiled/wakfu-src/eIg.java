/*
 * Decompiled with CFR 0.152.
 */
public final class eIg
extends Enum<eIg> {
    public static final /* enum */ eIg quX = new eIg(-1, false);
    public static final /* enum */ eIg quY = new eIg(0, false);
    public static final /* enum */ eIg quZ = new eIg(1);
    public static final /* enum */ eIg qva = new eIg(2);
    public static final /* enum */ eIg qvb = new eIg(3);
    public static final /* enum */ eIg qvc = new eIg(4);
    public static final /* enum */ eIg qvd = new eIg(5);
    public static final /* enum */ eIg qve = new eIg(6);
    public static final /* enum */ eIg qvf = new eIg(7);
    public static final /* enum */ eIg qvg = new eIg(8);
    public static final /* enum */ eIg qvh = new eIg(9);
    public static final /* enum */ eIg qvi = new eIg(10);
    public static final /* enum */ eIg qvj = new eIg(11);
    public static final /* enum */ eIg qvk = new eIg(12);
    private static final eIg[] qvl;
    private final int qvm;
    private final boolean qvn;
    private static final /* synthetic */ eIg[] qvo;

    public static eIg[] values() {
        return (eIg[])qvo.clone();
    }

    public static eIg valueOf(String string) {
        return Enum.valueOf(eIg.class, string);
    }

    private eIg(int n2) {
        this(n2, true);
    }

    private eIg(int n2, boolean bl) {
        this.qvm = n2;
        this.qvn = bl;
    }

    public int d() {
        return this.qvm;
    }

    public boolean aHz() {
        return this.qvn;
    }

    public static eIg eO(byte by) {
        if (by > qvl.length) {
            return quX;
        }
        return qvl[by];
    }

    private static /* synthetic */ eIg[] fwm() {
        return new eIg[]{quX, quY, quZ, qva, qvb, qvc, qvd, qve, qvf, qvg, qvh, qvi, qvj, qvk};
    }

    static {
        qvo = eIg.fwm();
        qvl = eIg.values();
    }
}

