/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

/*
 * Renamed from bYh
 */
class byh_2
implements TObjectProcedure<exz_1> {
    private final long lyi;
    private int lyj;
    private int lyk;

    byh_2(long l) {
        this.lyi = l;
    }

    public boolean c(exz_1 exz_12) {
        if (!exz_12.dmc()) {
            return true;
        }
        if (exz_12.aZj() == this.lyi) {
            ++this.lyk;
        }
        ++this.lyj;
        return true;
    }

    int eoP() {
        return this.lyj;
    }

    int eoQ() {
        return this.lyk;
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((exz_1)object);
    }
}

