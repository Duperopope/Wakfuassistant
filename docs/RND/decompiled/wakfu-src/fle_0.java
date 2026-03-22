/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fle
 */
class fle_0
implements TObjectProcedure<fkw> {
    public int Yh;

    fle_0() {
    }

    public boolean b(fkw fkw2) {
        this.Yh += fkw2.gco();
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.b((fkw)object);
    }
}

