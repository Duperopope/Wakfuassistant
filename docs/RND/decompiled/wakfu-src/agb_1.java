/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aGb
 */
public abstract class agb_1
extends aft_2
implements aao_2 {
    private static int dKp;
    protected static final int dKq = 30000;
    protected static final int dKr = -1;
    protected long dxy;

    public static int cbm() {
        dKp = dKp == Integer.MAX_VALUE ? 0 : ++dKp;
        return dKp;
    }

    public agb_1(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    @Override
    public final void run() {
        long l = this.cbk();
        if (l > 30000L) {
            if (l != Integer.MAX_VALUE) {
                dJP.warn((Object)("Timed Action " + this.getClass().getSimpleName() + " has a long duration : " + l + " ms. This may be an error."));
            }
            l = 0L;
        }
        if (l == 0L) {
            this.caT();
        } else if (l > 0L) {
            this.dxy = abb_2.bUA().a(this, l, -1, 1L);
        }
    }

    protected abstract long cbk();

    @Override
    public boolean b(aam_2 aam_22) {
        if (aam_22.d() == Integer.MIN_VALUE) {
            this.caT();
            return false;
        }
        return true;
    }

    @Override
    public long Sn() {
        return -1L;
    }

    @Override
    public void dC(long l) {
    }
}

