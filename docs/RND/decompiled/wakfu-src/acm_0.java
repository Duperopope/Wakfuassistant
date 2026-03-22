/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.map.hash.TIntObjectHashMap;
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from acm
 */
public class acm_0
extends acw_0 {
    private static final acm_0 cfU = new acm_0();
    private final TIntObjectHashMap<acf> cfV = new TIntObjectHashMap();
    final aco_0 cfW = new aco_0(1024);
    private final acp_0 cfX = new acp_0();

    public static acm_0 btv() {
        return cfU;
    }

    private acm_0() {
    }

    @Override
    public void btl() {
        this.cfW.btx();
        if (!this.cfV.isEmpty()) {
            float f2 = 1.0f;
            this.cfV.forEachValue((TObjectProcedure)new acn_0(this));
        }
    }

    @Override
    public void qF(int n) {
    }

    @Override
    public int bpb() {
        return 600;
    }

    @Override
    public boolean bpa() {
        return this.cfV.isEmpty();
    }

    @Override
    public void a(int n, int n2, int n3, int n4, float[] fArray) {
        this.cfW.a(n, n2, n3, fArray);
    }

    void b(float f2, int n) {
        int n2;
        this.cfX.c(f2, n);
        if (!this.cfV.isEmpty()) {
            this.cfV.forEachValue((TObjectProcedure)this.cfX);
        }
        if ((n2 = this.cfX.cgc.size()) != 0) {
            for (int i = 0; i < n2; ++i) {
                this.rD(this.cfX.cgc.getQuick(i));
            }
        }
    }

    public final void c(acf acf2) {
        this.cfV.put(acf2.d(), (Object)acf2);
        agr.ctK.c(acf2);
    }

    public final void rD(int n) {
        acf acf2 = (acf)this.cfV.remove(n);
        agr.ctK.d(acf2);
    }

    public final void btw() {
        this.cfV.clear();
    }

    public final acf rE(int n) {
        return (acf)this.cfV.get(n);
    }

    @Override
    public void h(int n, int n2, int n3, int n4) {
        this.cfW.h(n, n2, n3, n4);
    }
}

