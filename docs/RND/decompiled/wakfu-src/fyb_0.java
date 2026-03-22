/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from fyB
 */
class fyb_0
implements TObjectProcedure<String> {
    final /* synthetic */ fyw_0 tCQ;

    fyb_0(fyw_0 fyw_02) {
        this.tCQ = fyw_02;
    }

    public boolean tq(String string) {
        fyw_0.tBD.info((Object)("Unloading " + string));
        if (this.tCQ.tCe != null) {
            this.tCQ.tCe.vu(string);
        }
        for (alx_2 alx_22 : this.tCQ.tCz) {
            try {
                alx_22.dialogUnloaded(string);
            }
            catch (Exception exception) {
                fyw_0.tBD.error((Object)"Exception raised", (Throwable)exception);
            }
        }
        if (!this.tCQ.tCA.isEmpty()) {
            this.tCQ.tCz.removeAll(this.tCQ.tCA);
            this.tCQ.tCA.clear();
        }
        return true;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.tq((String)object);
    }
}

