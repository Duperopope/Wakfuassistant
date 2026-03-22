/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.procedure.TObjectIntProcedure;

/*
 * Renamed from bgC
 */
class bgc_0
implements TObjectIntProcedure<ffS> {
    final /* synthetic */ bgy icG;

    bgc_0(bgy bgy2) {
        this.icG = bgy2;
    }

    public boolean a(ffS ffS2, int n) {
        this.icG.ddI().a(n, (short)ffS2.aJr(), true);
        return true;
    }

    public /* synthetic */ boolean execute(Object object, int n) {
        return this.a((ffS)object, n);
    }
}

