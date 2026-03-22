/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from bJb
 */
public final class bjb_0
extends Enum<bjb_0>
implements aoq_1 {
    public static final /* enum */ bjb_0 kkb = new bjb_0(0);
    public static final /* enum */ bjb_0 kkc = new bjb_0(1);
    public static final /* enum */ bjb_0 kkd = new bjb_0(2);
    public static final /* enum */ bjb_0 kke = new bjb_0(3);
    public static final /* enum */ bjb_0 kkf = new bjb_0(4);
    private final int kkg;
    private static final /* synthetic */ bjb_0[] kkh;

    public static bjb_0[] values() {
        return (bjb_0[])kkh.clone();
    }

    public static bjb_0 valueOf(String string) {
        return Enum.valueOf(bjb_0.class, string);
    }

    private bjb_0(int n2) {
        this.kkg = n2;
    }

    public static bjb_0 Hj(int n) {
        for (bjb_0 bjb_02 : bjb_0.values()) {
            if (bjb_02.kkg != n) continue;
            return bjb_02;
        }
        return kkb;
    }

    public int d() {
        return this.kkg;
    }

    @Override
    public String aXA() {
        return String.valueOf(this.kkg);
    }

    @Override
    public String aXB() {
        return this.toString();
    }

    @Override
    public String aXC() {
        return null;
    }

    private static /* synthetic */ bjb_0[] dZV() {
        return new bjb_0[]{kkb, kkc, kkd, kke, kkf};
    }

    static {
        kkh = bjb_0.dZV();
    }
}

