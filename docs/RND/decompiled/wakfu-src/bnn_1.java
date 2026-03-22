/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bnn
 */
public class bnn_1
extends fnv {
    bnn_1() {
        super(aue_0.cVJ().cVO().xl(), -1L, "<undefined>", -1L, bno_1.iJX, bnn_2.iJW, new fnx());
        this.dyU().b(this);
    }

    public final boolean C(short s, short s2) {
        return this.ae(s, s2);
    }

    @Override
    public void b(wy_0 wy_02) {
        super.b(wy_02);
        bLe.ecw().u((TObjectProcedure<bKV>)((TObjectProcedure)bKV2 -> {
            bKV2.ech();
            return true;
        }));
    }

    public void a(ajo_0 ajo_02) {
        VL vL = this.gg(ajo_02.bun(), ajo_02.buo());
        ajo_02.a(vL);
    }

    public void aZp() {
        for (fnp fnp2 : this.sIJ) {
            if (!(fnp2 instanceof fnz)) continue;
            fnz fnz2 = (fnz)fnp2;
            fnz2.aZp();
        }
        if (aue_0.cVJ().cVO().xl() != this.bxw) {
            baj_2.hzf.iN(this.bxw);
        }
    }

    @Override
    protected void dyt() {
    }
}

