/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

class cdr
implements TObjectProcedure<bgy> {
    cdr() {
    }

    public boolean bO(bgy bgy2) {
        bri_2 bri_22 = (bri_2)bgy2.ffF();
        if (aue_0.cVJ().cVK().ffF().Xt() == bri_22.Xt()) {
            bri_22.iw(false);
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.bO((bgy)object);
    }
}

