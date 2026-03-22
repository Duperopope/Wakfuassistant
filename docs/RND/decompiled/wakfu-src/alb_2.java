/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import org.apache.commons.lang3.ArrayUtils;

/*
 * Renamed from alb
 */
public abstract class alb_2 {
    private static alb_2 cEA;
    private final aap_1 cEB = new aap_1();
    private static final int cEC = 1000;
    private final long[] cED = Bv.auv;
    public int cEE = 2;

    public static alb_2 bBL() {
        return cEA;
    }

    public static void a(alb_2 alb_22) {
        cEA = alb_22;
    }

    public int bBM() {
        return this.cEE;
    }

    public void sK(int n) {
        this.cEE = n;
    }

    public boolean f(long l, long l2) {
        this.gf(l);
        long l3 = ahk_2.hT(l2);
        if (!ArrayUtils.contains((long[])this.cED, (long)l3)) {
            return true;
        }
        long l4 = this.cEB.hb(l2);
        return 1000L <= Math.abs(l - l4);
    }

    private void gf(long l) {
        if (this.cEB.aVo() > 10) {
            for (int i = this.cEB.aVo() - 1; i >= 0; --i) {
                long l2 = this.cEB.wo(i);
                if (1000L > Math.abs(l - l2)) continue;
                this.cEB.wz(i);
            }
        }
    }

    public void g(long l, long l2) {
        this.cEB.i(l2, l);
    }

    public void a(arj_2 arj_22, long l) {
        this.b(arj_22, l);
    }

    protected abstract void b(arj_2 var1, long var2);
}

