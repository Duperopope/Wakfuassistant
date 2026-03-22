/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongObjectProcedure
 */
import gnu.trove.procedure.TLongObjectProcedure;

/*
 * Renamed from bwR
 */
class bwr_0
implements TLongObjectProcedure<bgy> {
    final /* synthetic */ bgy jAi;
    final /* synthetic */ bwq_0 jAj;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    bwr_0(bwq_0 bwq_02, bgy bgy2) {
        this.jAj = bwq_02;
        this.jAi = bgy2;
    }

    public boolean a(long l, bgy bgy2) {
        if (bgy2 == this.jAi) {
            return true;
        }
        acd_1 acd_12 = bgy2.eap();
        byte by = bgy2.bcO();
        for (int i = acd_12.getX() - by; i <= acd_12.getX() + by; ++i) {
            for (int j = acd_12.getY() - by; j <= acd_12.getY() + by; ++j) {
                this.jAj.jAh.add(bwq_0.dF(i, j));
            }
        }
        return true;
    }

    public /* synthetic */ boolean execute(long l, Object object) {
        return this.a(l, (bgy)object);
    }
}

