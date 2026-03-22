/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from cZw
 */
public class czw_2
implements Runnable {
    private static final int obb = 20;
    private static final float obc = 250.0f;
    private final fbz_2 obd;
    private long obe;
    private czx_1 obf;

    public czw_2(fbz_2 fbz_22) {
        this.obd = fbz_22;
        this.obf = czx_1.obg;
    }

    public void start() {
        abg_2.bUP().a((Runnable)this, 20L, -1);
    }

    public void bhk() {
        abg_2.bUP().h(this);
    }

    public void a(czx_1 czx_12) {
        this.obf = czx_12;
    }

    @Override
    public void run() {
        if (this.obd == null) {
            return;
        }
        long l = System.nanoTime();
        long l2 = (l - this.obe) / 1000000L;
        this.obe = l;
        if (this.obf == czx_1.obg) {
            return;
        }
        float f2 = this.obd.getOffset();
        float f3 = (float)l2 / 250.0f;
        float f4 = this.obf == czx_1.obh ? f2 - f3 : f2 + f3;
        this.obd.setOffset(f4);
    }
}

