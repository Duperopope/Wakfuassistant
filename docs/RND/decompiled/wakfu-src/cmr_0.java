/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntIntProcedure
 */
import gnu.trove.procedure.TIntIntProcedure;

/*
 * Renamed from cmR
 */
class cmr_0
implements TIntIntProcedure {
    final /* synthetic */ cmq_0 mbh;

    cmr_0(cmq_0 cmq_02) {
        this.mbh = cmq_02;
    }

    public boolean execute(int n, int n2) {
        if (this.mbh.mbf.put(n, n2) != 0) {
            throw new UnsupportedOperationException("Impossible d'ajouter plusieurs fois un m\u00eame item");
        }
        return true;
    }
}

