/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;
import java.util.ArrayList;

/*
 * Renamed from eYM
 */
class eym_2
implements TObjectProcedure<ezz_1> {
    final /* synthetic */ ArrayList rLn;
    final /* synthetic */ ezu_1 rLo;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    eym_2(ArrayList arrayList, ezu_1 ezu_12) {
        this.rLn = arrayList;
        this.rLo = ezu_12;
    }

    public boolean e(ezz_1 ezz_12) {
        if (this.rLn.size() <= 200 + this.rLo.fQf() || ezz_12.Xm() == this.rLo.drj()) {
            this.rLn.add(eyk_2.v(ezz_12));
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.e((ezz_1)object);
    }
}

