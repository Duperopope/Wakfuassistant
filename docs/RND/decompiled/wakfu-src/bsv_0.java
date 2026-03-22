/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntShortProcedure
 */
import gnu.trove.procedure.TIntShortProcedure;

/*
 * Renamed from bsv
 */
class bsv_0
implements TIntShortProcedure {
    final /* synthetic */ bsu_0 jgZ;

    bsv_0(bsu_0 bsu_02) {
        this.jgZ = bsu_02;
    }

    public boolean execute(int n, short s) {
        Object r = fgD.fXh().Vd(n);
        if (r != null) {
            this.jgZ.jgW.add(new bmj_2(s, (bgv_2)r));
        }
        return true;
    }
}

