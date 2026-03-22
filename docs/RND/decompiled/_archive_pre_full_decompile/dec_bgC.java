Picked up JAVA_TOOL_OPTIONS: 
/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  bgy
 *  ffS
 *  gnu.trove.procedure.TObjectIntProcedure
 */
import gnu.trove.procedure.TObjectIntProcedure;

class bgC
implements TObjectIntProcedure<ffS> {
    final /* synthetic */ bgy icG;

    bgC(bgy bgy2) {
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

