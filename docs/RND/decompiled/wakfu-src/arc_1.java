/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TIntProcedure
 */
import gnu.trove.procedure.TIntProcedure;

/*
 * Renamed from arC
 */
class arc_1
implements TIntProcedure {
    final /* synthetic */ ara_1 cUI;

    arc_1(ara_1 ara_12) {
        this.cUI = ara_12;
    }

    public boolean execute(int n) {
        if (this.cUI.cUF.contains(n)) {
            return true;
        }
        this.cUI.cUB.add(n);
        return true;
    }
}

