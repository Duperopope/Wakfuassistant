/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bsw
 */
class bsw_0
implements TObjectProcedure<fdu> {
    final /* synthetic */ bsu_0 jha;

    bsw_0(bsu_0 bsu_02) {
        this.jha = bsu_02;
    }

    public boolean a(fdu fdu2) {
        Object r = fgD.fXh().Vd(fdu2.azv());
        if (r != null) {
            this.jha.jgX.add(new bmj_2(fdu2.bfd(), (bgv_2)r));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fdu)object);
    }
}

