/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TObjectProcedure
 */
import gnu.trove.procedure.TObjectProcedure;

public class fcu
implements TObjectProcedure<fas_0> {
    private int rTF = 3;
    private int rTG = 3;

    public boolean c(fas_0 fas_02) {
        this.rTF -= fas_02.erN().fSc();
        this.rTF += fas_02.erN().fSd();
        this.rTG += fas_02.erN().fSd();
        return true;
    }

    public int fSy() {
        return this.rTF;
    }

    public int fSz() {
        return this.rTG;
    }

    public String toString() {
        return "WorkerBuildingCount{m_remainingWorker=" + this.rTF + "}";
    }

    public /* synthetic */ boolean execute(Object object) {
        return this.c((fas_0)object);
    }
}

