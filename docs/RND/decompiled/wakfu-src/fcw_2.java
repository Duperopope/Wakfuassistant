/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from fCW
 */
public class fcw_2
extends fss_2<Float> {
    final /* synthetic */ fcq_2 ubn;

    public fcw_2(fcq_2 fcq_22, float f2, float f3, fcq_2 fcq_23, int n, int n2, abn abn2) {
        this.ubn = fcq_22;
        super(Float.valueOf(f2), Float.valueOf(f3), fcq_23, n, n2, abn2);
    }

    @Override
    public boolean Ma(int n) {
        float f2;
        if (!super.Ma(n)) {
            return false;
        }
        if (this.tXJ != null && (f2 = this.tXJ.h(((Float)this.veb).floatValue(), ((Float)this.vec).floatValue(), this.bUi, this.bMn)) <= this.ubn.uaF) {
            this.ubn.uaF = f2;
        }
        return true;
    }
}

