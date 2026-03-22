/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from cIf
 */
class cif_1
implements TObjectProcedure<fam_0> {
    final /* synthetic */ cie_1 ndp;

    cif_1(cie_1 cie_12) {
        this.ndp = cie_12;
    }

    public boolean a(fam_0 fam_02) {
        this.ndp.g(fam_02);
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.a((fam_0)object);
    }
}

