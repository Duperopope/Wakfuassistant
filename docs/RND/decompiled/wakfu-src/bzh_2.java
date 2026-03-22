/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TLongProcedure
 */
import gnu.trove.procedure.TLongProcedure;

/*
 * Renamed from bZH
 */
class bzh_2
implements TLongProcedure {
    final /* synthetic */ bze_2 lDN;

    bzh_2(bze_2 bze_22) {
        this.lDN = bze_22;
    }

    public boolean execute(long l) {
        ((bsi_0)this.lDN.lDL.get(l)).bsI();
        return true;
    }
}

