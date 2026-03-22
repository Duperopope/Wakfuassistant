/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntObjectProcedure
 */
import gnu.trove.procedure.TIntObjectProcedure;

/*
 * Renamed from eXk
 */
class exk_2
implements TIntObjectProcedure<exf_2> {
    final /* synthetic */ tp_1 rFJ;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    exk_2(exh_1 exh_12, tp_1 tp_12) {
        this.rFJ = tp_12;
    }

    public boolean a(int n, exf_2 exf_22) {
        tq_2 tq_22 = new tq_2();
        tq_22.Rv = (byte)n;
        tq_22.aav = exf_22.brS;
        tq_22.aaw = exf_22.brU;
        tq_22.aax = exf_22.brV;
        tq_22.aay = exf_22.rFz;
        this.rFJ.aau.add(tq_22);
        return true;
    }

    public /* synthetic */ boolean execute(int n, Object object) {
        return this.a(n, (exf_2)object);
    }
}

