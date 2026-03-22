/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TLongFloatHashMap
 */
import gnu.trove.map.hash.TLongFloatHashMap;

/*
 * Renamed from bsH
 */
public class bsh_0
extends ags_0
implements acv_0 {
    private static final int jid = 3;
    private static final axb_2 jie = new awx_2(1.0f, 1.0f, 1.0f);
    private static final axb_2 jif = new awx_2(0.35f, 0.35f, 0.35f);
    private static final long jig = 500L;
    private static final int jih = 2;
    private rh_0 cts;
    private boolean ccM;
    private final TLongFloatHashMap jii = new TLongFloatHashMap();

    public bsh_0() {
        super(jie, jif, 500L);
    }

    public void d(rh_0 rh_02) {
        this.cts = rh_02;
        bzq_2 bzq_22 = bzp_2.eqt().mA(rh_02.bdL());
        this.ccM = bzq_22 != null && !bzq_22.lEJ;
    }

    @Override
    public int bpb() {
        return 700;
    }

    @Override
    public boolean bpa() {
        return this.ccM;
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        long l = GC.s(n, n2);
        if (this.jii.contains(l)) {
            float f2 = this.jii.get(l);
            fArray[0] = fArray[0] * Math.min(this.cuY[0] + f2, 1.0f);
            fArray[1] = fArray[1] * Math.min(this.cuY[1] + f2, 1.0f);
            fArray[2] = fArray[2] * Math.min(this.cuY[2] + f2, 1.0f);
        }
    }
}

